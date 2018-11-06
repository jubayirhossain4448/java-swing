
package com.jubayir.evidence;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;


public class Utils {
    public static void writeTofile(String filename, List<Student> students) throws Exception {
        File destFile = new File(filename + ".txt");
        
        if (destFile.exists() == false){
            System.out.println("We had to make a new file");
            destFile.createNewFile();
        }
        PrintWriter out = new PrintWriter(new FileWriter(destFile, true));
        for (Student s : students){
        out.append(s.getName() + ", " + s.getEmail() + ", " + s.getAge() + ", " ); 
        }
    
    }
    
}
