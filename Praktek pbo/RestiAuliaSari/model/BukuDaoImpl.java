/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestiAuliaSari.model;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class BukuDaoImpl implements BukuDao {
     List<Buku> data = new ArrayList<>();

    public BukuDaoImpl() {
        data.add(new Buku("B001", "Pascal", "Resti", "Resti"));
        data.add(new Buku("B002", "Algoritma", "Aulia", "Aulia"));
        data.add(new Buku("B003", "Java", "Sari", "Sari"));
    }
     
    public void save(Buku buku){
        data.add(buku);
    }
    public void update(int index,Buku buku){
        data.set(index, buku);
    }
    public void delete(int index){
        data.remove(index);
    }
    public Buku getBuku(int index){
        return data.get(index);
    }
    public List<Buku>getAll(){
        return data;
    }
}
