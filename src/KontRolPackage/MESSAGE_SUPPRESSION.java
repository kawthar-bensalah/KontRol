
package KontRolPackage;

import static KontRolPackage.LOGIN.userTwitter;

public class MESSAGE_SUPPRESSION extends javax.swing.JFrame {

    public static boolean supp=false;
    public MESSAGE_SUPPRESSION() {
        initComponents();
        lblCompteSupprime.setText("@"+userTwitter+" ?");
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSupprimerNon_ = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnSupprimerOui_ = new javax.swing.JButton();
        lblCompteSupprime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(49, 6, 25));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Suppression");

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("  Êtes-vous sur de vouloir supprimer le compte ");

        btnSupprimerNon_.setBackground(new java.awt.Color(49, 6, 25));
        btnSupprimerNon_.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        btnSupprimerNon_.setForeground(new java.awt.Color(255, 255, 255));
        btnSupprimerNon_.setText("Non");
        btnSupprimerNon_.setToolTipText("");
        btnSupprimerNon_.setBorder(null);
        btnSupprimerNon_.setContentAreaFilled(false);
        btnSupprimerNon_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSupprimerNon_.setFocusPainted(false);
        btnSupprimerNon_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSupprimerNon_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSupprimerNon_MouseExited(evt);
            }
        });
        btnSupprimerNon_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerNon_ActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        btnSupprimerOui_.setBackground(new java.awt.Color(49, 6, 25));
        btnSupprimerOui_.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        btnSupprimerOui_.setForeground(new java.awt.Color(0, 204, 51));
        btnSupprimerOui_.setText("Oui");
        btnSupprimerOui_.setToolTipText("");
        btnSupprimerOui_.setBorder(null);
        btnSupprimerOui_.setContentAreaFilled(false);
        btnSupprimerOui_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSupprimerOui_.setFocusPainted(false);
        btnSupprimerOui_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSupprimerOui_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSupprimerOui_MouseExited(evt);
            }
        });
        btnSupprimerOui_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerOui_ActionPerformed(evt);
            }
        });

        lblCompteSupprime.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lblCompteSupprime.setForeground(new java.awt.Color(255, 255, 255));
        lblCompteSupprime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCompteSupprime.setText("@raniaben ?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCompteSupprime, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSupprimerOui_, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSupprimerNon_, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCompteSupprime, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSupprimerOui_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSupprimerNon_, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSupprimerNon_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupprimerNon_MouseEntered
        btnSupprimerNon_.setFont(new java.awt.Font("Segoe UI Light", 1, 17));
    }//GEN-LAST:event_btnSupprimerNon_MouseEntered

    private void btnSupprimerNon_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupprimerNon_MouseExited
        btnSupprimerNon_.setFont(new java.awt.Font("Segoe UI Light", 0, 16));
    }//GEN-LAST:event_btnSupprimerNon_MouseExited

    private void btnSupprimerNon_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerNon_ActionPerformed
        supp=false;
        this.hide();
    }//GEN-LAST:event_btnSupprimerNon_ActionPerformed

    private void btnSupprimerOui_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupprimerOui_MouseEntered
        btnSupprimerOui_.setFont(new java.awt.Font("Segoe UI Light", 1, 17));
    }//GEN-LAST:event_btnSupprimerOui_MouseEntered

    private void btnSupprimerOui_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupprimerOui_MouseExited
        btnSupprimerOui_.setFont(new java.awt.Font("Segoe UI Light", 0, 16));
    }//GEN-LAST:event_btnSupprimerOui_MouseExited

    private void btnSupprimerOui_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerOui_ActionPerformed
        
        supp=true;
        this.hide();
    }//GEN-LAST:event_btnSupprimerOui_ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSupprimerNon_;
    private javax.swing.JButton btnSupprimerOui_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JLabel lblCompteSupprime;
    // End of variables declaration//GEN-END:variables
}
