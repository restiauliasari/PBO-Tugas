/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UASB_RestiAuliaSari.controller;
import UASB_RestiAuliaSari.model.*;
import UASB_RestiAuliaSari.view.FormWarnet;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author USER
 */
public class WarnetController {
    
    private FormWarnet formWarnet;
    private PelangganDao pelangganDao;
    private WarnetDao warnetDao;
    private Warnet warnet;
    
    public WarnetController(FormWarnet formWarnet){
        this.formWarnet = formWarnet;
        pelangganDao = new PelangganDaoImpl();
        warnetDao = new WarnetDaoImpl();
    }
    
    public void setCboPelanggan(){
        formWarnet.getCboPelanggan().removeAllItems();
        List<Pelanggan> list = pelangganDao.getAll();
        for (Pelanggan pelanggan : list){
            formWarnet.getCboPelanggan().addItem(pelanggan.getKode()+"-"+pelanggan.getNamapelanggan());
        }
    }
    
    public void setCboJenisPelanggan(){
        formWarnet.getCboJenispelanggan().removeAllItems();
        List<Pelanggan> list = pelangganDao.getAll();
        for (Pelanggan pelanggan : list){
            formWarnet.getCboJenispelanggan().addItem(pelanggan.getJenispelanggan());
        }
    }
    
    public void bersihForm(){
        formWarnet.getTxtKode().setText("");
        formWarnet.getTxtTglmasuk().setText("");
        formWarnet.getTxtJammasuk().setText("");
        formWarnet.getTxtJamkeluar().setText("");
        formWarnet.getTxtTarif().setText("");
    }
    
    public void getWarnet(){
        int index = formWarnet.getTblWarnet().getSelectedRow();
        warnet = warnetDao.getWarnet(index);
        formWarnet.getTxtKode().setText(warnet.getKode());
        if(warnet != null){
            List<Pelanggan> listPelanggan = pelangganDao.getAll();
            for(Pelanggan pelanggan:listPelanggan){
                if(warnet.getKode()==pelanggan.getKode()){
                    formWarnet.getCboPelanggan().setSelectedItem(pelanggan.getKode()+"-"+pelanggan.getNamapelanggan());
                    break;
                }
            }
            formWarnet.getCboJenispelanggan().setSelectedItem(warnet.getJenisPelanggan());
            formWarnet.getTxtTglmasuk().setText(warnet.getTanggalMasuk());
            formWarnet.getTxtJammasuk().setText(warnet.getJamMasuk());
            formWarnet.getTxtJamkeluar().setText(warnet.getJamKeluar());
            formWarnet.getTxtTarif().setText(warnet.getTarif());
        }
    }
    
    public void saveWarnet(){
        warnet = new Warnet();
        warnet.setKode(formWarnet.getTxtKode().getText());
        warnet.setPelanggan(formWarnet.getCboPelanggan().getSelectedItem().toString());
        warnet.setJenisPelanggan(formWarnet.getCboJenispelanggan().getSelectedItem().toString());
        warnet.setTanggalMasuk(formWarnet.getTxtTglmasuk().getText());
        warnet.setJamMasuk(formWarnet.getTxtJammasuk().getText());
        warnet.setJamKeluar(formWarnet.getTxtJamkeluar().getText());
        warnet.setTarif(formWarnet.getTxtTarif().getText());
        warnetDao.save(warnet);
        JOptionPane.showMessageDialog(formWarnet, "Entri Data Ok!");
    }    
    
    public void deleteWarnet(){
        int index = formWarnet.getTblWarnet().getSelectedRow();
        warnetDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formWarnet, "Delete Ok!");
    }
    
    public void UpdateWarnet() {
        int index = formWarnet.getTblWarnet().getSelectedRow();
        warnet = warnetDao.getWarnet(index);
        warnet.setKode(formWarnet.getTxtKode().getText());
        warnet.setPelanggan(formWarnet.getCboPelanggan().getSelectedItem().toString().split("-")[0]);
        warnet.setJenisPelanggan(formWarnet.getCboJenispelanggan().getSelectedItem().toString());
        warnet.setTanggalMasuk(formWarnet.getTxtTglmasuk().getText());
        warnet.setJamMasuk(formWarnet.getTxtJammasuk().getText());
        warnet.setJamKeluar(formWarnet.getTxtJamkeluar().getText());
        warnet.setTarif(formWarnet.getTxtTarif().getText());
        warnetDao.update(index, warnet);
        javax.swing.JOptionPane.showMessageDialog(formWarnet, "Update Ok!");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = (DefaultTableModel) formWarnet.getTblWarnet().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Warnet> listWarnet = warnetDao.getAll();
        for(Warnet warnet : listWarnet){
            Object[] data={
                warnet.getKode(),
                warnet.getPelanggan(),
                warnet.getJenisPelanggan(),
                warnet.getTanggalMasuk(),
                warnet.getJamMasuk(),
                warnet.getJamKeluar(),
                warnet.getLama(),
                warnet.getTarif(),
                warnet.getTotal()
            };
            tabelModel.addRow(data);
        }
    }
}
