
package KontRolPackage;

import static KontRolPackage.DASHBOARD.Barre;
import static KontRolPackage.HASHTAGS_CONFIG_STAT_PERS.NbrJourH;
import static KontRolPackage.HASHTAGS_CONFIG_STAT_PERS.NbrMoisH;
import static KontRolPackage.HASHTAGS_CONFIG_STAT_PERS.NbrAnneeH;
import static KontRolPackage.HASHTAGS_STATPARDEFAUT.lblAnnee;
import static KontRolPackage.HASHTAGS_STATPARDEFAUT.lblJour;
import static KontRolPackage.HASHTAGS_STATPARDEFAUT.lblMois;
import static KontRolPackage.HASHTAGS_STATPARDEFAUT.moisH;
import static KontRolPackage.HASHTAGS_STATPARDEFAUT.soustitre;

public class HASHTAG_CONF2 extends javax.swing.JFrame {

    public static boolean mois=false;
    public static boolean semaine = false;
    
    public HASHTAG_CONF2() {
        initComponents();
        if(mois)
        {
            checkMois.setSelected(mois);
            
        }
        else
        {
            if(semaine)
            {
                checkSem.setSelected(semaine);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnExit3 = new javax.swing.JButton();
        lblCreationReuissite = new javax.swing.JLabel();
        checkMois = new javax.swing.JCheckBox();
        checkSem = new javax.swing.JCheckBox();
        btnSauvegarder_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(49, 6, 25));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Configuration statistique (détails)");

        btnExit3.setBackground(new java.awt.Color(255, 255, 255));
        btnExit3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Delete_22px.png"))); // NOI18N
        btnExit3.setToolTipText("Fermer la fenetre");
        btnExit3.setBorderPainted(false);
        btnExit3.setContentAreaFilled(false);
        btnExit3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit3.setFocusPainted(false);
        btnExit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit3ActionPerformed(evt);
            }
        });

        lblCreationReuissite.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        lblCreationReuissite.setForeground(new java.awt.Color(255, 255, 255));
        lblCreationReuissite.setText("Voir le résultat par rapport aux : ");

        checkMois.setBackground(new java.awt.Color(49, 6, 25));
        checkMois.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        checkMois.setForeground(new java.awt.Color(255, 255, 255));
        checkMois.setText("Mois");
        checkMois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMoisActionPerformed(evt);
            }
        });

        checkSem.setBackground(new java.awt.Color(49, 6, 25));
        checkSem.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        checkSem.setForeground(new java.awt.Color(255, 255, 255));
        checkSem.setText("Semaines");
        checkSem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSemActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExit3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblCreationReuissite, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(checkMois, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(checkSem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(btnSauvegarder_, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnExit3)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblCreationReuissite)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkMois)
                    .addComponent(checkSem))
                .addGap(18, 18, 18)
                .addComponent(btnSauvegarder_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit3ActionPerformed
        this.hide();
    }//GEN-LAST:event_btnExit3ActionPerformed

    private void checkMoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMoisActionPerformed
        if(checkMois.isSelected())
        {

            checkSem.setSelected(false);
        }
    }//GEN-LAST:event_checkMoisActionPerformed

    private void checkSemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSemActionPerformed
        if(checkSem.isSelected())
        {

            checkMois.setSelected(false);
        }
    }//GEN-LAST:event_checkSemActionPerformed

    private void btnSauvegarder_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSauvegarder_ActionPerformed

        if(checkMois.isSelected())
        {
            mois=true;
            soustitre.setText("Personnalisé (En fonction des mois)");
                 //modificztions de la page
                  lblJour.setText("Nombre de hashtags que l'utilisateur a utilisé ce(s) "+NbrJourH+ " dernier(s) jours.");
                  lblMois.setText("Nombre de hashtags que l'utilisateur a utilisé ce(s)  "+NbrMoisH+" dernier(s) mois.");
                 lblAnnee.setText("Nombre de hashtags que l'utilisateur a utilisé ce(s) "+NbrAnneeH+" dernière(s) année(s).");
        
                this.hide();
        }
        else
        {
            if(checkSem.isSelected())
            {

                semaine=true;
                
                soustitre.setText("Personnalisé (En fonction des semaines)");
                 //modificztions de la page
                  lblJour.setText("Nombre de hashtags que l'utilisateur a utilisé ce(s) "+NbrJourH+ " dernier(s) jours.");
                  lblMois.setText("Nombre de hashtags que l'utilisateur a utilisé ce(s)  "+NbrMoisH+" dernier(s) mois.");
                 lblAnnee.setText("Nombre de hashtags que l'utilisateur a utilisé ce(s) "+NbrAnneeH+" dernière(s) année(s).");
        
                this.hide();

            }

        }
        
        if(semaine)
           { 
               moisH=HASHTAGS_CONFIG_STAT_PERS.NbrMoisH;
               Hashtag_Mois.nb=moisH;
            Hashtag_Mois ex = new Hashtag_Mois();
            Barre(ex);
           }
           else
           {
               if(mois)
               {
                moisH=HASHTAGS_CONFIG_STAT_PERS.NbrMoisH;
               Hashtag_mois_mois.nb=moisH;
                Hashtag_mois_mois ex = new Hashtag_mois_mois();
                Barre(ex);
                
               }
               else
               {
                   soustitre.setText("Par défaut");
                   Hashtag_Mois.nb=moisH;
                    Hashtag_Mois ex = new Hashtag_Mois();
                    Barre(ex);
               }
               
           }
        this.hide();
    }//GEN-LAST:event_btnSauvegarder_ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit3;
    private javax.swing.JButton btnSauvegarder_;
    private javax.swing.JCheckBox checkMois;
    private javax.swing.JCheckBox checkSem;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JLabel lblCreationReuissite;
    // End of variables declaration//GEN-END:variables
}
