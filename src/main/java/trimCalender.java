import java.util.Calendar;
import java.util.GregorianCalendar;

public class trimCalender {
    public static void main(String[] args) {
        Calendar cal = new GregorianCalendar();
        System.out.println(cal.getTime());

        cal.set(Calendar.DAY_OF_MONTH,1);
        System.out.println(cal.getTime());

        cal.set(Calendar.HOUR_OF_DAY,0);
        System.out.println(cal.getTime());

        cal.set(Calendar.MINUTE,0);
        System.out.println(cal.getTime());

        cal.set(Calendar.SECOND,0);
        System.out.println(cal.getTime());

        cal.set(Calendar.MILLISECOND,0);
        System.out.println(cal.getTime());
    }
}
