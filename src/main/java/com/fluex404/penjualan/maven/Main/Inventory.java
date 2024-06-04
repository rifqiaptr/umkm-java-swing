package com.fluex404.penjualan.maven.Main;

import com.fluex404.penjualan.maven.Config.Koneksi;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class Inventory extends javax.swing.JPanel {
    private final Connection conn;
    public Inventory() {
        initComponents();
        
        conn = Koneksi.getConnection();
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
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        btnExport.setBackground(new java.awt.Color(102, 102, 102));
        btnExport.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnExport.setForeground(new java.awt.Color(255, 255, 255));
        btnExport.setText("EXPORT");
        btnExport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExportMouseClicked(evt);
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
                "Nama Barang", "Kode Barang", "Harga Jual", "Barang Tersedia", "Barang Terjual", "Barang Masuk"
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

    private void btnExportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportMouseClicked
        try {
            // Parameters for report (if any)
            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("ReportTitle", "Data Inventory");
            
            //load report location
            InputStream in = this.getClass().getClassLoader().getResourceAsStream("./report/inventory_report.jrxml");
            
            //compile report
            JasperReport jasperReport = (JasperReport) JasperCompileManager.compileReport(in);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, conn);
            
            //view report to UI
            JasperViewer.viewReport(jasperPrint, false);
            

            JOptionPane.showMessageDialog(this, "Laporan berhasil diekspor ke PDF");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnExportMouseClicked

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        searchData();
    }//GEN-LAST:event_txtSearchKeyPressed


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

    private void getData(DefaultTableModel model) {
        model.setRowCount(0);

        try {
            // Query gabungan dengan INNER JOIN dan kondisi LIKE
            String sql = "SELECT " +
                            "b.nama, " +
                            "b.kode, " +
                            "b.harga_jual, " +
                            "i.barang_tersedia, " +
                            "i.barang_terjual, " +
                            "i.barang_masuk " +
                         "FROM " +
                            "barang b " +
                         "INNER JOIN " +
                            "inventory i " +
                         "ON b.id = i.barang_id AND b.nama LIKE '%%'";

            try (PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    String namaBarang     = rs.getString("nama");
                    String kodeBarang     = rs.getString("kode");
                    String hargaJual      = rs.getString("harga_jual");
                    String barangTersedia = rs.getString("barang_tersedia");
                    String barangTerjual  = rs.getString("barang_terjual");
                    String barangMasuk    = rs.getString("barang_masuk");

                    // Sesuaikan kolom yang ditambahkan ke dalam rowData dengan kolom yang ada di SELECT
                    Object[] rowData = {namaBarang, kodeBarang, hargaJual, barangTersedia, barangTerjual, barangMasuk};
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void searchData() {
        String kataKunci = txtSearch.getText();

        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.setRowCount(0);

        String sql = "SELECT " +
                        "b.nama, " +
                        "b.kode, " +
                        "b.harga_jual, " +
                        "i.barang_tersedia, " +
                        "i.barang_terjual, " +
                        "i.barang_masuk " +
                     "FROM " +
                        "barang b " +
                     "INNER JOIN " +
                        "inventory i " +
                     "ON b.id = i.barang_id " +
                     "WHERE b.nama LIKE ? OR b.kode LIKE ?";

        try (PreparedStatement st = conn.prepareStatement(sql)) {
            String searchPattern = "%" + kataKunci + "%";
            st.setString(1, searchPattern);
            st.setString(2, searchPattern);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                String namaBarang     = rs.getString("nama");
                String kodeBarang     = rs.getString("kode");
                String hargaJual      = rs.getString("harga_jual");
                String barangTersedia = rs.getString("barang_tersedia");
                String barangTerjual  = rs.getString("barang_terjual");
                String barangMasuk    = rs.getString("barang_masuk");

                Object[] rowData = {namaBarang, kodeBarang, hargaJual, barangTersedia, barangTerjual, barangMasuk};
                model.addRow(rowData);
            }
        } catch (SQLException e) {
            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}