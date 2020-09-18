import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shang Ching Liu on 2020/8/4.
 */
public class subListTest {

    public static void main(String argv[]) {
        List<String> testList = new ArrayList<String>();
        testList.add("aaa");
        testList.add("bbb");
        testList.add("ccc");
        testList.add("ddd");
        System.out.println(testList);//[aaa, bbb, ccc, ddd]
        testList.subList(1,2).clear();

        System.out.println(testList);//[aaa, bbb, ddd]
    }
}
