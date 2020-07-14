
package KontRolPackage;

import static KontRolPackage.TWEET_STATPARDEFAUT.a;
import static KontRolPackage.TWEET_STATPARDEFAUT.j;
import static KontRolPackage.TWEET_STATPARDEFAUT.m;
import static KontRolPackage.TWEET_STATPARDEFAUT.soustitre;



public class TWEETS_CONFIG_STAT extends javax.swing.JFrame {

public static boolean optionTweetsParDef =false;
public static boolean optionTweetsPerso =false;
    public TWEETS_CONFIG_STAT() {
        
        initComponents();
        if(optionTweetsPerso)
            checkboxPersonnalise.setSelected(optionTweetsPerso);
        else 
        
                checkboxParDefaut.setSelected(optionTweetsParDef);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        checkboxPersonnalise = new javax.swing.JCheckBox();
        checkboxParDefaut = new javax.swing.JCheckBox();
        btnSauvegarder_ = new javax.swing.JButton();
        btnExit1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(49, 6, 25));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Configuration statistiques");

        jTextPane1.setBackground(new java.awt.Color(49, 6, 25));
        jTextPane1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane1.setText("Vous pouvez choisir le mode d'affichage qui vous convient, soit vous séléctionner le mode 'Par défaut' pour voir les statistiques des 7 dérniers jours, 7 dérniers mois et 7 dérnières années, ou bien vous séléctionnez le mode 'Personnalisé' pour donner vous même la période que vous souhaitez (période limité).");
        jScrollPane1.setViewportView(jTextPane1);

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("Mode : ");

        checkboxPersonnalise.setBackground(new java.awt.Color(49, 6, 25));
        checkboxPersonnalise.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        checkboxPersonnalise.setForeground(new java.awt.Color(255, 255, 255));
        checkboxPersonnalise.setText("  Personnalisé");
        checkboxPersonnalise.setToolTipText("Accéder à");
        checkboxPersonnalise.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkboxPersonnalise.setFocusPainted(false);
        checkboxPersonnalise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxPersonnaliseActionPerformed(evt);
            }
        });

        checkboxParDefaut.setBackground(new java.awt.Color(49, 6, 25));
        checkboxParDefaut.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        checkboxParDefaut.setForeground(new java.awt.Color(255, 255, 255));
        checkboxParDefaut.setText("  Par défaut");
        checkboxParDefaut.setToolTipText("Accéder aux statistiques pré-définient par les développeurs.");
        checkboxParDefaut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkboxParDefaut.setFocusPainted(false);
        checkboxParDefaut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxParDefautActionPerformed(evt);
            }
        });

        btnSauvegarder_.setBackground(new java.awt.Color(49, 6, 25));
        btnSauvegarder_.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btnSauvegarder_.setForeground(new java.awt.Color(255, 255, 255));
        btnSauvegarder_.setText("Terminé");
        btnSauvegarder_.setToolTipText("Sauvegarder les changements et sortir");
        btnSauvegarder_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnSauvegarder_.setContentAreaFilled(false);
        btnSauvegarder_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSauvegarder_.setFocusPainted(false);
        btnSauvegarder_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSauvegarder_ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addComponent(btnExit1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkboxParDefaut, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkboxPersonnalise, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btnSauvegarder_, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnExit1)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(checkboxParDefaut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkboxPersonnalise)
                .addGap(18, 18, 18)
                .addComponent(btnSauvegarder_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkboxParDefautActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxParDefautActionPerformed

        if(checkboxParDefaut.isSelected())
        checkboxPersonnalise.setSelected(false);

    }//GEN-LAST:event_checkboxParDefautActionPerformed

    private void checkboxPersonnaliseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxPersonnaliseActionPerformed

        if(checkboxPersonnalise.isSelected())
        checkboxParDefaut.setSelected(false);
    }//GEN-LAST:event_checkboxPersonnaliseActionPerformed

    private void btnSauvegarder_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSauvegarder_ActionPerformed

       
            if(checkboxPersonnalise.isSelected())
            {
               soustitre.setText("Période personnalisée");
                optionTweetsPerso=true;
                optionTweetsParDef=false;
                TWEETS_CONFIG_STAT_PERS tp = new TWEETS_CONFIG_STAT_PERS();
                tp.setVisible(true);
                tp.setLocationRelativeTo(null);
               
            }
            else
            {
                optionTweetsParDef=true;
                optionTweetsPerso=false;

                soustitre.setText("Période par défaut");
                j.setText("Nombre de tweets ces 7 derniers jours.");
                m.setText("Nombre de tweets ces 7 derniers mois.");
                a.setText("Nombre de tweets ces 7 dernières années.");

                TWEET_STATPARDEFAUT.moisT=7;
                TWEET_STATPARDEFAUT.jourT=7;
                TWEET_STATPARDEFAUT.anneeT=7;

                Tweet_mois_mois.nb=7;
                Tweet_mois_sem.nb=7;

                Tweet_annee_annee.nb=7;
                Tweet_annee_mois.nb=7;

                Tweets_Jour.nb=7;
                
            }
        this.hide();
    }//GEN-LAST:event_btnSauvegarder_ActionPerformed

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed
        this.hide();
    }//GEN-LAST:event_btnExit1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit1;
    private javax.swing.JButton btnSauvegarder_;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox checkboxParDefaut;
    private javax.swing.JCheckBox checkboxPersonnalise;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
