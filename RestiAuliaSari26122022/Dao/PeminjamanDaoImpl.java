/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestiAuliaSari.Dao;
import RestiAuliaSari.model.Peminjaman;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author USER
 */
public class PeminjamanDaoImpl implements PeminjamanDao{
     List<Peminjaman> data = new ArrayList<>();

    public PeminjamanDaoImpl() {
    }
    
    public void save(Peminjaman peminjaman){
         data.add(peminjaman);
    }
    public void update(int index, Peminjaman peminjaman){
        data.set(index, peminjaman);
    }
    public void delete (int index){
         data.remove(index);
    }
    public Peminjaman getPeminjaman(int index){
          return data.get(index);
    }
    public List<Peminjaman> getAll(){
         return data;
    }
}
