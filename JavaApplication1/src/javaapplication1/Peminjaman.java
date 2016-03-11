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
public class Peminjaman {
    private static  Buku[] pinjaman = new Buku[5];
    private Anggota peminjam;
    private int npinjam=0;
    
    public void addPinjaman(Buku b){
        if(npinjam<5){
            this.pinjaman[npinjam]= b;
            npinjam++;
        }
    }
    public int getJumlahPinjam(){
        return npinjam;
    }
    public Buku getBuku(int i){
        return pinjaman[i];
    }
    public void setAnggota(Anggota a){
        this.peminjam=a;
    }
    public Anggota getAnggota(){
        return peminjam;
    }
}
