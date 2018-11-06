/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Delwar Pc
 */
public class WriteStudent {
    public static void main(String[] args) {
        File f2 = new File("apon3");
        File f1 = new File(f2 + "\\apon3.txt");

        try {
            boolean b1 = f2.mkdir();
            boolean b2 = f1.createNewFile();

            FileOutputStream fos = new FileOutputStream(f1);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Student1 s1 = new Student1(111, "aponhub", "Laxmipur");
            oos.writeObject(s1);
            oos.close();
            
            
            FileInputStream fis = new FileInputStream(f1);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student1 s2;
            while ((s2 = (Student1) ois.readObject()) != null) {
                System.out.print(s2.getId());
                System.out.print("   ");
                System.out.print(s2.getName());
                System.out.print("   ");
                System.out.print(s2.getAddress());
            }
            ois.close();
        } catch (Exception e) {
            System.out.println();
        }
    }
}
