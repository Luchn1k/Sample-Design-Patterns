/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Decorator.AvocadoJuice;
import Decorator.CashewNut;
import Decorator.FruitJuice;
import Decorator.OrangeJuice;
import Decorator.PomegranateJuice;
import Decorator.StrawberryJuice;
import Decorator.VanillaIceCream;
import Decorator.WhippingCream;
import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


/**
 *
 * @author Luchn1k
 */
public class VendingMachine extends javax.swing.JFrame {

    /**
     * Creates new form VendingMachine
     */
    private FruitJuice fruitJuice;
    private String selection;

    public VendingMachine() {
        initComponents();
        reset();
    }

    private void reset() {
        disableOrder();
        disableToppings();
        clearDisplay();
        enebleBeverages();
    }

    private void disableToppings() {
        whippingCreamBtn.setEnabled(false);
        vanillaIceCreamBtn.setEnabled(false);
        cashewNutBtn.setEnabled(false);
    }

    private void enebleToppings() {
        whippingCreamBtn.setEnabled(true);
        vanillaIceCreamBtn.setEnabled(true);
        cashewNutBtn.setEnabled(true);
    }

    private void disableOrder() {
        orderBtn.setEnabled(false);
    }

    private void enableOrder() {
        orderBtn.setEnabled(true);
    }

    private void disableBeverages() {
        orangeJuiceBtn.setEnabled(false);
        avocadoJuiceBtn.setEnabled(false);
        strawberryJuiceBtn.setEnabled(false);
        pomegranateJuiceBtn.setEnabled(false);
    }

    private void enebleBeverages() {
        orangeJuiceBtn.setEnabled(true);
        avocadoJuiceBtn.setEnabled(true);
        strawberryJuiceBtn.setEnabled(true);
        pomegranateJuiceBtn.setEnabled(true);
    }

    private void clearDisplay() {
        displayTxt.setText("Welcome To Fresh Frutti.");
    }

    private void setDisplay(String message) {
        displayTxt.setText(message);
    }

    private String genrateMessage(String text, double price) {
        return "You Selected " + text + "\nYour Current Total is Rs. " + price;
    }

    private String genrateFinalMessage(String text, double price) {
        String message = "Your Order is\n" + text + "\n\nYour Final Total is Rs. " + price;

        return message;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayTxt = new javax.swing.JTextArea();
        orangeJuiceBtn = new javax.swing.JButton();
        avocadoJuiceBtn = new javax.swing.JButton();
        pomegranateJuiceBtn = new javax.swing.JButton();
        strawberryJuiceBtn = new javax.swing.JButton();
        beverageLbl = new javax.swing.JLabel();
        toppingLbl1 = new javax.swing.JLabel();
        whippingCreamBtn = new javax.swing.JButton();
        vanillaIceCreamBtn = new javax.swing.JButton();
        cashewNutBtn = new javax.swing.JButton();
        orderBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fresh Frutii ");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Forte", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fresh Frutii ");

        displayTxt.setEditable(false);
        displayTxt.setColumns(20);
        displayTxt.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        displayTxt.setForeground(new java.awt.Color(255, 255, 255));
        displayTxt.setRows(5);
        displayTxt.setText("Welcome To Fresh Frutti.");
        displayTxt.setToolTipText("");
        displayTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        displayTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(displayTxt);

        orangeJuiceBtn.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        orangeJuiceBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/orangeIco.png"))); // NOI18N
        orangeJuiceBtn.setText("Orange Juice");
        orangeJuiceBtn.setPreferredSize(new java.awt.Dimension(205, 42));
        orangeJuiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orangeJuiceBtnActionPerformed(evt);
            }
        });

        avocadoJuiceBtn.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        avocadoJuiceBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AvocadoIco.png"))); // NOI18N
        avocadoJuiceBtn.setText("Avocado Juice");
        avocadoJuiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avocadoJuiceBtnActionPerformed(evt);
            }
        });

        pomegranateJuiceBtn.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        pomegranateJuiceBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pomegranateIco.png"))); // NOI18N
        pomegranateJuiceBtn.setText("Pomegranate Juice");
        pomegranateJuiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pomegranateJuiceBtnActionPerformed(evt);
            }
        });

        strawberryJuiceBtn.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        strawberryJuiceBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/strawberryIco.png"))); // NOI18N
        strawberryJuiceBtn.setText("Strawberry Juice");
        strawberryJuiceBtn.setPreferredSize(new java.awt.Dimension(205, 42));
        strawberryJuiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                strawberryJuiceBtnActionPerformed(evt);
            }
        });

        beverageLbl.setFont(new java.awt.Font("DialogInput", 3, 18)); // NOI18N
        beverageLbl.setText("Select Your Beverage");

        toppingLbl1.setFont(new java.awt.Font("DialogInput", 3, 18)); // NOI18N
        toppingLbl1.setText("Select Your Topping");

        whippingCreamBtn.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        whippingCreamBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/whipped-cream.png"))); // NOI18N
        whippingCreamBtn.setText("Whipping Cream");
        whippingCreamBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whippingCreamBtnActionPerformed(evt);
            }
        });

        vanillaIceCreamBtn.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        vanillaIceCreamBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icecream.png"))); // NOI18N
        vanillaIceCreamBtn.setText("Vanilla Ice Cream");
        vanillaIceCreamBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vanillaIceCreamBtnActionPerformed(evt);
            }
        });

        cashewNutBtn.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        cashewNutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cashew.png"))); // NOI18N
        cashewNutBtn.setText("Cashew Nut");
        cashewNutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashewNutBtnActionPerformed(evt);
            }
        });

        orderBtn.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        orderBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/take-away.png"))); // NOI18N
        orderBtn.setText("Take Away");
        orderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orderBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(whippingCreamBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(vanillaIceCreamBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(strawberryJuiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cashewNutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orangeJuiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(avocadoJuiceBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(pomegranateJuiceBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(beverageLbl)
                            .addComponent(toppingLbl1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(beverageLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(avocadoJuiceBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orangeJuiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(strawberryJuiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pomegranateJuiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(toppingLbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(whippingCreamBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vanillaIceCreamBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cashewNutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(orderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void orangeJuiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orangeJuiceBtnActionPerformed
        fruitJuice = new OrangeJuice();
        enableOrder();
        enebleToppings();
        disableBeverages();
        setDisplay(genrateMessage(fruitJuice.getDescription(), fruitJuice.getPrice()));
        selection = "orange";
    }//GEN-LAST:event_orangeJuiceBtnActionPerformed

    private void avocadoJuiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avocadoJuiceBtnActionPerformed
        fruitJuice = new AvocadoJuice();
        enableOrder();
        enebleToppings();
        disableBeverages();
        setDisplay(genrateMessage(fruitJuice.getDescription(), fruitJuice.getPrice()));
        selection = "avocado";
    }//GEN-LAST:event_avocadoJuiceBtnActionPerformed

    private void strawberryJuiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_strawberryJuiceBtnActionPerformed
        fruitJuice = new StrawberryJuice();
        enableOrder();
        enebleToppings();
        disableBeverages();
        setDisplay(genrateMessage(fruitJuice.getDescription(), fruitJuice.getPrice()));
        selection = "strawberry";
    }//GEN-LAST:event_strawberryJuiceBtnActionPerformed

    private void pomegranateJuiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pomegranateJuiceBtnActionPerformed
        fruitJuice = new PomegranateJuice();
        enableOrder();
        enebleToppings();
        disableBeverages();
        setDisplay(genrateMessage(fruitJuice.getDescription(), fruitJuice.getPrice()));
        selection = "pomegranate";
    }//GEN-LAST:event_pomegranateJuiceBtnActionPerformed

    private void whippingCreamBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whippingCreamBtnActionPerformed
        fruitJuice = new WhippingCream(fruitJuice);
        setDisplay(genrateMessage(fruitJuice.getDescription(), fruitJuice.getPrice()));
    }//GEN-LAST:event_whippingCreamBtnActionPerformed

    private void vanillaIceCreamBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vanillaIceCreamBtnActionPerformed
        fruitJuice = new VanillaIceCream(fruitJuice);
        setDisplay(genrateMessage(fruitJuice.getDescription(), fruitJuice.getPrice()));
    }//GEN-LAST:event_vanillaIceCreamBtnActionPerformed

    private void cashewNutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashewNutBtnActionPerformed
        fruitJuice = new CashewNut(fruitJuice);
        setDisplay(genrateMessage(fruitJuice.getDescription(), fruitJuice.getPrice()));
    }//GEN-LAST:event_cashewNutBtnActionPerformed

    private void orderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderBtnActionPerformed
        new Order(genrateFinalMessage(fruitJuice.getDescription(), fruitJuice.getPrice()), selection).setVisible(true);
        reset();
    }//GEN-LAST:event_orderBtnActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ImageIcon icon = new ImageIcon("src/images/ico.png");
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(VendingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VendingMachine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avocadoJuiceBtn;
    private javax.swing.JLabel beverageLbl;
    private javax.swing.JButton cashewNutBtn;
    private javax.swing.JTextArea displayTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton orangeJuiceBtn;
    private javax.swing.JButton orderBtn;
    private javax.swing.JButton pomegranateJuiceBtn;
    private javax.swing.JButton strawberryJuiceBtn;
    private javax.swing.JLabel toppingLbl1;
    private javax.swing.JButton vanillaIceCreamBtn;
    private javax.swing.JButton whippingCreamBtn;
    // End of variables declaration//GEN-END:variables
}
