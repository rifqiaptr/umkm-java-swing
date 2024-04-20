package com.fluex404.penjualan.maven.View;

import com.fluex404.penjualan.maven.Config.Koneksi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MenuPenerbit extends javax.swing.JPanel {
    private int halamanSaatIni = 1;
    private int dataPerHalaman = 50;
    private int totalPages;
    
    private final Connection conn;
    public MenuPenerbit() {
        initComponents();
        
        conn = Koneksi.getConnection();
        setTableModel();
        loadData();
        pagination();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbJK = new javax.swing.ButtonGroup();
        panelMain = new javax.swing.JPanel();
        panelView = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_first = new javax.swing.JButton();
        btn_before = new javax.swing.JButton();
        cbx_data = new javax.swing.JComboBox<>();
        btn_next = new javax.swing.JButton();
        btn_last = new javax.swing.JButton();
        lb_halaman = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        tblData = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelAdd = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnCancel2 = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtSitus = new javax.swing.JTextField();

        setLayout(new java.awt.CardLayout());

        panelMain.setBackground(new java.awt.Color(255, 255, 255));
        panelMain.setLayout(new java.awt.CardLayout());

        panelView.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("Data Penerbit Buku");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Master Data > Penerbit");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/TV_30px.png"))); // NOI18N

        btn_first.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btn_first.setText("First Page");

        btn_before.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btn_before.setText("<");

        cbx_data.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cbx_data.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "50", "100", "150", "200" }));
        cbx_data.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btn_next.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btn_next.setText(">");

        btn_last.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btn_last.setText("Last Page");

        lb_halaman.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lb_halaman.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_halaman.setText("Halaman ... dari Total Data ...");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Penerbit_30px.png"))); // NOI18N

        btnAdd.setBackground(new java.awt.Color(52, 152, 219));
        btnAdd.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Tambah_30px.png"))); // NOI18N
        btnAdd.setText("TAMBAH");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 0, 51));
        btnDelete.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Hapus_30px.png"))); // NOI18N
        btnDelete.setText("HAPUS");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 102, 0));
        btnCancel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Batal_30px.png"))); // NOI18N
        btnCancel.setText("BATAL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        txtSearch.setText("Search");
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });

        tblData.setBackground(new java.awt.Color(255, 255, 255));
        tblData.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblData.setViewportView(jTable1);

        javax.swing.GroupLayout panelViewLayout = new javax.swing.GroupLayout(panelView);
        panelView.setLayout(panelViewLayout);
        panelViewLayout.setHorizontalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lb_halaman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addComponent(btn_first)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_before)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_next)
                        .addGap(6, 6, 6)
                        .addComponent(btn_last)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tblData)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelViewLayout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 351, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)))
                .addGap(30, 30, 30))
        );
        panelViewLayout.setVerticalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdd)
                        .addComponent(btnDelete)
                        .addComponent(btnCancel))
                    .addComponent(txtSearch))
                .addGap(18, 18, 18)
                .addComponent(tblData, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lb_halaman)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_first)
                    .addComponent(btn_before)
                    .addComponent(cbx_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_next)
                    .addComponent(btn_last))
                .addGap(31, 31, 31))
        );

        panelMain.add(panelView, "card2");

        panelAdd.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setText("Tambah Data Penerbit Buku Perpustakaan");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setText("ID");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/TV_30px.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Penerbit_30px.png"))); // NOI18N

        btnSave.setBackground(new java.awt.Color(52, 152, 219));
        btnSave.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Simpan_30px.png"))); // NOI18N
        btnSave.setText("SIMPAN");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel2.setBackground(new java.awt.Color(255, 102, 0));
        btnCancel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnCancel2.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Batal_30px.png"))); // NOI18N
        btnCancel2.setText("BATAL");
        btnCancel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancel2ActionPerformed(evt);
            }
        });

        txtID.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        txtID.setText("ID");
        txtID.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setText("Master Data > Penerbit");

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setText("Nama");

        txtNama.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setText("Situs");

        txtSitus.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 361, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11))
                    .addComponent(txtID)
                    .addComponent(txtNama)
                    .addComponent(txtSitus)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addComponent(btnSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        panelAddLayout.setVerticalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnCancel2))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSitus, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        panelMain.add(panelAdd, "card2");

        add(panelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        panelMain.removeAll();
        panelMain.add(panelAdd);
        panelMain.repaint();
        panelMain.revalidate();
        
        txtID.setText(setIDPenerbit());
        if (btnAdd.getText().equals("UBAH")) {
            dataTable();
            btnSave.setText("PERBARUI");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        deleteData();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        showPanel();
        loadData();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (btnSave.getText().equals("TAMBAH")) {
            btnSave.setText("SIMPAN");
        }
        else if (btnSave.getText().equals("SIMPAN")) {
            insertData();
        }
        else if (btnSave.getText().equals("PERBARUI")) {
            updateData();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancel2ActionPerformed
        showPanel();
        loadData();
    }//GEN-LAST:event_btnCancel2ActionPerformed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        searchData();
    }//GEN-LAST:event_txtSearchKeyTyped

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        if (btnAdd.getText().equals("TAMBAH")) {
            btnAdd.setText("UBAH");
            btnDelete.setVisible(true);
            btnCancel.setVisible(true);
        }
    }//GEN-LAST:event_tblDataMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCancel2;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btn_before;
    private javax.swing.JButton btn_first;
    private javax.swing.JButton btn_last;
    private javax.swing.JButton btn_next;
    private javax.swing.JComboBox<String> cbx_data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lb_halaman;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelView;
    private javax.swing.ButtonGroup rbJK;
    private javax.swing.JScrollPane tblData;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSitus;
    // End of variables declaration//GEN-END:variables

    private void pagination() {
        btn_first.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                halamanSaatIni = 1;
                loadData();
            }
        });
        
        btn_before.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (halamanSaatIni > 1) {
                    halamanSaatIni--;
                    loadData();
                }
            }
        });
        
        cbx_data.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dataPerHalaman = Integer.parseInt(cbx_data.getSelectedItem().toString());
                halamanSaatIni = 1;
                loadData();
            }
        });
        
        btn_next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (halamanSaatIni < totalPages) {
                halamanSaatIni++;
                loadData();
                }
            }
        });
        
        btn_last.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                halamanSaatIni = totalPages;
                loadData();
            }
        });
    }
    
    private void calculateTotalPages() {
        int totalData = getTotalData();
        totalPages = (int) Math.ceil((double) totalData / dataPerHalaman);
    }
    
    private int getTotalData() {
        int totalData = 0;
        
        try {
            String sql = "SELECT COUNT(*) AS total FROM tbl_penerbit";
            try (PreparedStatement st = conn.prepareStatement(sql)) {;
                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    totalData = rs.getInt("total");
                }
            }
        }
        catch (Exception e) {
            Logger.getLogger(MenuPenerbit.class.getName()).log(Level.SEVERE, null, e);
        }
        return totalData;
    }
    
    private void loadData() {
        calculateTotalPages();
        JTable tblData = new JTable();
        int totalData = getTotalData();
        lb_halaman.setText(String.valueOf("Halaman " + halamanSaatIni + " dari Total Data " + totalData));
        
        int startIndex = (halamanSaatIni - 1) *dataPerHalaman;
        getData(startIndex, dataPerHalaman, (DefaultTableModel) tblData.getModel());
        btnDelete.setVisible(false);
        btnCancel.setVisible(false);
    }
    
    private void showPanel() {
        panelMain.removeAll();
        panelMain.add(new MenuPenerbit());
        panelMain.repaint();
        panelMain.revalidate();
    }
    
    private void resetForm() {
        txtID.setText("");
        txtNama.setText("");
        txtSitus.setText("");
    }
    
    private void setTableModel() {
        JTable tblData = new JTable();
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.addColumn("ID Penerbit");
        model.addColumn("Penerbit");
        model.addColumn("Situs Penerbit");
    }

    private void getData(int startIndex, int entriesPage, DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
            String sql = "SELECT * FROM tbl_penerbit LIMIT ?,?";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setInt(1, startIndex);
                st.setInt(2, entriesPage);
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String idPenerbit    = rs.getString("ID_Penerbit");
                    String namaPenerbit  = rs.getString("Nama_Penerbit");
                    String situsPenerbit = rs.getString("Situs_Penerbit");
                    
                    Object[] rowData = {idPenerbit, namaPenerbit, situsPenerbit};
                    model.addRow(rowData);
                }
            }
        }
        catch (SQLException e) {
            Logger.getLogger(MenuPenerbit.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private String setIDPenerbit() {
        String urutan = null;
        Date now = new Date();
        SimpleDateFormat noFormat = new SimpleDateFormat("yyMM");
        String no = noFormat.format(now);
        
        String sql = "SELECT RIGHT(ID_Penerbit, 3) AS Nomor " +
                     "FROM tbl_penerbit " +
                     "WHERE ID_Penerbit LIKE 'PNB" + no + "%' " +
                     "ORDER BY ID_Penerbit DESC " +
                     "LIMIT 1";
        
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();
            
            if (rs.next()) {
                int nomor = Integer.parseInt(rs.getString("Nomor")) + 1;
                urutan = "PNB" + no + String.format("%03d", nomor);
            }
            else {
                urutan = "PNB" + no + "001";
            }
        }
        catch (SQLException e) {
            Logger.getLogger(MenuPenerbit.class.getName()).log(Level.SEVERE, null, e);
        }
        return urutan;
    }
    
    public boolean validasiNama() {
        boolean valid = false;
        String idPenerbit = txtID.getText();
        String namaPenerbit = txtNama.getText();
        
        String sql = "SELECT Nama_Penerbit FROM tbl_penerbit WHERE ID_Penerbit !='" +idPenerbit+ "' AND Nama_Penerbit LIKE BINARY '" +namaPenerbit+ "'";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();
            
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Nama Penerbit sudah ada\nSilahkan input Nama Penerbit yang berbeda!",
                        "Peringatan", JOptionPane.WARNING_MESSAGE);
            }
            else {
                valid = true;
            }
        }
        catch (SQLException e) {
            Logger.getLogger(MenuPenerbit.class.getName()).log(Level.SEVERE, null, e);
        }
        return valid;
    }

    private void insertData() {
        String idPenerbit = txtID.getText();
        String namaPenerbit = txtNama.getText();
        String situsPenerbit = txtSitus.getText();
        
        if (idPenerbit.isEmpty() || namaPenerbit.isEmpty() || situsPenerbit.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus terisi!", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (!validasiNama()) {
            return;
        }
        
        try {
            String sql = "INSERT INTO tbl_penerbit (ID_Penerbit, Nama_Penerbit, Situs_Penerbit) VALUES (?,?,?)";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, idPenerbit);
                st.setString(2, namaPenerbit);
                st.setString(3, situsPenerbit);
                
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
            Logger.getLogger(MenuPenerbit.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void dataTable() {
        JTable tblData = new JTable();
        panelView.setVisible(false);
        panelAdd.setVisible(true);
        
        int row = tblData.getSelectedRow();
        jLabel6.setText("Perbarui Data Penerbit Perpustakaan");
        
        txtID.setEnabled(false);
        
        txtID.setText(tblData.getValueAt(row, 0).toString());
        txtNama.setText(tblData.getValueAt(row, 1).toString());
        txtSitus.setText(tblData.getValueAt(row, 2).toString());
    }
    
    private void updateData() {
        String idPenerbit = txtID.getText();
        String namaPenerbit = txtNama.getText();
        String situsPenerbit = txtSitus.getText();
        
        if (idPenerbit.isEmpty() || namaPenerbit.isEmpty() || situsPenerbit.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus terisi!", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            String sql = "UPDATE tbl_penerbit SET Nama_Penerbit=?, Situs_Penerbit=? WHERE ID_Penerbit=?";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, namaPenerbit);
                st.setString(2, situsPenerbit);
                st.setString(3, idPenerbit);
                
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
            Logger.getLogger(MenuPenerbit.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void deleteData() {
        JTable tblData = new JTable();
        int selectedRow = tblData.getSelectedRow();
        int confirm = JOptionPane.showConfirmDialog(this, 
                "Apakah yakin ingin menghapus data ini?", 
                "Konfirmasi Hapus Data", 
                JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            String id = tblData.getValueAt(selectedRow, 0).toString();
            try {
                String sql = "DELETE FROM tbl_penerbit WHERE ID_Penerbit=?";
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
                Logger.getLogger(MenuPenerbit.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        resetForm();
        loadData();
        showPanel();
    }

    private void searchData() {
        String kataKunci = txtSearch.getText();
        
        JTable tblData = new JTable();
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.setRowCount(0);
        
        try {
            String sql = "SELECT * FROM tbl_penerbit WHERE Nama_Penerbit LIKE ? OR Situs_Penerbit LIKE ?";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, "%" + kataKunci + "%");
                st.setString(2, "%" + kataKunci + "%");
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String idPenerbit    = rs.getString("ID_Penerbit");
                    String namaPenerbit  = rs.getString("Nama_Penerbit");
                    String situsPenerbit = rs.getString("Situs_Penerbit");
                    
                    Object[] rowData = {idPenerbit, namaPenerbit, situsPenerbit};
                    model.addRow(rowData);
                }
            }
        }
        catch (SQLException e) {
            Logger.getLogger(MenuPenerbit.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}