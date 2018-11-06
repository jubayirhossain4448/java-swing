/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ReadWrite {
    public static void main(String[] args) throws ClassNotFoundException {
       
        File f2 = new File("IDB");
        File f1 = new File(f2+"//shahid.txt");
        
        
        try {
            boolean b1 = f2.mkdir();
            boolean b2 = f1.createNewFile();
            FileOutputStream fos = new FileOutputStream(f1);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Student s1 = new Student(1243932,"shahid", "IDB-BISEW", 37, "Dhanmondi", "01757948310");
            Student s3 = new Student(1243933,"shahid2", "IDB-BISEW2", 38, "Dhanmondi2", "017579483102");
            oos.writeObject(s1);
            oos.writeObject(s3);
            
            FileInputStream fis = new FileInputStream(f1);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s2;
            
            while((s2=(Student)ois.readObject())!= null){
                System.out.println(s2.id+" \t"+s2.name+"\t "+s2.institute+" \t"+s2.round+"\t "+s2.contact);
//                System.out.println(s2.name+" ");
//                System.out.println(s2.institute+" ");
//                System.out.println(s2.round+" ");
//                System.out.println(s2.contact+" ");
                
            }
            ois.close();
        } catch (Exception ex) {
            
        }
        
    }
}
