import javax.swing.text.html.Option;
import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class streamNonNullExample {
    public static void main(String[] args) {
        // this could help to get the nonnull object and use orElse for setting prefer value
        Collection<Integer> collection = Arrays.asList (1,2,3);
        System.out.println (Optional.ofNullable(collection).orElse(Collections.emptySet()).stream().count ());
        collection = null;
        System.out.println (Optional.ofNullable(collection).orElse(Collections.emptySet()).stream().count ());

        List<TestClass> test = new ArrayList<>();
        TestClass testClass = new TestClass();
        testClass.a = "3";
        testClass.b = 3;
        test.add(testClass);
        System.out.println(test.stream().map(x->x.a).collect(Collectors.toList()));

        testClass = new TestClass();
        testClass.a = null;
        testClass.b = 4;
        test.add(testClass);
        System.out.println(test.stream().map(x-> Optional.ofNullable(x.a).orElse(null)).collect(Collectors.toList()));
    }

    static class TestClass{
        String a;
        Integer b;
    }
}
