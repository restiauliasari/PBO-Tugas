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
class Circle extends Shape{
    int r;
    
    Circle(String nama) 
    {
        super(nama);
        r= 3;
    }
    float getArea() 
    {
        float luas;
        luas = (float)(3.14 * r * r);
        return luas;
    }
}
