/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UASB_RestiAuliaSari.model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author USER
 */
public class PelangganDaoImpl implements PelangganDao{
    List<Pelanggan> data = new ArrayList<>();

    public PelangganDaoImpl() { 
        data.add(new Pelanggan("2018", "resti", "1"));
        data.add(new Pelanggan("2003", "yudha", "2"));
        data.add(new Pelanggan("2068", "caca", "Other"));
        
    }
 
    public Pelanggan save(Pelanggan pelanggan){
        data.add(pelanggan);
        return pelanggan;
    }
    
    public Pelanggan update(int index, Pelanggan pelanggan){
        data.set(index, pelanggan);
        return pelanggan;
    }
    
    public Pelanggan delete(int index){
        return data.remove(index);
    }
    
    public Pelanggan getPelanggan (int index){
        return data.get(index);
    }
    
    public List<Pelanggan> getAll(){
        return data;
    }
   
}
