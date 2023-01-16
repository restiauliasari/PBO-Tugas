/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UASB_RestiAuliaSari.model;

import java.util.List;

/**
 *
 * @author USER
 */
public class Pelanggan {
    private String kode;
    private String namapelanggan;
    private String jenispelanggan;

    public Pelanggan() {
        
    }

    public Pelanggan(String kode, String namapelanggan, String jenispelanggan) {
        this.kode = kode;
        this.namapelanggan = namapelanggan;
        this.jenispelanggan = jenispelanggan;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNamapelanggan() {
        return namapelanggan;
    }

    public void setNamapelanggan(String namapelanggan) {
        this.namapelanggan = namapelanggan;
    }

    public String getJenispelanggan() {
        return jenispelanggan;
    }

    public void setJenispelanggan(String jenispelanggan) {
        this.jenispelanggan = jenispelanggan;
    }
    
   
}
