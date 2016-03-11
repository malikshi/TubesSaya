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
public class Petugas extends Orang {
    private long idPetugas;
    private String alamat;

    public Petugas(String nama, String noTlp, String email) {
        super(nama, noTlp, email);
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
    public void editStatus(String idBuku, String namaBuku, String kondisi){
        
    }
    public void tambahPinjam(String idBuku, String namaBuku, String Tanggal){
        
    }
    public void editPinjam(String idBuku, String namaBuku){
        
    }  
}
