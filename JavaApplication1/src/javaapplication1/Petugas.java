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
    private String username;
    private String password;
    private String alamat;

    @Override
    public String toString() {
        return "Anggota" + "\nidPetugas=" + getIdPetugas() + "\nusername=" + getUsername() + "\npassword=" + getPassword() + " \nalamat=" + getAlamat();
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

    public Petugas(long idPetugas, String username, String password, String nama, String alamat, String noTlp, String email) {
        super(nama, noTlp, email);
        setIdPetugas(idPetugas);
        this.username = username;
        setPassword(password);
        this.alamat = alamat;
    }

    public Petugas() {
        super();
    }

    public long getIdPetugas() {
        return idPetugas;
    }

    public void setIdPetugas(long idPetugas) {
        this.idPetugas = idPetugas;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
