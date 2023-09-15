/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Bridge.Brand;
import Bridge.DesktopPC;
import Bridge.Device;
import Bridge.Gpu;
import Bridge.Laptop;
import Bridge.Model;
import Bridge.Ram;
import Bridge.Specs;
import Bridge.Ssd;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Component;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luchn1k
 */
public class SpecsDisplay extends javax.swing.JFrame {

    /**
     * Creates new form SpecsDisplay
     */
    DefaultTableModel dtm;
    ArrayList<Brand> brandList = new ArrayList();
    ArrayList<Model> modelList = new ArrayList();
    ArrayList<Ram> ramList = new ArrayList();
    ArrayList<Gpu> gpuList = new ArrayList();
    ArrayList<Ssd> ssdList = new ArrayList();

    public SpecsDisplay() {
        initComponents();
        dtm = (DefaultTableModel) specTable.getModel();
        //buildComputer();
        buildTable();
        // addObjects();
        populateComboBox();
        setTitles();
    }

//    private void buildComputer() {
//        Brand desktopBrand = new Brand("MSI");
//        Brand laptopBrand = new Brand("Acer");
//        Model desktopModel = new Model("X592");
//        Model laptopModel = new Model("Z124");
//
//        Ram RAM = new Ram("8GB DDR3");
//        Gpu GPU = new Gpu("Nvidia X20 2GB");
//        Ssd SSD = new Ssd("Kingston 250GB");
//
//        DesktopPC desktopPC = new DesktopPC(desktopBrand, desktopModel, RAM, GPU, SSD);
//        Laptop laptop = new Laptop(laptopBrand, laptopModel, RAM, GPU, SSD);
//
//    }
    private void setTitles() {
        dtm.setValueAt("Brand", 1, 0);
        dtm.setValueAt("Model", 2, 0);
        dtm.setValueAt("RAM", 3, 0);
        dtm.setValueAt("GPU", 4, 0);
        dtm.setValueAt("SSD", 5, 0);
    }

//    private void addObjects() {
//
//        brandList = new ArrayList();
//        modelList = new ArrayList();
//        ramList = new ArrayList();
//        gpuList = new ArrayList();
//        ssdList = new ArrayList();
//        Brand desktopBrand = new Brand("MSI");
//        Brand laptopBrand = new Brand("Acer");
//        Model desktopModel = new Model("X592");
//        Model laptopModel = new Model("Z124");
//
//        Ram RAM = new Ram("8GB DDR3");
//        Gpu GPU = new Gpu("Nvidia X20 2GB");
//        Ssd SSD = new Ssd("Kingston 250GB");
//        brandList.add(laptopBrand);
//        brandList.add(desktopBrand);
//
//        modelList.add(laptopModel);
//        modelList.add(desktopModel);
//
//        ramList.add(RAM);
//        gpuList.add(GPU);
//        ssdList.add(SSD);
//    }
    private void populateComboBox() {
        desktopBrandCombo.removeAllItems();
        laptopBrandCombo.removeAllItems();
        desktopBrandCombo.addItem("Select Brand...");
        laptopBrandCombo.addItem("Select Brand...");
        for (Brand i : brandList) {
            desktopBrandCombo.addItem(i.getName());
            laptopBrandCombo.addItem(i.getName());
        }

        desktopModelCombo.removeAllItems();
        laptopModelCombo.removeAllItems();
        desktopModelCombo.addItem("Select Model...");
        laptopModelCombo.addItem("Select Model...");
        for (Model i : modelList) {
            desktopModelCombo.addItem(i.getName());
            laptopModelCombo.addItem(i.getName());
        }

        desktopRamCombo.removeAllItems();
        laptopRamCombo.removeAllItems();
        desktopRamCombo.addItem("Select RAM...");
        laptopRamCombo.addItem("Select RAM...");
        for (Ram i : ramList) {
            desktopRamCombo.addItem(i.getName());
            laptopRamCombo.addItem(i.getName());
        }

        desktopGpuCombo.removeAllItems();
        laptopGpuCombo.removeAllItems();
        desktopGpuCombo.addItem("Select GPU...");
        laptopGpuCombo.addItem("Select GPU...");
        for (Gpu i : gpuList) {
            desktopGpuCombo.addItem(i.getName());
            laptopGpuCombo.addItem(i.getName());
        }

        desktopSsdCombo.removeAllItems();
        laptopSsdCombo.removeAllItems();
        desktopSsdCombo.addItem("Select SSD...");
        laptopSsdCombo.addItem("Select SSD...");
        for (Ssd i : ssdList) {
            desktopSsdCombo.addItem(i.getName());
            laptopSsdCombo.addItem(i.getName());
        }

    }

    class ImageRenderer extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            if (row == 0 && (column == 1 || column == 2)) {
                JLabel lbl = new JLabel(new ImageIcon((String) value));
                return lbl;
            } else {
                JLabel lbl = new JLabel(value == null ? "" : value.toString());
                lbl.setFont(new Font("DialogInput", Font.ITALIC, 14));
                return lbl;
            }
        }
    }

    private void buildTable() {

        String[] data = {"Image", "src/Images/Desktop.png", "src/Images/Laptop.png"};
        dtm.addRow(data);
        specTable.setRowHeight(0, 128);
        specTable.getColumn("Desktop PC").setCellRenderer(new ImageRenderer());
        specTable.getColumn("Laptop").setCellRenderer(new ImageRenderer());
        dtm.setRowCount(6);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        specTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        desktopBrandCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        desktopModelCombo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        desktopRamCombo = new javax.swing.JComboBox<>();
        desktopGpuCombo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        desktopSsdCombo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        createDesktop = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        laptopBrandCombo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        laptopModelCombo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        laptopRamCombo = new javax.swing.JComboBox<>();
        laptopGpuCombo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        laptopSsdCombo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        createLaptop = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        itemCombo = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        addItemBtn = new javax.swing.JButton();
        clearSpecs = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Specs Monitor");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Specs Monitor");

        specTable.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        specTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Description", "Desktop PC", "Laptop"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        specTable.setColumnSelectionAllowed(true);
        specTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                specTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(specTable);
        specTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (specTable.getColumnModel().getColumnCount() > 0) {
            specTable.getColumnModel().getColumn(0).setResizable(false);
            specTable.getColumnModel().getColumn(1).setResizable(false);
            specTable.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Create", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 14))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Desktop Specifications", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel2.setText("Brand");

        desktopBrandCombo.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel3.setText("Model");

        desktopModelCombo.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel4.setText("RAM");

        desktopRamCombo.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N

        desktopGpuCombo.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel5.setText("GPU");

        desktopSsdCombo.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel6.setText("SSD");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addComponent(desktopBrandCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(desktopModelCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(desktopRamCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(desktopGpuCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(desktopSsdCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopBrandCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopModelCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopRamCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopGpuCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopSsdCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        createDesktop.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        createDesktop.setText("Create");
        createDesktop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDesktopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createDesktop)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Create", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 14))); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Laptop Specifications", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 14))); // NOI18N

        jLabel7.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel7.setText("Brand");

        laptopBrandCombo.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel8.setText("Model");

        laptopModelCombo.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel9.setText("RAM");

        laptopRamCombo.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N

        laptopGpuCombo.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel10.setText("GPU");

        laptopSsdCombo.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel11.setText("SSD");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(laptopBrandCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(laptopModelCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(laptopRamCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(laptopGpuCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(laptopSsdCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(laptopBrandCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(laptopModelCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(laptopRamCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(laptopGpuCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(laptopSsdCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        createLaptop.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        createLaptop.setText("Create");
        createLaptop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createLaptopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createLaptop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createLaptop)
                .addContainerGap())
        );

        jButton1.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Items", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 14))); // NOI18N

        jLabel12.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel12.setText("Select The Specification");

        itemCombo.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        itemCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Brand", "Model", "RAM", "GPU", "SSD" }));

        jLabel13.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel13.setText("Enter Name");

        nameText.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        nameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameTextKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameTextKeyTyped(evt);
            }
        });

        addItemBtn.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        addItemBtn.setText("Add Item");
        addItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemBtnActionPerformed(evt);
            }
        });

        clearSpecs.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        clearSpecs.setText("Clear All Specifications");
        clearSpecs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearSpecsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(itemCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(79, 79, 79))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(nameText)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addItemBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clearSpecs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(itemCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addItemBtn)
                .addGap(7, 7, 7)
                .addComponent(clearSpecs)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(12, 12, 12))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ImageIcon icon = new ImageIcon("src/images/ico.png");
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        desktopBrandCombo.setSelectedIndex(0);
        desktopGpuCombo.setSelectedIndex(0);
        desktopModelCombo.setSelectedIndex(0);
        desktopRamCombo.setSelectedIndex(0);
        desktopSsdCombo.setSelectedIndex(0);

        laptopBrandCombo.setSelectedIndex(0);
        laptopGpuCombo.setSelectedIndex(0);
        laptopModelCombo.setSelectedIndex(0);
        laptopRamCombo.setSelectedIndex(0);
        laptopSsdCombo.setSelectedIndex(0);

        dtm.setRowCount(0);
        buildTable();
        //addObjects();
        populateComboBox();
        setTitles();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void createDesktopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDesktopActionPerformed
        int selectedBrand = desktopBrandCombo.getSelectedIndex();
        int selectedModel = desktopModelCombo.getSelectedIndex();
        int selectedRam = desktopRamCombo.getSelectedIndex();
        int selectedGpu = desktopGpuCombo.getSelectedIndex();
        int selectedSsd = desktopSsdCombo.getSelectedIndex();

        if (selectedBrand == 0) {
            ImageIcon icon = new ImageIcon("src/images/brand.png");
            JOptionPane.showMessageDialog(SpecsDisplay.this, "Select a brand to create a PC", "Warn", JOptionPane.INFORMATION_MESSAGE, icon);
        } else if (selectedModel == 0) {
            ImageIcon icon = new ImageIcon("src/images/model.png");
            JOptionPane.showMessageDialog(SpecsDisplay.this, "Select a model to create a PC", "Warn", JOptionPane.INFORMATION_MESSAGE, icon);
        } else if (selectedRam == 0) {
            ImageIcon icon = new ImageIcon("src/images/ram.png");
            JOptionPane.showMessageDialog(SpecsDisplay.this, "Select a RAM to create a PC", "Warn", JOptionPane.INFORMATION_MESSAGE, icon);
        } else if (selectedGpu == 0) {
            ImageIcon icon = new ImageIcon("src/images/gpu.png");
            JOptionPane.showMessageDialog(SpecsDisplay.this, "Select a GPU to create a PC", "Warn", JOptionPane.INFORMATION_MESSAGE, icon);
        } else if (selectedSsd == 0) {
            ImageIcon icon = new ImageIcon("src/images/ssd.png");
            JOptionPane.showMessageDialog(SpecsDisplay.this, "Select a SSD to create a PC", "Warn", JOptionPane.INFORMATION_MESSAGE, icon);
        } else {
            Brand brand = brandList.get(selectedBrand - 1);
            Model model = modelList.get(selectedModel - 1);
            Ram ram = ramList.get(selectedRam - 1);
            Gpu gpu = gpuList.get(selectedGpu - 1);
            Ssd ssd = ssdList.get(selectedSsd - 1);
            DesktopPC desktopPC = new DesktopPC(brand, model, ram, gpu, ssd);
            createTable(desktopPC, "desktop");
            clearFieldsDesktop();
        }

    }//GEN-LAST:event_createDesktopActionPerformed

    private void createLaptopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createLaptopActionPerformed
        int selectedBrand = laptopBrandCombo.getSelectedIndex();
        int selectedModel = laptopModelCombo.getSelectedIndex();
        int selectedRam = laptopRamCombo.getSelectedIndex();
        int selectedGpu = laptopGpuCombo.getSelectedIndex();
        int selectedSsd = laptopSsdCombo.getSelectedIndex();

        if (selectedBrand == 0) {
            ImageIcon icon = new ImageIcon("src/images/brand.png");
            JOptionPane.showMessageDialog(SpecsDisplay.this, "Select a brand to create a laptop", "Warn", JOptionPane.INFORMATION_MESSAGE, icon);
        } else if (selectedModel == 0) {
            ImageIcon icon = new ImageIcon("src/images/model.png");
            JOptionPane.showMessageDialog(SpecsDisplay.this, "Select a model to create a laptop", "Warn", JOptionPane.INFORMATION_MESSAGE, icon);
        } else if (selectedRam == 0) {
            ImageIcon icon = new ImageIcon("src/images/ram.png");
            JOptionPane.showMessageDialog(SpecsDisplay.this, "Select a RAM to create a laptop", "Warn", JOptionPane.INFORMATION_MESSAGE, icon);
        } else if (selectedGpu == 0) {
            ImageIcon icon = new ImageIcon("src/images/gpu.png");
            JOptionPane.showMessageDialog(SpecsDisplay.this, "Select a GPU to create a laptop", "Warn", JOptionPane.INFORMATION_MESSAGE, icon);
        } else if (selectedSsd == 0) {
            ImageIcon icon = new ImageIcon("src/images/ssd.png");
            JOptionPane.showMessageDialog(SpecsDisplay.this, "Select a SSD to create a laptop", "Warn", JOptionPane.INFORMATION_MESSAGE, icon);
        } else {
            Brand brand = brandList.get(selectedBrand - 1);
            Model model = modelList.get(selectedModel - 1);
            Ram ram = ramList.get(selectedRam - 1);
            Gpu gpu = gpuList.get(selectedGpu - 1);
            Ssd ssd = ssdList.get(selectedSsd - 1);
            Laptop laptop = new Laptop(brand, model, ram, gpu, ssd);
            createTable(laptop, "laptop");
            clearFieldLaptop();
        }
    }//GEN-LAST:event_createLaptopActionPerformed

    private final DesktopPC sampleDesktopPc = new DesktopPC(null, null, null, null, null);
    private final Laptop sampleLaptop = new Laptop(null, null, null, null, null);
    private final Brand sampleBrand = new Brand(null);
    private final Model sampleModel = new Model(null);
    private final Ram sampleRam = new Ram(null);
    private final Gpu sampleGpu = new Gpu(null);
    private final Ssd sampleSsd = new Ssd(null);

    private void specTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_specTableMouseClicked
        if (evt.getClickCount() == 2) {
            if (specTable.getSelectedRowCount() == 1) {
                int selectedRow = specTable.getSelectedRow();
                ImageIcon icon = new ImageIcon("src/images/error.png");
                String s = "Select a single row to get information";
                switch (selectedRow) {
                    case 0:
                        icon = new ImageIcon("src/images/computer.png");
                        s = "Desktop Pc: " + sampleDesktopPc.description() + "\n"
                                + "Laptop :" + sampleLaptop.description();
                        break;
                    case 1:
                        icon = new ImageIcon("src/images/brand.png");
                        s = sampleBrand.work();
                        break;
                    case 2:
                        icon = new ImageIcon("src/images/model.png");
                        s = sampleModel.work();
                        break;
                    case 3:
                        icon = new ImageIcon("src/images/ram.png");
                        s = sampleRam.work();
                        break;
                    case 4:
                        icon = new ImageIcon("src/images/gpu.png");
                        s = sampleGpu.work();
                        break;
                    case 5:
                        icon = new ImageIcon("src/images/ssd.png");
                        s = sampleSsd.work();
                        break;
                }
                JOptionPane.showMessageDialog(SpecsDisplay.this, s, "info", JOptionPane.INFORMATION_MESSAGE, icon);
            } else {
                ImageIcon icon = new ImageIcon("src/images/error.png");
                JOptionPane.showMessageDialog(SpecsDisplay.this, "Select a single row to get information", "Error", JOptionPane.INFORMATION_MESSAGE, icon);
            }
        }
    }//GEN-LAST:event_specTableMouseClicked

    private void addItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemBtnActionPerformed
        String name = nameText.getText().trim();
        if (!name.isEmpty()) {
            String item = itemCombo.getSelectedItem().toString();
            switch (item) {
                case "Brand":
                    Brand brand = new Brand(name);
                    brandList.add(brand);
                    break;
                case "Model":
                    Model model = new Model(name);
                    modelList.add(model);
                    break;
                case "RAM":
                    Ram ram = new Ram(name);
                    ramList.add(ram);
                    break;
                case "GPU":
                    Gpu gpu = new Gpu(name);
                    gpuList.add(gpu);
                    break;
                case "SSD":
                    Ssd ssd = new Ssd(name);
                    ssdList.add(ssd);
                    break;
            }
            itemCombo.setSelectedIndex(0);
            nameText.setText("");
            populateComboBox();
        } else {
            ImageIcon icon = new ImageIcon("src/images/error.png");
            JOptionPane.showMessageDialog(SpecsDisplay.this, "Enter a name to add to system", "Error", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }//GEN-LAST:event_addItemBtnActionPerformed

    private void clearSpecsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearSpecsActionPerformed
        brandList = new ArrayList();
        modelList = new ArrayList();
        ramList = new ArrayList();
        gpuList = new ArrayList();
        ssdList = new ArrayList();
        populateComboBox();
    }//GEN-LAST:event_clearSpecsActionPerformed

    private void nameTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextKeyTyped
        if (nameText.getText().trim().length() == 50) {
            evt.consume();
        }
    }//GEN-LAST:event_nameTextKeyTyped

    private void nameTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextKeyPressed
  if (evt.getKeyCode() == 86) {
            String temp = nameText.getText().trim();
            int curser = nameText.getCaretPosition();
            nameText.setText("");
            try {
                String data = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
                StringBuilder validationValue = new StringBuilder(temp);
                validationValue.insert(curser, data);
                if (validationValue.length() > 50) {
                    nameText.setText(temp);
                } else {
                    nameText.setText(validationValue.toString());
                }
                evt.consume();
            } catch (UnsupportedFlavorException | IOException e) {
                nameText.setText(temp);
                evt.consume();

            }
        }
    }//GEN-LAST:event_nameTextKeyPressed
    private void createTable(Device device, String type) {

        switch (type) {
            case "desktop":
                DesktopPC pc = (DesktopPC) device;
                dtm.setValueAt(pc.getBrand(), 1, 1);
                dtm.setValueAt(pc.getModel(), 2, 1);
                dtm.setValueAt(pc.getRam(), 3, 1);
                dtm.setValueAt(pc.getGpu(), 4, 1);
                dtm.setValueAt(pc.getSSD(), 5, 1);
                break;
            case "laptop":
                Laptop laptop = (Laptop) device;
                dtm.setValueAt(laptop.getBrand(), 1, 2);
                dtm.setValueAt(laptop.getModel(), 2, 2);
                dtm.setValueAt(laptop.getRam(), 3, 2);
                dtm.setValueAt(laptop.getGpu(), 4, 2);
                dtm.setValueAt(laptop.getSSD(), 5, 2);
        }
    }

    private void clearFieldsDesktop() {
        desktopBrandCombo.setSelectedIndex(0);
        desktopGpuCombo.setSelectedIndex(0);
        desktopModelCombo.setSelectedIndex(0);
        desktopRamCombo.setSelectedIndex(0);
        desktopSsdCombo.setSelectedIndex(0);
    }

    private void clearFieldLaptop() {
        laptopBrandCombo.setSelectedIndex(0);
        laptopGpuCombo.setSelectedIndex(0);
        laptopModelCombo.setSelectedIndex(0);
        laptopRamCombo.setSelectedIndex(0);
        laptopSsdCombo.setSelectedIndex(0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SpecsDisplay.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SpecsDisplay.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SpecsDisplay.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SpecsDisplay.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FlatDarkLaf.setup();
                try {
                    UIManager.setLookAndFeel(new FlatDarkLaf());
                } catch (UnsupportedLookAndFeelException ex) {
                    System.err.println("Failed to initialize LaF");
                }
                new SpecsDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItemBtn;
    private javax.swing.JButton clearSpecs;
    private javax.swing.JButton createDesktop;
    private javax.swing.JButton createLaptop;
    private javax.swing.JComboBox<String> desktopBrandCombo;
    private javax.swing.JComboBox<String> desktopGpuCombo;
    private javax.swing.JComboBox<String> desktopModelCombo;
    private javax.swing.JComboBox<String> desktopRamCombo;
    private javax.swing.JComboBox<String> desktopSsdCombo;
    private javax.swing.JComboBox<String> itemCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> laptopBrandCombo;
    private javax.swing.JComboBox<String> laptopGpuCombo;
    private javax.swing.JComboBox<String> laptopModelCombo;
    private javax.swing.JComboBox<String> laptopRamCombo;
    private javax.swing.JComboBox<String> laptopSsdCombo;
    private javax.swing.JTextField nameText;
    private javax.swing.JTable specTable;
    // End of variables declaration//GEN-END:variables
}
