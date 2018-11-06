/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Student implements Serializable{
  int id;
  String name;
  String institute;
  int round;
  String address;
  String contact;

    public Student() {
    }

    public Student(int id, String name, String institute, int round, String address, String contact) {
        this.id = id;
        this.name = name;
        this.institute = institute;
        this.round = round;
        this.address = address;
        this.contact = contact;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the institute
     */
    public String getInstitute() {
        return institute;
    }

    /**
     * @param institute the institute to set
     */
    public void setInstitute(String institute) {
        this.institute = institute;
    }

    /**
     * @return the round
     */
    public int getRound() {
        return round;
    }

    /**
     * @param round the round to set
     */
    public void setRound(int round) {
        this.round = round;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }
    
    
    
      public static void main(String[] args) throws ClassNotFoundException {
       
        File f2 = new File("IDB2");
        File f1 = new File(f2+"//shahid2.txt");
        
        
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
