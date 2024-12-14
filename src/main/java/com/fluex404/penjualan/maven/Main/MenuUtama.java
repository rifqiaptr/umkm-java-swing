package com.fluex404.penjualan.maven.Main;;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BoxLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuUtama extends javax.swing.JFrame {
    private String userID;
    private String roleUser;
    
    public MenuUtama(String userID, String namaUser, String roleUser) {
        
        this.roleUser = roleUser;
        
        initComponents();
        lbProfileName.setText(namaUser);
        actionButton();
        
       
        showMenuForDiffeerentRoles();
    }
    
    MenuUtama(String username) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public MenuUtama() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_kiri = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contentOfSideBar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pn_btnPerformance = new javax.swing.JPanel();
        pn_line8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btn_performance = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pn_btnPelanggan = new javax.swing.JPanel();
        pn_line = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_pelanggan = new javax.swing.JLabel();
        pn_btnSupplier = new javax.swing.JPanel();
        pn_line1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btn_supplier = new javax.swing.JLabel();
        pn_btnBarang = new javax.swing.JPanel();
        pn_line2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btn_barang = new javax.swing.JLabel();
        pn_btnKategori = new javax.swing.JPanel();
        pn_line3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btn_inventory = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pn_btnPembelian = new javax.swing.JPanel();
        pn_line6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btn_pembelian = new javax.swing.JLabel();
        pn_btnPenjualan = new javax.swing.JPanel();
        pn_line7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btn_penjualan = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        pn_btnPerformance1 = new javax.swing.JPanel();
        pn_line9 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btn_performance1 = new javax.swing.JLabel();
        pn_btnPerformance2 = new javax.swing.JPanel();
        pn_line10 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        btn_performance2 = new javax.swing.JLabel();
        pn_btnPerformance3 = new javax.swing.JPanel();
        pn_line11 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btn_performance3 = new javax.swing.JLabel();
        pn_btnPerformance4 = new javax.swing.JPanel();
        pn_line12 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        btn_performance4 = new javax.swing.JLabel();
        pn_btnPerformance5 = new javax.swing.JPanel();
        pn_line13 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        btn_performance5 = new javax.swing.JLabel();
        pn_kanan = new javax.swing.JPanel();
        pn_dasar = new javax.swing.JPanel();
        pn_utama = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        lbProfileName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pn_kiri.setBackground(new java.awt.Color(255, 255, 255));
        pn_kiri.setPreferredSize(new java.awt.Dimension(296, 700));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(296, 680));

        contentOfSideBar.setBackground(new java.awt.Color(255, 255, 255));
        contentOfSideBar.setPreferredSize(new java.awt.Dimension(296, 817));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Shop_50px.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("PT PAKAR AYAM INDONESIA");

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Dashboard");

        pn_btnPerformance.setBackground(new java.awt.Color(255, 255, 255));

        pn_line8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line8Layout = new javax.swing.GroupLayout(pn_line8);
        pn_line8.setLayout(pn_line8Layout);
        pn_line8Layout.setHorizontalGroup(
            pn_line8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_line8Layout.setVerticalGroup(
            pn_line8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Performance_30px.png"))); // NOI18N

        btn_performance.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_performance.setText("Performance");

        javax.swing.GroupLayout pn_btnPerformanceLayout = new javax.swing.GroupLayout(pn_btnPerformance);
        pn_btnPerformance.setLayout(pn_btnPerformanceLayout);
        pn_btnPerformanceLayout.setHorizontalGroup(
            pn_btnPerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPerformanceLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(btn_performance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_btnPerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnPerformanceLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(204, Short.MAX_VALUE)))
        );
        pn_btnPerformanceLayout.setVerticalGroup(
            pn_btnPerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPerformanceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btnPerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btn_performance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pn_btnPerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnPerformanceLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("MASTER DATA");

        pn_btnPelanggan.setBackground(new java.awt.Color(255, 255, 255));

        pn_line.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_lineLayout = new javax.swing.GroupLayout(pn_line);
        pn_line.setLayout(pn_lineLayout);
        pn_lineLayout.setHorizontalGroup(
            pn_lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_lineLayout.setVerticalGroup(
            pn_lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Customer_30px.png"))); // NOI18N

        btn_pelanggan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_pelanggan.setText("Data Pelanggan");

        javax.swing.GroupLayout pn_btnPelangganLayout = new javax.swing.GroupLayout(pn_btnPelanggan);
        pn_btnPelanggan.setLayout(pn_btnPelangganLayout);
        pn_btnPelangganLayout.setHorizontalGroup(
            pn_btnPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPelangganLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(btn_pelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_btnPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnPelangganLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(155, Short.MAX_VALUE)))
        );
        pn_btnPelangganLayout.setVerticalGroup(
            pn_btnPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPelangganLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btnPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btn_pelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pn_btnPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnPelangganLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pn_btnSupplier.setBackground(new java.awt.Color(255, 255, 255));

        pn_line1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line1Layout = new javax.swing.GroupLayout(pn_line1);
        pn_line1.setLayout(pn_line1Layout);
        pn_line1Layout.setHorizontalGroup(
            pn_line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_line1Layout.setVerticalGroup(
            pn_line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Supplier_30px.png"))); // NOI18N

        btn_supplier.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_supplier.setText("Data Supplier");

        javax.swing.GroupLayout pn_btnSupplierLayout = new javax.swing.GroupLayout(pn_btnSupplier);
        pn_btnSupplier.setLayout(pn_btnSupplierLayout);
        pn_btnSupplierLayout.setHorizontalGroup(
            pn_btnSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnSupplierLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(btn_supplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_btnSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnSupplierLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(155, Short.MAX_VALUE)))
        );
        pn_btnSupplierLayout.setVerticalGroup(
            pn_btnSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnSupplierLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btnSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btn_supplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pn_btnSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnSupplierLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pn_btnBarang.setBackground(new java.awt.Color(255, 255, 255));

        pn_line2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line2Layout = new javax.swing.GroupLayout(pn_line2);
        pn_line2.setLayout(pn_line2Layout);
        pn_line2Layout.setHorizontalGroup(
            pn_line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_line2Layout.setVerticalGroup(
            pn_line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Product_30px.png"))); // NOI18N

        btn_barang.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_barang.setText("Data Barang");

        javax.swing.GroupLayout pn_btnBarangLayout = new javax.swing.GroupLayout(pn_btnBarang);
        pn_btnBarang.setLayout(pn_btnBarangLayout);
        pn_btnBarangLayout.setHorizontalGroup(
            pn_btnBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnBarangLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(btn_barang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_btnBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnBarangLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(155, Short.MAX_VALUE)))
        );
        pn_btnBarangLayout.setVerticalGroup(
            pn_btnBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btnBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btn_barang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pn_btnBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnBarangLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pn_btnKategori.setBackground(new java.awt.Color(255, 255, 255));

        pn_line3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line3Layout = new javax.swing.GroupLayout(pn_line3);
        pn_line3.setLayout(pn_line3Layout);
        pn_line3Layout.setHorizontalGroup(
            pn_line3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_line3Layout.setVerticalGroup(
            pn_line3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Inventory_30px.png"))); // NOI18N

        btn_inventory.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_inventory.setText("Inventory");

        javax.swing.GroupLayout pn_btnKategoriLayout = new javax.swing.GroupLayout(pn_btnKategori);
        pn_btnKategori.setLayout(pn_btnKategoriLayout);
        pn_btnKategoriLayout.setHorizontalGroup(
            pn_btnKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnKategoriLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(btn_inventory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_btnKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnKategoriLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(160, Short.MAX_VALUE)))
        );
        pn_btnKategoriLayout.setVerticalGroup(
            pn_btnKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnKategoriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btnKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btn_inventory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pn_btnKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnKategoriLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("TRANSAKSI");

        pn_btnPembelian.setBackground(new java.awt.Color(255, 255, 255));

        pn_line6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line6Layout = new javax.swing.GroupLayout(pn_line6);
        pn_line6.setLayout(pn_line6Layout);
        pn_line6Layout.setHorizontalGroup(
            pn_line6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_line6Layout.setVerticalGroup(
            pn_line6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Buy_30px.png"))); // NOI18N

        btn_pembelian.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_pembelian.setText("Pembelian");

        javax.swing.GroupLayout pn_btnPembelianLayout = new javax.swing.GroupLayout(pn_btnPembelian);
        pn_btnPembelian.setLayout(pn_btnPembelianLayout);
        pn_btnPembelianLayout.setHorizontalGroup(
            pn_btnPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPembelianLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(btn_pembelian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_btnPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnPembelianLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(204, Short.MAX_VALUE)))
        );
        pn_btnPembelianLayout.setVerticalGroup(
            pn_btnPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPembelianLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btnPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btn_pembelian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pn_btnPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnPembelianLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pn_btnPenjualan.setBackground(new java.awt.Color(255, 255, 255));

        pn_line7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line7Layout = new javax.swing.GroupLayout(pn_line7);
        pn_line7.setLayout(pn_line7Layout);
        pn_line7Layout.setHorizontalGroup(
            pn_line7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_line7Layout.setVerticalGroup(
            pn_line7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Sell_30px.png"))); // NOI18N

        btn_penjualan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_penjualan.setText("Penjualan");

        javax.swing.GroupLayout pn_btnPenjualanLayout = new javax.swing.GroupLayout(pn_btnPenjualan);
        pn_btnPenjualan.setLayout(pn_btnPenjualanLayout);
        pn_btnPenjualanLayout.setHorizontalGroup(
            pn_btnPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPenjualanLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(btn_penjualan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_btnPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnPenjualanLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(204, Short.MAX_VALUE)))
        );
        pn_btnPenjualanLayout.setVerticalGroup(
            pn_btnPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPenjualanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btnPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btn_penjualan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pn_btnPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnPenjualanLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("LAPORAN");

        pn_btnPerformance1.setBackground(new java.awt.Color(255, 255, 255));

        pn_line9.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line9Layout = new javax.swing.GroupLayout(pn_line9);
        pn_line9.setLayout(pn_line9Layout);
        pn_line9Layout.setHorizontalGroup(
            pn_line9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_line9Layout.setVerticalGroup(
            pn_line9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-report-30.png"))); // NOI18N

        btn_performance1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_performance1.setText("Lap. Pelanggan");

        javax.swing.GroupLayout pn_btnPerformance1Layout = new javax.swing.GroupLayout(pn_btnPerformance1);
        pn_btnPerformance1.setLayout(pn_btnPerformance1Layout);
        pn_btnPerformance1Layout.setHorizontalGroup(
            pn_btnPerformance1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPerformance1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(btn_performance1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_btnPerformance1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnPerformance1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(211, Short.MAX_VALUE)))
        );
        pn_btnPerformance1Layout.setVerticalGroup(
            pn_btnPerformance1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPerformance1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btnPerformance1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btn_performance1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pn_btnPerformance1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnPerformance1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pn_btnPerformance2.setBackground(new java.awt.Color(255, 255, 255));

        pn_line10.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line10Layout = new javax.swing.GroupLayout(pn_line10);
        pn_line10.setLayout(pn_line10Layout);
        pn_line10Layout.setHorizontalGroup(
            pn_line10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_line10Layout.setVerticalGroup(
            pn_line10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-report-30.png"))); // NOI18N

        btn_performance2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_performance2.setText("Lap. Suplier");

        javax.swing.GroupLayout pn_btnPerformance2Layout = new javax.swing.GroupLayout(pn_btnPerformance2);
        pn_btnPerformance2.setLayout(pn_btnPerformance2Layout);
        pn_btnPerformance2Layout.setHorizontalGroup(
            pn_btnPerformance2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPerformance2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(btn_performance2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_btnPerformance2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnPerformance2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(211, Short.MAX_VALUE)))
        );
        pn_btnPerformance2Layout.setVerticalGroup(
            pn_btnPerformance2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPerformance2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btnPerformance2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btn_performance2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pn_btnPerformance2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnPerformance2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pn_btnPerformance3.setBackground(new java.awt.Color(255, 255, 255));

        pn_line11.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line11Layout = new javax.swing.GroupLayout(pn_line11);
        pn_line11.setLayout(pn_line11Layout);
        pn_line11Layout.setHorizontalGroup(
            pn_line11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_line11Layout.setVerticalGroup(
            pn_line11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-report-30.png"))); // NOI18N

        btn_performance3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_performance3.setText("Lap. Barang");

        javax.swing.GroupLayout pn_btnPerformance3Layout = new javax.swing.GroupLayout(pn_btnPerformance3);
        pn_btnPerformance3.setLayout(pn_btnPerformance3Layout);
        pn_btnPerformance3Layout.setHorizontalGroup(
            pn_btnPerformance3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPerformance3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(btn_performance3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_btnPerformance3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnPerformance3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(211, Short.MAX_VALUE)))
        );
        pn_btnPerformance3Layout.setVerticalGroup(
            pn_btnPerformance3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPerformance3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btnPerformance3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btn_performance3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pn_btnPerformance3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnPerformance3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pn_btnPerformance4.setBackground(new java.awt.Color(255, 255, 255));

        pn_line12.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line12Layout = new javax.swing.GroupLayout(pn_line12);
        pn_line12.setLayout(pn_line12Layout);
        pn_line12Layout.setHorizontalGroup(
            pn_line12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_line12Layout.setVerticalGroup(
            pn_line12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-report-30.png"))); // NOI18N

        btn_performance4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_performance4.setText("Lap. Penjualan");

        javax.swing.GroupLayout pn_btnPerformance4Layout = new javax.swing.GroupLayout(pn_btnPerformance4);
        pn_btnPerformance4.setLayout(pn_btnPerformance4Layout);
        pn_btnPerformance4Layout.setHorizontalGroup(
            pn_btnPerformance4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPerformance4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(btn_performance4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_btnPerformance4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnPerformance4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(211, Short.MAX_VALUE)))
        );
        pn_btnPerformance4Layout.setVerticalGroup(
            pn_btnPerformance4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPerformance4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btnPerformance4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btn_performance4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pn_btnPerformance4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnPerformance4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pn_btnPerformance5.setBackground(new java.awt.Color(255, 255, 255));

        pn_line13.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line13Layout = new javax.swing.GroupLayout(pn_line13);
        pn_line13.setLayout(pn_line13Layout);
        pn_line13Layout.setHorizontalGroup(
            pn_line13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_line13Layout.setVerticalGroup(
            pn_line13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-report-30.png"))); // NOI18N

        btn_performance5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_performance5.setText("Lap. Pembelian");

        javax.swing.GroupLayout pn_btnPerformance5Layout = new javax.swing.GroupLayout(pn_btnPerformance5);
        pn_btnPerformance5.setLayout(pn_btnPerformance5Layout);
        pn_btnPerformance5Layout.setHorizontalGroup(
            pn_btnPerformance5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPerformance5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(btn_performance5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_btnPerformance5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnPerformance5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(211, Short.MAX_VALUE)))
        );
        pn_btnPerformance5Layout.setVerticalGroup(
            pn_btnPerformance5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPerformance5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btnPerformance5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btn_performance5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pn_btnPerformance5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnPerformance5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout contentOfSideBarLayout = new javax.swing.GroupLayout(contentOfSideBar);
        contentOfSideBar.setLayout(contentOfSideBarLayout);
        contentOfSideBarLayout.setHorizontalGroup(
            contentOfSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentOfSideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentOfSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn_btnPerformance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentOfSideBarLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pn_btnPerformance5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_btnPerformance4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_btnPerformance3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_btnPerformance2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_btnPerformance1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_btnPelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_btnSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_btnBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_btnKategori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_btnPembelian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_btnPenjualan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentOfSideBarLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(contentOfSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel3)
                            .addComponent(jLabel13)
                            .addComponent(jLabel5))
                        .addGap(0, 173, Short.MAX_VALUE)))
                .addContainerGap())
        );
        contentOfSideBarLayout.setVerticalGroup(
            contentOfSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentOfSideBarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(contentOfSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnPerformance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnPerformance1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnPerformance2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnPerformance3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnPerformance4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnPerformance5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(contentOfSideBar);

        javax.swing.GroupLayout pn_kiriLayout = new javax.swing.GroupLayout(pn_kiri);
        pn_kiri.setLayout(pn_kiriLayout);
        pn_kiriLayout.setHorizontalGroup(
            pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_kiriLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pn_kiriLayout.setVerticalGroup(
            pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
        );

        getContentPane().add(pn_kiri, java.awt.BorderLayout.LINE_START);
        // pn_kiri.setLayout(new BoxLayout(pn_kiri, BoxLayout.Y_AXIS));

        pn_kanan.setBackground(new java.awt.Color(255, 255, 255));
        pn_kanan.setLayout(new java.awt.BorderLayout());

        pn_dasar.setBackground(new java.awt.Color(240, 240, 240));

        pn_utama.setBackground(new java.awt.Color(255, 255, 255));
        pn_utama.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        btnLogout.setBackground(new java.awt.Color(204, 255, 204));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_multiplication_30px.png"))); // NOI18N
        btnLogout.setBorder(null);
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });

        lbProfileName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbProfileName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbProfileName.setText("Profile Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(677, Short.MAX_VALUE)
                .addComponent(lbProfileName, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogout)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbProfileName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pn_dasarLayout = new javax.swing.GroupLayout(pn_dasar);
        pn_dasar.setLayout(pn_dasarLayout);
        pn_dasarLayout.setHorizontalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dasarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pn_dasarLayout.setVerticalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_dasarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
                .addContainerGap())
        );

        pn_kanan.add(pn_dasar, java.awt.BorderLayout.CENTER);

        getContentPane().add(pn_kanan, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setExtendedState(MenuUtama.MAXIMIZED_BOTH);
        
        pn_utama.removeAll();
        pn_utama.add(new Performance());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_formWindowOpened

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        setVisible(false);
        dispose();
        
        new FormLogin().setVisible(true);
    }//GEN-LAST:event_btnLogoutMouseClicked

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
//            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                String userID = "ID";
//                String namaUser = "Nama";
//                new MenuUtama(userID, namaUser).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel btn_barang;
    private javax.swing.JLabel btn_inventory;
    private javax.swing.JLabel btn_pelanggan;
    private javax.swing.JLabel btn_pembelian;
    private javax.swing.JLabel btn_penjualan;
    private javax.swing.JLabel btn_performance;
    private javax.swing.JLabel btn_performance1;
    private javax.swing.JLabel btn_performance2;
    private javax.swing.JLabel btn_performance3;
    private javax.swing.JLabel btn_performance4;
    private javax.swing.JLabel btn_performance5;
    private javax.swing.JLabel btn_supplier;
    private javax.swing.JPanel contentOfSideBar;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbProfileName;
    private javax.swing.JPanel pn_btnBarang;
    private javax.swing.JPanel pn_btnKategori;
    private javax.swing.JPanel pn_btnPelanggan;
    private javax.swing.JPanel pn_btnPembelian;
    private javax.swing.JPanel pn_btnPenjualan;
    private javax.swing.JPanel pn_btnPerformance;
    private javax.swing.JPanel pn_btnPerformance1;
    private javax.swing.JPanel pn_btnPerformance2;
    private javax.swing.JPanel pn_btnPerformance3;
    private javax.swing.JPanel pn_btnPerformance4;
    private javax.swing.JPanel pn_btnPerformance5;
    private javax.swing.JPanel pn_btnSupplier;
    private javax.swing.JPanel pn_dasar;
    private javax.swing.JPanel pn_kanan;
    private javax.swing.JPanel pn_kiri;
    private javax.swing.JPanel pn_line;
    private javax.swing.JPanel pn_line1;
    private javax.swing.JPanel pn_line10;
    private javax.swing.JPanel pn_line11;
    private javax.swing.JPanel pn_line12;
    private javax.swing.JPanel pn_line13;
    private javax.swing.JPanel pn_line2;
    private javax.swing.JPanel pn_line3;
    private javax.swing.JPanel pn_line6;
    private javax.swing.JPanel pn_line7;
    private javax.swing.JPanel pn_line8;
    private javax.swing.JPanel pn_line9;
    private javax.swing.JPanel pn_utama;
    // End of variables declaration//GEN-END:variables

    private void showMenuForDiffeerentRoles(){
      
        
        System.out.println("user with role "+roleUser+" already login");
      
        
        
        if(roleUser.equalsIgnoreCase("OWNER")) {
            jLabel3.setVisible(false);
            pn_btnPelanggan.setVisible(false);
            pn_btnSupplier.setVisible(false);
            pn_btnBarang.setVisible(false);
            pn_btnKategori.setVisible(false);
            jLabel5.setVisible(false);
            pn_btnPembelian.setVisible(false);
            pn_btnPenjualan.setVisible(false);
        }
        else if(roleUser.equalsIgnoreCase("ADMIN")) {
            jLabel13.setVisible(false);
            pn_btnPerformance1.setVisible(false);
            pn_btnPerformance2.setVisible(false);
            pn_btnPerformance3.setVisible(false);
            pn_btnPerformance4.setVisible(false);
            pn_btnPerformance5.setVisible(false);
        }
        else {
            System.out.println("role user doesnt exists!");
          
            System.exit(-1);
        }
        
        
    }
    
    private void actionButton() {
        btn_pelanggan.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked (MouseEvent e) {
                pn_btnPelanggan.setBackground(new Color(240, 240, 240));
                pn_line.setBackground(new Color(0, 102, 153));
                
                pn_utama.removeAll();
                pn_utama.add(new DataPelanggan());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
            
            @Override
            public void mouseEntered (MouseEvent e) {
                pn_btnPelanggan.setBackground(new Color(250, 250, 250));
                pn_line.setBackground(new Color(0, 102, 153));
            }
            
            @Override
            public void mouseExited (MouseEvent e) {
                pn_btnPelanggan.setBackground(new Color(255, 255, 255));
                pn_line.setBackground(new Color(255 ,255, 255));
            }
        });
        
        btn_supplier.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked (MouseEvent e) {
                pn_btnSupplier.setBackground(new Color(240, 240, 240));
                pn_line1.setBackground(new Color(0, 102, 153));
                
                pn_utama.removeAll();
                pn_utama.add(new DataSupplier());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
            
            @Override
            public void mouseEntered (MouseEvent e) {
                pn_btnSupplier.setBackground(new Color(250, 250, 250));
                pn_line1.setBackground(new Color(0, 102, 153));
            }
            
            @Override
            public void mouseExited (MouseEvent e) {
                pn_btnSupplier.setBackground(new Color(255, 255, 255));
                pn_line1.setBackground(new Color(255 ,255, 255));
            }
        });
        
        btn_barang.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked (MouseEvent e) {
                pn_btnBarang.setBackground(new Color(240, 240, 240));
                pn_line2.setBackground(new Color(0, 102, 153));
                
                pn_utama.removeAll();
                pn_utama.add(new DataBarang());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
            
            @Override
            public void mouseEntered (MouseEvent e) {
                pn_btnBarang.setBackground(new Color(250, 250, 250));
                pn_line2.setBackground(new Color(0, 102, 153));
            }
            
            @Override
            public void mouseExited (MouseEvent e) {
                pn_btnBarang.setBackground(new Color(255, 255, 255));
                pn_line2.setBackground(new Color(255 ,255, 255));
            }
        });
        
        btn_inventory.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked (MouseEvent e) {
                pn_btnKategori.setBackground(new Color(240, 240, 240));
                pn_line3.setBackground(new Color(0, 102, 153));
                
                pn_utama.removeAll();
                pn_utama.add(new Inventory());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
            
            @Override
            public void mouseEntered (MouseEvent e) {
                pn_btnKategori.setBackground(new Color(250, 250, 250));
                pn_line3.setBackground(new Color(0, 102, 153));
            }
            
            @Override
            public void mouseExited (MouseEvent e) {
                pn_btnKategori.setBackground(new Color(255, 255, 255));
                pn_line3.setBackground(new Color(255 ,255, 255));
            }
        });
        
        btn_pembelian.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked (MouseEvent e) {
                pn_btnPembelian.setBackground(new Color(240, 240, 240));
                pn_line6.setBackground(new Color(0, 102, 153));
                
                pn_utama.removeAll();
                pn_utama.add(new Pembelian());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
            
            @Override
            public void mouseEntered (MouseEvent e) {
                pn_btnPembelian.setBackground(new Color(250, 250, 250));
                pn_line6.setBackground(new Color(0, 102, 153));
            }
            
            @Override
            public void mouseExited (MouseEvent e) {
                pn_btnPembelian.setBackground(new Color(255, 255, 255));
                pn_line6.setBackground(new Color(255 ,255, 255));
            }
        });
        
        btn_penjualan.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked (MouseEvent e) {
                pn_btnPenjualan.setBackground(new Color(240, 240, 240));
                pn_line7.setBackground(new Color(0, 102, 153));
                
                pn_utama.removeAll();
                pn_utama.add(new Penjualan());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
            
            @Override
            public void mouseEntered (MouseEvent e) {
                pn_btnPenjualan.setBackground(new Color(250, 250, 250));
                pn_line7.setBackground(new Color(0, 102, 153));
            }
            
            @Override
            public void mouseExited (MouseEvent e) {
                pn_btnPenjualan.setBackground(new Color(255, 255, 255));
                pn_line7.setBackground(new Color(255 ,255, 255));
            }
        });
        
        btn_performance.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked (MouseEvent e) {
                pn_btnPerformance.setBackground(new Color(240, 240, 240));
                pn_line8.setBackground(new Color(0, 102, 153));
                
                pn_utama.removeAll();
                pn_utama.add(new Performance());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
            
            @Override
            public void mouseEntered (MouseEvent e) {
                pn_btnPerformance.setBackground(new Color(250, 250, 250));
                pn_line8.setBackground(new Color(0, 102, 153));
            }
            
            @Override
            public void mouseExited (MouseEvent e) {
                pn_btnPerformance.setBackground(new Color(255, 255, 255));
                pn_line8.setBackground(new Color(255 ,255, 255));
            }
        });
        
        btn_performance1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked (MouseEvent e) {
                btn_performance1.setBackground(new Color(240, 240, 240));
                pn_line9.setBackground(new Color(0, 102, 153));
                
                pn_utama.removeAll();
                pn_utama.add(new LapPelanggan());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
            
            @Override
            public void mouseEntered (MouseEvent e) {
                btn_performance1.setBackground(new Color(250, 250, 250));
                pn_line9.setBackground(new Color(0, 102, 153));
            }
            
            @Override
            public void mouseExited (MouseEvent e) {
                btn_performance1.setBackground(new Color(255, 255, 255));
                pn_line9.setBackground(new Color(255 ,255, 255));
            }
        });
        
        
        btn_performance2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked (MouseEvent e) {
                btn_performance2.setBackground(new Color(240, 240, 240));
                pn_line10.setBackground(new Color(0, 102, 153));
                
                pn_utama.removeAll();
                pn_utama.add(new LapSupplier());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
            
            @Override
            public void mouseEntered (MouseEvent e) {
                btn_performance2.setBackground(new Color(250, 250, 250));
                pn_line10.setBackground(new Color(0, 102, 153));
            }
            
            @Override
            public void mouseExited (MouseEvent e) {
                btn_performance2.setBackground(new Color(255, 255, 255));
                pn_line10.setBackground(new Color(255 ,255, 255));
            }
        });
        
        
        btn_performance3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked (MouseEvent e) {
                btn_performance3.setBackground(new Color(240, 240, 240));
                pn_line11.setBackground(new Color(0, 102, 153));
                
                pn_utama.removeAll();
                pn_utama.add(new LapBarang());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
            
            @Override
            public void mouseEntered (MouseEvent e) {
                btn_performance3.setBackground(new Color(250, 250, 250));
                pn_line11.setBackground(new Color(0, 102, 153));
            }
            
            @Override
            public void mouseExited (MouseEvent e) {
                btn_performance3.setBackground(new Color(255, 255, 255));
                pn_line11.setBackground(new Color(255 ,255, 255));
            }
        });
        
        
        btn_performance4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked (MouseEvent e) {
                btn_performance4.setBackground(new Color(240, 240, 240));
                pn_line12.setBackground(new Color(0, 102, 153));
                
                pn_utama.removeAll();
                pn_utama.add(new LapPenjualan());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
            
            @Override
            public void mouseEntered (MouseEvent e) {
                btn_performance4.setBackground(new Color(250, 250, 250));
                pn_line12.setBackground(new Color(0, 102, 153));
            }
            
            @Override
            public void mouseExited (MouseEvent e) {
                btn_performance4.setBackground(new Color(255, 255, 255));
                pn_line12.setBackground(new Color(255 ,255, 255));
            }
        });
        
        
        btn_performance5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked (MouseEvent e) {
                btn_performance5.setBackground(new Color(240, 240, 240));
                pn_line13.setBackground(new Color(0, 102, 153));
                
                pn_utama.removeAll();
                pn_utama.add(new LapPembelian());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
            
            @Override
            public void mouseEntered (MouseEvent e) {
                btn_performance5.setBackground(new Color(250, 250, 250));
                pn_line13.setBackground(new Color(0, 102, 153));
            }
            
            @Override
            public void mouseExited (MouseEvent e) {
                btn_performance5.setBackground(new Color(255, 255, 255));
                pn_line13.setBackground(new Color(255 ,255, 255));
            }
        });
        
    }
}