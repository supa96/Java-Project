/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopony;

import java.util.Random;
import java.util.TimerTask;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 *
 * @author Phustih
 */
public class Game extends javax.swing.JFrame {

    /**
     * Creates new form Game
     */
    public Game() {
        initComponents();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gameBoard = new javax.swing.JPanel();
        bg = new javax.swing.JLabel();
        allButton = new javax.swing.JPanel();
        menuButton = new javax.swing.JButton();
        buyButton = new javax.swing.JButton();
        sellButton = new javax.swing.JButton();
        mortgageButton = new javax.swing.JButton();
        unmortgageButton = new javax.swing.JButton();
        playerInfo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        playerInfoBG = new javax.swing.JLabel();
        nextPlayer = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nextPlayerBG = new javax.swing.JLabel();
        History = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        historyBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1366, 735));

        gameBoard.setPreferredSize(new java.awt.Dimension(1366, 650));
        gameBoard.setLayout(null);

        bg.setPreferredSize(new java.awt.Dimension(1366, 650));
        gameBoard.add(bg);
        bg.setBounds(0, 0, 830, 650);

        allButton.setPreferredSize(new java.awt.Dimension(1366, 135));
        allButton.setLayout(null);

        menuButton.setText("Menu");
        allButton.add(menuButton);
        menuButton.setBounds(0, 0, 160, 35);

        buyButton.setText("Buy");
        buyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });
        allButton.add(buyButton);
        buyButton.setBounds(166, 0, 160, 35);

        sellButton.setText("Sell");
        allButton.add(sellButton);
        sellButton.setBounds(332, 0, 160, 35);

        mortgageButton.setText("Mortgage");
        mortgageButton.setPreferredSize(new java.awt.Dimension(73, 35));
        mortgageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mortgageButtonActionPerformed(evt);
            }
        });
        allButton.add(mortgageButton);
        mortgageButton.setBounds(502, 0, 160, 35);

        unmortgageButton.setText("Unmortgage");
        unmortgageButton.setPreferredSize(new java.awt.Dimension(73, 35));
        allButton.add(unmortgageButton);
        unmortgageButton.setBounds(668, 0, 160, 35);

        playerInfo.setLayout(null);

        jLabel1.setText("PlayerInfo");
        playerInfo.add(jLabel1);
        jLabel1.setBounds(250, 80, 90, 50);
        playerInfo.add(playerInfoBG);
        playerInfoBG.setBounds(0, 0, 530, 300);

        nextPlayer.setLayout(null);

        jLabel3.setText("Next Player");
        nextPlayer.add(jLabel3);
        jLabel3.setBounds(210, 50, 100, 14);
        nextPlayer.add(nextPlayerBG);
        nextPlayerBG.setBounds(0, 0, 530, 135);

        History.setPreferredSize(new java.awt.Dimension(530, 300));
        History.setLayout(null);

        jLabel2.setText("History");
        History.add(jLabel2);
        jLabel2.setBounds(220, 80, 140, 14);
        History.add(historyBG);
        historyBG.setBounds(0, 0, 530, 240);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(gameBoard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(allButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                    .addComponent(nextPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(History, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(gameBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(allButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(playerInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(History, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mortgageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mortgageButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mortgageButtonActionPerformed

    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_buyButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel History;
    private javax.swing.JPanel allButton;
    private javax.swing.JLabel bg;
    private javax.swing.JButton buyButton;
    private javax.swing.JPanel gameBoard;
    private javax.swing.JLabel historyBG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton menuButton;
    private javax.swing.JButton mortgageButton;
    private javax.swing.JPanel nextPlayer;
    private javax.swing.JLabel nextPlayerBG;
    private javax.swing.JPanel playerInfo;
    private javax.swing.JLabel playerInfoBG;
    private javax.swing.JButton sellButton;
    private javax.swing.JButton unmortgageButton;
    // End of variables declaration//GEN-END:variables
}
