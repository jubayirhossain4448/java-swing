
package Evidence;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Utils {
    
    public static void writeToFile(String filename, List<Student> students) throws Exception{
    
        File destFile = new File(filename + ".txt");
        
        try {
            if(destFile.exists() == false){
                System.out.println("Need to create file");
                destFile.createNewFile();
            }
            
            PrintWriter out = new PrintWriter(new FileWriter(destFile, true));
            for (Student s : students){
            out.append(s.getId() + "," + s.getName()+ "," + s.getEmail()+ "," + s.getPassword()+ "," + s.getGender()+ "," + s.getHobby()+ "," + s.getRound()+ "," + s.getMsg()+ ",");
            
            }
            out.close();;
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    
    public static void displayToFile(String filename, DefaultTableModel model){
    
    }
}
