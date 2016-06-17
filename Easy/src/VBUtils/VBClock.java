package VBUtils;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author vinicius.reif
 */
public class VBClock
{
    public static Date getDate()
    {
        return new Date();
    }
    
    public static int getDay()
    {
        return Calendar.getInstance().get(Calendar.DATE);
    }
    
    public static int getMonth()
    {
        return Calendar.getInstance().get(Calendar.MONTH);
    }
    
    public static int getYear()
    {
        return Calendar.getInstance().get(Calendar.YEAR);
    }

    public static int getSecond()
    {
        return Calendar.getInstance().get(Calendar.SECOND);
    }
    
    public static int getMinute()
    {
        return Calendar.getInstance().get(Calendar.MINUTE);
    }
    
    public static int getHour()
    {
        return Calendar.getInstance().get(Calendar.HOUR);
    }
}
