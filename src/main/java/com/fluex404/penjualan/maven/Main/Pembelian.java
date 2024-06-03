package com.fluex404.penjualan.maven.Main;

import com.fluex404.penjualan.maven.Config.Koneksi;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Notification;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
public class Pembelian extends javax.swing.JPanel {
    private final Connection conn;
    public Pembelian() {
        initComponents();
        
        conn = Koneksi.getConnection();
        setTableModel();
        
        placeHolder(txtNomor, "Nomor Transaksi");
        
        // settingan fold
        txtNomor.disable();
        
        // settingan datachooser
        dateChooser.setDateFormatString("dd/MM/yyy");
       
        // settingan supliername combo box
        try{
            suplierNames.removeAllItems();
            
            Connection conn = Koneksi.getConnection();
            PreparedStatement ps = conn.prepareStatement("select concat(nama, ' (', kode, ')')  from suplier;");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                suplierNames.addItem(rs.getString(1));
            }
            
            suplierNames.setEditable(true);
            suplierNames.setSelectedItem("");
            
            AutoCompleteDecorator.decorate(suplierNames);
            
        } catch(Exception e){
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addBarang = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        TBKodeBarang = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TBJumlahBarang = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        editBarang = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        EBKodeBarang = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        EBJumlahBarang = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        panelMain = new javax.swing.JPanel();
        panelAdd = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNomor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTabel = new javax.swing.JTable();
        btn_generate_transaction_no = new javax.swing.JButton();
        dateChooser = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        suplierNames = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jLabel4.setText("Tambah Barang");

        TBKodeBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Kode Barang");

        jLabel8.setText("Jumlah Barang");

        jButton6.setText("ADD");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addBarangLayout = new javax.swing.GroupLayout(addBarang.getContentPane());
        addBarang.getContentPane().setLayout(addBarangLayout);
        addBarangLayout.setHorizontalGroup(
            addBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBarangLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(addBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6)
                    .addGroup(addBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(addBarangLayout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TBJumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addBarangLayout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TBKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addBarangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(123, 123, 123))
        );
        addBarangLayout.setVerticalGroup(
            addBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBarangLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(addBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TBKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TBJumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel9.setText("Edit Barang");

        EBKodeBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setText("Kode Barang");

        jLabel12.setText("Jumlah Barang");

        jButton7.setText("EDIT");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editBarangLayout = new javax.swing.GroupLayout(editBarang.getContentPane());
        editBarang.getContentPane().setLayout(editBarangLayout);
        editBarangLayout.setHorizontalGroup(
            editBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editBarangLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(editBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton7)
                    .addGroup(editBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(editBarangLayout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(EBJumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, editBarangLayout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(EBKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(editBarangLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(84, 84, 84)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        editBarangLayout.setVerticalGroup(
            editBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editBarangLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(editBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EBKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(EBJumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        setLayout(new java.awt.CardLayout());

        panelMain.setBackground(new java.awt.Color(255, 255, 255));
        panelMain.setLayout(new java.awt.CardLayout());

        panelAdd.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setText("PEMBELIAN");

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Buy_30px.png"))); // NOI18N

        txtNomor.setFont(new java.awt.Font("SansSerif", 2, 14)); // NOI18N
        txtNomor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomorActionPerformed(evt);
            }
        });

        txtTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        txtTabel.setRowHeight(30);
        txtTabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txtTabel);

        btn_generate_transaction_no.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-refresh-16.png"))); // NOI18N
        btn_generate_transaction_no.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_generate_transaction_no.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_generate_transaction_noMouseClicked(evt);
            }
        });
        btn_generate_transaction_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generate_transaction_noActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setText("NOMOR TRANSAKSI");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setText("TANGGAL TRANSAKSI");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setText("NAMA SUPLIER");

        suplierNames.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                suplierNamesPopupMenuWillBecomeVisible(evt);
            }
        });
        suplierNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suplierNamesActionPerformed(evt);
            }
        });
        suplierNames.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                suplierNamesKeyPressed(evt);
            }
        });

        jButton1.setText("ADD");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("EDIT");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("DELETE");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("EXPORT");

        jButton5.setText("BELI");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addComponent(txtNomor, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_generate_transaction_no, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suplierNames, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 546, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );
        panelAddLayout.setVerticalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_generate_transaction_no, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(suplierNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelMain.add(panelAdd, "card2");

        add(panelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomorActionPerformed

    private void btn_generate_transaction_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generate_transaction_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_generate_transaction_noActionPerformed

    private void btn_generate_transaction_noMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_generate_transaction_noMouseClicked
        // TODO add your handling code here:
        try{
            
            Connection conn = Koneksi.getConnection();
            PreparedStatement ps = conn.prepareStatement("select count(1)+1 from pembelian_barang;");
            ResultSet rs = ps.executeQuery();

            Integer value = 0;
            while(rs.next()){
                value = rs.getInt(1);
            }

            String trxNo = "TRX"+generateRandomString()+String.format("%04d", value);
            txtNomor.setText(trxNo);
            
            
        } catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Generate gagal");
        }
        
        
    }//GEN-LAST:event_btn_generate_transaction_noMouseClicked

    private void suplierNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suplierNamesActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_suplierNamesActionPerformed

    private void suplierNamesPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_suplierNamesPopupMenuWillBecomeVisible
        
        
    }//GEN-LAST:event_suplierNamesPopupMenuWillBecomeVisible

    private void suplierNamesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_suplierNamesKeyPressed
        
    }//GEN-LAST:event_suplierNamesKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try{
            Connection conn = Koneksi.getConnection();
            PreparedStatement ps = conn.prepareStatement("select concat(nama, ' (', kode, ')')  from barang;");
            ResultSet rs = ps.executeQuery();
            
            TBKodeBarang.removeAllItems();
            while(rs.next()){
                TBKodeBarang.addItem(rs.getString(1));
            }
            
            TBKodeBarang.setEditable(true);
            TBKodeBarang.setSelectedItem("");
            
            AutoCompleteDecorator.decorate(TBKodeBarang);
        
            addBarang.pack();
            
            // entahlah
            
            addBarang.setVisible(true);
        } catch(Exception e){
            JOptionPane.showConfirmDialog(this, e.getMessage());
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        
        // get data from table
        int selectedRow = txtTabel.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) txtTabel.getModel();
            
            String namaBarang = (String) model.getValueAt(selectedRow, 0);
            String kodeBarang = (String) model.getValueAt(selectedRow, 1);
            String jumlahBarang = (String) model.getValueAt(selectedRow, 3);
            
            String itemSelected = String.format("%s (%s)", namaBarang, kodeBarang);
            
            try{
                Connection conn = Koneksi.getConnection();
                PreparedStatement ps = conn.prepareStatement("select concat(nama, ' (', kode, ')')  from barang;");
                ResultSet rs = ps.executeQuery();

                EBKodeBarang.removeAllItems();
                while(rs.next()){
                    EBKodeBarang.addItem(rs.getString(1));
                }

                EBKodeBarang.setEditable(true);
                EBKodeBarang.setSelectedItem(itemSelected);
                
                EBJumlahBarang.setText(jumlahBarang);

                AutoCompleteDecorator.decorate(EBKodeBarang);

                editBarang.pack();
                editBarang.setVisible(true);
            } catch(Exception e){
                JOptionPane.showConfirmDialog(this, e.getMessage());
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "anda belum select row di table");
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        try{
            // get kode barang
            String kodeBarang = (String) TBKodeBarang.getSelectedItem();
            kodeBarang = kodeBarang
                    .replaceAll(".+\\(", "")
                    .replaceAll("\\)", "");
            String namaBarang = "";
            Integer hargaJual = 0;
            String jumlahBarang = TBJumlahBarang.getText().isBlank()? "0": TBJumlahBarang.getText();
            
            // get barang
            Connection conn = Koneksi.getConnection();
            PreparedStatement ps = conn.prepareStatement("select nama, harga_jual from barang where kode=?;");
            ps.setString(1, kodeBarang);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                namaBarang = rs.getString("nama");
                hargaJual = rs.getBigDecimal("harga_jual").intValue();
            }
            
            // check barang is exist
            DefaultTableModel model = (DefaultTableModel) txtTabel.getModel();
            boolean dataFound = false;
            for (int row = 0; row < model.getRowCount(); row++) {
                 String kodeBarangExisting = (String) model.getValueAt(row, 1);
                 String jumlahBarangExisting = (String) model.getValueAt(row, 3);
                 
                 // insert to table
                 if(kodeBarang.equals(kodeBarangExisting)){
                    
                    String jumlahBarangNew = String.valueOf(
                            (Integer.parseInt(jumlahBarang) + Integer.parseInt(jumlahBarangExisting))
                    ) ;
                    
                    model.setValueAt(jumlahBarangNew, row, 3);
                    dataFound = true;
                 } 
            }
            
            if(!dataFound){
                model.addRow(new Object[]{ namaBarang, kodeBarang, hargaJual.toString(), jumlahBarang});
            }
            
            
        }catch(Exception e){
            JOptionPane.showConfirmDialog(this, e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton6MouseClicked

    private void txtTabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTabelMouseClicked
        
    }//GEN-LAST:event_txtTabelMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        int selectedRow = txtTabel.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) txtTabel.getModel();
            model.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "anda belum select row di table");
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        
        int selectedRow = txtTabel.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) txtTabel.getModel();
            
            String kodeBarang = (String) EBKodeBarang.getSelectedItem();
            String jumlahBarang = (String) EBJumlahBarang.getText();
            String namaBarang = "";
            Integer hargaJual = 0;
            
            kodeBarang = kodeBarang
                    .replaceAll(".+\\(", "")
                    .replaceAll("\\)", "");
            
            try{
                
                // get barang
                Connection conn = Koneksi.getConnection();
                PreparedStatement ps = conn.prepareStatement("select nama, harga_jual from barang where kode=?;");
                ps.setString(1, kodeBarang);

                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    namaBarang = rs.getString("nama");
                    hargaJual = rs.getBigDecimal("harga_jual").intValue();
                }

                // edit table
                model.setValueAt(namaBarang, selectedRow, 0);
                model.setValueAt(kodeBarang, selectedRow, 1);
                model.setValueAt(hargaJual.toString(), selectedRow, 2);
                model.setValueAt(jumlahBarang, selectedRow, 3);
                
            } catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "gagal edit");
            }
            
            
            
        } else {
            JOptionPane.showMessageDialog(this, "anda belum select row di table");
        }
        
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // get data
        String trxNo = txtNomor.getText();
        Date trxTgl = dateChooser.getDate();
        String suplierKode = (String) suplierNames.getSelectedItem();
        
        suplierKode = suplierKode
                .replaceAll(".+\\(", "")
                .replaceAll("\\)", "");
        
        // validasi
        if(
            trxNo.isBlank() ||
            trxTgl == null || 
            suplierKode.isBlank() || 
            0 == txtTabel.getRowCount()
        ) {
            JOptionPane.showMessageDialog(this, "data kurang lengkap");
        }
        
        // insert data to database
        Connection con = Koneksi.getConnection();
        
        try{
            con.setAutoCommit(false);
            
            // save parent
            PreparedStatement ps = con.prepareStatement(
                    """
                    
                    insert into umkmdb.pembelian (nomor_transaksi, tanggal_transaksi, suplier_id)
                    values (
                        ?, 
                        ?,
                        (
                            SELECT id from suplier where kode = ?
                        )
                    );
                    """);
            ps.setString(1, trxNo);
            ps.setDate(2, (java.sql.Date) trxTgl);
            ps.setString(3, suplierKode);
            
            ps.execute();
            
            // get last id
            String trxId = null;
            ps = con.prepareStatement("select LAST_INSERT_ID()");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                trxId = rs.getString(1);
            }
            
            DefaultTableModel model = (DefaultTableModel) txtTabel.getModel();
            // iterasi row
            for (int row = 0; row < model.getRowCount(); row++) {
                String kodeBarang = (String) model.getValueAt(row, 1);
                String jumlahBarang = (String) model.getValueAt(row, 3);
                
                ps = con.prepareStatement(
                        """
                        insert into pembelian_barang (
                            pembelian_id, 
                            barang_id, 
                            jumlah_barang
                        )
                        values (
                        ?, 
                        (select id from barang where kode=? group by kode), 
                        ?);
                        """
                );
                ps.setString(1, trxId);
                ps.setString(2, kodeBarang);
                ps.setString(3, jumlahBarang);
                ps.execute();
            }
            
            // save child
            ps = con.prepareStatement(
                    """
                    insert into pembelian_barang (pembelian_id, barang_id, jumlah_barang)
                    values (?, ?, ?);
                    """
            );
            ps.setString(1, trxId);
            ps.setString(1, trxId);
            ps.setString(1, trxId);
            
            con.commit();
        } catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "gagal simpan");
        }
        
        // pop berhasil
        JOptionPane.showMessageDialog(this, "data tersimpan");
        
    }//GEN-LAST:event_jButton5MouseClicked

    
    
    private static String generateRandomString() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            char randomChar = characters.charAt(random.nextInt(characters.length()));
            sb.append(randomChar);
        }

        return sb.toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EBJumlahBarang;
    private javax.swing.JComboBox<String> EBKodeBarang;
    private javax.swing.JTextField TBJumlahBarang;
    private javax.swing.JComboBox<String> TBKodeBarang;
    private javax.swing.JDialog addBarang;
    private javax.swing.JButton btn_generate_transaction_no;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JDialog editBarang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JPanel panelMain;
    private javax.swing.JComboBox<String> suplierNames;
    private javax.swing.JTextField txtNomor;
    private javax.swing.JTable txtTabel;
    // End of variables declaration//GEN-END:variables

    void placeHolder(javax.swing.JTextField textField, String placeholder) {
        textField.setText(placeholder);
        textField.setForeground(Color.GRAY);
        textField.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setForeground(Color.GRAY);
                    textField.setText(placeholder);
                }
            }
            
        });
    }
    
    private void setTableModel() {
        DefaultTableModel model = (DefaultTableModel) txtTabel.getModel();
        model.addColumn("Nama Barang");
        model.addColumn("Kode Barang");
        model.addColumn("Harga Beli");
        model.addColumn("Jumlah Barang");
    }
}