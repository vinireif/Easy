package VBUtils;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author vinicius.reif
 */
public class VBChooser 
{
    public static final int FILES_ONLY = JFileChooser.FILES_ONLY;
    public static final int FILES_AND_DIRECTORIES = JFileChooser.FILES_AND_DIRECTORIES;
    public static final int DIRECTORIES_ONLY = JFileChooser.DIRECTORIES_ONLY;
    
    private JFileChooser jfc = new JFileChooser();

    /**
     * Make default Chooser
     */
    public VBChooser()
    {
    }
    
    /**
     * Make Chooser with current directory
     * @param currentDir 
     */
    public VBChooser(String currentDir)
    {
        this.setCurrentDir(currentDir);
    }
    
    /**
     * Make Chooser with filters and current directory
     * @param currentDir
     * @param filterName
     * @param extensions 
     */
    public VBChooser(String currentDir, String filterName, String... extensions)
    {
        this.setCurrentDir(currentDir);
        this.setFilter(filterName, extensions);
    }
    
    /**
     * Make Chooser with filter
     * @param filterName
     * @param extensions 
     */
    public VBChooser(String filterName, String... extensions)
    {
        this.setFilter(filterName, extensions);
    }

    /**
     * Set Filter
     * Example .dat .png .jpg
     * @param name
     * @param extensions 
     */
    public void setFilter(String name, String... extensions)
    {
        jfc.setFileFilter(new FileNameExtensionFilter(name, extensions));
    }

    /**
     * Set the dir that the choose will open
     * @param currentDir 
     */
    public void setCurrentDir(String currentDir)
    {
        this.jfc.setCurrentDirectory(new File(currentDir));
    }
    
    /**
     * Set type of chooser to selection
     * Use the constants from VBChooser
     * @param type 
     */
    public void setType(int type)
    {
        this.jfc.setFileSelectionMode(type);
    }

    /**
     * Show open dialog
     * @return 
     */
    public File showOpenDialog()
    {
        int option = this.jfc.showOpenDialog(null);
        if(option == JFileChooser.APPROVE_OPTION)
        {
            return this.jfc.getSelectedFile();
        }
        return null;
    }
    
    /**
     * Show open multiple selection dialog
     * @return 
     */
    public File[] showOpenMultipleDialog()
    {
        int option = this.jfc.showOpenDialog(null);
        if(option == JFileChooser.APPROVE_OPTION)
        {
            return this.jfc.getSelectedFiles();
        }
        return null;
    }

    /**
     * Show save dialog
     * @return 
     */
    public File showSaveDialog()
    {
        int option = this.jfc.showSaveDialog(null);
        if(option == JFileChooser.APPROVE_OPTION)
        {
            return this.jfc.getSelectedFile();
        }
        return null;
    }
}
