package VBUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Write and Read property files
 * @author vinicius.reif
 */
public class VBProperties 
{
    private File propertyFile;
    private Properties properties = new Properties();

    /**
     * Create a new property file reader
     * @param propertyFile
     * @throws IOException 
     */
    public VBProperties(File propertyFile) throws IOException
    {
        if(propertyFile.isDirectory())
        {
            throw new IOException("The path is a directory");
        }
        if(!propertyFile.exists())
        {
            propertyFile.createNewFile();
        }
        this.propertyFile = propertyFile;
    }
    
    /**
     * Create a new property file reader
     * @param path
     * @throws IOException 
     */
    public VBProperties(String path) throws IOException
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
        this.propertyFile = f;
    }

    /**
     * Write property in file
     * @param key
     * @param value
     * @throws IOException 
     */
    public void set(String key, String value) throws IOException
    {
        this.load();
        this.properties.setProperty(key, value);
        this.store("");
    }
    
    /**
     * Write property in file with comments
     * @param key
     * @param value
     * @param comments
     * @throws IOException 
     */
    public void set(String key, String value, String comments) throws IOException
    {
        this.load();
        this.properties.setProperty(key, value);
        this.store(comments);
    }
    
    /**
     * Read property
     * @param key
     * @return 
     * @throws java.io.IOException 
     */
    public String get(String key) throws IOException
    {
        this.load();
        return this.properties.get(key) + "";
    }
    
    /**
     * Remove property
     * @param key
     * @throws IOException 
     */
    public void removeProperty(String key) throws IOException
    {
        this.load();
        this.properties.remove(key);
        this.store("");
    }
    
    /**
     * Remove property with comments
     * @param key
     * @param comments
     * @throws IOException 
     */
    public void removeProperty(String key, String comments) throws IOException
    {
        this.load();
        this.properties.remove(key);
        this.store(comments);
    }
    
    /**
     * Clear contents of file
     * @throws IOException 
     */
    public void clearContents() throws IOException
    {
        new VBFile(this.propertyFile).clearContents();
    }
    
    /**
     * Load property file
     */
    private void load() throws IOException
    {
        this.properties.load(new FileInputStream(this.propertyFile));
    }
    
    /**
     * Store property file
     */
    private void store(String msg) throws IOException
    {
        this.properties.store(new FileOutputStream(propertyFile), msg);
    }

    public File getPropertyFile()
    {
        return propertyFile;
    }

    public void setPropertyFile(File propertyFile)
    {
        this.propertyFile = propertyFile;
    }
}
