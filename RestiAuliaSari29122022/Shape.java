/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestiAuliaSari29122022;

/**
 *
 * @author USER
 */
public abstract class Shape {
    private String nm;
    
    Shape(String nama) 
    {
        nm = nama; 
    }
    public String getName() 
    {
        return nm;
    }
    abstract float getArea();
}
