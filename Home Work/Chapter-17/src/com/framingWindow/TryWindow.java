
package com.framingWindow;

import javax.swing.JFrame;

public class TryWindow {
    // The window Object
    static JFrame aWindow = new JFrame("This is the Window Title");
    
    public static void main(String[] args) {
        int windowWidth = 400;  //  Window width in pixels
        int windowHeight = 150;  // Window height in pixels
        aWindow.setBounds(50, 100, 500, 800);
        aWindow.setVisible(true);
    }
    
}
