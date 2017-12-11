import java.util.Calendar;

public class Util {

  public static long[] getTimeLimit(int period) {

    long[] res = new long[4];

    Calendar cal = Calendar.getInstance();

    int hour = cal.get(Calendar.HOUR_OF_DAY);
    int min = cal.get(Calendar.MINUTE) / 15;

    cal.set(Calendar.HOUR_OF_DAY, 0);
    cal.set(Calendar.SECOND, 0);
    cal.set(Calendar.MINUTE, 0);
    cal.set(Calendar.MILLISECOND, 0);

    long max_time_mills = cal.getTimeInMillis()-(24*60*60*1000*(period-1));
    long min_time_mills = max_time_mills - (24*60*60*1000*1) ; //从前period天的00:00点到前period-1天的00:00

    res[0] = max_time_mills;
    res[1] = min_time_mills;
    res[2] = hour;
    res[3] = min;

    return res;
  }
}
