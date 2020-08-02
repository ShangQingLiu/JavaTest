import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaListOrderTest {
    public static void main(String argv[]) {
        List<String> keys = Arrays.asList("1","2","3","4","5","3","4");
        //dinstinct還是保有原始的順序
        List<String> distinctKeys = keys.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctKeys);

    }
}
