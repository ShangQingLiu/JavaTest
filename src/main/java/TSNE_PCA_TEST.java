import lombok.extern.slf4j.Slf4j;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@Slf4j
public class TSNE_PCA_TEST {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://pg.dev.sis.ai:5432/sygps";
        Properties props = new Properties();
        props.setProperty("user", "sam");
        props.setProperty("password", "sjdfxacc");
        props.setProperty("ssl", "require");
        String sql = "select * from tb_7cb05d34f6fc429fac7a4e09bba16d53 limit 500";
        try (Connection connection = DriverManager.getConnection(url, props);
             Statement statement = connection.createStatement();
        ) {
            ResultSet resultSet = statement.executeQuery(sql);

            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
//            log.info("resultSetMetaData: {}",resultSetMetaData);
            System.out.println(resultSetMetaData);

            final int columnCount = resultSetMetaData.getColumnCount();
            List<Object[]> model = new ArrayList<>();
            while (resultSet.next()) {
                Object[] values = new Object[columnCount];
                boolean hasNull = false;
                for (int i = 1; i <= columnCount; i++) {
                    values[i - 1] = resultSet.getObject(i);
                    if (values[i - 1] == null) {
                        hasNull = true;
                    }
                }
                if (!hasNull) {
                    model.add(values);
                }
            }
//            log.info("model: {}",model);
            System.out.println(model);

            //1 preprocessing the data to numeric array
            List<List<Double>> resultNumeric2DArray = new ArrayList<>();
            for (int columnCountIndex = 1; columnCountIndex <= columnCount; columnCountIndex++) {
                String columnName = resultSetMetaData.getColumnTypeName(columnCountIndex);
                for (int j = 0; j < model.size(); j++) {
                    if (resultSetMetaData.getColumnTypeName(columnCountIndex).equals("varchar")) {
                        List<Double> columnData = collectColumn(model, columnCountIndex - 1);
                        resultNumeric2DArray.add(columnData);
                    } else {
                        List<Double> columnData = collectColumn(model,columnCountIndex);
                        resultNumeric2DArray.add(columnData);
                    }
                }

            }

            //2 SVG -> choose number of component
            //3 pca -> to storage place
            //4. showing -> get first two dimension
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    private static List<Double> collectColumn(List<Object[]> model, int columnIndex) {
        List<Double> columnDataList = new ArrayList<>();
        for (Object[] objects : model) {
            columnDataList.add((double)objects[columnIndex]);
        }
        return columnDataList;
    }
}
