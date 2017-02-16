/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author Supachai
 */
public class Rules extends javax.swing.JFrame {

    /**
     * Creates new form Rules
     */
    public Rules() {
        initComponents();
        details.setText("<html>-Every user starts off with $1,500 which is distributed"
                + " by the bank<br><br>- Min. Players: 2    Max. Players: 8<br><br> "
                + "- Every player needs to roll 2 dice in their turn and move the"
                + " corresponding number of steps on the board<br><br>"
                + "- Buying Property<br><br>----- Each Property has a buying price, mortgage value, and rent value<br><br> "
                + "----- The buying price should be payed if the player wants to buy the property<br><br> "
                + "----- The mortgage price should be payed if the player wants to unmortgage the property<br><br> "
                + "----- The rent value should be payed if a a player who is not the owner of the property lands on it<br><br></html>"); 
        next2.setVisible(false);
        mm.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        details = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        next2 = new javax.swing.JButton();
        mm = new javax.swing.JButton();
        bg = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 735));
        setSize(new java.awt.Dimension(1366, 735));
        getContentPane().setLayout(null);

        title.setFont(new java.awt.Font("Phosphate", 0, 48)); // NOI18N
        title.setText("HOW TO PLAY");
        getContentPane().add(title);
        title.setBounds(530, 10, 370, 70);

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Silom", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("THE MAIN GOAL IS NOT TO GO BANKRUPT : YOUR TOTAL ASSETS  SHOULD NOT BE LESS THAN $0");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 100, 1160, 40);

        details.setFont(new java.awt.Font("STHeiti", 0, 24)); // NOI18N
        getContentPane().add(details);
        details.setBounds(30, 140, 1110, 540);

        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        getContentPane().add(next);
        next.setBounds(940, 620, 55, 23);

        next2.setText("Next");
        next2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next2ActionPerformed(evt);
            }
        });
        getContentPane().add(next2);
        next2.setBounds(940, 610, 55, 30);

        mm.setText("Back to Main Menu");
        mm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmActionPerformed(evt);
            }
        });
        getContentPane().add(mm);
        mm.setBounds(890, 610, 160, 30);
        getContentPane().add(bg);
        bg.setBounds(0, 0, 1460, 760);

        jPanel2.setPreferredSize(new java.awt.Dimension(1363, 763));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1220, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1220, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here: 
        details.setText( "<html>- Mortgaging<br><br>----- When the player mortgages the property, the player will get the mortgage money from the bank<br><br> "
                + "----- If any player land on a mortgaged property, they will not be charged<br><br> "
                + "- Buying Houses<br><br>" 
                + "----- The player can build a maximum of 4 houses in any of their property except for Utilities<br><br> "
                + "----- If a player wants to build more than 4 houses, the house will traded in for a hotel<br><br> "
                + "----- The price for building a house and a hotel will be listed on the property card<br>  </html>");
        next.setVisible(false);
        next2.setVisible(true);
        
        
    }//GEN-LAST:event_nextActionPerformed

    private void next2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next2ActionPerformed
        // TODO add your handling code here: 
        details.setText("<html>- Jail<br><br> "
                + "----- If the player roll doubles 3 times in a row, they will automatically end up in jail<br><br> "
                + "----- The player can also enter jail by picking a Chance or Community Card<br><br> "
                + "----- If the player is in jail, the player will not be able to play 3 rounds<br><br>"
                + "----- The alternative to skipping 3 rounds is to pay a $50 fine<br><br> "
                + "- Utilities (Water Works and Electricity)<br><br> "
                + "----- The rent fee is 4 times the number on the dice if 1 utility is owned<br><br> "
                + "----- The rent fee is 10 time the number of the dice if both are owned<br><br> </html>");
        next2.setVisible(false);
        mm.setVisible(true);
    }//GEN-LAST:event_next2ActionPerformed

    private void mmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmActionPerformed
        // TODO add your handling code here:
        Mainmenu m = new Mainmenu(); 
        this.dispose();
        m.setVisible(true);
    }//GEN-LAST:event_mmActionPerformed

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
            java.util.logging.Logger.getLogger(Rules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rules().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel details;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton mm;
    private javax.swing.JButton next;
    private javax.swing.JButton next2;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}