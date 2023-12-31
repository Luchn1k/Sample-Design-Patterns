/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import FlyWeight.Oval;
import FlyWeight.Rectangle;
import FlyWeight.ShapeFactory;
import FlyWeight.Triangle;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatDraculaIJTheme;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Luchn1k
 */
public class GraphicsPanel extends javax.swing.JFrame {

    /**
     * Creates new form Drawer
     */
    private Color selectedColor = Color.BLACK;
    private int counter = 0;
    Random rand = new Random();
    private final int MAX_RGB_VALUE = 255;

    public GraphicsPanel() {
        initComponents();
        pnlColorPnl.setBackground(canvasesPnl.getBackground());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvasesPnl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        heightTxt = new javax.swing.JTextField();
        widthTxt = new javax.swing.JTextField();
        SelctecColorPnl = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pnlColorPnl = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        circleBtn = new javax.swing.JButton();
        recBtn = new javax.swing.JButton();
        triBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        poolSizeLbl = new javax.swing.JLabel();
        shapeCountLbl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("2D Shape Factory");
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        canvasesPnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Canvases", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 14))); // NOI18N

        javax.swing.GroupLayout canvasesPnlLayout = new javax.swing.GroupLayout(canvasesPnl);
        canvasesPnl.setLayout(canvasesPnlLayout);
        canvasesPnlLayout.setHorizontalGroup(
            canvasesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        canvasesPnlLayout.setVerticalGroup(
            canvasesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("2D Shape Factory");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Design", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel2.setText("Height/Altitude");

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel3.setText("Width/Base");

        heightTxt.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        heightTxt.setToolTipText("");
        heightTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                heightTxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                heightTxtKeyTyped(evt);
            }
        });

        widthTxt.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        widthTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                widthTxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                widthTxtKeyTyped(evt);
            }
        });

        SelctecColorPnl.setBackground(new java.awt.Color(0, 0, 0));
        SelctecColorPnl.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SelctecColorPnl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SelctecColorPnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SelctecColorPnlMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SelctecColorPnlLayout = new javax.swing.GroupLayout(SelctecColorPnl);
        SelctecColorPnl.setLayout(SelctecColorPnlLayout);
        SelctecColorPnlLayout.setHorizontalGroup(
            SelctecColorPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        SelctecColorPnlLayout.setVerticalGroup(
            SelctecColorPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel6.setText("Shape Color");

        jLabel7.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel7.setText("Canvases Color");

        pnlColorPnl.setBackground(new java.awt.Color(0, 0, 0));
        pnlColorPnl.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlColorPnl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlColorPnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlColorPnlMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlColorPnlLayout = new javax.swing.GroupLayout(pnlColorPnl);
        pnlColorPnl.setLayout(pnlColorPnlLayout);
        pnlColorPnlLayout.setHorizontalGroup(
            pnlColorPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pnlColorPnlLayout.setVerticalGroup(
            pnlColorPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlColorPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelctecColorPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(heightTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                        .addComponent(widthTxt)))
                .addContainerGap(201, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(heightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(widthTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SelctecColorPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(pnlColorPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Create", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 14))); // NOI18N

        circleBtn.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        circleBtn.setText("Create Oval");
        circleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circleBtnActionPerformed(evt);
            }
        });

        recBtn.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        recBtn.setText("Create Rectangle");
        recBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recBtnActionPerformed(evt);
            }
        });

        triBtn.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        triBtn.setText("Create Triangle");
        triBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(circleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(recBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(triBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(circleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(recBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(triBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Count", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 14))); // NOI18N

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel4.setText("Object Count");

        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel5.setText("Shapes Count");

        poolSizeLbl.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        poolSizeLbl.setText("0");

        shapeCountLbl.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        shapeCountLbl.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27)
                        .addComponent(poolSizeLbl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(shapeCountLbl)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(poolSizeLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(shapeCountLbl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jButton1.setText("Clear Shapes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(canvasesPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canvasesPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void circleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circleBtnActionPerformed

        if (heightTxt.getText().trim().isEmpty() || widthTxt.getText().trim().isEmpty()) {
            ImageIcon icon = new ImageIcon("src/images/size.png");
            JOptionPane.showMessageDialog(GraphicsPanel.this, "Enter the height/altitude and width/base of the shape to draw the circle.", "Error", JOptionPane.INFORMATION_MESSAGE, icon);
            return;
        }

        int height = Integer.parseInt(heightTxt.getText().trim());
        int width = Integer.parseInt(widthTxt.getText().trim());

        Graphics g = canvasesPnl.getGraphics();
        Oval shape = (Oval) ShapeFactory.getShape("Oval", g);
        Dimension location = genaratePosition(canvasesPnl);
        shape.setHeight(height);
        shape.setWidth(width);
        shape.setX(location.width);
        shape.setY(location.height);
        shape.setColor(selectedColor);
        shape.draw();
        counter++;
        setCounter();

    }//GEN-LAST:event_circleBtnActionPerformed
    private Dimension genaratePosition(JPanel size) {
        int x = rand.nextInt((size.getWidth()) + 1) + 1;
        int y = rand.nextInt((size.getHeight() + 1) + 1) + 1;
        return new Dimension(x, y);
    }

    private void recBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recBtnActionPerformed

        if (heightTxt.getText().trim().isEmpty() || widthTxt.getText().trim().isEmpty()) {
            ImageIcon icon = new ImageIcon("src/images/size.png");
            JOptionPane.showMessageDialog(GraphicsPanel.this, "Enter the height/altitude and width/base of the shape to draw the rectangle.", "Error", JOptionPane.INFORMATION_MESSAGE, icon);
            return;
        }
        int height = Integer.parseInt(heightTxt.getText().trim());
        int width = Integer.parseInt(widthTxt.getText().trim());

        Graphics g = canvasesPnl.getGraphics();
        Rectangle shape = (Rectangle) ShapeFactory.getShape("Rectangle", g);
        Dimension location = genaratePosition(canvasesPnl);
        shape.setHeight(height);
        shape.setWidth(width);
        shape.setX(location.width);
        shape.setY(location.height);
        shape.setColor(selectedColor);
        shape.draw();
        counter++;
        setCounter();
    }//GEN-LAST:event_recBtnActionPerformed

    private void SelctecColorPnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SelctecColorPnlMouseClicked
        Color color = JColorChooser.showDialog(this, "Select a color", selectedColor);
        if (color != null) {
            SelctecColorPnl.setBackground(color);
            selectedColor = color;
        }
    }//GEN-LAST:event_SelctecColorPnlMouseClicked

    private void triBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triBtnActionPerformed
        if (heightTxt.getText().trim().isEmpty() || widthTxt.getText().trim().isEmpty()) {
            ImageIcon icon = new ImageIcon("src/images/size.png");
            JOptionPane.showMessageDialog(GraphicsPanel.this, "Enter the height/altitude and width/base of the shape to draw a triangle.", "Error", JOptionPane.INFORMATION_MESSAGE, icon);
            return;
        }

        int height = Integer.parseInt(heightTxt.getText().trim());
        int width = Integer.parseInt(widthTxt.getText().trim());

        Graphics g = canvasesPnl.getGraphics();
        Triangle shape = (Triangle) ShapeFactory.getShape("triangle", g);
        Dimension location = genaratePosition(canvasesPnl);
        shape.setHeight(height);
        shape.setWidth(width);
        shape.setX(location.width);
        shape.setY(location.height);
        shape.setColor(selectedColor);
        shape.draw();
        counter++;
        setCounter();

    }//GEN-LAST:event_triBtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ImageIcon icon = new ImageIcon("src/Images/icon.png");
        setIconImage(icon.getImage());
        this.pack();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }//GEN-LAST:event_formWindowOpened

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        counter = 0;
        setCounter();
    }//GEN-LAST:event_formWindowStateChanged

    private void heightTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_heightTxtKeyTyped
        try {
            char c = evt.getKeyChar();
            String text = heightTxt.getText().trim();
            if (!Character.isDigit(c) && !evt.isAltDown()) {
                evt.consume();
            }
            if (text.length() >= 3) {
                evt.consume();
            }
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_heightTxtKeyTyped

    private void heightTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_heightTxtKeyPressed
        if (evt.getKeyCode() == 86) {
            String temp = heightTxt.getText().trim();
            int curser = heightTxt.getCaretPosition();
            heightTxt.setText("");
            try {
                String data = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
                StringBuilder validationValue = new StringBuilder(temp);
                validationValue.insert(curser, data);
                if (validationValue.length() > 3) {
                    heightTxt.setText(temp);
                } else {
                    Integer.parseInt(validationValue.toString());
                    heightTxt.setText(validationValue.toString());
                }
                evt.consume();
            } catch (NumberFormatException | UnsupportedFlavorException | IOException e) {
                heightTxt.setText(temp);
                evt.consume();

            }
        }
    }//GEN-LAST:event_heightTxtKeyPressed

    private void widthTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_widthTxtKeyPressed
        if (evt.getKeyCode() == 86) {
            String temp = widthTxt.getText().trim();
            int curser = widthTxt.getCaretPosition();
            widthTxt.setText("");
            try {
                String data = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
                StringBuilder validationValue = new StringBuilder(temp);
                validationValue.insert(curser, data);
                if (validationValue.length() > 3) {
                    widthTxt.setText(temp);
                } else {
                    Integer.parseInt(validationValue.toString());
                    widthTxt.setText(validationValue.toString());
                }
                evt.consume();
            } catch (NumberFormatException | UnsupportedFlavorException | IOException e) {
                widthTxt.setText(temp);
                evt.consume();

            }
        }
    }//GEN-LAST:event_widthTxtKeyPressed

    private void widthTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_widthTxtKeyTyped
        try {
            char c = evt.getKeyChar();
            String text = widthTxt.getText().trim();
            if (!Character.isDigit(c) && !evt.isAltDown()) {
                evt.consume();
            }
            if (text.length() >= 3) {
                evt.consume();
            }
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_widthTxtKeyTyped

    private void pnlColorPnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlColorPnlMouseClicked
        Color color = JColorChooser.showDialog(this, "Select a color", selectedColor);
        if (color != null) {
            pnlColorPnl.setBackground(color);
            canvasesPnl.setBackground(color);
            canvasesPnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Canvases", 
                    javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                    new java.awt.Font("DialogInput", 1, 14), invert(color))); // NOI18N
        }
    }//GEN-LAST:event_pnlColorPnlMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        canvasesPnl.repaint();
        counter = 0;
        setCounter();
    }//GEN-LAST:event_jButton1ActionPerformed
    private void setCounter() {
        poolSizeLbl.setText(String.valueOf(ShapeFactory.getSize()));
        shapeCountLbl.setText(String.valueOf(counter));
    }

    private Color invert(Color color) {
        return new Color(255 - color.getRed(), 255 - color.getGreen(), 255 - color.getBlue());
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
            java.util.logging.Logger.getLogger(GraphicsPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraphicsPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraphicsPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraphicsPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FlatDarkLaf.setup();
                try {
                    UIManager.setLookAndFeel(new FlatDraculaIJTheme());
                } catch (UnsupportedLookAndFeelException ex) {
                    System.err.println("Failed to initialize LaF");
                }
                new GraphicsPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SelctecColorPnl;
    private javax.swing.JPanel canvasesPnl;
    private javax.swing.JButton circleBtn;
    private javax.swing.JTextField heightTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel pnlColorPnl;
    private javax.swing.JLabel poolSizeLbl;
    private javax.swing.JButton recBtn;
    private javax.swing.JLabel shapeCountLbl;
    private javax.swing.JButton triBtn;
    private javax.swing.JTextField widthTxt;
    // End of variables declaration//GEN-END:variables
}
