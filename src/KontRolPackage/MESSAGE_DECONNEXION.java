
package KontRolPackage;


public class MESSAGE_DECONNEXION extends javax.swing.JFrame {

    public MESSAGE_DECONNEXION() {
        
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnDeconnexionNon_ = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnDeconnexionOui_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(49, 6, 25));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Déconnexion");

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("  Êtes-vous sur de vouloir vous  déconnecter ?");

        btnDeconnexionNon_.setBackground(new java.awt.Color(49, 6, 25));
        btnDeconnexionNon_.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        btnDeconnexionNon_.setForeground(new java.awt.Color(255, 255, 255));
        btnDeconnexionNon_.setText("Non");
        btnDeconnexionNon_.setToolTipText("");
        btnDeconnexionNon_.setBorder(null);
        btnDeconnexionNon_.setContentAreaFilled(false);
        btnDeconnexionNon_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeconnexionNon_.setFocusPainted(false);
        btnDeconnexionNon_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeconnexionNon_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeconnexionNon_MouseExited(evt);
            }
        });
        btnDeconnexionNon_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeconnexionNon_ActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        btnDeconnexionOui_.setBackground(new java.awt.Color(49, 6, 25));
        btnDeconnexionOui_.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        btnDeconnexionOui_.setForeground(new java.awt.Color(0, 204, 51));
        btnDeconnexionOui_.setText("Oui");
        btnDeconnexionOui_.setToolTipText("");
        btnDeconnexionOui_.setBorder(null);
        btnDeconnexionOui_.setContentAreaFilled(false);
        btnDeconnexionOui_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeconnexionOui_.setFocusPainted(false);
        btnDeconnexionOui_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeconnexionOui_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeconnexionOui_MouseExited(evt);
            }
        });
        btnDeconnexionOui_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeconnexionOui_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeconnexionOui_, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeconnexionNon_, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeconnexionNon_, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeconnexionOui_, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnDeconnexionNon_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeconnexionNon_ActionPerformed
       
        this.hide();
    }//GEN-LAST:event_btnDeconnexionNon_ActionPerformed

    private void btnDeconnexionOui_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeconnexionOui_ActionPerformed
        LOGIN l = new LOGIN();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
        this.hide();
    }//GEN-LAST:event_btnDeconnexionOui_ActionPerformed

    private void btnDeconnexionOui_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeconnexionOui_MouseEntered
       btnDeconnexionOui_.setFont(new java.awt.Font("Segoe UI Light", 1, 17)); 

    }//GEN-LAST:event_btnDeconnexionOui_MouseEntered

    private void btnDeconnexionOui_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeconnexionOui_MouseExited
       btnDeconnexionOui_.setFont(new java.awt.Font("Segoe UI Light", 0, 16));
    }//GEN-LAST:event_btnDeconnexionOui_MouseExited

    private void btnDeconnexionNon_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeconnexionNon_MouseEntered
     btnDeconnexionNon_.setFont(new java.awt.Font("Segoe UI Light", 1, 17));
    }//GEN-LAST:event_btnDeconnexionNon_MouseEntered

    private void btnDeconnexionNon_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeconnexionNon_MouseExited
        btnDeconnexionNon_.setFont(new java.awt.Font("Segoe UI Light", 0, 16));
    }//GEN-LAST:event_btnDeconnexionNon_MouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeconnexionNon_;
    private javax.swing.JButton btnDeconnexionOui_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
