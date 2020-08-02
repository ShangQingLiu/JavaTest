import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest {
    public static void main(String argv[]) {

        Pattern pattern = Pattern.compile("boolean.");
        Matcher matcher = pattern.matcher("boolean1");
        System.out.println(matcher.matches());
    }

    public String test1(){
        StringBuilder stringBuilder = new StringBuilder();
        String selectValue = "c26";
        String test = "c27 = '越南盾'";
        String tableName = "tb_4ee56958afd44b4f894a2fd2116d0a70";

        stringBuilder.append("select least(q3+delta_q*1.5,number_max) as max, greatest(q1-delta_q*1.5,number_min) as min, " +
                "       q1,q2,q3 " +
                "from (");
        stringBuilder.append("select max(").append(selectValue)
                .append(") as number_max, min(").append(selectValue)
                .append(") as number_min, percentile_disc(0.25) within group (order by ")
                .append(selectValue)
                .append(") as q1, percentile_disc(0.50) within group (order by ")
                .append(selectValue)
                .append(") as q2, percentile_disc(0.75) within group (order by ")
                .append(selectValue)
                .append(") as q3,(percentile_disc(0.75) within group (order by " + selectValue + ") - percentile_disc(0.50) within group (order by " + selectValue + ") ) as delta_q from ").append(tableName)
                .append(" where ").append(test)
                .append(" ) as t;");
        return stringBuilder.toString();
    }
    public boolean testRegex(){
        Pattern pattern = Pattern.compile("boolean.");
        Matcher matcher = pattern.matcher("boolean1");
        return matcher.matches();
    }

}
