
package CreatingWindow;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.*;
import javax.swing.JFrame;

public class TryWindow2 {
 // The Window Object
    static JFrame aWindow = new JFrame("This is the Window Title");
     public static void main(String[] args) {
        Toolkit theKit = aWindow.getToolkit(); // Get the window toolkit
        Dimension wndSize = theKit.getScreenSize(); // Get screen size
        
        // Set the position to screen center & size to half screen size
        aWindow.setBounds(wndSize.width/4, wndSize.height/4, 
                windSize.width/2, wndSize.height/2);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setVisible(true);
    }
}
