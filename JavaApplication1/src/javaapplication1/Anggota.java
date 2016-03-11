/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Rizky
 */
public class Anggota extends Orang {
    private long idAnggota;
    private String alamat;
    
    public void Daftar(String idAnggota, String nama, long noTlp, String email) {
        
    }
    
    public void viewDaftarPinjam(String idBuku, String namaBuku, String kondisi) {
        
    }
    
    public void viewDaftarBarangPinjam(String idBuku, String namaBuku, String tanggal) {
        
    }
    
    public void setAnggota(String nama, long idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
    }
    
    public String getAnggota() {
        return nama;
    }
}
