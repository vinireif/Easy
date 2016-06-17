package VBUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Save and Load serializable Objects
 * @author vinicius.reif
 */
public class VBSerial 
{
    private File file;
    
    /**
     * Create Serial Manager
     * @param path
     * @throws IOException 
     */
    public VBSerial(String path) throws IOException
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
     * Create Serial Manager
     * @param file
     * @throws IOException 
     */
    public VBSerial(File file) throws IOException
    {
        File f = file;
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
     * Save object as file
     * @param object
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void save(Object object) throws FileNotFoundException, IOException
    {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(object);
        oos.flush();
        oos.close();
    }
    
    /**
     * Load object to application
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    public Object load() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Object result = ois.readObject();
        ois.close();
        return result;
    }
}
