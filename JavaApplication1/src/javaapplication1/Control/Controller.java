/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.Control;

import com.sun.glass.ui.Cursor;
import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javaapplication1.Model.Anggota;
import javaapplication1.Model.Aplikasi;
import javaapplication1.Model.Buku;
import javaapplication1.Model.Petugas;
import javaapplication1.View.Login;
import javaapplication1.View.MenuAnggota;
import javaapplication1.View.MenuPetugas;
import javaapplication1.View.SignUp;
import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class Controller implements ActionListener {

    Aplikasi apps;
    Login vLogin;
    Anggota a;
    Petugas p;
    Buku b;
    MenuAnggota vMenuAnggota;
    MenuPetugas vMenuPetugas;
    SignUp vSignUp;

    public Controller() {
        apps = new Aplikasi();
        vSignUp = new SignUp();
        vLogin = new Login();
        b = new Buku();
        vMenuAnggota = new MenuAnggota();
        vMenuPetugas = new MenuPetugas();
        vLogin.setVisible(true);
//        vMenuAnggota.setVisible(true);
//        vMenuPetugas.setVisible(false);
        vLogin.addListener(this);
        vSignUp.addListener(this);
        vMenuAnggota.addListener(this);
        vMenuPetugas.addListener(this);
        a = new Anggota();
        p = new Petugas();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object ob = e.getSource();
        if (ob.equals(vLogin.getjBtnLogin())) {
            String user = vLogin.getjTxtUsername().getText();
            String pass = vLogin.getjPassword().getText();
            // Login Jika Petugas
            if (apps.cekPetugas(user, pass) == true) {
                vLogin.dispose();
                vMenuPetugas.setVisible(true);
            } //Login jika Anggota
            else if (apps.cekAnggota(user, pass) == true) {
                vLogin.dispose();
                vMenuAnggota.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(vLogin, "Username atau Password Salah");
            }

        } //SIgn Up
        else if (ob.equals(vLogin.getjBtnSignUp())) {
            vLogin.dispose();
            vSignUp.setVisible(true);

//Sign Up Anggota
        } else if (ob.equals(vSignUp.getjBtnSignUpAnggota())) {
            String idAnggota = vSignUp.getjTxtId().getText();
            long idAngg;
            idAngg = Long.parseLong(idAnggota);
            String username = vSignUp.getjTxtUsernameSignUp().getText();
            String password = vSignUp.getjTxtPasswordSignUp().getText();
            String nama = vSignUp.getjTxtNamaSignUp().getText();
            String alamat = vSignUp.getjTxtAlamatSignUp().getText();
            String noTlp = vSignUp.getjTxtNoTelepon().getText();
            String email = vSignUp.getjTxtEmailSignUp().getText();
            a = new Anggota(idAngg, username, password, nama, alamat, noTlp, email);

            apps.addAnggota(a);
            //Personal 
            vMenuAnggota.getjLblUsername().setText(username);
            vMenuAnggota.getjLblId().setText(idAnggota);
            vMenuAnggota.getjLblNama().setText(nama);
            vMenuAnggota.getjLblAlmat().setText(alamat);
            vMenuAnggota.getjLblEmail().setText(email);
            vMenuAnggota.getjLblNoTlp().setText(noTlp);
            vSignUp.setVisible(false);
            vMenuAnggota.setVisible(true);
        } else if (ob.equals(vMenuAnggota.getjBtnLogout())) {
            vMenuAnggota.setVisible(false);
            vLogin.setVisible(true);
        } else if (ob.equals(vSignUp.getjBtnKembali())) {
            vSignUp.setVisible(false);
            vLogin.setVisible(true);
        } else if (ob.equals(vSignUp.getjBtnSignUpPetugas())) {
            String idPetugas = vSignUp.getjTxtId().getText();
            long idPts;
            idPts = Long.parseLong(idPetugas);
            String username = vSignUp.getjTxtUsernameSignUp().getText();
            String password = vSignUp.getjTxtPasswordSignUp().getText();
            String nama = vSignUp.getjTxtNamaSignUp().getText();
            String alamat = vSignUp.getjTxtAlamatSignUp().getText();
            String noTlp = vSignUp.getjTxtNoTelepon().getText();
            String email = vSignUp.getjTxtEmailSignUp().getText();
            p = new Petugas(idPts, username, password, nama, alamat, noTlp, email);

            apps.addPetugas(p);
            //Personal 
            vMenuPetugas.getjLblUsername().setText(username);
            vMenuPetugas.getjLblId().setText(idPetugas);
            vMenuPetugas.getjLblNama().setText(nama);
            vMenuPetugas.getjLblAlmat().setText(alamat);
            vMenuPetugas.getjLblEmail().setText(email);
            vMenuPetugas.getjLblNoTlp().setText(noTlp);
            vSignUp.setVisible(false);
            vMenuPetugas.setVisible(true);
        } else if (ob.equals(vMenuPetugas.getjBtnLogout())) {
            vMenuPetugas.setVisible(false);
            vLogin.setVisible(true);
        } //Tambah Buku 
        else if (ob.equals(vMenuPetugas.getjBtnTambahBukuPetugas())) {

            String idBuku = vMenuPetugas.getjTxtIsbnAddBukuPetugas().getText();
            String namaBuku = vMenuPetugas.getjTxtJudulAddBukuPetugas().getText();
            String kondisi = vMenuPetugas.getjTxtKondisiAddBukuPetugas().getText();
            String total = vMenuPetugas.getjTxtJmlAddBukuPetugas().getText();
            String terpinjam = vMenuPetugas.getjTxtTerpinjam().getText();
            String tersedia = vMenuPetugas.getjTxtAddTersedia().getText();
            int jumlah_total = Integer.parseInt(total);
            int jumlah_terpinjam = Integer.parseInt(terpinjam);
            int jumlah_tersedia = Integer.parseInt(tersedia);
            b = new Buku(idBuku, namaBuku, kondisi, jumlah_total, jumlah_terpinjam, jumlah_tersedia);
            apps.addBuku(idBuku, namaBuku, kondisi, jumlah_total, jumlah_terpinjam, jumlah_tersedia);
        } //Tambah Member
        else if (ob.equals(vMenuPetugas.getjBtnSignUpAnggota())) {
            String idAnggota = vMenuPetugas.getjTxtId().getText();
            long idAngg;
            idAngg = Long.parseLong(idAnggota);
            String username = vMenuPetugas.getjTxtUsernameSignUp().getText();
            String password = vMenuPetugas.getjTxtPasswordSignUp().getText();
            String nama = vMenuPetugas.getjTxtNamaSignUp().getText();
            String alamat = vMenuPetugas.getjTxtAlamatSignUp().getText();
            String noTlp = vMenuPetugas.getjTxtNoTelepon().getText();
            String email = vMenuPetugas.getjTxtEmailSignUp().getText();
            a = new Anggota(idAngg, username, password, nama, alamat, noTlp, email);

            apps.addAnggota(a);
        } //Hapus Buku
        else if (ob.equals(vMenuPetugas.getjBtnHapusBukuPetugas())) {
            String idBuku = vMenuPetugas.getjTxtIsbnHapusBukuPetugas().getText();
            apps.deleteBuku(idBuku);
            JOptionPane.showMessageDialog(null, "Buku Terhapus");
        } //Cari Buku
        else if (ob.equals(vMenuPetugas.getjBtnCariBukuPetugas())) {
            String idBuku = vMenuPetugas.getjTxtIsbnCariBukuPetugas().getText();
            Buku buku = apps.getBuku(idBuku);

            JOptionPane.showConfirmDialog(vMenuAnggota, buku);
        } // Edit Status
        else if (ob.equals(vMenuPetugas.getjBtnCariBukuEditStatPetugas())) {
            String idBuku = vMenuPetugas.getjTxtEditStatPetugas().getText();
            String kondisi = vMenuPetugas.getjTxtJudulEditStatPetugas().getText();
            apps.editStatusBuku(idBuku, kondisi);
            JOptionPane.showConfirmDialog(vMenuAnggota, idBuku + " Status Tebaru " + kondisi);
        } else if (ob.equals(vMenuPetugas.getjBtnViewNow())) {
            apps.viewPinjaman();

        } else if (ob.equals(vMenuPetugas.getjBtnAddTransaksiPnjmPetugas())) {
            String idAnggota = vMenuPetugas.getjTxtIdAnggotaPinjam().getText();
            long idAngg;
            idAngg = Long.parseLong(idAnggota);
            String jumlahPinjam = vMenuPetugas.getjTxtIsbnTransaksiPnjmPetugas().getText();
            int jumlahPinjamBuku = Integer.parseInt(jumlahPinjam);
            apps.addPinjaman(idAngg, jumlahPinjamBuku);

        } //
        //ANGGOTA
        //
        else if (ob.equals(vMenuAnggota.getjBtnViewNow())) {
            apps.viewPinjaman();
        } //
        //Cari Buku
        else if (ob.equals(vMenuAnggota.getCrbutton())) {
            String idBuku = vMenuAnggota.getTfisbncrbuku().getText();
            Buku buku = apps.getBuku(idBuku);

            JOptionPane.showConfirmDialog(vMenuAnggota, buku);
        } else if (ob.equals(vMenuAnggota.getjBtnAddTransaksiPnjmPetugas())) {
            String idAnggota = vMenuAnggota.getjTxtIdAnggotaPinjam().getText();
            long idAngg;
            idAngg = Long.parseLong(idAnggota);
            String jumlahPinjam = vMenuAnggota.getjTxtIsbnTransaksiPnjmPetugas().getText();
            int jumlahPinjamBuku = Integer.parseInt(jumlahPinjam);
            apps.addPinjaman(idAngg, jumlahPinjamBuku);

        } else if (ob.equals(vMenuAnggota.getjBtnLihatDaftarPinjam())) {
            String idAnggota = vMenuAnggota.getjTxtPinjamIdAnggota().getText();
            long idAngg;
            idAngg = Long.parseLong(idAnggota);
            apps.viewDaftarPinjaman(idAngg);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
