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
public class Square extends Shape {
    private int sisi;
    
    Square(String nama) 
    {
        super(nama);
        sisi = 3;
    }
    float getArea() 
    {
        float luas;
        luas = sisi * sisi;
        return luas;
    }
}
