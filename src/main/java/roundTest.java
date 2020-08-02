import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class roundTest {
    public static void main(String[] args) {

        List<Double> doubles = new ArrayList<>();
        doubles.add(0.012);
        System.out.println(findMinScale(doubles));

    }
    public static int findMinScale(List<Double> valueList) {
        if(valueList.size() == 0) {
            return 2;
        }
        DoubleSummaryStatistics summaryStatistics = valueList.stream().mapToDouble(x -> x).summaryStatistics();
        Double minValue = summaryStatistics.getMin();
        String minValueString = new BigDecimal(minValue).toPlainString();
        String[] minValueArray = minValueString.split("\\.");
        if(minValueArray.length <= 1) {
            return 0;
        } else {
            int index = 0;
            while (index < minValueArray[1].length())  {
                char checkChar = minValueArray[1].charAt(index);
                String checkString = String.valueOf(checkChar);
                int charIntValue = Integer.valueOf(checkString);
                if(charIntValue > 0) {
                    return index + 2;
                }
                index = index + 1;
            }
        }
        return 2;
    }
}
