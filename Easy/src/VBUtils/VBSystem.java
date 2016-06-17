package VBUtils;

import java.awt.Desktop;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.Scanner;
import javax.swing.UIManager;

/**
 *
 * @author vinicius.reif
 */
public class VBSystem 
{
    /**
     * Set these application variables using 
     * VBSystem.[variable] = "[value]";
     */
    public static String name = "Default Application";
    public static String version = "1.0";
    public static String author = "Default Author";
    
    /**
     * Quit application
     */
    public static void exit()
    {
        System.exit(0);
    }
    
    /**
     * Return hostname
     * @return
     * @throws UnknownHostException 
     */
    public static String getHostName() throws UnknownHostException
    {
        return InetAddress.getLocalHost().getHostName();
    }
    
    /**
     * Return address
     * @return
     * @throws UnknownHostException 
     */
    public static String getAddress() throws UnknownHostException
    {
        return InetAddress.getLocalHost().getHostAddress();
    }
    
    /**
     * Return app dir
     * @return 
     */
    public static String getAppDir()
    {
        return System.getProperty("user.dir");
    }
    
    /**
     * Return desktop dir
     * @return 
     */
    public static String getDesktopDir()
    {
        return System.getProperty("user.home") + "/Desktop";
    }
    
    /**
     * Return user dir
     * @return 
     */
    public static String getUserDir()
    {
        return System.getProperty("user.home");
    }
    
    /**
     * Get [name] [version]
     * @return 
     */
    public static String getNameVersion()
    {
        return VBSystem.name + " " + VBSystem.version;
    }
    
    /**
     * Open url in default browser
     * @param url
     * @throws URISyntaxException
     * @throws IOException 
     */
    public static void openUrlInBrowser(String url) throws URISyntaxException, IOException
    {
        Desktop.getDesktop().browse(new URI(url));
    }
    
    /**
     * Set Windows Theme to Frames for this application
     */
    public static void setWindowsTheme()
    {
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } 
        catch (Exception ex)
        {
            System.out.println("Error to set Windows Theme\n" + ex);
        }
    }
    
    /**
     * Print text in console
     * @param txt 
     */
    public static void print(String txt)
    {
        System.out.println(txt);
    }
    
    /**
     * Print text in console
     * @param txt 
     */
    public static void printError(String txt)
    {
        System.err.println(txt);
    }
    
    /**
     * Execute command in CMD and get return
     * Return int. 0 to success
     * @param command 
     */
    public static String cmdCommand(String command) throws IOException, InterruptedException
    {
        Scanner s = new Scanner(Runtime.getRuntime().exec(command).getInputStream());
        String result = "";
        while(s.hasNext()) 
        {
            result += s.nextLine() + "\n";
        }
        return result;
    }
}
