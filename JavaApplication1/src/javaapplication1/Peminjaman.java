/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author Synricha
 */
public class Peminjaman {

    private ArrayList<Buku> pinjaman = new ArrayList();
    private Anggota peminjam;
    private long idTransaksi;
    private static long tmpId = 1;
    private int npinjam = 0;

    public Peminjaman() {
        this.idTransaksi = tmpId;
        autoIncrement();
    }

    public long getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(long idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public void autoIncrement() {
        tmpId++;
    }

    public ArrayList<Buku> getPinjaman() {
        return pinjaman;
    }

    public void setPinjaman(ArrayList<Buku> pinjaman) {
        this.pinjaman = pinjaman;
    }

    public Anggota getPeminjam() {
        return peminjam;
    }

    public void setPeminjam(Anggota peminjam) {
        this.peminjam = peminjam;
    }

    public int getNpinjam() {
        return npinjam;
    }

    public void setNpinjam(int npinjam) {
        this.npinjam = npinjam;
    }

    public boolean delBuku(String idBuku) {
        boolean iscek = false;
        for (int i = 0; i < pinjaman.size(); i++) {
            if (pinjaman.get(i).getIdBuku() == idBuku) {
                pinjaman.remove(i);
                iscek = true;
            }
        }
        if (iscek == true) {
            return true;
        } else {
            return false;
        }

    }

    public void addPinjaman(Buku b) {
        if (npinjam < 5) {
            pinjaman.add(b);
            npinjam++;
        }
    }

    public int getJumlahPinjam() {
        return npinjam;
    }

    public Buku getBuku(int i) {
        return pinjaman.get(i);
    }

    public void setAnggota(Anggota a) {
        this.peminjam = a;
    }

    public Anggota getAnggota() {
        return peminjam;
    }
    
}
