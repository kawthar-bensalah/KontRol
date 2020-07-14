
package KontRolPackage;

public class ABONNES_CONFIG extends javax.swing.JFrame {

    public static boolean ok=false;
    public static boolean pardef=false;
    
  public static int nombre ;
  
    public ABONNES_CONFIG() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        nbrAbonnes = new javax.swing.JTextField();
        btnExit_ = new javax.swing.JButton();
        btnOk_ = new javax.swing.JButton();
        btnParDef_ = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(49, 6, 25));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Configuration Abonnés");

        jLabel18.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Nombre d'abonnés à extraire :");

        nbrAbonnes.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        nbrAbonnes.setForeground(new java.awt.Color(102, 102, 102));
        nbrAbonnes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nbrAbonnes.setToolTipText("Nombre des derniers abonnés à extraire ( Exemple : 10 --> Afficher les 10 déniers abonnés.)");

        btnExit_.setBackground(new java.awt.Color(255, 255, 255));
        btnExit_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Icones/Delete_22px.png"))); // NOI18N
        btnExit_.setToolTipText("Minimiser la fenetre");
        btnExit_.setBorderPainted(false);
        btnExit_.setContentAreaFilled(false);
        btnExit_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit_.setFocusPainted(false);
        btnExit_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit_ActionPerformed(evt);
            }
        });

        btnOk_.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnOk_.setForeground(new java.awt.Color(0, 153, 255));
        btnOk_.setText("OK");
        btnOk_.setToolTipText("");
        btnOk_.setBorder(null);
        btnOk_.setContentAreaFilled(false);
        btnOk_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOk_.setFocusPainted(false);
        btnOk_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOk_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOk_MouseExited(evt);
            }
        });
        btnOk_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOk_ActionPerformed(evt);
            }
        });

        btnParDef_.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        btnParDef_.setForeground(new java.awt.Color(0, 153, 255));
        btnParDef_.setText("Par défaut");
        btnParDef_.setToolTipText("Afficher tous les abonnés.");
        btnParDef_.setBorder(null);
        btnParDef_.setContentAreaFilled(false);
        btnParDef_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnParDef_.setFocusPainted(false);
        btnParDef_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnParDef_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnParDef_MouseExited(evt);
            }
        });
        btnParDef_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParDef_ActionPerformed(evt);
            }
        });

        jTextArea1.setBackground(new java.awt.Color(49, 6, 25));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 153, 153));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(2);
        jTextArea1.setText("Remarque: cette modification s'applique aux trois options: la liste, la liste en commun et la recherche.");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExit_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nbrAbonnes, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnParDef_, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnOk_, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnExit_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nbrAbonnes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk_)
                    .addComponent(btnParDef_))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit_ActionPerformed
        this.hide();
    }//GEN-LAST:event_btnExit_ActionPerformed

    private void btnOk_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOk_MouseEntered
        DASHBOARD.Police_Gras(btnOk_);
    }//GEN-LAST:event_btnOk_MouseEntered

    private void btnOk_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOk_MouseExited
        DASHBOARD.Police_Normal(btnOk_);
    }//GEN-LAST:event_btnOk_MouseExited

    private void btnOk_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOk_ActionPerformed
        ok=true;
        nombre = Integer.valueOf(nbrAbonnes.getText());
        this.hide();
    }//GEN-LAST:event_btnOk_ActionPerformed

    private void btnParDef_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnParDef_MouseEntered
        DASHBOARD.Police_Gras(btnParDef_);
    }//GEN-LAST:event_btnParDef_MouseEntered

    private void btnParDef_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnParDef_MouseExited
        DASHBOARD.Police_Normal(btnParDef_);
    }//GEN-LAST:event_btnParDef_MouseExited

    private void btnParDef_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParDef_ActionPerformed

        pardef=true;
        nbrAbonnes.setText("");
        this.hide();
    }//GEN-LAST:event_btnParDef_ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit_;
    private javax.swing.JButton btnOk_;
    private javax.swing.JButton btnParDef_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    public static javax.swing.JTextField nbrAbonnes;
    // End of variables declaration//GEN-END:variables
}
