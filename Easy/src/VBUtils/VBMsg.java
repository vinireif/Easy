package VBUtils;

import javax.swing.JOptionPane;

/**
 * Show messages from this class
 * @author vinicius.reif
 */
public class VBMsg 
{
    public static final int YES_OPTION = JOptionPane.YES_OPTION;
    public static final int NO_OPTION = JOptionPane.NO_OPTION;
    public static final int CANCEL_OPTION = JOptionPane.CANCEL_OPTION;
    /**
     * Show rrror message
     * @param msg 
     */
    public static void error(String msg)
    {
        JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    /**
     * Show fatal error message and shutdown the application
     * @param msg 
     */
    public static void fatalError(String msg)
    {
        JOptionPane.showMessageDialog(null, msg, "FATAL Error", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }
    
    /**
     * Show information message
     * @param msg 
     */
    public static void info(String msg)
    {
        JOptionPane.showMessageDialog(null, msg, "Info", JOptionPane.INFORMATION_MESSAGE);
    }
    
    /**
     * Show warning message
     * @param msg 
     */
    public static void warning(String msg)
    {
        JOptionPane.showMessageDialog(null, msg, "Warning", JOptionPane.WARNING_MESSAGE);
    }
    
    /**
     * Show confirmation frame with yes and no options
     * @param msg
     * @return Constant from JOptionPane
     */
    public static int confirmYesNo(String msg)
    {
        return JOptionPane.showConfirmDialog(null, msg, "Confirm", JOptionPane.YES_NO_OPTION);
    }
    
    /**
     * Show confirmation frame with yes, no, and cancel options
     * @param msg
     * @return Constant from JOptionPane
     */
    public static int confirmYesNoCancel(String msg)
    {
        return JOptionPane.showConfirmDialog(null, msg, "Confirm", JOptionPane.YES_NO_CANCEL_OPTION);
    }
    
    /**
     * Show options dialog to choose one option and return this as int
     * @param msg
     * @param options
     * @return 
     */
    public static int options(String msg, String[] options)
    {
        int s = JOptionPane.showOptionDialog(null, msg, "Options", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, 0);
        return s;
    }

    /**
     * Show input dialog
     * @param msg
     * @return 
     */
    public static String input(String msg)
    {
        return JOptionPane.showInputDialog(msg);
    }
    
    /**
     * Show input dialog with options
     * @param msg
     * @param options
     * @return 
     */
    public static String inputOptions(String msg, String[] options)
    {
        return JOptionPane.showInputDialog(null, msg, "Input Options", JOptionPane.DEFAULT_OPTION, null, options, 0) + "";
    }
    
    /**
     * Print text in console
     * @param txt 
     */
    public static void print(String txt)
    {
        System.out.println(txt);
    }
}
