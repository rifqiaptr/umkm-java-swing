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

public class LapPenjualan extends javax.swing.JPanel {
    private final Connection conn;
    public LapPenjualan() {
        initComponents();
        
        conn = Koneksi.getConnection();
        getData("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        panelAdd = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnExport = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        btnExport1 = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        panelMain.setBackground(new java.awt.Color(255, 255, 255));
        panelMain.setLayout(new java.awt.CardLayout());

        panelAdd.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setText("Lap Penjualan");

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-report-30.png"))); // NOI18N

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

            },
            new String [] {
                "ID", "Kode Barang", "Nama Barang", "Harga Jual", "Kategori Barang", "Satuan Barang"
            }
        ));
        tblData.setRowHeight(30);
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        btnExport1.setBackground(new java.awt.Color(102, 102, 102));
        btnExport1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnExport1.setForeground(new java.awt.Color(255, 255, 255));
        btnExport1.setText("Search");
        btnExport1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExport1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExport1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExport))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 971, Short.MAX_VALUE)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(0, 798, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelAddLayout.setVerticalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExport1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelMain.add(panelAdd, "card2");

        add(panelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        int selectedRow = tblData.getSelectedRow();
        if (selectedRow != -1) {
            String kodeBarang    = tblData.getValueAt(selectedRow, 1).toString();
            String namaBarang    = tblData.getValueAt(selectedRow, 2).toString();
            String harga_jual    = tblData.getValueAt(selectedRow, 3).toString();
            String kategori      = tblData.getValueAt(selectedRow, 4).toString();
            String satuan_barang = tblData.getValueAt(selectedRow, 5).toString();
        }
    }//GEN-LAST:event_tblDataMouseClicked

    private void btnExportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportMouseClicked
        try {
            // Parameters for report (if any)
            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("ReportTitle", "Data Barang");
            
            //load report location
            InputStream in = this.getClass().getClassLoader().getResourceAsStream("./report/penjualan_report.jrxml");
            
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

    private void btnExport1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExport1MouseClicked
        getData(jTextField1.getText());
    }//GEN-LAST:event_btnExport1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnExport1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTable tblData;
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
    
    private void getData(String searchQuery) {
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.setColumnIdentifiers(new Object[]{
            "Nomor Transaksi",
            "Tanggal Transaksi",
            "Pelanggan",
            "Email",
            "Telp",
            "Alamat",
            "Kode Barang",
            "Nama Barang",
            "Harga Barang",
            "Kategori Barang",
            "Satuan Barang",
            "Jumlah Barang"
        });
        
        model.setRowCount(0);
        
        try {
            String sql = """
                         select
                                 p.nomor_transaksi,
                                 p.tanggal_transaksi,
                                 s.nama nama_pelanggan,
                                 s.email email_pelanggan,
                                 s.nomor_telp nomor_telp_pelanggan,
                                 s.alamat alamat_pelanggan,
                                 b.kode kode_barang,
                                 b.nama nama_barang,
                                 b.harga_jual harga_jual_barang,
                                 b.kategori kategori_barang,
                                 b.satuan_barang satuan_barang_barang,
                                 pb.jumlah_barang
                             from penjualan p
                             inner join pelanggan s on p.pelanggan_id = s.id
                             left join penjualan_barang pb on p.id = pb.penjualan_id
                             left join barang b on b.id = pb.barang_id
                             where 
                                 p.nomor_transaksi like '%#searchQuery#%' or
                                 s.nama like '%#searchQuery#%' or 
                                 s.email like '%#searchQuery#%' or
                                 s.email like'%#searchQuery#%' or
                                 s.alamat like '%#searchQuery#%' 
                         """.replaceAll("#searchQuery#", searchQuery);
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                String nomorTransaksi = rs.getString("nomor_transaksi");
                String tanggalTransaksi = rs.getString("tanggal_transaksi");
                String namaPelanggan = rs.getString("nama_pelanggan");
                String emailPelanggan = rs.getString("email_pelanggan");
                String nomorTelpPelanggan = rs.getString("nomor_telp_pelanggan");
                String alamatPelanggan = rs.getString("alamat_pelanggan");
                String kodeBarang = rs.getString("kode_barang");
                String namaBarang = rs.getString("nama_barang");
                String hargaJualBarang = rs.getString("harga_jual_barang");
                String kategoriBarang =  rs.getString("kategori_barang");
                String satuanBarang = rs.getString("satuan_barang_barang");
                String jumlahBarang = rs.getString("jumlah_barang");
                
                Object[] rowData = {
                    
                    nomorTransaksi,
                    tanggalTransaksi,
                    namaPelanggan,
                    emailPelanggan,
                    nomorTelpPelanggan,
                    alamatPelanggan,
                    kodeBarang,
                    namaBarang,
                    hargaJualBarang,
                    kategoriBarang,
                    satuanBarang,
                    jumlahBarang
                    
                };
                
                
                model.addRow(rowData);
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            Logger.getLogger(LapPenjualan.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}