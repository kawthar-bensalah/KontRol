
package KontRolPackage;

import static KontRolPackage.DASHBOARD.Police_Gras;
import static KontRolPackage.DASHBOARD.Police_Normal;


public class ERREUR_LOGIN_CIBLE extends javax.swing.JFrame {

    public ERREUR_LOGIN_CIBLE() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelLogin = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cibleLogin = new javax.swing.JLabel();
        btnOKProfilNonValide_ = new javax.swing.JButton();
        btnExit2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(49, 6, 25));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        labelLogin.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(0, 153, 255));
        labelLogin.setText("Erreur");

        jSeparator1.setForeground(new java.awt.Color(51, 0, 0));

        cibleLogin.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        cibleLogin.setForeground(new java.awt.Color(255, 255, 255));
        cibleLogin.setText("La cible n'existe pas ! ");

        btnOKProfilNonValide_.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnOKProfilNonValide_.setForeground(new java.awt.Color(0, 153, 255));
        btnOKProfilNonValide_.setText("OK");
        btnOKProfilNonValide_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        btnOKProfilNonValide_.setContentAreaFilled(false);
        btnOKProfilNonValide_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOKProfilNonValide_.setFocusPainted(false);
        btnOKProfilNonValide_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOKProfilNonValide_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOKProfilNonValide_MouseExited(evt);
            }
        });
        btnOKProfilNonValide_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKProfilNonValide_ActionPerformed(evt);
            }
        });

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

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cliquez sur 'OK' puis réessayez.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(29, 29, 29)
                        .addComponent(btnExit2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cibleLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOKProfilNonValide_, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cibleLogin)
                .addGap(5, 5, 5)
                .addComponent(jLabel3)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnOKProfilNonValide_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKProfilNonValide_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOKProfilNonValide_MouseEntered
        btnOKProfilNonValide_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 2, true));
        Police_Gras(btnOKProfilNonValide_);
    }//GEN-LAST:event_btnOKProfilNonValide_MouseEntered

    private void btnOKProfilNonValide_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOKProfilNonValide_MouseExited
        btnOKProfilNonValide_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        Police_Normal(btnOKProfilNonValide_);
    }//GEN-LAST:event_btnOKProfilNonValide_MouseExited

    private void btnOKProfilNonValide_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKProfilNonValide_ActionPerformed
        
        this.hide();
    }//GEN-LAST:event_btnOKProfilNonValide_ActionPerformed

    private void btnExit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit2ActionPerformed
        this.hide();
    }//GEN-LAST:event_btnExit2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit2;
    private javax.swing.JButton btnOKProfilNonValide_;
    public static javax.swing.JLabel cibleLogin;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JLabel labelLogin;
    // End of variables declaration//GEN-END:variables
}
