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

    public long getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(long idAnggota) {
        this.idAnggota = idAnggota;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Anggota(String nama, String noTlp, String email) {
        super(nama, noTlp, email);
    }
    
    public void Daftar(String idAnggota, String nama, long noTlp, String email) {
        
    }
    
        public void viewDaftarPinjam(String idBuku, String namaBuku, String kondisi) {
        int i=0;
        do {    
            System.out.println("ID Buku     : " +Buku[i].idBuku);
            System.out.println("Nama Buku   : " +Buku[i].namaBuku);
            System.out.println("Kondisi     : " +Buku[i].kondisi);
            i = i+1;
        while(Buku[i]!=null) }     
    }
    
    public void viewDaftarBarangPinjam(String idBuku, String namaBuku, String tanggal) {
        do {    
            System.out.println("ID      : " +Buku[i].idBuku);
            System.out.println("Nama    : " +Buku[i].namaBuku);
            System.out.println("Tanggal : " +Buku[i].tanggal);
            i = i+1;
        while(Buku[i]!=null)
    }
    
    public void setAnggota(String nama, long idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
    }
    
    public String getAnggota() {
        return nama;
    }
    
    
    
}
