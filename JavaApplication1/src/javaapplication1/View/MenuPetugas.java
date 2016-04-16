/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.View;

import javaapplication1.Control.Controller;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Rizky
 */
public class MenuPetugas extends javax.swing.JFrame {
    
    public JTextField getjTxtIdAnggotaPinjam() {
        return jTxtIdAnggotaPinjam;
    }

//    public JTable getISBN() {
//        return ISBN;
//    }
//
    public void setjTxtIdAnggotaPinjam(JTextField jTxtIdAnggotaPinjam) {    
        this.jTxtIdAnggotaPinjam = jTxtIdAnggotaPinjam;
    }

    public JButton getjBtnSignUpAnggota() {
        return jBtnSignUpAnggota;
    }
    
    public void setjBtnSignUpAnggota(JButton jBtnSignUpAnggota) {
        this.jBtnSignUpAnggota = jBtnSignUpAnggota;
    }
    
    public JTextField getjTxtAlamatSignUp() {
        return jTxtAlamatSignUp;
    }
    
    public void setjTxtAlamatSignUp(JTextField jTxtAlamatSignUp) {
        this.jTxtAlamatSignUp = jTxtAlamatSignUp;
    }
    
    public JTextField getjTxtEmailSignUp() {
        return jTxtEmailSignUp;
    }
    
    public void setjTxtEmailSignUp(JTextField jTxtEmailSignUp) {
        this.jTxtEmailSignUp = jTxtEmailSignUp;
    }
    
    public JTextField getjTxtId() {
        return jTxtId;
    }
    
    public void setjTxtId(JTextField jTxtId) {
        this.jTxtId = jTxtId;
    }
    
    public JTextField getjTxtNamaSignUp() {
        return jTxtNamaSignUp;
    }
    
    public void setjTxtNamaSignUp(JTextField jTxtNamaSignUp) {
        this.jTxtNamaSignUp = jTxtNamaSignUp;
    }
    
    public JTextField getjTxtNoTelepon() {
        return jTxtNoTelepon;
    }
    
    public void setjTxtNoTelepon(JTextField jTxtNoTelepon) {
        this.jTxtNoTelepon = jTxtNoTelepon;
    }
    
    public JTextField getjTxtPasswordSignUp() {
        return jTxtPasswordSignUp;
    }
    
    public void setjTxtPasswordSignUp(JTextField jTxtPasswordSignUp) {
        this.jTxtPasswordSignUp = jTxtPasswordSignUp;
    }
    
    public JTextField getjTxtUsernameSignUp() {
        return jTxtUsernameSignUp;
    }
    
    public void setjTxtUsernameSignUp(JTextField jTxtUsernameSignUp) {
        this.jTxtUsernameSignUp = jTxtUsernameSignUp;
    }
//    
//    public void setISBN(JTable ISBN) {
//        this.ISBN = ISBN;
//    }
    
    public JButton getjBtnAddTransaksiPnjmPetugas() {
        return jBtnAddTransaksiPnjmPetugas;
    }
    
    public void setjBtnAddTransaksiPnjmPetugas(JButton jBtnAddTransaksiPnjmPetugas) {
        this.jBtnAddTransaksiPnjmPetugas = jBtnAddTransaksiPnjmPetugas;
    }
    
    public JButton getjBtnCariBukuEditStatPetugas() {
        return jBtnCariBukuEditStatPetugas;
    }
    
    public void setjBtnCariBukuEditStatPetugas(JButton jBtnCariBukuEditStatPetugas) {
        this.jBtnCariBukuEditStatPetugas = jBtnCariBukuEditStatPetugas;
    }
    
    public JButton getjBtnCariBukuPetugas() {
        return jBtnCariBukuPetugas;
    }
    
    public void setjBtnCariBukuPetugas(JButton jBtnCariBukuPetugas) {
        this.jBtnCariBukuPetugas = jBtnCariBukuPetugas;
    }
//    
//    public JButton getjBtnEditBukuPetugas() {
//        return jBtnEditBukuPetugas;
//    }
//    
//    public void setjBtnEditBukuPetugas(JButton jBtnEditBukuPetugas) {
//        this.jBtnEditBukuPetugas = jBtnEditBukuPetugas;
//    }
    
//    public JButton getjBtnEditTransaksiPnjmPetugas() {
//        return jBtnEditTransaksiPnjmPetugas;
//    }
//    
//    public void setjBtnEditTransaksiPnjmPetugas(JButton jBtnEditTransaksiPnjmPetugas) {
//        this.jBtnEditTransaksiPnjmPetugas = jBtnEditTransaksiPnjmPetugas;
//    }
//    
    public JTextField getjTtxtAddTersedia() {
        return jTxtAddTersedia;
    }
    
    public void setjTtxtAddTersedia(JTextField jTtxtAddTersedia) {
        this.jTxtAddTersedia = jTtxtAddTersedia;
    }
    
    public JTextField getjTxtTerpinjam() {
        return jTxtTerpinjam;
    }
    
    public void setjTxtTerpinjam(JTextField jTxtTerpinjam) {
        this.jTxtTerpinjam = jTxtTerpinjam;
    }
    
    public JButton getjBtnHapusBukuPetugas() {
        return jBtnHapusBukuPetugas;
    }
    
    public void setjBtnHapusBukuPetugas(JButton jBtnHapusBukuPetugas) {
        this.jBtnHapusBukuPetugas = jBtnHapusBukuPetugas;
    }
    
//    public JButton getjBtnHapusTransaksiPnjmPetugas() {
//        return jBtnHapusTransaksiPnjmPetugas;
//    }
//    
//    public void setjBtnHapusTransaksiPnjmPetugas(JButton jBtnHapusTransaksiPnjmPetugas) {
//        this.jBtnHapusTransaksiPnjmPetugas = jBtnHapusTransaksiPnjmPetugas;
//    }
    
    public JButton getjBtnTambahBukuPetugas() {
        return jBtnTambahBukuPetugas;
    }
    
    public void setjBtnTambahBukuPetugas(JButton jBtnTambahBukuPetugas) {
        this.jBtnTambahBukuPetugas = jBtnTambahBukuPetugas;
    }
    
//    public JTable getjTableCariBukuPetugas() {
//        return jTableCariBukuPetugas;
//    }
//    
//    public void setjTableCariBukuPetugas(JTable jTableCariBukuPetugas) {
//        this.jTableCariBukuPetugas = jTableCariBukuPetugas;
//    }
    
    public JTabbedPane getjTablePetugas() {
        return jTablePetugas;
    }
    
    public void setjTablePetugas(JTabbedPane jTablePetugas) {
        this.jTablePetugas = jTablePetugas;
    }
    
//    public JTable getjTableTransaksiPnjmPetugas() {
//        return jTableTransaksiPnjmPetugas;
//    }
    
//    public void setjTableTransaksiPnjmPetugas(JTable jTableTransaksiPnjmPetugas) {
//        this.jTableTransaksiPnjmPetugas = jTableTransaksiPnjmPetugas;
//    }
    
    public JTextField getjTxtEditStatPetugas() {
        return jTxtEditStatPetugas;
    }
    
    public void setjTxtEditStatPetugas(JTextField jTxtEditStatPetugas) {
        this.jTxtEditStatPetugas = jTxtEditStatPetugas;
    }
    
    public JTextField getjTxtIsbnAddBukuPetugas() {
        return jTxtIsbnAddBukuPetugas;
    }
    
    public void setjTxtIsbnAddBukuPetugas(JTextField jTxtIsbnAddBukuPetugas) {
        this.jTxtIsbnAddBukuPetugas = jTxtIsbnAddBukuPetugas;
    }
    
    public JTextField getjTxtIsbnCariBukuPetugas() {
        return jTxtIsbnCariBukuPetugas;
    }
    
    public void setjTxtIsbnCariBukuPetugas(JTextField jTxtIsbnCariBukuPetugas) {
        this.jTxtIsbnCariBukuPetugas = jTxtIsbnCariBukuPetugas;
    }
    
//    public JTextField getjTxtIsbnEditBukuPetugas() {
//        return jTxtIsbnEditBukuPetugas;
//    }
//    
//    public void setjTxtIsbnEditBukuPetugas(JTextField jTxtIsbnEditBukuPetugas) {
//        this.jTxtIsbnEditBukuPetugas = jTxtIsbnEditBukuPetugas;
//    }
    
    public JTextField getjTxtIsbnHapusBukuPetugas() {
        return jTxtIsbnHapusBukuPetugas;
    }
    
    public void setjTxtIsbnHapusBukuPetugas(JTextField jTxtIsbnHapusBukuPetugas) {
        this.jTxtIsbnHapusBukuPetugas = jTxtIsbnHapusBukuPetugas;
    }
    
    public JTextField getjTxtIsbnTransaksiPnjmPetugas() {
        return jTxtIsbnTransaksiPnjmPetugas;
    }
    
    public void setjTxtIsbnTransaksiPnjmPetugas(JTextField jTxtIsbnTransaksiPnjmPetugas) {
        this.jTxtIsbnTransaksiPnjmPetugas = jTxtIsbnTransaksiPnjmPetugas;
    }
    
    public JTextField getjTxtJmlAddBukuPetugas() {
        return jTxtJmlAddBukuPetugas;
    }
    
    public void setjTxtJmlAddBukuPetugas(JTextField jTxtJmlAddBukuPetugas) {
        this.jTxtJmlAddBukuPetugas = jTxtJmlAddBukuPetugas;
    }
    
    public JTextField getjTxtJudulAddBukuPetugas() {
        return jTxtJudulAddBukuPetugas;
    }
    
    public void setjTxtJudulAddBukuPetugas(JTextField jTxtJudulAddBukuPetugas) {
        this.jTxtJudulAddBukuPetugas = jTxtJudulAddBukuPetugas;
    }
    
//    public JTextField getjTxtJudulEditBukuPetugas() {
//        return jTxtJudulEditBukuPetugas;
//    }
//    
//    public void setjTxtJudulEditBukuPetugas(JTextField jTxtJudulEditBukuPetugas) {
//        this.jTxtJudulEditBukuPetugas = jTxtJudulEditBukuPetugas;
//    }
    
    public JTextField getjTxtJudulEditStatPetugas() {
        return jTxtJudulEditStatPetugas;
    }
    
    public void setjTxtJudulEditStatPetugas(JTextField jTxtJudulEditStatPetugas) {
        this.jTxtJudulEditStatPetugas = jTxtJudulEditStatPetugas;
    }
    
    public JTextField getjTxtKondisiAddBukuPetugas() {
        return jTxtKondisiAddBukuPetugas;
    }
    
    public void setjTxtKondisiAddBukuPetugas(JTextField jTxtKondisiAddBukuPetugas) {
        this.jTxtKondisiAddBukuPetugas = jTxtKondisiAddBukuPetugas;
    }
    
    public JButton getjBtnViewNow() {
        return jBtnViewNow;
    }

//    public JTextField getjTxtKondisiEditBukuPetugas() {
//        return jTxtKondisiEditBukuPetugas;
//    }
//    
//    public void setjTxtKondisiEditBukuPetugas(JTextField jTxtKondisiEditBukuPetugas) {
//        this.jTxtKondisiEditBukuPetugas = jTxtKondisiEditBukuPetugas;
//    }
    public void setjBtnViewNow(JButton jBtnViewNow) {    
        this.jBtnViewNow = jBtnViewNow;
    }

    public JButton getjBtnLogout() {
        return jBtnLogout;
    }

//    public JLabel getjLblHasilCari() {
//        return jLblHasilCari;
//    }
//
//    public void setjLblHasilCari(JLabel jLblHasilCari) {
//        this.jLblHasilCari = jLblHasilCari;
//    }
    
    public void setjBtnLogout(JButton jBtnLogout) {
        this.jBtnLogout = jBtnLogout;
    }
    
    public JLabel getjLblAlmat() {
        return jLblAlmat;
    }
    
    public void setjLblAlmat(JLabel jLblAlmat) {
        this.jLblAlmat = jLblAlmat;
    }
    
    public JLabel getjLblEmail() {
        return jLblEmail;
    }
    
    public void setjLblEmail(JLabel jLblEmail) {
        this.jLblEmail = jLblEmail;
    }
    
    public JLabel getjLblId() {
        return jLblId;
    }
    
    public void setjLblId(JLabel jLblId) {
        this.jLblId = jLblId;
    }
    
    public JLabel getjLblNama() {
        return jLblNama;
    }
    
    public void setjLblNama(JLabel jLblNama) {
        this.jLblNama = jLblNama;
    }
    
    public JLabel getjLblNoTlp() {
        return jLblNoTlp;
    }
    
    public void setjLblNoTlp(JLabel jLblNoTlp) {
        this.jLblNoTlp = jLblNoTlp;
    }
    
    public JLabel getjLblUsername() {
        return jLblUsername;
    }
    
    public void setjLblUsername(JLabel jLblUsername) {
        this.jLblUsername = jLblUsername;
    }

    public JTextField getjTxtAddTersedia() {
        return jTxtAddTersedia;
    }

    public void setjTxtAddTersedia(JTextField jTxtAddTersedia) {
        this.jTxtAddTersedia = jTxtAddTersedia;
    }

    /**
     * Creates new form MenuAnggota
     */
    public MenuPetugas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jTablePetugas = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLblUsername = new javax.swing.JLabel();
        jLblId = new javax.swing.JLabel();
        jLblNama = new javax.swing.JLabel();
        jLblAlmat = new javax.swing.JLabel();
        jLblEmail = new javax.swing.JLabel();
        jLblNoTlp = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jBtnLogout = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jTxtIsbnAddBukuPetugas = new javax.swing.JTextField();
        jTxtJudulAddBukuPetugas = new javax.swing.JTextField();
        jTxtKondisiAddBukuPetugas = new javax.swing.JTextField();
        jTxtJmlAddBukuPetugas = new javax.swing.JTextField();
        jBtnTambahBukuPetugas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTxtAddTersedia = new javax.swing.JTextField();
        jTxtTerpinjam = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTxtIsbnHapusBukuPetugas = new javax.swing.JTextField();
        jBtnHapusBukuPetugas = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jBtnViewNow = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTxtIsbnCariBukuPetugas = new javax.swing.JTextField();
        jBtnCariBukuPetugas = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jTxtEditStatPetugas = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTxtJudulEditStatPetugas = new javax.swing.JTextField();
        jBtnCariBukuEditStatPetugas = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jTxtIsbnTransaksiPnjmPetugas = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jBtnAddTransaksiPnjmPetugas = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTxtIdAnggotaPinjam = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jTxtId = new javax.swing.JTextField();
        jTxtNamaSignUp = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTxtUsernameSignUp = new javax.swing.JTextField();
        jTxtPasswordSignUp = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTxtAlamatSignUp = new javax.swing.JTextField();
        jTxtEmailSignUp = new javax.swing.JTextField();
        jTxtNoTelepon = new javax.swing.JTextField();
        jBtnSignUpAnggota = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab1", jPanel2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setTitle("Petugas");
        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLblUsername.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(jLblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 110, 20));

        jLblId.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(jLblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 110, 20));

        jLblNama.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(jLblNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 110, 20));

        jLblAlmat.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(jLblAlmat, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 110, 20));

        jLblEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(jLblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 110, 20));

        jLblNoTlp.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(jLblNoTlp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 110, 20));

        jLabel13.setText("Username");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 32, -1, -1));

        jLabel14.setText("ID");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 41, -1));

        jLabel15.setText("Nama");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 41, -1));

        jLabel16.setText("Alamat");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 41, -1));

        jLabel17.setText("Email");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 41, -1));

        jLabel18.setText("No Telepon");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jBtnLogout.setText("Logout");
        jPanel3.add(jBtnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 265, -1, -1));

        jTablePetugas.addTab("Personal", jPanel3);

        jBtnTambahBukuPetugas.setText("Tambah Buku");
        jBtnTambahBukuPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTambahBukuPetugasActionPerformed(evt);
            }
        });

        jLabel1.setText("ISBN");

        jLabel2.setText("Judul");

        jLabel3.setText("Kondisi");

        jLabel4.setText("Jumlah");

        jLabel19.setText("Jumlah Tersedia");

        jLabel20.setText("Jumlah Terpinjam");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jBtnTambahBukuPetugas))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtJmlAddBukuPetugas, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(jTxtKondisiAddBukuPetugas, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(jTxtJudulAddBukuPetugas, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(jTxtIsbnAddBukuPetugas, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(jTxtAddTersedia)
                            .addComponent(jTxtTerpinjam))))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtIsbnAddBukuPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(8, 8, 8)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtJudulAddBukuPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtKondisiAddBukuPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtJmlAddBukuPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTxtAddTersedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jTxtTerpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jBtnTambahBukuPetugas)
                .addContainerGap(336, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTablePetugas.addTab("Add Buku", jPanel4);

        jLabel5.setText("ISBN");

        jBtnHapusBukuPetugas.setText("Hapus Buku");
        jBtnHapusBukuPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnHapusBukuPetugasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtIsbnHapusBukuPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jBtnHapusBukuPetugas)))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtIsbnHapusBukuPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(37, 37, 37)
                .addComponent(jBtnHapusBukuPetugas)
                .addContainerGap(456, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTablePetugas.addTab("Hapus Buku", jPanel5);

        jBtnViewNow.setText("View");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jBtnViewNow)
                .addContainerGap(238, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnViewNow)
                .addContainerGap(548, Short.MAX_VALUE))
        );

        jTablePetugas.addTab("List Buku", jPanel7);

        jLabel9.setText("ISBN");

        jBtnCariBukuPetugas.setText("Cari Buku");
        jBtnCariBukuPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCariBukuPetugasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(28, 28, 28)
                        .addComponent(jTxtIsbnCariBukuPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBtnCariBukuPetugas))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtIsbnCariBukuPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(32, 32, 32)
                .addComponent(jBtnCariBukuPetugas)
                .addContainerGap(478, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTablePetugas.addTab("Cari Buku", jPanel8);

        jLabel10.setText("ISBN");

        jLabel11.setText("Kondisi");

        jBtnCariBukuEditStatPetugas.setText("Edit Status");
        jBtnCariBukuEditStatPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCariBukuEditStatPetugasActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ISBN", "Judul Buku", "Total", "Terpinjam", "Tersedia"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtJudulEditStatPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtEditStatPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jBtnCariBukuEditStatPetugas))
                .addContainerGap(301, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtEditStatPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(8, 8, 8)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtJudulEditStatPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnCariBukuEditStatPetugas)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTablePetugas.addTab("Edit Status", jPanel9);

        jLabel12.setText("Jumlah");

        jBtnAddTransaksiPnjmPetugas.setText("Add Pinjam");
        jBtnAddTransaksiPnjmPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddTransaksiPnjmPetugasActionPerformed(evt);
            }
        });

        jLabel6.setText("Id Member");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnAddTransaksiPnjmPetugas)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtIsbnTransaksiPnjmPetugas, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(jTxtIdAnggotaPinjam))))
                .addContainerGap(283, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTxtIdAnggotaPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtIsbnTransaksiPnjmPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnAddTransaksiPnjmPetugas)
                .addContainerGap(475, Short.MAX_VALUE))
        );

        jTablePetugas.addTab("Transaksi Pinjam", jPanel10);

        jLabel21.setText("ID");

        jTxtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtIdActionPerformed(evt);
            }
        });

        jTxtNamaSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNamaSignUpActionPerformed(evt);
            }
        });

        jLabel22.setText("Nama");

        jLabel23.setText("Username");

        jTxtUsernameSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtUsernameSignUpActionPerformed(evt);
            }
        });

        jTxtPasswordSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtPasswordSignUpActionPerformed(evt);
            }
        });

        jLabel24.setText("Password");

        jLabel25.setText("Alamat");

        jLabel26.setText("Email");

        jLabel27.setText("No Telepon");

        jTxtAlamatSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtAlamatSignUpActionPerformed(evt);
            }
        });

        jTxtEmailSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEmailSignUpActionPerformed(evt);
            }
        });

        jBtnSignUpAnggota.setText("Tambah Member");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jBtnSignUpAnggota)
                        .addGap(96, 96, 96))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel21)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtUsernameSignUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtNamaSignUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtAlamatSignUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtPasswordSignUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtEmailSignUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtNoTelepon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(237, 237, 237))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtNamaSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtUsernameSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtPasswordSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtAlamatSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(5, 5, 5)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtEmailSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jTxtNoTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jBtnSignUpAnggota)
                .addContainerGap(335, Short.MAX_VALUE))
        );

        jTablePetugas.addTab("Add Member", jPanel16);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTablePetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTablePetugas)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtEmailSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEmailSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEmailSignUpActionPerformed

    private void jTxtAlamatSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtAlamatSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtAlamatSignUpActionPerformed

    private void jTxtPasswordSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtPasswordSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtPasswordSignUpActionPerformed

    private void jTxtUsernameSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtUsernameSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtUsernameSignUpActionPerformed

    private void jTxtNamaSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNamaSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNamaSignUpActionPerformed

    private void jTxtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtIdActionPerformed

    private void jBtnAddTransaksiPnjmPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddTransaksiPnjmPetugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnAddTransaksiPnjmPetugasActionPerformed

    private void jBtnCariBukuEditStatPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCariBukuEditStatPetugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnCariBukuEditStatPetugasActionPerformed

    private void jBtnCariBukuPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCariBukuPetugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnCariBukuPetugasActionPerformed

    private void jBtnHapusBukuPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnHapusBukuPetugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnHapusBukuPetugasActionPerformed

    private void jBtnTambahBukuPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTambahBukuPetugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnTambahBukuPetugasActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MenuPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenuPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenuPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenuPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MenuPetugas().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAddTransaksiPnjmPetugas;
    private javax.swing.JButton jBtnCariBukuEditStatPetugas;
    private javax.swing.JButton jBtnCariBukuPetugas;
    private javax.swing.JButton jBtnHapusBukuPetugas;
    private javax.swing.JButton jBtnLogout;
    private javax.swing.JButton jBtnSignUpAnggota;
    private javax.swing.JButton jBtnTambahBukuPetugas;
    private javax.swing.JButton jBtnViewNow;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLblAlmat;
    private javax.swing.JLabel jLblEmail;
    private javax.swing.JLabel jLblId;
    private javax.swing.JLabel jLblNama;
    private javax.swing.JLabel jLblNoTlp;
    private javax.swing.JLabel jLblUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTabbedPane jTablePetugas;
    private javax.swing.JTextField jTxtAddTersedia;
    private javax.swing.JTextField jTxtAlamatSignUp;
    private javax.swing.JTextField jTxtEditStatPetugas;
    private javax.swing.JTextField jTxtEmailSignUp;
    private javax.swing.JTextField jTxtId;
    private javax.swing.JTextField jTxtIdAnggotaPinjam;
    private javax.swing.JTextField jTxtIsbnAddBukuPetugas;
    private javax.swing.JTextField jTxtIsbnCariBukuPetugas;
    private javax.swing.JTextField jTxtIsbnHapusBukuPetugas;
    private javax.swing.JTextField jTxtIsbnTransaksiPnjmPetugas;
    private javax.swing.JTextField jTxtJmlAddBukuPetugas;
    private javax.swing.JTextField jTxtJudulAddBukuPetugas;
    private javax.swing.JTextField jTxtJudulEditStatPetugas;
    private javax.swing.JTextField jTxtKondisiAddBukuPetugas;
    private javax.swing.JTextField jTxtNamaSignUp;
    private javax.swing.JTextField jTxtNoTelepon;
    private javax.swing.JTextField jTxtPasswordSignUp;
    private javax.swing.JTextField jTxtTerpinjam;
    private javax.swing.JTextField jTxtUsernameSignUp;
    // End of variables declaration//GEN-END:variables

    public void addListener(Controller aThis) {
        jBtnAddTransaksiPnjmPetugas.addActionListener(aThis);
        jBtnCariBukuEditStatPetugas.addActionListener(aThis);
        jBtnCariBukuPetugas.addActionListener(aThis);
        jBtnHapusBukuPetugas.addActionListener(aThis);
//        jBtnEditTransaksiPnjmPetugas.addActionListener(aThis);
//        jBtnHapusTransaksiPnjmPetugas.addActionListener(aThis);
        jBtnTambahBukuPetugas.addActionListener(aThis);
        jBtnLogout.addActionListener(aThis);
        jBtnSignUpAnggota.addActionListener(aThis);
        jBtnViewNow.addActionListener(aThis);
    }
}
