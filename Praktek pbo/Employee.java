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
public class Employee extends Person{
    
    @Override
     public String getName(){ 
        System.out.println("getName Employee");
        return name; 
    } 
}
