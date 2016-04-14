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

    private ArrayList<Orang> orang;
    private ArrayList<Petugas> daftarPetugas;
    private ArrayList<Anggota> daftarAnggota;
    private ArrayList<Peminjaman> daftarPeminjaman;
    private ArrayList<Buku> daftarBuku;

    public Aplikasi() {
        orang = new ArrayList<>();
        daftarAnggota = new ArrayList<>();
        daftarPetugas = new ArrayList<>();
        daftarPeminjaman = new ArrayList<>();
        daftarBuku = new ArrayList<>();
    }

//    Anggota a;
    public void addPetugas(Petugas p) {
        daftarPetugas.add(p);
        orang.add(p);
    }

    public void addAnggota(Anggota a) {
        this.daftarAnggota.add(a);
        this.orang.add(a);
    }

    public void editPenjaga(long idCari, long idPetugas, String username, String password, String nama, String alamat, String noTlp, String email) {
        Petugas p;
        p = getPetugas(idCari);
        p.setIdPetugas(idPetugas);
        p.setUsername(username);
        p.setUsername(username);
        p.setAlamat(alamat);
        p.setNoTlp(noTlp);
        p.setEmail(email);
    }

    public void editAnggota(long idCari, long idAnggota, String username, String password, String nama, String alamat, String noTlp, String email) {
        Anggota a = getAnggota(idCari);
        a.setIdAnggota(idAnggota);
        a.setUsername(username);
        a.setUsername(username);
        a.setAlamat(alamat);
        a.setNoTlp(noTlp);
        a.setEmail(email);
    }

    public boolean cekAnggota(String username, String password) {
        boolean cek = false;
        for (int i = 0; i < daftarAnggota.size(); i++) {
            if (daftarAnggota.get(i).getPassword().equals(password) && daftarAnggota.get(i).getUsername().equals(username)) {
                cek = true;
            } else {
                cek = false;
            }
        }
        return cek;
    }

    public boolean cekPetugas(String username, String password) {
        boolean cek = false;
        for (int i = 0; i < daftarPetugas.size(); i++) {
            if (daftarPetugas.get(i).getPassword().equals(password) && daftarPetugas.get(i).getUsername().equals(username)) {
                cek = true;
            } else {
                cek = false;
            }
        }
        return cek;
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
            System.out.println(daftarAnggota.get(i).toString());
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
        Anggota a = getAnggota(idAnggota);
        Buku b;
        Peminjaman pin;
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
        Buku b;
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
        int input, inputpm, inputam;
        boolean status = true;
        inputpm = 0;
        input = 0;
        inputam = 0;
        long idPetugas;
        long idAnggota;
        String username;
        String password;
        String nama;
        String alamat;
        String noTlp;
        String email;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Management Library");
            System.out.println("1.Mendaftar Anggota");
            System.out.println("2.Mendaftar Petugas");
            System.out.println("3.Login Petugas");
            System.out.println("4.Login Anggota");
            System.out.println("0.Exit");
            System.out.print("Masukan Pilihan:");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.print("Masukan ID:");
                    idAnggota = sc.nextLong();
                    System.out.print("Masukan Username:");
                    username = sc.next();
                    System.out.print("Masukan Password:");
                    password = sc.next();
                    System.out.print("Masukan Nama:");
                    nama = sc.next();
                    System.out.print("Masukan alamat:");
                    alamat = sc.next();
                    System.out.print("Masukan No Telepon:");
                    noTlp = sc.next();
                    System.out.print("Masukan Email:");
                    email = sc.next();
                    Anggota a = new Anggota(idAnggota, username, password, nama, alamat, noTlp, email);
                    addAnggota(a);
                    break;
                case 2:
                    System.out.print("Masukan ID:");
                    idPetugas = sc.nextLong();
                    System.out.print("Masukan Username:");
                    username = sc.next();
                    System.out.print("Masukan Password:");
                    password = sc.next();
                    System.out.print("Masukan Nama:");
                    nama = sc.next();
                    System.out.print("Masukan alamat:");
                    alamat = sc.next();
                    System.out.print("Masukan No Telepon:");
                    noTlp = sc.next();
                    System.out.print("Masukan Email:");
                    email = sc.next();
                    Petugas p;
                    p = new Petugas(idPetugas, username, password, nama, alamat, noTlp, email);
                    addPetugas(p);
                    break;
                case 3:
                    do {

                        System.out.print("Masukan Username\t:");
                        username = sc.next();
                        System.out.print("Masukan Password\t:");
                        password = sc.next();
                        if (cekPetugas(username, password) == true) {
                            status = true;
                            do {
                                System.out.println("MENU PETUGAS");
                                System.out.println("1.Add Anggota");
                                System.out.println("2.Add Buku");
                                System.out.println("3.Edit Buku");
                                System.out.println("4.Hapus Buku");
                                System.out.println("5.Cari Buku");
                                System.out.println("6.List Buku");
                                System.out.println("7.Edit Status Buku");
                                System.out.println("8.Transaksi Pinjam");
                                System.out.println("9.Edit Personal");
                                System.out.println("0.Logout");
                                System.out.print("Masukan Pilihan\t:");
                                inputpm = sc.nextInt();
                                switch (inputpm) {
                                    case 1:
                                        System.out.print("Masukan ID\t:");
                                        idAnggota = sc.nextLong();
                                        System.out.print("Masukan Username\t:");
                                        username = sc.next();
                                        System.out.print("Masukan Password\t:");
                                        password = sc.next();
                                        System.out.print("Masukan Nama\t:");
                                        nama = sc.next();
                                        System.out.print("Masukan alamat\t:");
                                        alamat = sc.next();
                                        System.out.print("Masukan No Telepon\t:");
                                        noTlp = sc.next();
                                        System.out.print("Masukan Email\t:");
                                        email = sc.next();
                                        a = new Anggota(idAnggota, username, password, nama, alamat, noTlp, email);
                                        addAnggota(a);
                                        break;
                                    case 2:
                                        System.out.print("Masukan ISBN\t:");
                                        String idBuku = sc.next();
                                        System.out.print("Masukan Judul Buku:\t");
                                        String namaBuku = sc.next();
                                        System.out.print("Status Buku");
                                        String kondisi = sc.next();
                                        System.out.print("Jumlah Total\t:");
                                        int jumlah_total = sc.nextInt();
                                        System.out.print("Jumlah Terpinjam:\t");
                                        int jumlah_terpinjam = sc.nextInt();
                                        System.out.print("Jumlah Tersedia");
                                        int jumlah_tersedia = sc.nextInt();
                                        addBuku(idBuku, namaBuku, kondisi, jumlah_total, jumlah_terpinjam, jumlah_tersedia);
                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        System.out.print("Masukan ISBN Buku yang akan dihapus \t:");
                                        idBuku = sc.next();
                                        if (deleteBuku(idBuku) == true) {
                                            System.out.println("Buku Tehapus");
                                        }
                                        break;
                                    case 5:
                                        System.out.print("Masukan ISBN buku \t:");
                                        idBuku = sc.next();
                                        System.out.println(getBuku(idBuku));
                                        break;
                                    case 6:
                                        viewPinjaman();
                                        break;
                                    case 7:
                                        System.out.print("Masukan ISBN buku \t:");
                                        idBuku = sc.next();
                                        System.out.print("Masukan Status Buku \t:");
                                        kondisi = sc.next();
                                        editStatusBuku(idBuku, kondisi);
                                        break;
                                    case 8:
                                        System.out.print("Masukan ID Anggota \t:");
                                        idAnggota = sc.nextLong();
                                        System.out.print("Masukan Jumlah Buku yang dipinjam \t:");
                                        int jumlahBuku;
                                        jumlahBuku = sc.nextInt();
                                        addPinjaman(idAnggota, jumlahBuku);
                                        break;
                                    case 9:
                                        System.out.print("Masukan ID Anda Sekarang \t:");
                                        long idcari;
                                        idcari = sc.nextLong();
                                        System.out.print("Masukan ID Baru \t:");
                                        idPetugas = sc.nextLong();
                                        System.out.print("Masukan Username Baru \t:");
                                        username = sc.next();
                                        System.out.print("Masukan Password Baru \t:");
                                        password = sc.next();
                                        System.out.print("Masukan Nama Baru \t:");
                                        nama = sc.next();
                                        System.out.print("Masukan alamat Baru \t:");
                                        alamat = sc.next();
                                        System.out.print("Masukan No Telepon Baru \t:");
                                        noTlp = sc.next();
                                        System.out.print("Masukan Email Baru  \t:");
                                        email = sc.next();
                                        editPenjaga(idcari, idPetugas, username, password, nama, alamat, noTlp, email);
                                        break;
                                    default:
                                        break;

                                }//switch
                            } while (inputpm != 0);
                        } else {
                            System.out.println("Username atau Password Salah");
                            status = true;
                        }
                    } while (status == false);
                    break;
                case 4:
                    do {
                        System.out.print("Masukan Username\t:");
                        username = sc.next();
                        System.out.print("Masukan Password\t:");
                        password = sc.next();
                        if (cekAnggota(username, password) == true) {

                            status = true;
                            do {
                                System.out.println("MENU ANGGOTA");
                                System.out.println("1.Personal");// edit profil
                                System.out.println("2.List Buku");
                                System.out.println("3.Cari Buku");
                                System.out.println("4.Pinjam Buku");
                                System.out.println("5.Kembalikan Buku");
                                System.out.println("6.List Pinjam");
                                System.out.println("7. Edit Personal");
                                System.out.println("0.Logout");
                                System.out.print("Masukan Pilihan\t:");
                                inputpm = sc.nextInt();
                                switch (inputam) {
                                    case 1:
                                        System.out.print("Masukan Id \t:");
                                        idAnggota = sc.nextLong();
                                        System.out.println(getAnggota(idAnggota));
                                        break;
                                    case 2:
                                        viewPinjaman();
                                        break;
                                    case 3:
                                        System.out.print("Masukan ISBN Buku :");
                                        String idBuku;
                                        idBuku = sc.next();
                                        System.out.println(getBuku(idBuku));
                                        break;
                                    case 4:
                                        System.out.print("Masukan ID Anggota \t:");
                                        idAnggota = sc.nextLong();
                                        System.out.print("Masukan Jumlah Buku yang dipinjam \t:");
                                        int jumlahBuku;
                                        jumlahBuku = sc.nextInt();
                                        addPinjaman(idAnggota, jumlahBuku);
                                        break;
                                    case 5:
                                        System.out.print("Masukan Id Transaksi \t:");
                                        int idTransaksi;
                                        idTransaksi = sc.nextInt();
                                        System.out.print("Masukan ISBN Buku :");
                                        idBuku = sc.next();
                                        break;
                                    //deleteBukuPinjam(idTransaksi, idBuku);
                                    case 6:
                                        System.out.print("Masukan ID Anggota \t:");
                                        idAnggota = sc.nextLong();
                                        viewDaftarPinjaman(idAnggota);
                                        break;
                                    case 7:
                                        System.out.print("Masukan ID Anda Sekarang \t:");
                                        long idcari;
                                        idcari = sc.nextLong();
                                        System.out.print("Masukan ID Baru \t:");
                                        idAnggota = sc.nextLong();
                                        System.out.print("Masukan Username Baru \t:");
                                        username = sc.next();
                                        System.out.print("Masukan Password Baru \t:");
                                        password = sc.next();
                                        System.out.print("Masukan Nama Baru \t:");
                                        nama = sc.next();
                                        System.out.print("Masukan alamat Baru \t:");
                                        alamat = sc.next();
                                        System.out.print("Masukan No Telepon Baru \t:");
                                        noTlp = sc.next();
                                        System.out.print("Masukan Email Baru  \t:");
                                        email = sc.next();
                                        editAnggota(idcari, idAnggota, username, password, nama, alamat, noTlp, email);
                                        break;
                                    default:
                                        break;

                                }//switch
                            } while (inputam != 0);
                        } else {
                            System.out.println("Username atau Password Salah");
                            status = true;
                        }
                    } while (status == false);
                    break;

            }

        } while (input != 0);

    }
}

//        do {
//            System.out.println("1. Add Petugas");
//            System.out.println("2. Add Anggota");
//            System.out.println("3. Add Buku");
//            System.out.println("4. view Anggota");
//            System.out.println("5. view peminjaman");
//            System.out.println("6. view Daftar Pinjam");
//            System.out.println("7. delete Petugas");
//            System.out.println("8. delete Anggota");
//            System.out.println("9. delete Buku");
//            System.out.println("10. Add Pinjam");
//            System.out.println("11. Del Buku Pinjam");
//            System.out.println("12. Edit Status Buku");
//            System.out.println("0. exit");
//            System.out.println("Masukan Pilihan");
//            try {
//
//                input = sc.nextInt();
//                switch (input) {
//                    case 1:
//                        long idPetugas = sc.nextLong();
//                        String username = sc.next();
//                        String password = sc.next();
//                        String nama = sc.next();
//                        String alamat = sc.next();
//                        String noTlp = sc.next();
//                        String email = sc.next();
//                        p = new Petugas(idPetugas, username, password, nama, alamat, noTlp, email);
//                        addPetugas(p);
//                        break;
//                    case 2:
//                        long idAnggota = sc.nextLong();
//                        username = sc.next();
//                        password = sc.next();
//                        nama = sc.next();
//                        alamat = sc.next();
//                        noTlp = sc.next();
//                        email = sc.next();
//                        a = new Anggota(idAnggota, username, password, nama, alamat, noTlp, email);
//                        addAnggota(a);
//                        break;
//                    case 3:
//                        String idBuku = sc.next();
//                        String namaBuku = sc.next();
//                        String kondisi = sc.next();
//                        int jumlah_total = sc.nextInt();
//                        int jumlah_terpinjam = sc.nextInt();
//                        int jumlah_tersedia = sc.nextInt();
//                        addBuku(idBuku, namaBuku, kondisi, jumlah_total, jumlah_terpinjam, jumlah_tersedia);
//                        break;
//                    case 4:
//                        viewAnggota();
//                        break;
//                    case 5:
//                        viewPinjaman();
//                        break;
//                    case 6:
//                        idAnggota = sc.nextLong();
//                        viewDaftarPinjaman(idAnggota);
//                        break;
//                    case 7:
//                        idPetugas = sc.nextLong();
//                        deletePetugas(idPetugas);
//                        break;
//                    case 8:
//                        idAnggota = sc.nextLong();
//                        deleteAnggota(idAnggota);
//                        break;
//                    case 9:
//                        idBuku = sc.next();
//                        deleteBuku(idBuku);
//                        break;
//                    case 10:
//                        int jumlahPinjam = sc.nextInt();
//                        idAnggota = sc.nextLong();
//                        addPinjaman(idAnggota, jumlahPinjam);
//                        break;
//                    case 11:
//                        int idTransaksi = sc.nextInt();
//                        idBuku = sc.next();
//                        deleteBukuPinjam(idTransaksi, idBuku);
//                        break;
//                    case 12:
//                        idBuku = sc.next();
//                        kondisi = sc.next();
//                        editStatusBuku(idBuku, kondisi);
//                        break;
//                    default:
//                        break;
//
//                }
//            } catch (Exception e) {
//                System.err.println("Kesalahan Input");
//            }
//        } while (input != 0);

