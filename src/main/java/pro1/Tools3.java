package pro1;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Tools3
{
    public static long hourDiff(ZonedDateTime time1, ZonedDateTime time2)
    {
        return ChronoUnit.HOURS.between(time1, time2);
    }
}
