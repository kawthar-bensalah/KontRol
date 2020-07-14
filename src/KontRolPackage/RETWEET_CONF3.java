
package KontRolPackage;

import static KontRolPackage.DASHBOARD.Barre;
import static KontRolPackage.RETWEETS_CONFIG_STAT_PERS.NbrAnneesRT;
import static KontRolPackage.RETWEETS_CONFIG_STAT_PERS.NbrJourRT;
import static KontRolPackage.RETWEETS_CONFIG_STAT_PERS.NbrMoisRT;
import static KontRolPackage.RETWEETS_STATPARDEFAUT.a;
import static KontRolPackage.RETWEETS_STATPARDEFAUT.j;
import static KontRolPackage.RETWEETS_STATPARDEFAUT.m;
import static KontRolPackage.RETWEETS_STATPARDEFAUT.jourR;
import static KontRolPackage.RETWEETS_STATPARDEFAUT.moisR;
import static KontRolPackage.RETWEETS_STATPARDEFAUT.anneeR;
import java.util.logging.Level;
import java.util.logging.Logger;
import twitter4j.TwitterException;

public class RETWEET_CONF3 extends javax.swing.JFrame {

    public static boolean mois=false,annee=false;
    public RETWEET_CONF3() {
        initComponents();
        if(mois)
        {
            checkMois.setSelected(mois);
            
        }
        else
        {
            if(annee)
            {
                checkAnnee.setSelected(annee);
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
        checkAnnee = new javax.swing.JCheckBox();
        checkMois = new javax.swing.JCheckBox();
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

        checkAnnee.setBackground(new java.awt.Color(49, 6, 25));
        checkAnnee.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        checkAnnee.setForeground(new java.awt.Color(255, 255, 255));
        checkAnnee.setText("Année");
        checkAnnee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAnneeActionPerformed(evt);
            }
        });

        checkMois.setBackground(new java.awt.Color(49, 6, 25));
        checkMois.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        checkMois.setForeground(new java.awt.Color(255, 255, 255));
        checkMois.setText("Mois");
        checkMois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMoisActionPerformed(evt);
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
                        .addComponent(checkAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(checkMois, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(checkAnnee)
                    .addComponent(checkMois))
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

    private void checkAnneeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAnneeActionPerformed
        if(checkAnnee.isSelected())
        {

            checkMois.setSelected(false);
        }
    }//GEN-LAST:event_checkAnneeActionPerformed

    private void checkMoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMoisActionPerformed
        if(checkMois.isSelected())
        {

            checkAnnee.setSelected(false);
        }
    }//GEN-LAST:event_checkMoisActionPerformed

    private void btnSauvegarder_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSauvegarder_ActionPerformed
if(checkMois.isSelected())
        {
            mois=true;
            annee = false;
                 
        }
        else
        {
            if(checkAnnee.isSelected())
            {

                annee=true;
                mois= false;
              
            }

        }
        jourR=NbrJourRT;
        moisR=NbrMoisRT;
        anneeR=NbrAnneesRT;
        //modificztions de la page
                  j.setText("Nombre de retweets ce(s) "+jourR+ " dernier(s) jour(s).");
                  m.setText("Nombre de retweets ce(s)  "+moisR+" dernier(s) mois.");
                 a.setText("Nombre de retweets ce(s) "+anneeR+" dernière(s) année(s).");
        
        
           
               if(annee)
               {
             
                    try 
                    {
                         Retweet_annee_annee.nb=anneeR;
                         Retweet_annee_annee ex = new Retweet_annee_annee("Nombre de retweets ce(s) "+anneeR+" dernière(s) année(s)");
                         Barre(ex);
                    } 
                    catch (TwitterException ex1) 
                    {
                        Logger.getLogger(TWEETS_CONF3.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                
               }
               else
               {
                  
                    try 
                    {
                         Retweets_Annees.nb=anneeR;
                         Retweets_Annees ex = new Retweets_Annees("Nombre de retweets ce(s) "+anneeR+" dernière(s) année(s)");
                         Barre(ex);
                         
                    } 
                    catch (TwitterException ex1) 
                    {
                        Logger.getLogger(TWEETS_CONF3.class.getName()).log(Level.SEVERE, null, ex1);
                    }
               }
               
           
        this.hide();
    }//GEN-LAST:event_btnSauvegarder_ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit3;
    private javax.swing.JButton btnSauvegarder_;
    private javax.swing.JCheckBox checkAnnee;
    private javax.swing.JCheckBox checkMois;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JLabel lblCreationReuissite;
    // End of variables declaration//GEN-END:variables
}
