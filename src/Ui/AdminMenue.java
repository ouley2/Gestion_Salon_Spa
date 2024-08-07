/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ui;

/**
 *
 * @author HP
 */
public class AdminMenue extends javax.swing.JFrame {

    /**
     * Creates new form AdminMenue
     */
    public AdminMenue() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        clientButton = new javax.swing.JButton();
        clientButton6 = new javax.swing.JButton();
        clientButton7 = new javax.swing.JButton();
        clientButton8 = new javax.swing.JButton();
        clientButton9 = new javax.swing.JButton();
        clientButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 255));

        jPanel2.setBackground(new java.awt.Color(255, 228, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 60, 50));
        jLabel1.setText("Bienvenue Cher Admin");

        clientButton.setBackground(new java.awt.Color(255, 204, 204));
        clientButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clientButton.setForeground(new java.awt.Color(105, 105, 100));
        clientButton.setText("Gestion Client");
        clientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientButtonActionPerformed(evt);
            }
        });

        clientButton6.setBackground(new java.awt.Color(230, 193, 202));
        clientButton6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clientButton6.setForeground(new java.awt.Color(105, 105, 100));
        clientButton6.setText("Gestion Estheticienne");
        clientButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientButton6ActionPerformed(evt);
            }
        });

        clientButton7.setBackground(new java.awt.Color(230, 193, 202));
        clientButton7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clientButton7.setForeground(new java.awt.Color(105, 105, 100));
        clientButton7.setText("Gestion Produit");
        clientButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientButton7ActionPerformed(evt);
            }
        });

        clientButton8.setBackground(new java.awt.Color(230, 193, 202));
        clientButton8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clientButton8.setForeground(new java.awt.Color(105, 105, 100));
        clientButton8.setText("Gestion Service");
        clientButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientButton8ActionPerformed(evt);
            }
        });

        clientButton9.setBackground(new java.awt.Color(230, 193, 202));
        clientButton9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clientButton9.setForeground(new java.awt.Color(105, 105, 100));
        clientButton9.setText("Gestion RendezVous");
        clientButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientButton9ActionPerformed(evt);
            }
        });

        clientButton10.setBackground(new java.awt.Color(255, 102, 102));
        clientButton10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clientButton10.setForeground(new java.awt.Color(105, 105, 100));
        clientButton10.setText("Deconnexion");
        clientButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(175, 175, 175))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(clientButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clientButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clientButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clientButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clientButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clientButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(249, 249, 249))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(clientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clientButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clientButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clientButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clientButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clientButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientButtonActionPerformed
        new ClientUI().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_clientButtonActionPerformed

    private void clientButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientButton6ActionPerformed
        new Estheticienne().setVisible(true);
        dispose();
    }//GEN-LAST:event_clientButton6ActionPerformed

    private void clientButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientButton7ActionPerformed
       new Produits().setVisible(true);
       dispose();
    }//GEN-LAST:event_clientButton7ActionPerformed

    private void clientButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientButton8ActionPerformed
        new services().setVisible(true);
        dispose();
    }//GEN-LAST:event_clientButton8ActionPerformed

    private void clientButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientButton9ActionPerformed
        new RendezVous().setVisible(true);
        dispose();
    }//GEN-LAST:event_clientButton9ActionPerformed

    private void clientButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientButton10ActionPerformed
        dispose();
    }//GEN-LAST:event_clientButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMenue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clientButton;
    private javax.swing.JButton clientButton10;
    private javax.swing.JButton clientButton6;
    private javax.swing.JButton clientButton7;
    private javax.swing.JButton clientButton8;
    private javax.swing.JButton clientButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
