/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopony;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author Phustih
 */

public class Mainmenu extends javax.swing.JFrame {
    /**
     * Creates new form temp
     */
  
    Register a = new Register();
    
    public Mainmenu() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        signIn = new javax.swing.JButton();
        userLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        username = new RoundJTextField(15)
        ;
        register = new javax.swing.JButton();
        password = new RoundJPasswordField(15);
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        signIn.setBackground(new java.awt.Color(45, 48, 55));
        signIn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        signIn.setForeground(new java.awt.Color(57, 192, 186));
        signIn.setText("Sign in");
        signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInActionPerformed(evt);
            }
        });
        jPanel1.add(signIn);
        signIn.setBounds(890, 410, 110, 30);

        userLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        userLabel.setForeground(new java.awt.Color(57, 192, 186));
        userLabel.setText("username:");
        jPanel1.add(userLabel);
        userLabel.setBounds(400, 420, 100, 23);

        passLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        passLabel.setForeground(new java.awt.Color(57, 192, 186));
        passLabel.setText("password:");
        jPanel1.add(passLabel);
        passLabel.setBounds(640, 420, 90, 23);

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username);
        username.setBounds(520, 410, 85, 35);

        register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/signUp.jpg"))); // NOI18N
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        jPanel1.add(register);
        register.setBounds(890, 450, 110, 30);

        password.setBorder(null);
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(750, 410, 85, 35);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/bgMain.jpg"))); // NOI18N
        jPanel1.add(bg);
        bg.setBounds(0, 0, 1370, 770);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInActionPerformed
        // TODO add your handling code here:
        
        if(username.getText().isEmpty() || password.getText().isEmpty()){
            JOptionPane.showMessageDialog( null, "Not found" );
        }
        else{
            signIn.setVisible(false);
            register.setVisible(false);
            userLabel.setVisible(false);
            passLabel.setVisible(false);
            username.setVisible(false);
            password.setVisible(false);
            this.dispose();
            a.setVisible(true);
        }
    }//GEN-LAST:event_signInActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        // TODO add your handling code here:
        this.dispose();
        a.setVisible(true);
    }//GEN-LAST:event_registerActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

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
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainmenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton register;
    private javax.swing.JButton signIn;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
