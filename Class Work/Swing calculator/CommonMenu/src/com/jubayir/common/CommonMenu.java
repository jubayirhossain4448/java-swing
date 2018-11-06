
package com.jubayir.common;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;


public class CommonMenu {
    public static void main(String[] args) {
        JFrame f = new JFrame("Common Menu");
        JMenuBar jMenuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        jMenuBar.add(file);
       
        JMenu help = new JMenu("Help");
        jMenuBar.add(help);
    }
    
}
