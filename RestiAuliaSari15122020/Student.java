/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestiAuliaSari15122020;

/**
 *
 * @author USER
 */
public class Student extends Person {
    public Student(){ 
        super ("Anna","Padang");
        System.out.println("Inside Student:Constructor"); 
    } 
    public static void main( String[] args ){ 
        Student anna = new Student(); 
        System.out.println(anna.name);
        System.out.println(anna.address);
    }
     public String getName(){ 
        System.out.println("getName Student");
        return name; 
    } 
}
