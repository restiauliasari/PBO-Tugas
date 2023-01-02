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
public class AnggotaDaoImpl implements AnggotaDao {
    List<Anggota> data = new ArrayList<>();

    public AnggotaDaoImpl() {
        data.add(new Anggota("1001", "Resti", "Padang"));
        data.add(new Anggota("1002", "Aulia", "Solok"));
        data.add(new Anggota("1003", "Sari", "Pariaman"));
    }
    
    public void save(Anggota anggota){
        data.add(anggota);
    }
    public void update(int index,Anggota anggota){
        data.set(index, anggota);
    }
    public void delete(int index){
        data.remove(index);
    }
    public Anggota getAnggota(int index){
        return data.get(index);
    }
    public List<Anggota>getAll(){
        return data;
    }
}
