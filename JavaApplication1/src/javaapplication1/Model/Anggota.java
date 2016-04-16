/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.Model;

import javaapplication1.*;

/**
 *
 * @author Rizky
 */
public class Anggota extends Orang {

    private long idAnggota;
    private String alamat;
    private String username;
    private String password;

    public Anggota() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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

    public Anggota(long idAnggota, String username, String password, String nama, String alamat, String noTlp, String email) {
        super(nama, noTlp, email);
        setIdAnggota(idAnggota);
        this.alamat = alamat;
        this.username = username;
        setPassword(password);
    }

    public void setAnggota(String nama, long idAnggota) {
        super.setNama(nama);
        this.idAnggota = idAnggota;
    }

    public String getAnggota() {
        return super.getNama();
    }

    @Override
    public String toString() {
        return "Anggota" + "\nidAnggota=" + getIdAnggota() + "\nusername=" + getUsername() + "\npassword=" + getPassword() + " \nalamat=" + getAlamat();
    }

}
