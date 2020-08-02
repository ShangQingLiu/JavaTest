import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class DatetimeTest {

    public static void main(String argv[]) {

        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                // here is the same as your code
                .append(DateTimeFormatter.BASIC_ISO_DATE).appendLiteral('-')
                // time (hour/minute/seconds)
                .appendPattern("HH:mm:ss")
                // optional nanos, with 9, 6 or 3 digits
                .appendPattern("[.SSSSSSSSS][.SSSSSS][.SSS]")
                // offset
                .appendOffset("+HH:mm", "Z")
                // create formatter
                .toFormatter();
        System.out.println(OffsetDateTime.parse("20161201-10:30:45.123Z", formatter)); // 2016-12-01T10:30:45.123Z

// 6 digits
        System.out.println(OffsetDateTime.parse("20161201-10:30:45.123456Z", formatter)); // 2016-12-01T10:30:45.123456Z

// 9 digits
        System.out.println(OffsetDateTime.parse("20161201-10:30:45.123456789Z", formatter)); // 2016-12-01T10:30:45.123456789Z

// 4 digits (throws DateTimeParseException: Text '20161201-10:30:45.1234Z' could not be parsed at index 21)
        System.out.println(OffsetDateTime.parse("20161201-10:30:45.1234Z", formatter));
    }
}
