/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import ChainOfResponsibility.Details;
import ChainOfResponsibility.TypeValidation;
import ChainOfResponsibility.ValidateEmail;
import ChainOfResponsibility.ValidateMobile;
import ChainOfResponsibility.ValidateName;
import ChainOfResponsibility.ValidatePassword;
import ChainOfResponsibility.ValidateUsername;
import Mediator.ChatRoom;
import Mediator.ChatRoomComponent;
import Mediator.Customer;
import Mediator.Seller;
import Mediator.User;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;

/**
 *
 * @author Luchn1k
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    private final Border defaultBoder;
    
    public SignUp() {
        initComponents();
        setLableImage();
        passwordTxt.setEchoChar((char) 0);
        defaultBoder = nameTxt.getBorder();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainImage = new javax.swing.JPanel();
        mainImageLbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        contatTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        usernameTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        typeCombo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        showHide = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Electro Shop");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        mainImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout mainImageLayout = new javax.swing.GroupLayout(mainImage);
        mainImage.setLayout(mainImageLayout);
        mainImageLayout.setHorizontalGroup(
            mainImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainImageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainImageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainImageLayout.setVerticalGroup(
            mainImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainImageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainImageLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sign Up Form", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel1.setText("Name");

        nameTxt.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        nameTxt.setText("Enter Your Name...");
        nameTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameTxtFocusLost(evt);
            }
        });

        contatTxt.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        contatTxt.setText("Enter Your Contact Number...");
        contatTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contatTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                contatTxtFocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel2.setText("Contact Number");

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel3.setText("Email");

        emailTxt.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        emailTxt.setText("Enter Your Email...");
        emailTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailTxtFocusLost(evt);
            }
        });
        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });

        usernameTxt.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        usernameTxt.setText("Enter User Name...");
        usernameTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameTxtFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel4.setText("Username");

        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel5.setText("Password");

        passwordTxt.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        passwordTxt.setText("Enter Your Password...");
        passwordTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordTxtFocusLost(evt);
            }
        });
        passwordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel6.setText("AccountType");

        typeCombo.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        typeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type...", "Seller", "Customer" }));

        jButton1.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jButton1.setText("Sign Up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        showHide.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        showHide.setText("🔒");
        showHide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showHideActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel7.setText("Have a Account ? Sign in");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(typeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(contatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showHide, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordTxt)
                    .addComponent(showHide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(typeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ImageIcon icon = new ImageIcon("src/Images/icon.png");
        setIconImage(icon.getImage());

    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = nameTxt.getText().trim();
        String contact = contatTxt.getText().trim();
        String email = emailTxt.getText().trim();
        String username = usernameTxt.getText().trim();
        String password = passwordTxt.getText().trim();
        String type = typeCombo.getSelectedItem().toString().trim();
        
        ValidateName nameValidate = new ValidateName();
        ValidateMobile mobileValidate = new ValidateMobile();
        ValidatePassword passwordValidate = new ValidatePassword();
        ValidateEmail emailValidate = new ValidateEmail();
        TypeValidation typeValidation = new TypeValidation();
        ValidateUsername validateUsername = new ValidateUsername();
        
        nameValidate.setNext(mobileValidate);
        mobileValidate.setNext(emailValidate);
        emailValidate.setNext(passwordValidate);
        passwordValidate.setNext(validateUsername);
        validateUsername.setNext(typeValidation);
        
        Details details = new Details(nameTxt, contatTxt, passwordTxt, emailTxt, typeCombo, this, usernameTxt);
        nameValidate.validate(details);
        if (details.isIsCompleteSuccessfuly()) {
            User user;
            ChatRoomComponent mediator = ChatRoom.getChatRoom();
            if (type.equalsIgnoreCase("customer")) {
                user = new Customer(name, contact, email, username, password, type, mediator);
            } else {
                user = new Seller(name, contact, email, username, password, type, mediator);
            }
            ChatRoom.getChatRoom().addUser(user);
            
            this.setVisible(false);
            new Home(user).setVisible(true);
            nameTxt.setText("Enter Your Name...");
            contatTxt.setText("Enter Your Mobile...");
            passwordTxt.setText("Enter Your Password...");
            showHide.setText("🔒");
            passwordTxt.setEchoChar((char) 0);
            emailTxt.setText("Enter Your Email...");
            typeCombo.setSelectedIndex(0);
            usernameTxt.setText("Enter User Name...");
            
            nameTxt.setBorder(defaultBoder);
            contatTxt.setBorder(defaultBoder);
            passwordTxt.setBorder(defaultBoder);
            emailTxt.setBorder(defaultBoder);
            typeCombo.setBorder(defaultBoder);
            usernameTxt.setBorder(defaultBoder);
            mainImage.requestFocus();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    private void passwordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTxtActionPerformed

    private void nameTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTxtFocusGained
        String text = nameTxt.getText().trim();
        if (text.equals("Enter Your Name...")) {
            nameTxt.setText("");
        }
    }//GEN-LAST:event_nameTxtFocusGained

    private void nameTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTxtFocusLost
        String text = nameTxt.getText().trim();
        if (text.isEmpty()) {
            nameTxt.setText("Enter Your Name...");
        }
    }//GEN-LAST:event_nameTxtFocusLost

    private void contatTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contatTxtFocusGained
        String text = contatTxt.getText().trim();
        if (text.equals("Enter Your Contact Number...")) {
            contatTxt.setText("");
        }
    }//GEN-LAST:event_contatTxtFocusGained

    private void contatTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contatTxtFocusLost
        String text = contatTxt.getText().trim();
        if (text.isEmpty()) {
            contatTxt.setText("Enter Your Contact Number...");
        }
    }//GEN-LAST:event_contatTxtFocusLost

    private void emailTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTxtFocusGained
        String text = emailTxt.getText().trim();
        if (text.equals("Enter Your Email...")) {
            emailTxt.setText("");
        }
    }//GEN-LAST:event_emailTxtFocusGained

    private void emailTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTxtFocusLost
        String text = emailTxt.getText().trim();
        if (text.isEmpty()) {
            emailTxt.setText("Enter Your Email...");
        }
    }//GEN-LAST:event_emailTxtFocusLost

    private void usernameTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTxtFocusGained
        String text = usernameTxt.getText().trim();
        if (text.equals("Enter User Name...")) {
            usernameTxt.setText("");
        }
    }//GEN-LAST:event_usernameTxtFocusGained

    private void usernameTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTxtFocusLost
        String text = usernameTxt.getText().trim();
        if (text.isEmpty()) {
            usernameTxt.setText("Enter User Name...");
        }
    }//GEN-LAST:event_usernameTxtFocusLost

    private void showHideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showHideActionPerformed
        passwordTxt.requestFocus();
        if (showHide.getText().equals("🔒")) {
            showHide.setText("🔓");
            passwordTxt.setEchoChar((char) 0);
        } else {
            showHide.setText("🔒");
            passwordTxt.setEchoChar('•');
        }
    }//GEN-LAST:event_showHideActionPerformed

    private void passwordTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTxtFocusGained
        String text = passwordTxt.getText().trim();
        if (text.equals("Enter Your Password...")) {
            passwordTxt.setText("");
            passwordTxt.setEchoChar('•');
        }
        if (showHide.getText().equals("🔓")) {
            passwordTxt.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_passwordTxtFocusGained

    private void passwordTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTxtFocusLost
        String text = passwordTxt.getText().trim();
        if (text.isEmpty()) {
            passwordTxt.setText("Enter Your Password...");
            passwordTxt.setEchoChar((char) 0);
            
        }
    }//GEN-LAST:event_passwordTxtFocusLost

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.setVisible(false);
        new SignIn().setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
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
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contatTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mainImage;
    private javax.swing.JLabel mainImageLbl;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JButton showHide;
    private javax.swing.JComboBox<String> typeCombo;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables

    private void setLableImage() {
        ClassLoader classLoader = getClass().getClassLoader();
        try {
            File file = new File(classLoader.getResource("Images/RegistrationImage.jpg").getFile());
            BufferedImage img = ImageIO.read(file);
            Image dimg = img.getScaledInstance(mainImageLbl.getWidth(), mainImageLbl.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(dimg);
            mainImageLbl.setIcon(imageIcon);
            mainImageLbl.requestFocus();
        } catch (Exception e) {
        }
    }
}