package Fonts;

import Frames.MainFrame;
import VBUtils.VBSystem;

/**
 * 
 * @author vinicius.reif
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        VBSystem.setWindowsTheme();
        new MainFrame(new DataBase()).setVisible(true);
    }

}
