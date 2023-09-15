/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BuilderPattern.PcDoc;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;
import java.awt.Component;
import java.awt.Font;
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
public class PCBuilder extends javax.swing.JFrame {

    private ArrayList<PcDoc> pcList;
    private final DefaultTableModel DTM;

    public PCBuilder() {
        initComponents();
        pcList = new ArrayList();
        DTM = (DefaultTableModel) display.getModel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        brandCombo = new javax.swing.JComboBox<>();
        modelCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        processorCombo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        ramCombo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        gpuCombo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        ssdCombo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        caseCombo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        createPc = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTable();
        clearHistory = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PC-Doctor");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel2.setText("Brand");

        brandCombo.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        brandCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Brand...", "MSI", "Acer" }));

        modelCombo.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        modelCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Model...", "X473", "TUF-289", "GF-95" }));

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel3.setText("Model");

        processorCombo.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        processorCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Processor...", "Intel i7", "AMD Ryzen 7" }));

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel4.setText("Processor");

        ramCombo.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        ramCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Ram...", "16GB DDR3", "32GB DDR4" }));

        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel5.setText("RAM");

        gpuCombo.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        gpuCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select GPU...", "Nvidia 1650 6GB", "Nvidia 1660 Ti 4GB", "Radeon 5800 6GB" }));

        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel6.setText("GPU");

        ssdCombo.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        ssdCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select SSD...", "Kingston 512GB", "Seagate 512GB" }));

        jLabel7.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel7.setText("SSD");

        caseCombo.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        caseCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Case...", "RGB case", "Blue Double Stripe", "Red Stripe" }));

        jLabel8.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel8.setText("Case");

        createPc.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        createPc.setText("Create");
        createPc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(brandCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modelCombo, 0, 251, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(processorCombo, 0, 251, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ramCombo, 0, 251, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gpuCombo, 0, 251, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ssdCombo, 0, 251, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(caseCombo, 0, 251, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createPc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(brandCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modelCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(processorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ramCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gpuCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ssdCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caseCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(createPc, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pc Viewer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 14))); // NOI18N
        jPanel2.setInheritsPopupMenu(true);

        display.setFont(new java.awt.Font("DialogInput", 2, 14)); // NOI18N
        display.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand", "Model", "Processor", "RAM", "GPU", "SSD", "Case"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        display.getTableHeader().setReorderingAllowed(false);
        display.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(display);
        if (display.getColumnModel().getColumnCount() > 0) {
            display.getColumnModel().getColumn(0).setResizable(false);
            display.getColumnModel().getColumn(1).setResizable(false);
            display.getColumnModel().getColumn(2).setResizable(false);
            display.getColumnModel().getColumn(3).setResizable(false);
            display.getColumnModel().getColumn(4).setResizable(false);
            display.getColumnModel().getColumn(5).setResizable(false);
            display.getColumnModel().getColumn(6).setResizable(false);
        }

        clearHistory.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        clearHistory.setText("Clear History");
        clearHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1011, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(clearHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(clearHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PC-Doctor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createPcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPcActionPerformed
        String brand = brandCombo.getSelectedIndex() == 0 ? null : brandCombo.getSelectedItem().toString().trim();
        String model = modelCombo.getSelectedIndex() == 0 ? null : modelCombo.getSelectedItem().toString().trim();
        String processor = processorCombo.getSelectedIndex() == 0 ? null : processorCombo.getSelectedItem().toString().trim();
        String ram = ramCombo.getSelectedIndex() == 0 ? null : ramCombo.getSelectedItem().toString().trim();
        String gpu = gpuCombo.getSelectedIndex() == 0 ? null : gpuCombo.getSelectedItem().toString().trim();
        String ssd = ssdCombo.getSelectedIndex() == 0 ? null : ssdCombo.getSelectedItem().toString().trim();
        String caseImage = caseCombo.getSelectedIndex() == 0 ? null : caseCombo.getSelectedItem().toString().trim();

        if (brand == null || model == null) {
            ImageIcon icon = new ImageIcon("src/images/select.png");
            JOptionPane.showMessageDialog(PCBuilder.this, "Please selact a brand and a model", "Error", JOptionPane.ERROR_MESSAGE, icon);
            return;
        }
        if (caseImage != null) {
            switch (caseImage) {
                case "RGB case":
                    caseImage = "src/Images/case1.png";
                    break;
                case "Blue Double Stripe":
                    caseImage = "src/Images/case2.png";
                    break;
                case "Red Stripe":
                    caseImage = "src/Images/case3.png";
                    break;
            }
        }

        PcDoc.Builder pcBuilder = new PcDoc.Builder(brand, model);
        PcDoc build = pcBuilder.setProcessor(processor).setRam(ram).setGpu(gpu).setSsd(ssd).setCaseImage(caseImage).build();
        pcList.add(build);
        updateTable();
        reset();

    }//GEN-LAST:event_createPcActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ImageIcon icon = new ImageIcon("src/images/ico.png");
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowActivated

    private void clearHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearHistoryActionPerformed
        pcList = new ArrayList();
        updateTable();
    }//GEN-LAST:event_clearHistoryActionPerformed

    private void displayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMouseClicked
        if (evt.getClickCount() == 2) {
            if (display.getSelectedRowCount() == 1) {
                PcDoc pc = pcList.get(display.getSelectedRow());
                ImageIcon icon = new ImageIcon(pc.getCaseImage() == null ? "src/images/infoPc.png" : pc.getCaseImage());
                JOptionPane.showMessageDialog(PCBuilder.this, pc, "Info", JOptionPane.ERROR_MESSAGE, icon);
            }else{
                ImageIcon icon = new ImageIcon("src/images/error.png");
                JOptionPane.showMessageDialog(PCBuilder.this, "Select a single row", "Error", JOptionPane.ERROR_MESSAGE, icon);
            }
        }
    }//GEN-LAST:event_displayMouseClicked
    private void reset() {
        brandCombo.setSelectedIndex(0);
        modelCombo.setSelectedIndex(0);
        processorCombo.setSelectedIndex(0);
        ramCombo.setSelectedIndex(0);
        gpuCombo.setSelectedIndex(0);
        ssdCombo.setSelectedIndex(0);
        caseCombo.setSelectedIndex(0);
    }

    class ImageRenderer extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            if (!value.toString().trim().equalsIgnoreCase("N/A")) {
                JLabel lbl = new JLabel(new ImageIcon((String) value));
                return lbl;
            } else {
                JLabel lbl = new JLabel(value.toString());
                lbl.setFont(new Font("DialogInput", Font.ITALIC, 14));
                return lbl;
            }
        }
    }

    private void updateTable() {
        DTM.setRowCount(0);
        for (PcDoc p : pcList) {
            String[] dataRow = {p.getBrand(), p.getModel(), (p.getProcessor() == null ? "N/A" : p.getProcessor()), (p.getRam() == null ? "N/A" : p.getRam()), (p.getGpu() == null ? "N/A" : p.getGpu()), (p.getSsd() == null ? "N/A" : p.getSsd()), (p.getCaseImage() == null ? "N/A" : p.getCaseImage())};
            DTM.addRow(dataRow);
        }
        display.setRowHeight(128);
        display.getColumn("Case").setCellRenderer(new ImageRenderer());
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PCBuilder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PCBuilder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PCBuilder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PCBuilder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FlatDarkLaf.setup();
                try {
                    UIManager.setLookAndFeel(new FlatDarkPurpleIJTheme());
                } catch (UnsupportedLookAndFeelException ex) {
                    System.err.println("Failed to initialize LaF");
                }
                new PCBuilder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> brandCombo;
    private javax.swing.JComboBox<String> caseCombo;
    private javax.swing.JButton clearHistory;
    private javax.swing.JButton createPc;
    private javax.swing.JTable display;
    private javax.swing.JComboBox<String> gpuCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> modelCombo;
    private javax.swing.JComboBox<String> processorCombo;
    private javax.swing.JComboBox<String> ramCombo;
    private javax.swing.JComboBox<String> ssdCombo;
    // End of variables declaration//GEN-END:variables
}
