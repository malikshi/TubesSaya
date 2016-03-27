/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Synricha
 */
public class Aplikasi {

    private ArrayList<Orang> orang = new ArrayList();
    private ArrayList<Petugas> daftarPetugas = new ArrayList();
    private ArrayList<Anggota> daftarAnggota = new ArrayList();

    private ArrayList<Peminjaman> daftarPeminjaman = new ArrayList();
    private ArrayList<Buku> daftarBuku = new ArrayList();
    Peminjaman pin;
    Petugas p;
    Buku b;
    Anggota a;

    public void addPetugas(long idPetugas, String nama, String noTlp, String email) {
        p = new Petugas(idPetugas, nama, noTlp, email);
        daftarPetugas.add(p);
        orang.add(p);
    }

    public void addAnggota(long idAnggota, String nama, String noTlp, String email) {
        a = new Anggota(idAnggota, nama, noTlp, email);
        daftarAnggota.add(a);
        orang.add(a);
    }

    public Anggota getAnggota(long idAnggota) {
        boolean iscek = false;
        int angg = 0;
        for (int i = 0; i < daftarAnggota.size(); i++) {
            if (daftarAnggota.get(i).getIdAnggota() == idAnggota) {
                iscek = true;
                angg = i;
            }
        }
        if (iscek == true) {
            return daftarAnggota.get(angg);
        } else {
            return null;
        }
    }

    public void viewAnggota() {
        for (int i = 0; i < daftarAnggota.size(); i++) {
            System.out.println(daftarAnggota.get(i).getNama());
            System.out.println(daftarAnggota.get(i).getIdAnggota());
        }
    }

    public Petugas getPetugas(long idPetugas) {
        boolean iscek = false;
        int angg = 0;
        for (int i = 0; i < daftarPetugas.size(); i++) {
            if (daftarPetugas.get(i).getIdPetugas() == idPetugas) {
                iscek = true;
                angg = i;
            }
        }
        if (iscek == true) {
            return daftarPetugas.get(angg);
        } else {
            return null;
        }
    }

    public boolean deletePetugas(long idPetugas) {
        boolean iscek = false;
        for (int i = 0; i < daftarPetugas.size(); i++) {
            if (daftarPetugas.get(i).getIdPetugas() == idPetugas) {
                daftarPetugas.remove(i);
                iscek = true;
            }
        }
        if (iscek == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean deleteAnggota(long idAnggota) {
        boolean iscek = false;
        for (int i = 0; i < daftarAnggota.size(); i++) {
            if (daftarAnggota.get(i).getIdAnggota() == idAnggota) {
                daftarAnggota.remove(i);
                iscek = true;
            }
        }
        if (iscek == true) {
            return true;
        } else {
            return false;
        }
    }

    public void addPinjaman(long idAnggota, int jumlahPinjam) {
        a = getAnggota(idAnggota);
        pin = new Peminjaman();
        pin.setAnggota(a);
        Scanner bk = new Scanner(System.in);
        String id;
        for (int i = 0; i < jumlahPinjam; i++) {
            id = bk.next();
            b = getBuku(id);
            pin.addPinjaman(b);
        }
        daftarPeminjaman.add(pin);
    }

    public void deleteBukuPinjam(int idTransaksi, String idBuku) {
        for (int i = 0; i < daftarPeminjaman.size(); i++) {
            if (daftarPeminjaman.get(i).getIdTransaksi() == idTransaksi) {
                daftarPeminjaman.get(i).delBuku(idBuku);
            }
        }
    }

    public Peminjaman getPinjam(int idTransaksi) {
        boolean iscek = false;
        int angg = 0;
        for (int i = 0; i < daftarPeminjaman.size(); i++) {
            if (daftarPeminjaman.get(i).getIdTransaksi() == idTransaksi) {
                iscek = true;
                angg = i;
            }
        }
        if (iscek == true) {
            return daftarPeminjaman.get(angg);
        } else {
            return null;
        }
    }

    public void viewPinjaman() {
        for (int i = 0; i < daftarPeminjaman.size(); i++) {
            System.out.println(daftarPeminjaman.get(i).getIdTransaksi());
            System.out.println(daftarPeminjaman.get(i).getAnggota().getNama());
            for (int j = 0; j < daftarPeminjaman.get(i).getPinjaman().size(); j++) {
                System.out.println(daftarPeminjaman.get(i).getPinjaman().get(j).getIdBuku());
                System.out.println(daftarPeminjaman.get(i).getPinjaman().get(j).getNamaBuku());
                System.out.println(daftarPeminjaman.get(i).getPinjaman().get(j).getKondisi());
            }
        }
    }

    public void viewDaftarPinjaman(long idAnggota) {
        for (int i = 0; i < daftarPeminjaman.size(); i++) {
            if (daftarPeminjaman.get(i).getAnggota().getIdAnggota() == idAnggota) {
                System.out.println(daftarPeminjaman.get(i).getIdTransaksi());
                System.out.println(daftarPeminjaman.get(i).getAnggota().getNama());
                for (int j = 0; j < daftarPeminjaman.get(i).getPinjaman().size(); j++) {
                    System.out.println(daftarPeminjaman.get(i).getPinjaman().get(j).getIdBuku());
                    System.out.println(daftarPeminjaman.get(i).getPinjaman().get(j).getNamaBuku());
                    System.out.println(daftarPeminjaman.get(i).getPinjaman().get(j).getKondisi());
                }
            }
        }
    }

    public void addBuku(String idBuku, String namaBuku, String kondisi, int jumlah_total, int jumlah_terpinjam, int jumlah_tersedia) {
        b = new Buku(idBuku, namaBuku, kondisi, jumlah_total, jumlah_terpinjam, jumlah_tersedia);
        daftarBuku.add(b);
    }

    public void editStatusBuku(String idBuku, String kondisi) {
        for (int i = 0; i < daftarBuku.size(); i++) {
            if (daftarBuku.get(i).getIdBuku() == idBuku) {
                daftarBuku.get(i).setKondisi(kondisi);
            }
        }
    }

    public boolean deleteBuku(String idBuku) {
        boolean iscek = false;
        for (int i = 0; i < daftarBuku.size(); i++) {
            if (daftarBuku.get(i).getIdBuku() == idBuku) {
                daftarBuku.remove(i);
                iscek = true;
            }
        }
        if (iscek == true) {
            return true;
        } else {
            return false;
        }
    }

    public Buku getBuku(String idBuku) {
        boolean iscek = false;
        int angg = 0;
        for (int i = 0; i < daftarBuku.size(); i++) {
            if (daftarBuku.get(i).getIdBuku() == idBuku) {
                iscek = true;
                angg = i;
            }
        }
        if (iscek == true) {
            return daftarBuku.get(angg);
        } else {
            return null;
        }
    }

    public void menu() {
        int input = 0;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("1. Add Petugas");
            System.out.println("2. Add Anggota");
            System.out.println("3. Add Buku");
            System.out.println("4. view Anggota");
            System.out.println("5. view peminjaman");
            System.out.println("6. view Daftar Pinjam");
            System.out.println("7. delete Petugas");
            System.out.println("8. delete Anggota");
            System.out.println("9. delete Buku");
            System.out.println("10. Add Pinjam");
            System.out.println("11. Del Buku Pinjam");
            System.out.println("12. Edit Status Buku");
            System.out.println("0. exit");
            System.out.println("Masukan Pilihan");
            try {
                
            input = sc.nextInt();
            switch (input) {
                case 1:
                    long idPetugas = sc.nextLong();
                    String nama = sc.next();
                    String noTlp = sc.next();
                    String email = sc.next();
                    addPetugas(idPetugas, nama, noTlp, email);
                    break;
                case 2:
                    long idAnggota = sc.nextLong();
                    nama = sc.next();
                    noTlp = sc.next();
                    email = sc.next();
                    addAnggota(idAnggota, nama, noTlp, email);
                    break;
                case 3:
                    String idBuku = sc.next();
                    String namaBuku = sc.next();
                    String kondisi = sc.next();
                    int jumlah_total = sc.nextInt();
                    int jumlah_terpinjam = sc.nextInt();
                    int jumlah_tersedia = sc.nextInt();
                    addBuku(idBuku, namaBuku, kondisi, jumlah_total, jumlah_terpinjam, jumlah_tersedia);
                    break;
                case 4:
                    viewAnggota();
                    break;
                case 5:
                    viewPinjaman();
                    break;
                case 6:
                    idAnggota = sc.nextLong();
                    viewDaftarPinjaman(idAnggota);
                    break;
                case 7:
                    idPetugas = sc.nextLong();
                    deletePetugas(idPetugas);
                    break;
                case 8:
                    idAnggota = sc.nextLong();
                    deleteAnggota(idAnggota);
                    break;
                case 9:
                    idBuku = sc.next();
                    deleteBuku(idBuku);
                    break;
                case 10:
                    int jumlahPinjam = sc.nextInt();
                    idAnggota = sc.nextLong();
                    addPinjaman(idAnggota, jumlahPinjam);
                    break;
                case 11:
                    int idTransaksi= sc.nextInt();
                    idBuku= sc.next();
                    deleteBukuPinjam(idTransaksi, idBuku);
                    break;
                case 12:
                    idBuku=sc.next();
                    kondisi=sc.next();
                    editStatusBuku(idBuku, kondisi);
                    break;
                default:
                    break;

            }
            } catch (Exception e){
                System.err.println("Kesalahan Input");
            }
        } while (input != 0);
        
    }
}
