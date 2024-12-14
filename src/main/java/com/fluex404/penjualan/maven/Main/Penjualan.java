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
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class Penjualan extends javax.swing.JPanel {
    private final Connection conn;
    public Penjualan() {
        initComponents();
        
        conn = Koneksi.getConnection();
        setTableModel();
        setTableModelHistory();
        setTableModelDetail();
        getData();
        
        placeHolder(txtNomor, "Nomor Transaksi");
        
        // settingan fold
        txtNomor.disable();
        
        // settingan datachooser
        dateChooser.setDateFormatString("dd/MM/yyy");
       
        // settingan supliername combo box
        try{
            pelangganNames.removeAllItems();
            
            Connection conn = Koneksi.getConnection();
            PreparedStatement ps = conn.prepareStatement("select concat(nama, ' (', kode, ')')  from pelanggan;");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                pelangganNames.addItem(rs.getString(1));
            }
            
            pelangganNames.setEditable(true);
            pelangganNames.setSelectedItem("");
            
            AutoCompleteDecorator.decorate(pelangganNames);
            
        } catch(Exception e){
            
        }
        
        // delete all row in jtable
        DefaultTableModel model = (DefaultTableModel) txtTabel.getModel();
        model.setRowCount(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addBarang = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        TBKodeBarang = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TBJumlahBarang = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        editBarang = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        EBKodeBarang = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        EBJumlahBarang = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        panelMain = new javax.swing.JPanel();
        panelView = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        pnDetail2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnCloseDetail2 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblDataDetail2 = new javax.swing.JTable();
        btnEdit = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        panelAdd = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNomor = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtTabel = new javax.swing.JTable();
        btn_generate_transaction_no = new javax.swing.JButton();
        dateChooser = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        pelangganNames = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnCreateTransaction = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnEditTransaction = new javax.swing.JButton();

        jLabel4.setText("Tambah Barang");

        TBKodeBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setText("Kode Barang");

        jLabel11.setText("Jumlah Barang");

        jButton6.setText("ADD");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
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
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TBJumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addBarangLayout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(jLabel8)
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
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TBJumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel13.setText("Edit Barang");

        EBKodeBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel14.setText("Kode Barang");

        jLabel15.setText("Jumlah Barang");

        jButton7.setText("EDIT");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
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
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(EBJumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, editBarangLayout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(EBKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(editBarangLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(84, 84, 84)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        editBarangLayout.setVerticalGroup(
            editBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editBarangLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(editBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EBKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(EBJumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        setLayout(new java.awt.CardLayout());

        panelMain.setBackground(new java.awt.Color(255, 255, 255));
        panelMain.setLayout(new java.awt.CardLayout());

        panelView.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("PENJUALAN");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Sell_30px.png"))); // NOI18N

        btnAdd.setBackground(new java.awt.Color(0, 204, 51));
        btnAdd.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("TAMBAH");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

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
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        pnDetail2.setBackground(new java.awt.Color(255, 255, 255));
        pnDetail2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pnDetail2.setForeground(new java.awt.Color(204, 204, 204));

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel18.setText("DETAIL PENJUALAN");

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Sell_30px.png"))); // NOI18N

        btnCloseDetail2.setForeground(new java.awt.Color(102, 102, 102));
        btnCloseDetail2.setText("X");
        btnCloseDetail2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseDetail2MouseClicked(evt);
            }
        });

        tblDataDetail2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblDataDetail2.setRowHeight(30);
        jScrollPane6.setViewportView(tblDataDetail2);

        javax.swing.GroupLayout pnDetail2Layout = new javax.swing.GroupLayout(pnDetail2);
        pnDetail2.setLayout(pnDetail2Layout);
        pnDetail2Layout.setHorizontalGroup(
            pnDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDetail2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addGroup(pnDetail2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCloseDetail2)))
                .addContainerGap())
        );
        pnDetail2Layout.setVerticalGroup(
            pnDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDetail2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCloseDetail2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnEdit.setBackground(new java.awt.Color(52, 152, 219));
        btnEdit.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnRemove.setBackground(new java.awt.Color(255, 51, 51));
        btnRemove.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(255, 255, 255));
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelViewLayout = new javax.swing.GroupLayout(panelView);
        panelView.setLayout(panelViewLayout);
        panelViewLayout.setHorizontalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnDetail2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 966, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelViewLayout.createSequentialGroup()
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelViewLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelViewLayout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemove)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        panelViewLayout.setVerticalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEdit)
                        .addComponent(btnRemove))
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addComponent(pnDetail2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        panelMain.add(panelView, "card2");

        panelAdd.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setText("PENJUALAN");

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Sell_30px.png"))); // NOI18N

        txtNomor.setFont(new java.awt.Font("SansSerif", 2, 14)); // NOI18N

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
        jScrollPane3.setViewportView(txtTabel);

        btn_generate_transaction_no.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-refresh-16.png"))); // NOI18N
        btn_generate_transaction_no.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_generate_transaction_no.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_generate_transaction_noMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setText("NOMOR TRANSAKSI");

        jButton1.setText("TAMBAH");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("EDIT");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("HAPUS");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        btnCreateTransaction.setText("SAVE");
        btnCreateTransaction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCreateTransactionMouseClicked(evt);
            }
        });
        btnCreateTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateTransactionActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setText("TANGGAL TRANSAKSI");

        jLabel16.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel16.setText("NAMA PELANGGAN");

        btnEditTransaction.setText("EDIT");
        btnEditTransaction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditTransactionMouseClicked(evt);
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
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pelangganNames, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addComponent(txtNomor, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_generate_transaction_no, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 966, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelAddLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelAddLayout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3))
                                    .addGroup(panelAddLayout.createSequentialGroup()
                                        .addComponent(btnCreateTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEditTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(30, 30, 30))))
        );
        panelAddLayout.setVerticalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_generate_transaction_no, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNomor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pelangganNames, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateTransaction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelMain.add(panelAdd, "card2");

        add(panelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        panelMain.removeAll();
        panelMain.add(panelAdd);
        panelMain.repaint();
        panelMain.revalidate();
        
        
        btnCreateTransaction.setVisible(true);
        btnEditTransaction.setVisible(false);
    }//GEN-LAST:event_btnAddActionPerformed

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
            
            btnCreateTransaction.setVisible(true);
            btnEditTransaction.setVisible(false);

        }catch(Exception e){
            JOptionPane.showConfirmDialog(this, e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton6MouseClicked

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

    private void btn_generate_transaction_noMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_generate_transaction_noMouseClicked
        try{

            Connection conn = Koneksi.getConnection();
            PreparedStatement ps = conn.prepareStatement("select count(1)+1 from penjualan_barang;");
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

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        int selectedRow = txtTabel.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) txtTabel.getModel();
            model.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "anda belum select row di table");
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void btnCreateTransactionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateTransactionMouseClicked
        // get data
        String trxNo = txtNomor.getText();
        Date trxTgl = dateChooser.getDate();
        String suplierKode = (String) pelangganNames.getSelectedItem();

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
            return;
        }

        // insert data to database
        Connection con = Koneksi.getConnection();

        try{
            con.setAutoCommit(false);

            // save parent
            PreparedStatement ps = con.prepareStatement(
                """

                insert into umkmdb.penjualan (nomor_transaksi, tanggal_transaksi, pelanggan_id)
                values (
                    ?,
                    ?,
                    (
                        SELECT id from pelanggan where kode = ?
                    )
                );
                """);
                ps.setString(1, trxNo);
                ps.setDate(2, new java.sql.Date(trxTgl.getTime()) );
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
                        insert into penjualan_barang (
                            penjualan_id,
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
                    insert into penjualan_barang (penjualan_id, barang_id, jumlah_barang)
                    values (?, ?, ?);
                    """
                );
                ps.setString(1, trxId);
                ps.setString(1, trxId);
                ps.setString(1, trxId);

                con.commit();
            } catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "gagal simpan karna "+e.getMessage());
                return;
            }

            // pop berhasil
            JOptionPane.showMessageDialog(this, "data tersimpan");

    }//GEN-LAST:event_btnCreateTransactionMouseClicked

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        pnDetail2.setVisible(true);
                
        int row = tblData.getSelectedRow();
        String id = tblData.getValueAt(row, 0).toString();
        getDataDetail(id);
    }//GEN-LAST:event_tblDataMouseClicked

    private void btnCloseDetail2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseDetail2MouseClicked
        showPanel();
    }//GEN-LAST:event_btnCloseDetail2MouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed

        // init component
        btn_generate_transaction_no.setVisible(false);
        btnEditTransaction.setVisible(true);
        btnCreateTransaction.setVisible(false);

        // get data from table transaksi
        int row = tblData.getSelectedRow();

        if(-1 == row){
            JOptionPane.showMessageDialog(this, "Anda belum memilih row");
            return;
        }

        String transactionId = tblData.getValueAt(row, 0).toString();

        System.out.println("TransactionId : "+transactionId);

        clearTransactionDetail();
        setTransactionDetail(transactionId);

        // pindah halaman
        panelMain.removeAll();
        panelMain.add(panelAdd);
        panelMain.repaint();
        panelMain.revalidate();
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void clearTransactionDetail(){
        txtNomor.setText("");
        dateChooser.cleanup();
        pelangganNames.setSelectedIndex(-1);
        txtTabel.removeAll();
    }
    
    private void setTransactionDetail(String transactionId){
        // get data transaction
        String sql = """
                     select
                          p.id,
                          p.nomor_transaksi,
                          p.tanggal_transaksi,
                          p.pelanggan_id,
                          s.nama pelanggan_name
                      from penjualan p
                      inner join pelanggan s on p.pelanggan_id = s.id
                      where p.id =
                     """+transactionId;
        
        Connection con = Koneksi.getConnection();
        
        try {
            PreparedStatement ps =  con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                String id =  rs.getString("id");
                String noTransaction =  rs.getString("nomor_transaksi");
                Date tanggalTransaction = rs.getDate("tanggal_transaksi");
                String pelangganId = rs.getString("pelanggan_id");
                String pelangganName = rs.getString("pelanggan_name");
                
                txtNomor.setText(noTransaction);
                dateChooser.setDate(tanggalTransaction);
                pelangganNames.setSelectedItem(pelangganName);
                
                // remove table barang
                // delete all row in jtable
                DefaultTableModel model = (DefaultTableModel) txtTabel.getModel();
                model.setRowCount(0);
                
                // fill table barang
                sql = """
                      
                      select
                        b.nama barang_nama,
                        b.kode barang_kode,
                        b.harga_jual barang_harga,
                        pb.barang_id,
                        pb.jumlah_barang
                      from penjualan_barang pb
                      inner join barang b on pb.barang_id = b.id
                      where pb.penjualan_id=
                      
                      """+transactionId;
                
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                
                while(rs.next()){
                    String barangNama = rs.getString("barang_nama");
                    String barangKode = rs.getString("barang_kode");
                    String barangHarga = rs.getString("barang_harga");
                    String barangId = rs.getString("barang_id");
                    String jumlahBarang = rs.getString("jumlah_barang");
                    
                    
                    
                    model.addRow(new Object[]{
                        barangNama,
                        barangKode,
                        barangHarga,
                        jumlahBarang
                    });
                }
                
                
            }
            
        } catch(Exception e) {
            
        }
        
        
        
    }
    
    
    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // get transaction of the row of table
        int row = tblData.getSelectedRow();

        if(-1 == row){
            JOptionPane.showMessageDialog(this, "Anda belum memilih row");
            return;
        }

        String transactionId = tblData.getValueAt(row, 0).toString();

        // delete barang of the transaction
        Connection con = Koneksi.getConnection();
        try{
            con.setAutoCommit(false);

            String sql = """
            delete from penjualan_barang
            where penjualan_id =
            """+transactionId;
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();

            // delete the transaction
            sql = """

            delete from penjualan
            where id=?

            """;
            ps = con.prepareStatement(sql);
            ps.setString(1, transactionId);
            ps.executeUpdate();

            // reload table of list transaction
            getData();

            con.commit();

        } catch(Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());

            try {
                con.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }

    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnEditTransactionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditTransactionMouseClicked
        
        String transactionNo = txtNomor.getText();
        Date transactionDate = dateChooser.getDate();
        String pelangganKode = (String) pelangganNames.getSelectedItem();

        pelangganKode = pelangganKode
        .replaceAll(".+\\(", "")
        .replaceAll("\\)", "");
        
        
        // update the transaction 
        String sql = """
                     
                     update penjualan p
                     set p.tanggal_transaksi =?,
                         p.pelanggan_id = ( select s.id from pelanggan s where s.kode =?)
                     where p.nomor_transaksi =?;
                     
                     """;
        
        Connection con = Koneksi.getConnection();
        
        try{
           
            
            
            con.setAutoCommit(false);
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, new java.sql.Date(transactionDate.getTime()) );
            ps.setString(2, pelangganKode);
            ps.setString(3, transactionNo);
            ps.executeUpdate();
            
            
            // remove barang of the transaction
            sql = """
                  delete from penjualan_barang
                  where penjualan_id = (select p.id from penjualan p where p.nomor_transaksi=?);
                  """;
            ps = con.prepareStatement(sql);
            ps.setString(1, transactionNo);
            ps.executeUpdate();

            
            // create new barangs of the new transation
            DefaultTableModel model = (DefaultTableModel) txtTabel.getModel();
            for(int i = 0 ; i < model.getRowCount(); i++){
                String newKodeBarang = model.getValueAt(i, 1).toString();
                String newJumlahBarang = model.getValueAt(i, 3).toString();
                
                
                sql = """
                  insert into penjualan_barang(
                      penjualan_id,
                      barang_id,
                      jumlah_barang
                  )
                  value (
                      (select p.id from penjualan p where p.nomor_transaksi=?),
                      (select b.id from barang b where b.kode=? ),
                      ?
                    );
                  """;
                ps = con.prepareStatement(sql);
                ps.setString(1, transactionNo);
                ps.setString(2, newKodeBarang);
                ps.setString(3, newJumlahBarang);
                ps.executeUpdate();
                
                
            }
            
            // sukses edit
            JOptionPane.showMessageDialog(this, "berhasil merubah data transaksi");
            
            con.commit();
            
            
        } catch (Exception e ){
            try {
                con.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
            
            e.printStackTrace();
            
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
        
    }//GEN-LAST:event_btnEditTransactionMouseClicked

    private void btnCreateTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateTransactionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateTransactionActionPerformed

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
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCloseDetail2;
    private javax.swing.JButton btnCreateTransaction;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnEditTransaction;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btn_generate_transaction_no;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JDialog editBarang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelView;
    private javax.swing.JComboBox<String> pelangganNames;
    private javax.swing.JPanel pnDetail2;
    private javax.swing.JTable tblData;
    private javax.swing.JTable tblDataDetail2;
    private javax.swing.JTextField txtNomor;
    private javax.swing.JTable txtTabel;
    // End of variables declaration//GEN-END:variables

    private void showPanel() {
        panelMain.removeAll();
        panelMain.add(new Penjualan());
        panelMain.repaint();
        panelMain.revalidate();
    }
    
    private void resetForm() {
        txtNomor.setText("");
    }
    
    private void setTableModel() {
        DefaultTableModel model = (DefaultTableModel) txtTabel.getModel();
        model.addColumn("Nama Barang");
        model.addColumn("Kode Barang");
        model.addColumn("Harga Beli");
        model.addColumn("Jumlah Barang");
    }
    
    private void getData() {
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.setRowCount(0);
        
        try {
            String sql = """
                select p.id, p.nomor_transaksi, p.tanggal_transaksi, s.id pelanggan_id, s.nama, s.email, s.nomor_telp, s.alamat
                from penjualan p
                inner join pelanggan s on p.pelanggan_id = s.id
                where p.nomor_transaksi like '%%' or s.nama like '%%' or s.email like '%%' or s.nomor_telp like '%%'
                """;
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String id               = rs.getString("id");
                    String trxNo            = rs.getString("nomor_transaksi");
                    String trxTgl           = rs.getString("tanggal_transaksi");
                    String namaPelanggan     = rs.getString("nama");
                    String emailPelanggan    = rs.getString("email");
                    String noTelp           = rs.getString("nomor_telp");
                    String alamatPelanggan  = rs.getString("alamat");
                    
                    Object[] rowData = {id, trxNo, trxTgl, namaPelanggan, emailPelanggan, noTelp, alamatPelanggan};
                    model.addRow(rowData);
                }
            }
        }
        catch (SQLException e) {
            Logger.getLogger(Penjualan.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void setTableModelHistory() {
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.addColumn("ID");
        model.addColumn("Nomor Transaksi");
        model.addColumn("Tanggal Transaksi");
        model.addColumn("Nama Pelanggan");
        model.addColumn("Email Pelanggan");
        model.addColumn("Nomor Telepon");
        model.addColumn("Alamat Pelanggan");
    }

    private void getDataDetail(String id) {
        DefaultTableModel model = (DefaultTableModel) tblDataDetail2.getModel();
        model.setRowCount(0);
        
        try {
            String sql = """
                select b.id, b.kode, b.nama, b.harga_jual, b.kategori, b.satuan_barang from penjualan_barang pb
                inner join barang b on pb.barang_id = b.id
                where pb.penjualan_id=
                """+id;
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String idBrg        = rs.getString("id");
                    String kodeBrg      = rs.getString("kode");
                    String namaBrg      = rs.getString("nama");
                    String hargaJual    = rs.getString("harga_jual");
                    String ktgBrg       = rs.getString("kategori");
                    String satuanBrg    = rs.getString("satuan_barang");
                    
                    Object[] rowData = {idBrg, kodeBrg, namaBrg, hargaJual, ktgBrg, satuanBrg};
                    model.addRow(rowData);
                }
            }
        }
        catch (SQLException e) {
            Logger.getLogger(Penjualan.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void setTableModelDetail() {
        DefaultTableModel model = (DefaultTableModel) tblDataDetail2.getModel();
        model.addColumn("ID");
        model.addColumn("Kode Barang");
        model.addColumn("Nama Barang");
        model.addColumn("Harga Jual");
        model.addColumn("Kategori");
        model.addColumn("Satuan Barang");
    }
    
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
}