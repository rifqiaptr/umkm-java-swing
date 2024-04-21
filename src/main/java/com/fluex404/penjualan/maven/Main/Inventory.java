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

public class Inventory extends javax.swing.JPanel {
    private final Connection conn;
    public Inventory() {
        initComponents();
        
        conn = Koneksi.getConnection();
        setTableModel();
        loadData();
        
        placeHolder(txtSearch, "Search Barang");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        panelAdd = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnExport = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();

        setLayout(new java.awt.CardLayout());

        panelMain.setBackground(new java.awt.Color(255, 255, 255));
        panelMain.setLayout(new java.awt.CardLayout());

        panelAdd.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setText("INVENTORY");

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Inventory_30px.png"))); // NOI18N

        txtSearch.setFont(new java.awt.Font("SansSerif", 2, 14)); // NOI18N
        txtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchMouseClicked(evt);
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

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nama Barang", "Kode Barang", "Harga Beli", "Barang Tersedia", "Barang Terjual", "Barang Masuk"
            }
        ));
        tblData.setRowHeight(30);
        jScrollPane1.setViewportView(tblData);

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExport))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 968, Short.MAX_VALUE)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(0, 819, Short.MAX_VALUE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        panelAddLayout.setVerticalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelMain.add(panelAdd, "card2");

        add(panelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExportActionPerformed

    private void txtSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExport;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtSearch;
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
        getData((DefaultTableModel) tblData.getModel());
    }
    
    private void showPanel() {
        panelMain.removeAll();
        panelMain.add(new Inventory());
        panelMain.repaint();
        panelMain.revalidate();
    }
    
    private void resetForm() {
        txtSearch.setText("");
    }
    
    private void setTableModel() {
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.addColumn("Nama Barang");
        model.addColumn("Kode Barang");
        model.addColumn("Harga Beli");
        model.addColumn("Barang Tersedia");
        model.addColumn("Barang Terjual");
        model.addColumn("Barang Masuk");
    }

    private void getData(DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
            String sql = "SELECT * FROM inventory";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String namaBarang     = rs.getString("nama");
                    String kodeBarang     = rs.getString("kode");
                    String hargaBeli      = rs.getString("harga_beli");
                    String barangTersedia = rs.getString("barang_tersedia");
                    String barangTerjual  = rs.getString("barang_terjual");
                    String barangMasuk    = rs.getString("barang_masuk");
                    
                    Object[] rowData = {namaBarang, kodeBarang, hargaBeli, barangTersedia, barangTerjual, barangMasuk};
                    model.addRow(rowData);
                }
            }
        }
        catch (SQLException e) {
            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void searchData() {
        String kataKunci = txtSearch.getText();

        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.setRowCount(0);

        String sql = "SELECT "
                + "b.kode, "
                + "b.nama, "
                + "b.harga_jual, "
                + "i.barang_terjual, "
                + "i.barang_terjual, "
                + "i.barang_masuk \n" +
                "FROM inventory i\n" +
                "INNER JOIN barang b on b.id = i.barang_id";
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
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, e);
        }
        return urutan;
    }

//    private void dataTable() {
//        int row = tblData.getSelectedRow();
//        jLabel6.setText("Perbarui Data Pelanggan");
//        
//        txtSearch.setText(tblData.getValueAt(row, 0).toString());
//        txtNama.setText(tblData.getValueAt(row, 1).toString());
//        txtKode.setText(tblData.getValueAt(row, 2).toString());
//        txtHargaBeli.setText(tblData.getValueAt(row, 3).toString());
//        txtBarangTersedia.setText(tblData.getValueAt(row, 4).toString());
//        txtBarangTerjual.setText(tblData.getValueAt(row, 5).toString());
//        txtBarangMasuk.setText(tblData.getValueAt(row, 6).toString());
//    }
    
//    private void updateData() {
//                    String namaBarang     = rs.getString("nama");
//                    String kodeBarang     = rs.getString("kode");
//                    String hargaBeli      = rs.getString("harga_beli");
//                    String barangTersedia = rs.getString("barang_tersedia");
//                    String barangTerjual  = rs.getString("barang_terjual");
//                    String barangMasuk    = rs.getString("barang_masuk");
//        
//        if (kodeBarang.isEmpty() || namaBarang.isEmpty() || hargaJual.isEmpty() || kategoriBarang.isEmpty() || satuanBarang.isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Semua kolom harus terisi!", "Validasi", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//        
//        try {
//            String sql = "UPDATE barang SET nama=?, harga_jual=?, kategori=?, satuan_barang=? WHERE kode=?";
//            try (PreparedStatement st = conn.prepareStatement(sql)) {
//                st.setString(1, namaBarang);
//                st.setString(2, kodeBarang);
//                st.setString(3, hargaBeli);
//                st.setString(4,barangTersedia);
//                st.setString(5, barangTerjual);
//                st.setString(6,barangMasuk);
//                
//                int rowUpdated = st.executeUpdate();
//                if (rowUpdated > 0) {
//                    JOptionPane.showMessageDialog(this, "Data Berhasil Diperbarui");
//                    resetForm();
//                    loadData();
//                    showPanel();
//                }
//            }
//        }
//        catch (SQLException e) {
//            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, e);
//        }
//    }

    private void deleteData() {
        int selectedRow = tblData.getSelectedRow();
        int confirm = JOptionPane.showConfirmDialog(this, 
                "Apakah yakin ingin menghapus data ini?", 
                "Konfirmasi Hapus Data", 
                JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            String id = tblData.getValueAt(selectedRow, 0).toString();
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
                Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        resetForm();
        loadData();
        showPanel();
    }
}