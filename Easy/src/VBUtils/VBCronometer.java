package VBUtils;

import java.util.ArrayList;

/**
 * Make cronometer
 * @author vinicius.reif
 */
public class VBCronometer extends VBThread
{
    private int hour;
    private int minute;
    private int second;
    private boolean print = false;
    private ArrayList<String> marks = new ArrayList<>();

    /**
     * Make new cronometer
     */
    public VBCronometer()
    {
        super(1000, true);
        this.setHour(0);
        this.setMinute(0);
        this.setSecond(0);
    }

    /**
     * Make new cronometer from time
     */
    public VBCronometer(int hour, int minute, int second)
    {
        super(1000, true);
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);
    }

    /**
     * Add Mark in list
     */
    public void mark()
    {
        this.marks.add(this.toString());
    }
    
    /**
     * Clear marks
     */
    public void clearMarks()
    {
        this.marks.clear();
    }

    public int getHour()
    {
        return hour;
    }

    public void setHour(int hour)
    {
        if(hour < 0 || hour > 24)
        {
            this.hour = 0;
        }
        this.hour = hour;
    }

    public int getMinute()
    {
        return minute;
    }

    public void setMinute(int minute)
    {
        if(minute < 0 || minute > 60)
        {
            this.hour = 0;
        }
        this.minute = minute;
    }

    public int getSecond()
    {
        return second;
    }

    public void setSecond(int second)
    {
        if(second < 0 || second > 60)
        {
            this.hour = 0;
        }
        this.second = second;
    }

    public ArrayList<String> getMarks()
    {
        return marks;
    }

    public void setMarks(ArrayList<String> marks)
    {
        this.marks = marks;
    }

    public boolean isPrint()
    {
        return print;
    }

    public void setPrint(boolean print)
    {
        this.print = print;
    }

    @Override
    public void execute()
    {
        if(this.print)
        {
            this.print();
        }
        this.second++;
        if(this.second >= 60)
        {
            this.second = 0;
            this.minute++;
            if(this.minute >= 60)
            {
                this.minute = 0;
                this.hour++;
                if(this.hour >= 23)
                {
                    this.hour = 0;
                    this.stop();
                }
            }
        }
    }
    
    /**
     * Return the time with the mask [hh:mm:ss]
     * @return 
     */
    public String toString()
    {
        String hour = this.hour + "";
        String minute = this.minute + "";
        String second = this.second + "";
        if(this.hour < 10)
        {
            hour = "0" + this.hour;
        }
        if(this.minute < 10)
        {
            minute = "0" + this.minute;
        }
        if(this.second < 10)
        {
            second = "0" + this.second;
        }
        return hour + ":" + minute + ":" + second;
    }
    
    /**
     * Print the time
     */
    public void print()
    {
        System.out.println(this.toString());
    }
}
