/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestiAuliaSari.controller;
import RestiAuliaSari.model.*;
import RestiAuliaSari.view.FormPeminjaman;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class PeminjamanController {
    private FormPeminjaman formPeminjaman;
    private AnggotaDao anggotaDao;
    private BukuDao bukuDao;
    private Peminjaman peminjaman;
    private PeminjamanDao peminjamanDao;
    
    public PeminjamanController (FormPeminjaman formPeminjaman){
        this.formPeminjaman = formPeminjaman;
        anggotaDao = new AnggotaDaoImpl();
        bukuDao = new BukuDaoImpl();
        peminjamanDao = new PeminjamanDaoImpl();
    }
    
    public void bersihForm(){
        formPeminjaman.getTxtTglPinjam().setText("");
        formPeminjaman.getTxtTglKembali().setText("");
    }
    
    public void setCboNobp(){
        formPeminjaman.getCboNobp().removeAllItems();
        List <Anggota> list = anggotaDao.getAll();
        for (Anggota anggota: list) {
            formPeminjaman.getCboNobp().
                    addItem(anggota.getNobp()+"-"+anggota.getNama());
        }
    }
    
    public void setCboBuku(){
        formPeminjaman.getCboBuku().removeAllItems();
        List <Buku> list = bukuDao.getAll();
        for (Buku buku: list) {
            formPeminjaman.getCboBuku().
                    addItem(buku.getKodeBuku());
        }
    }
    
    public void save(){
        peminjaman = new Peminjaman();
        peminjaman.setNobp(formPeminjaman.getCboNobp()
            .getSelectedItem().toString().split("-")[0]);
        peminjaman.setKodebuku(formPeminjaman.getCboBuku()
            .getSelectedItem().toString());
        peminjaman.setTglpinjam(formPeminjaman.getTxtTglPinjam().getText());
        peminjaman.setTglkembali(formPeminjaman.getTxtTglKembali().getText());
        peminjamanDao.save(peminjaman);
        JOptionPane.showMessageDialog(formPeminjaman, "Entri Ok");
        
    }
    
    public void getPeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        if(peminjaman != null){
            List<Anggota> listAnggota = anggotaDao.getAll();
            for (Anggota anggota:listAnggota){
                formPeminjaman.getCboNobp().setSelectedItem(anggota.getNobp()+"-"+anggota.getNama());
                break;
            }
            
        }
        formPeminjaman.getCboBuku().setSelectedItem(peminjaman.getKodebuku());
        formPeminjaman.getTxtTglPinjam().setText(peminjaman.getTglpinjam());
        formPeminjaman.getTxtTglKembali().setText(peminjaman.getTglkembali());
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = 
                (DefaultTableModel) formPeminjaman.getTblPeminjaman().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Peminjaman> list = peminjamanDao.getAllPeminjaman();
        for(Peminjaman peminjaman : list){
            Object[] data = {
                peminjaman.getNobp(),
                peminjaman.getKodebuku(),
                peminjaman.getTglpinjam(),
                peminjaman.getTglkembali(),
            };
            tabelModel.addRow(data);
        }
    }
}
