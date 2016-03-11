/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Synricha
 */
public class Buku {
    private String idBuku;
    private String namaBuku;
    private String kondisi;
    private int jumlah_total;
    private int jumlah_tersedia;
    private int jumlah_terpinjam;
    
    public Buku(String idBuku,String namaBuku,String kondisi,int jumlah_total,int jumlah_terpinjam,int jumlah_tersedia){
        this.idBuku=idBuku;
        this.jumlah_terpinjam=jumlah_terpinjam;
        this.namaBuku=namaBuku;
        this.kondisi=kondisi;
        this.jumlah_total=jumlah_total;
        this.jumlah_tersedia=jumlah_tersedia;
    }
    public String getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(String idBuku) {
        this.idBuku = idBuku;
    }

    public String getNamaBuku() {
        return namaBuku;
    }

    public void setNamaBuku(String namaBuku) {
        this.namaBuku = namaBuku;
    }

    public String getKondisi() {
        return kondisi;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    public int getJumlah_total() {
        return jumlah_total;
    }

    public void setJumlah_total(int jumlah_total) {
        this.jumlah_total = jumlah_total;
    }

    public int getJumlah_tersedia() {
        return jumlah_tersedia;
    }

    public void setJumlah_tersedia(int jumlah_tersedia) {
        this.jumlah_tersedia = jumlah_tersedia;
    }

    public int getJumlah_terpinjam() {
        return jumlah_terpinjam;
    }

    public void setJumlah_terpinjam(int jumlah_terpinjam) {
        this.jumlah_terpinjam = jumlah_terpinjam;
    }
    
    

}
