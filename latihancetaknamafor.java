/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestiAuliaSari27102022;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class latihancetaknamafor {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int i,batas;
        String nama="Viola Yosevi";
        
        System.out.print("Masukkan Batas : ");
        batas = in.nextInt();
        
        for(i=0; i<batas ; i++){
            System.out.println(nama);
        }
    }
}
