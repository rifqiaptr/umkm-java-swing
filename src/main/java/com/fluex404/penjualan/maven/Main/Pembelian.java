package com.fluex404.penjualan.maven.Main;

import com.fluex404.penjualan.maven.Config.Koneksi;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Pembelian extends javax.swing.JPanel {
    private final Connection conn;
    public Pembelian() {
        initComponents();
        
        conn = Koneksi.getConnection();
        setTableModel();
        loadData();
        
        placeHolder(txtNomor, "Nomor Transaksi");
        placeHolder(txtTanggal, "Tanggal Transaksi");
        placeHolder(txtNama, "Nama Supplier");
        placeHolder(txtTelepon, "Nomor Telepon");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        panelAdd = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        txtNomor = new javax.swing.JTextField();
        txtTanggal = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtTelepon = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTabel = new javax.swing.JTable();

        setLayout(new java.awt.CardLayout());

        panelMain.setBackground(new java.awt.Color(255, 255, 255));
        panelMain.setLayout(new java.awt.CardLayout());

        panelAdd.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setText("PEMBELIAN");

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Buy_30px.png"))); // NOI18N

        btnAdd.setBackground(new java.awt.Color(102, 102, 102));
        btnAdd.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(102, 102, 102));
        btnEdit.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        txtNomor.setFont(new java.awt.Font("SansSerif", 2, 14)); // NOI18N
        txtNomor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomorActionPerformed(evt);
            }
        });

        txtTanggal.setFont(new java.awt.Font("SansSerif", 2, 14)); // NOI18N

        txtNama.setFont(new java.awt.Font("SansSerif", 2, 14)); // NOI18N
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        txtTelepon.setFont(new java.awt.Font("SansSerif", 2, 14)); // NOI18N

        btnDelete.setBackground(new java.awt.Color(102, 102, 102));
        btnDelete.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnExport.setBackground(new java.awt.Color(102, 102, 102));
        btnExport.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnExport.setForeground(new java.awt.Color(255, 255, 255));
        btnExport.setText("EXPORT");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
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
        jScrollPane1.setViewportView(txtTabel);

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6))
                            .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNama, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTanggal, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNomor, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTelepon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExport)))
                        .addGap(0, 678, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAddLayout.setVerticalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(txtNomor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMain.add(panelAdd, "card2");

        add(panelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        showPanel();
        loadData();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExportActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtNomorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomorActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExport;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNomor;
    private javax.swing.JTable txtTabel;
    private javax.swing.JTextField txtTanggal;
    private javax.swing.JTextField txtTelepon;
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
    
    private void loadData() {
        getData((DefaultTableModel) txtTabel.getModel());
    }
    
    private void showPanel() {
        panelMain.removeAll();
        panelMain.add(new Pembelian());
        panelMain.repaint();
        panelMain.revalidate();
    }
    
    private void resetForm() {
        txtNomor.setText("");
        txtTanggal.setText("");
        txtNama.setText("");
        txtTelepon.setText("");
    }
    
    private void setTableModel() {
        DefaultTableModel model = (DefaultTableModel) txtTabel.getModel();
        model.addColumn("Nomor Transaksi");
        model.addColumn("Tanggal Transaksi");
        model.addColumn("Nama Supplier");
        model.addColumn("Nomor Telepon");
    }

    private void getData(DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
            String sql = "SELECT * FROM Pembelian";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String nomortransaksi     = rs.getString("nomor");
                    String tanggaltransaksi     = rs.getString("tanggal");
                    String namasupplier      = rs.getString("nama");
                    String nomortelepon = rs.getString("nomortelp");
                    
                    Object[] rowData = {nomortransaksi, tanggaltransaksi, namasupplier, nomortelepon};
                    model.addRow(rowData);
                }
            }
        }
        catch (SQLException e) {
            Logger.getLogger(Pembelian.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private String setIDAnggota() {
        String urutan = null;
        Date now = new Date();
        SimpleDateFormat noFormat = new SimpleDateFormat("yyMM");
        String no = noFormat.format(now);
        
        String sql = "SELECT RIGHT(ID_Pelanggan, 3) AS Nomor " +
                     "FROM tbl_pelanggan " +
                     "WHERE ID_Pelanggan LIKE 'PLG" + no + "%' " +
                     "ORDER BY ID_Pelanggan DESC " +
                     "LIMIT 1";
        
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();
            
            if (rs.next()) {
                int nomor = Integer.parseInt(rs.getString("Nomor")) + 1;
                urutan = "PLG" + no + String.format("%03d", nomor);
            }
            else {
                urutan = "PLG" + no + "001";
            }
        }
        catch (SQLException e) {
            java.util.logging.Logger.getLogger(Pembelian.class.getName()).log(Level.SEVERE, null, e);
        }
        return urutan;
    }

    private void insertData() {
        String nomortransaksi      = txtNomor.getText();
        String tanggaltransaksi    = txtTanggal.getText();
        String namasupplier   = txtNama.getText();
        String nomortelepon = txtTelepon.getText();
        if (nomortransaksi.isEmpty() || tanggaltransaksi.isEmpty() || namasupplier.isEmpty() || nomortelepon.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus terisi!", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            String sql = "INSERT INTO barang (kode, nama, harga_jual, kategori, satuan_barang) VALUES (?,?,?,?,?)";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, nomortransaksi);
                st.setString(2, tanggaltransaksi);
                st.setString(3, namasupplier);
                st.setString(4, nomortelepon);
                
                int rowInserted = st.executeUpdate();
                if (rowInserted > 0) {
                    JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan");
                    resetForm();
                    loadData();
                    showPanel();
                }
            }
        }
        catch (SQLException e) {
            Logger.getLogger(Pembelian.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void dataTable() {
        int row = txtTabel.getSelectedRow();
        jLabel6.setText("Perbarui Data Pelanggan");
        
        txtNomor.setText(txtTabel.getValueAt(row, 0).toString());
        txtTanggal.setText(txtTabel.getValueAt(row, 1).toString());
        txtNama.setText(txtTabel.getValueAt(row, 2).toString());
        txtTelepon.setText(txtTabel.getValueAt(row, 3).toString());
    }
    
    private void updateData() {
        String Nomortransaksi     = txtNomor.getText();
        String tanggaltransaksi     = txtTanggal.getText();
        String namasupplier      = txtNama.getText();
        String nomortelepon = txtTelepon.getText();
        
        if (Nomortransaksi.isEmpty() || tanggaltransaksi.isEmpty() || namasupplier.isEmpty() || nomortelepon.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus terisi!", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            String sql = "UPDATE barang SET nama=?, harga_jual=?, kategori=?, satuan_barang=? WHERE kode=?";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, Nomortransaksi);
                st.setString(2, tanggaltransaksi);
                st.setString(3, namasupplier);
                st.setString(4, nomortelepon);
                
                int rowUpdated = st.executeUpdate();
                if (rowUpdated > 0) {
                    JOptionPane.showMessageDialog(this, "Data Berhasil Diperbarui");
                    resetForm();
                    loadData();
                    showPanel();
                }
            }
        }
        catch (SQLException e) {
            Logger.getLogger(Pembelian.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void deleteData() {
        int selectedRow = txtTabel.getSelectedRow();
        int confirm = JOptionPane.showConfirmDialog(this, 
                "Apakah yakin ingin menghapus data ini?", 
                "Konfirmasi Hapus Data", 
                JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            String id = txtTabel.getValueAt(selectedRow, 0).toString();
            try {
                String sql = "DELETE FROM barang WHERE kode=?";
                try (PreparedStatement st = conn.prepareStatement(sql)) {
                    st.setString(1, id);
                    
                    int rowDeleted = st.executeUpdate();
                    if (rowDeleted > 0) {
                        JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
                    }
                    else {
                        JOptionPane.showMessageDialog(this, "Data Gagal Dihapus");
                    }   
                }
            }
            catch (Exception e) {
                Logger.getLogger(Pembelian.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        resetForm();
        loadData();
        showPanel();
    }
}