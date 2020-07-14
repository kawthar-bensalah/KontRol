
package KontRolPackage;

import static KontRolPackage.DASHBOARD.Police_Blanc;
import static KontRolPackage.DASHBOARD.Police_Bleu;
import static KontRolPackage.INSCRIPTION.bordureBlanche;
import static KontRolPackage.INSCRIPTION.bordureBleue;
import static KontRolPackage.RETWEETS_STATPARDEFAUT.a;
import static KontRolPackage.RETWEETS_STATPARDEFAUT.soustitre;
import static KontRolPackage.RETWEETS_STATPARDEFAUT.j;
import static KontRolPackage.RETWEETS_STATPARDEFAUT.m;

public class RETWEETS_CONFIG_STAT extends javax.swing.JFrame {

public static boolean optionRetweetsParDef =false; 
public static boolean optionRetweetsPerso =false;

    public RETWEETS_CONFIG_STAT() {
        initComponents();
        
        if(optionRetweetsPerso)
                checkBoxPers.setSelected(optionRetweetsPerso);
        else
            checkBoxParDef.setSelected(optionRetweetsParDef);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        checkBoxPers = new javax.swing.JCheckBox();
        checkBoxParDef = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        btnExit1 = new javax.swing.JButton();
        btnSauvegarder_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(49, 6, 25));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jTextPane1.setBackground(new java.awt.Color(49, 6, 25));
        jTextPane1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane1.setText("Vous pouvez choisir le mode d'affichage qui vous convient, soit vous séléctionner le mode 'Par défaut pour voir les statistiques des 7 dérniers jours, 7 dérniers mois et 7 dérnières années, ou bien vous séléctionnez le mode 'Personnalisé' pour donner vous meme la période que vous souhaitez selon certaines réstrictions.");
        jScrollPane1.setViewportView(jTextPane1);

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("Mode : ");

        checkBoxPers.setBackground(new java.awt.Color(49, 6, 25));
        checkBoxPers.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        checkBoxPers.setForeground(new java.awt.Color(255, 255, 255));
        checkBoxPers.setText("  Personnalisé");
        checkBoxPers.setFocusPainted(false);
        checkBoxPers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxPersActionPerformed(evt);
            }
        });

        checkBoxParDef.setBackground(new java.awt.Color(49, 6, 25));
        checkBoxParDef.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        checkBoxParDef.setForeground(new java.awt.Color(255, 255, 255));
        checkBoxParDef.setText("  Par défaut");
        checkBoxParDef.setFocusPainted(false);
        checkBoxParDef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxParDefActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Configuration statistique");

        btnExit1.setBackground(new java.awt.Color(255, 255, 255));
        btnExit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Delete_22px.png"))); // NOI18N
        btnExit1.setToolTipText("Fermer la fenetre");
        btnExit1.setBorderPainted(false);
        btnExit1.setContentAreaFilled(false);
        btnExit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit1.setFocusPainted(false);
        btnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit1ActionPerformed(evt);
            }
        });

        btnSauvegarder_.setBackground(new java.awt.Color(49, 6, 25));
        btnSauvegarder_.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btnSauvegarder_.setForeground(new java.awt.Color(255, 255, 255));
        btnSauvegarder_.setText("Terminé");
        btnSauvegarder_.setToolTipText("Sauvegarder les changements et sortir");
        btnSauvegarder_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnSauvegarder_.setContentAreaFilled(false);
        btnSauvegarder_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSauvegarder_.setFocusPainted(false);
        btnSauvegarder_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSauvegarder_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSauvegarder_MouseExited(evt);
            }
        });
        btnSauvegarder_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSauvegarder_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(110, 110, 110))
                    .addComponent(btnExit1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkBoxParDef, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkBoxPers, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(btnSauvegarder_, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnExit1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkBoxParDef)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkBoxPers)
                .addGap(26, 26, 26)
                .addComponent(btnSauvegarder_, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkBoxPersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxPersActionPerformed

        if(checkBoxPers.isSelected())
        checkBoxParDef.setSelected(false);
    }//GEN-LAST:event_checkBoxPersActionPerformed

    private void checkBoxParDefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxParDefActionPerformed

        if(checkBoxParDef.isSelected())
        checkBoxPers.setSelected(false);
    }//GEN-LAST:event_checkBoxParDefActionPerformed

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed
        this.hide();
    }//GEN-LAST:event_btnExit1ActionPerformed

    private void btnSauvegarder_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSauvegarder_MouseEntered
        bordureBleue(btnSauvegarder_);
        Police_Bleu(btnSauvegarder_);
    }//GEN-LAST:event_btnSauvegarder_MouseEntered

    private void btnSauvegarder_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSauvegarder_MouseExited
        bordureBlanche(btnSauvegarder_);
        Police_Blanc(btnSauvegarder_);
    }//GEN-LAST:event_btnSauvegarder_MouseExited

    private void btnSauvegarder_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSauvegarder_ActionPerformed
        if(checkBoxPers.isSelected())
            {
               soustitre.setText("Période personnalisée");
                optionRetweetsPerso=true;
                optionRetweetsParDef=false;
                RETWEETS_CONFIG_STAT_PERS tp = new RETWEETS_CONFIG_STAT_PERS();
                tp.setVisible(true);
                tp.setLocationRelativeTo(null);
               
            }
            else
            {
                optionRetweetsParDef=true;
                optionRetweetsPerso=false;

                soustitre.setText("Période par défaut");
                j.setText("Nombre de retweets ces 7 derniers jours.");
                m.setText("Nombre de retweets ces 7 derniers mois.");
                a.setText("Nombre de retweets ces 7 dernières années.");

                RETWEETS_STATPARDEFAUT.moisR=7;
                RETWEETS_STATPARDEFAUT.jourR=7;
                RETWEETS_STATPARDEFAUT.anneeR=7;

                Retweet_mois_mois.nb=7;
                Retweets_Mois.nb=7;

                Retweet_annee_annee.nb=7;
                Retweets_Annees.nb=7;

                Retweets_Jours.nb=7;
                
            }
        this.hide();
    }//GEN-LAST:event_btnSauvegarder_ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit1;
    private javax.swing.JButton btnSauvegarder_;
    private javax.swing.JCheckBox checkBoxParDef;
    private javax.swing.JCheckBox checkBoxPers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
