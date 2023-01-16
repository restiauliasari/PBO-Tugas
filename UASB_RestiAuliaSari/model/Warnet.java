/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UASB_RestiAuliaSari.model;

/**
 *
 * @author USER
 */
public class Warnet {
    private String kode;
    private String jenis;
    private String pelanggan;
    private String tanggal;
    private String jammasuk;
    private String jamkeluar;
    private String tarif;
    private int lama;
    private double total;  

    public Warnet(String kode, String jenis, String pelanggan, String tanggal, String jammasuk, String jamkeluar, String tarif, int lama, double total) {
        this.kode = kode;
        this.jenis = jenis;
        this.pelanggan = pelanggan;
        this.tanggal = tanggal;
        this.jammasuk = jammasuk;
        this.jamkeluar = jamkeluar;
        this.tarif = tarif;
        this.lama = lama;
        this.total = total;
    }

    public Warnet() {
    }
    
    public String getKode(){
        return kode;
    }
    
    public void setKode (String kode){
        this.kode = kode;
    }

    public String getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(String pelanggan) {
        this.pelanggan = pelanggan;
    }
    
    
    public String getJenisPelanggan(){
        return jenis;
    }
    
    public void setJenisPelanggan (String jenis){
        this.jenis = jenis;
    }
    
    public String getTanggalMasuk(){
        return tanggal;
    }
    
    public void setTanggalMasuk (String tanggal){
        this.tanggal = tanggal;
    }   
    
    public String getJamMasuk(){
        return jammasuk;
    }
    
    public void setJamMasuk (String jamMasuk){
        this.jammasuk = jamMasuk;
    }
    
    public String getJamKeluar(){
        return jamkeluar;
    }
    
    public void setJamKeluar (String jamKeluar){
        this.jamkeluar = jamKeluar;
    }

    public void setTarif(String tarif) {
        this.tarif = tarif;
    }

    public String getTarif() {
        return tarif;
    }
    
    public int getLama(){
        lama = Integer.parseInt(jamkeluar) - Integer.parseInt(jammasuk);
        
        if(Integer.parseInt(jammasuk)>=Integer.parseInt(jamkeluar)){
            lama = (Integer.parseInt(jamkeluar)+24) - Integer.parseInt(jammasuk);
        }
        return lama;
    }
    
    public double getTotal(){
        total = Double.parseDouble(tarif) * lama;
        if(jenis == "1"){
            total = total - (total * 0.02);
        }
        else if(jenis == "2"){
            total = total - (total * 0.05);
        }
        return total;
    }
    
}
