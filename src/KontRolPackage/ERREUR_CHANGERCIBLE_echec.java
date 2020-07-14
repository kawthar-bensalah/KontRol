
package KontRolPackage;

import static KontRolPackage.DASHBOARD.Police_Gras;
import static KontRolPackage.DASHBOARD.Police_Normal;

public class ERREUR_CHANGERCIBLE_echec extends javax.swing.JFrame {

    public ERREUR_CHANGERCIBLE_echec() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblCreationReuissite = new javax.swing.JLabel();
        btnOkCibleChangee_ = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnExit2 = new javax.swing.JButton();
        lblCreationReuissite1 = new javax.swing.JLabel();
        lblCreationReuissite2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(49, 6, 25));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Erreur :");

        jSeparator1.setForeground(new java.awt.Color(51, 0, 0));

        lblCreationReuissite.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lblCreationReuissite.setForeground(new java.awt.Color(255, 255, 255));
        lblCreationReuissite.setText("Création du compte de la cible non effectuée.");

        btnOkCibleChangee_.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnOkCibleChangee_.setForeground(new java.awt.Color(0, 153, 255));
        btnOkCibleChangee_.setText("OK");
        btnOkCibleChangee_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        btnOkCibleChangee_.setContentAreaFilled(false);
        btnOkCibleChangee_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOkCibleChangee_.setFocusPainted(false);
        btnOkCibleChangee_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOkCibleChangee_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOkCibleChangee_MouseExited(evt);
            }
        });
        btnOkCibleChangee_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkCibleChangee_ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cliquez sur 'OK' puis réessayez.");

        btnExit2.setBackground(new java.awt.Color(255, 255, 255));
        btnExit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Delete_22px.png"))); // NOI18N
        btnExit2.setToolTipText("Fermer la fenetre");
        btnExit2.setBorderPainted(false);
        btnExit2.setContentAreaFilled(false);
        btnExit2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit2.setFocusPainted(false);
        btnExit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit2ActionPerformed(evt);
            }
        });

        lblCreationReuissite1.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        lblCreationReuissite1.setForeground(new java.awt.Color(255, 255, 255));

        lblCreationReuissite2.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lblCreationReuissite2.setForeground(new java.awt.Color(255, 255, 255));
        lblCreationReuissite2.setText("Création échouée");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCreationReuissite1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCreationReuissite2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCreationReuissite, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOkCibleChangee_, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCreationReuissite1)
                            .addComponent(lblCreationReuissite2)))
                    .addComponent(btnExit2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCreationReuissite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(btnOkCibleChangee_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkCibleChangee_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkCibleChangee_MouseEntered

        btnOkCibleChangee_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 2, true));
        Police_Gras(btnOkCibleChangee_);
    }//GEN-LAST:event_btnOkCibleChangee_MouseEntered

    private void btnOkCibleChangee_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkCibleChangee_MouseExited
        btnOkCibleChangee_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
         Police_Normal(btnOkCibleChangee_);
    }//GEN-LAST:event_btnOkCibleChangee_MouseExited

    private void btnOkCibleChangee_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkCibleChangee_ActionPerformed

        //apres la sauvegarde passer a l ecran login
        LOGIN login = new LOGIN();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.hide();
    }//GEN-LAST:event_btnOkCibleChangee_ActionPerformed

    private void btnExit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit2ActionPerformed
        this.hide();
    }//GEN-LAST:event_btnExit2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit2;
    private javax.swing.JButton btnOkCibleChangee_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JLabel lblCreationReuissite;
    public static javax.swing.JLabel lblCreationReuissite1;
    public static javax.swing.JLabel lblCreationReuissite2;
    // End of variables declaration//GEN-END:variables
}
