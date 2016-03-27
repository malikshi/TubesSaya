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
public abstract class Orang {
   private String nama;
   private String noTlp;
   private String email;
   
   public Orang (String nama, String noTlp, String email) {
       this.nama = nama;
       this.noTlp = noTlp;
       this.email = email;
   }
   public Orang(){
       
   }
   public void setNama(String nama) {
       this.nama = nama;
   }
   
   public String getNama() {
       return nama;
   }
   
   public void setnoTlp(String noTlp) {
       this.noTlp = noTlp;
   }

    public String getNoTlp() {
        return noTlp;
    }

    public void setNoTlp(String noTlp) {
        this.noTlp = noTlp;
    }
   
   public String getnoTlp() {
       return noTlp;
   }
   
   public void setEmail(String email) {
       this.email = email;
   }
   
   public String getEmail() {
       return email;
   }
   
   public void viewDaftarPinjam() {
       
   }
   public void viewDaftarBarangPinjam() {
   
   }
}
