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

public class DataBarang extends javax.swing.JPanel {
    private final Connection conn;
    public DataBarang() {
        initComponents();
        
        conn = Koneksi.getConnection();
        setTableModel();
        loadData();
        
        placeHolder(txtKode, "Kode Barang");
        placeHolder(txtNama, "Nama Barang");
        placeHolder(txtHarga, "Harga Jual");
        placeHolder(txtKategori, "Kategori Barang");
        placeHolder(txtSatuan, "Satuan Barang");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        panelAdd = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        txtKode = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        txtKategori = new javax.swing.JTextField();
        txtSatuan = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();

        setLayout(new java.awt.CardLayout());

        panelMain.setBackground(new java.awt.Color(255, 255, 255));
        panelMain.setLayout(new java.awt.CardLayout());

        panelAdd.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setText("DATA BARANG");

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Product_30px.png"))); // NOI18N

        btnSave.setBackground(new java.awt.Color(102, 102, 102));
        btnSave.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SAVE");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(102, 102, 102));
        btnEdit.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("EDIT");

        txtKode.setFont(new java.awt.Font("SansSerif", 2, 14)); // NOI18N

        txtNama.setFont(new java.awt.Font("SansSerif", 2, 14)); // NOI18N

        txtHarga.setFont(new java.awt.Font("SansSerif", 2, 14)); // NOI18N

        txtKategori.setFont(new java.awt.Font("SansSerif", 2, 14)); // NOI18N

        txtSatuan.setFont(new java.awt.Font("SansSerif", 2, 14)); // NOI18N

        btnDelete.setBackground(new java.awt.Color(102, 102, 102));
        btnDelete.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");

        btnExport.setBackground(new java.awt.Color(102, 102, 102));
        btnExport.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnExport.setForeground(new java.awt.Color(255, 255, 255));
        btnExport.setText("EXPORT");

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 971, Short.MAX_VALUE)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6))
                            .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtHarga, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNama, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtKode, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtKategori, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(txtSatuan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addComponent(btnSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExport)))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        try {
            String kodeBarang = txtKode.getText();
            String namaBarang = txtNama.getText();
            String harga_jual = txtHarga.getText();
            String kategori = txtKategori.getText();
            String satuan_barang = txtSatuan.getText();
            
            // insert ke database lewat sql
            String sql = "insert into barang (kode, nama, harga_jual, kategori, satuan_barang)\n" +
                        "values(?,?,?,?,?);";
            
            Connection con = Koneksi.getConnection();
            PreparedStatement stmt=con.prepareStatement(sql);
            stmt.setString(1,kodeBarang);
            stmt.setString(2,namaBarang);
            stmt.setString(3,harga_jual);
            stmt.setString(4,kategori);
            stmt.setString(5,satuan_barang);
            stmt.executeUpdate(); 
            
            // get list data dari database
            loadData();
            
            // tampilkan ke table
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_btnSaveMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtKategori;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtSatuan;
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
        panelMain.add(new DataBarang());
        panelMain.repaint();
        panelMain.revalidate();
    }
    
    private void resetForm() {
        txtKode.setText("");
        txtNama.setText("");
        txtHarga.setText("");
        txtKategori.setText("");
        txtSatuan.setText("");
    }
    
    private void setTableModel() {
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.addColumn("Kode Barang");
        model.addColumn("Nama Barang");
        model.addColumn("Harga Jual");
        model.addColumn("Kategori Barang");
        model.addColumn("Satuan Barang");
    }

    private void getData(DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
            String sql = "SELECT * FROM barang";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String kodeBarang     = rs.getString("kode");
                    String namaBarang     = rs.getString("nama");
                    String hargaJual      = rs.getString("harga_jual");
                    String kategoriBarang = rs.getString("kategori");
                    String satuanBarang   = rs.getString("satuan_barang");
                    
                    Object[] rowData = {kodeBarang, namaBarang, hargaJual, kategoriBarang, satuanBarang};
                    model.addRow(rowData);
                }
            }
        }
        catch (SQLException e) {
            Logger.getLogger(DataBarang.class.getName()).log(Level.SEVERE, null, e);
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
            java.util.logging.Logger.getLogger(DataBarang.class.getName()).log(Level.SEVERE, null, e);
        }
        return urutan;
    }

    private void insertData() {
        String kodeBarang      = txtKode.getText();
        String namaBarang    = txtNama.getText();
        String hargaJual   = txtHarga.getText();
        String kategoriBarang = txtKategori.getText();
        String satuanBarang = txtSatuan.getText();
        if (kodeBarang.isEmpty() || namaBarang.isEmpty() || hargaJual.isEmpty() || kategoriBarang.isEmpty() || satuanBarang.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus terisi!", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            String sql = "INSERT INTO barang (kode, nama, harga_jual, kategori, satuan_barang) VALUES (?,?,?,?,?)";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, kodeBarang);
                st.setString(2, namaBarang);
                st.setString(3, hargaJual);
                st.setString(4, kategoriBarang);
                st.setString(5, satuanBarang);
                
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
            Logger.getLogger(DataBarang.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void dataTable() {
        int row = tblData.getSelectedRow();
        jLabel6.setText("Perbarui Data Pelanggan");
        
        txtKode.setText(tblData.getValueAt(row, 0).toString());
        txtNama.setText(tblData.getValueAt(row, 1).toString());
        txtHarga.setText(tblData.getValueAt(row, 2).toString());
        txtKategori.setText(tblData.getValueAt(row, 3).toString());
        txtSatuan.setText(tblData.getValueAt(row, 4).toString());
    }
    
    private void updateData() {
        String kodeBarang     = txtKode.getText();
        String namaBarang     = txtNama.getText();
        String hargaJual      = txtHarga.getText();
        String kategoriBarang = txtKategori.getText();
        String satuanBarang   = txtSatuan.getText();
        
        if (kodeBarang.isEmpty() || namaBarang.isEmpty() || hargaJual.isEmpty() || kategoriBarang.isEmpty() || satuanBarang.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus terisi!", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            String sql = "UPDATE barang SET nama=?, harga_jual=?, kategori=?, satuan_barang=? WHERE kode=?";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, namaBarang);
                st.setString(2, hargaJual);
                st.setString(3, kategoriBarang);
                st.setString(4, satuanBarang);
                st.setString(5, kodeBarang);
                
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
            Logger.getLogger(DataBarang.class.getName()).log(Level.SEVERE, null, e);
        }
    }

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
                Logger.getLogger(DataBarang.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        resetForm();
        loadData();
        showPanel();
    }
}