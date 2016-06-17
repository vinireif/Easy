package VBUtils;

import java.io.File;
import java.io.IOException;

/**
 * Make Lan using the shared directories
 * @author vinicius.reif
 */
public class VBLanShare 
{
    private String hostPath;

    /**
     * Create Lan directory
     * @param hostPath 
     */
    public VBLanShare(String hostPath)
    {
        this.hostPath = hostPath;
    }
    
    /**
     * Write in player file
     * @param player
     * @param text
     * @param file
     * @throws IOException 
     */
    public void write(String player, String file, String text) throws IOException
    {
        File f = new File(this.hostPath + "/" + player + "/" + file);
        new VBFile(f).write(text);
    }
    
    /**
     * Read file by player
     * @param player
     * @param file
     * @return
     * @throws IOException 
     */
    public String read(String player, String file) throws IOException
    {
        File f = new File(this.hostPath + "/" + player + "/" + file);
        return new VBFile(f).read();
    }
}
