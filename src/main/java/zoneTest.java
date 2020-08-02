import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class zoneTest {

    public static void main(String argv[]) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2018, 11, 31, 59, 59, 59);
        Date happyNewYearDate = calendar.getTime();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(happyNewYearDate.toInstant(), ZoneId.systemDefault());
        DateTimeFormatter outFormat = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH點mm分ss秒");
        String indexValue = localDateTime.format(outFormat);
        System.out.println(indexValue);
        System.out.println("##############");

         localDateTime = LocalDateTime.ofInstant(happyNewYearDate.toInstant(), ZoneId.of("Asia/Tokyo"));
         indexValue = localDateTime.format(outFormat);
        System.out.println(indexValue);
    }
}
