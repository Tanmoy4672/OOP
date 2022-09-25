/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Student>arraylist = new ArrayList<Student>();
        Student std = new Student();
        std.setName("Tanmoy");
        std.setAge(22);
        std.setRoll("12-23");
        std.setClas("31C");
        
        arraylist.add(std);
         System.out.println(arraylist.get(0));
         
        Student std1 = new Student();
        std1.setName("Tanmo");
        std1.setAge(12);
        std1.setRoll("12-3");
        std1.setClas("31A");
        
        arraylist.add(std1);
        
        System.out.println(arraylist.get(1));
    }
    
}
