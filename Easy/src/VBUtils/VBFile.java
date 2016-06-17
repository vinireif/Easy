package VBUtils;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Read, Write, Clear and Crete files
 * @author vinicius.reif
 */
public class VBFile 
{
    private File file;
    
    /**
     * Create new file manager
     * @param path
     * @throws IOException 
     */
    public VBFile(String path) throws IOException
    {
        File f = new File(path);
        if(f.isDirectory())
        {
            throw new IOException("The path is a directory");
        }
        if(!f.exists())
        {
            f.createNewFile();
        }
        this.file = f;
    }
    
    /**
     * Create new file manager
     * @param file
     * @throws IOException 
     */
    public VBFile(File file) throws IOException
    {
        if(file.isDirectory())
        {
            throw new IOException("The path is a directory");
        }
        if(!file.exists())
        {
            file.createNewFile();
        }
        this.file = file;
    }
    
    /**
     * Write text in file
     * @param text
     * @throws IOException 
     */
    public void write(String text) throws IOException
    {
        PrintWriter pw = new PrintWriter(this.file);
        pw.write(text);
        pw.flush();
        pw.close();
    }
    
    /**
     * Write text in file using append before
     * @param text
     * @throws IOException 
     */
    public void writeAppendBefore(String text) throws IOException
    {
        String content = this.read();
        text = text + "\n" + content;
        PrintWriter pw = new PrintWriter(this.file);
        pw.write(text);
        pw.flush();
        pw.close();
    }
    
    /**
     * Write text in file using append after
     * @param text
     * @throws IOException 
     */
    public void writeAppendAfter(String text) throws IOException
    {
        String content = this.read();
        text = content + text;
        PrintWriter pw = new PrintWriter(this.file);
        pw.write(text);
        pw.flush();
        pw.close();
    }
    
    /**
     * Read file
     * @return 
     * @throws java.io.IOException 
     */
    public String read() throws IOException
    {
        String result = "";
        try (Scanner s = new Scanner(this.file))
        {
            while(s.hasNext())
            {
                result += s.nextLine() + "\n";
            }
        }
        return result;
    }

    /**
     * Clear file content
     */
    public void clearContents() throws IOException
    {
        PrintWriter pw = new PrintWriter(this.file);
        pw.write("");
        pw.flush();
        pw.close();
    }

    /**
     * Delete file
     */
    public void delete()
    {
        this.file.delete();
    }

    public File getFile()
    {
        return file;
    }

    public void setFile(File file)
    {
        this.file = file;
    }
}
