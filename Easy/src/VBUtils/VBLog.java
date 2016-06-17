package VBUtils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * Create a log to application
 * @author vinicius.reif
 */
public class VBLog extends VBFile
{
    /**
     * Make log file
     * @param path
     * @throws IOException 
     */
    public VBLog(String path) throws IOException
    {
        super(path);
    }
    
    /**
     * Make log file
     * @param file
     * @throws IOException 
     */
    public VBLog(File file) throws IOException
    {
        super(file);
    }
    
    /**
     * Write Log
     * @param log
     * @throws IOException 
     */
    public void writeLog(String log) throws IOException
    {
        String content = this.read();
        this.write(content + "\n[" + new Date() + "] " + log);
    }
    
    /**
     * Write Log with Message and Exception
     * @param log
     * @throws IOException 
     */
    public void writeLog(String log, Exception ex) throws IOException
    {
        String content = this.read();
        String stack = "";
        for(StackTraceElement ste : ex.getStackTrace())
        {
            stack += ste.toString() + "\n";
        }
        this.write(content + "\n[" + new Date() + "] " + log + "\n" + stack);
    }
    
    /**
     * Write Log with Exception
     * @throws IOException 
     */
    public void writeLog(Exception ex) throws IOException
    {
        String stack = "";
        for(StackTraceElement ste : ex.getStackTrace())
        {
            stack += ste.toString() + "\n";
        }
        this.write("[" + new Date() + "] " + stack);
    }
}
