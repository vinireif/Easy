package VBUtils;

/**
 * Create new Thread extends this class
 * @author vinicius.reif
 */
public abstract class VBThread implements Runnable
{
    private boolean loop = true;
    private boolean pause = false;
    private int delay;
    private boolean delayBefore;
    
    /**
     * Create new Thread
     * @param delay 
     */
    public VBThread(int delay)
    {
        this.delay = delay;
        this.delayBefore = true;
    }
    
    /**
     * Create new Thread
     * @param delay 
     * @param delayBefore 
     */
    public VBThread(int delay, boolean delayBefore)
    {
        this.delay = delay;
        this.delayBefore = delayBefore;
    }
    
    /**
     * Start Thread
     */
    public void start()
    {
        new Thread(this).start();
    }
    
    /**
     * Thread processing method
     */
    @Override
    public void run()
    {
        while(this.loop)
        {
            try
            {
                while(this.pause)
                {
                    Thread.sleep(10);
                }
                
                //Wait
                if(this.delayBefore)
                {
                    Thread.sleep(delay);
                }
                
                //Execute launch method
                this.execute();
                
                //Wait
                if(!this.delayBefore)
                {
                    Thread.sleep(delay);
                }
            } 
            catch (InterruptedException ex)
            {
                System.out.println(ex);
            }
        }    
    }
    
    /**
     * Implements this method that will be call in the processing of Thread
     */
    public abstract void execute();
    
    /**
     * Stop Thread
     */
    public void stop()
    {
        this.loop = false;
    }

    /**
     * Pause Thread
     */
    public void pause()
    {
        this.pause = true;
    }
    
    /**
     * Continue Thread
     */
    public void continues()
    {
        this.pause = false;
    }

    
    public int getDelay()
    {
        return delay;
    }

    public void setDelay(int delay)
    {
        this.delay = delay;
    }

    public boolean isDelayBefore()
    {
        return delayBefore;
    }

    public void setDelayBefore(boolean delayBefore)
    {
        this.delayBefore = delayBefore;
    }
}
