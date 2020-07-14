
package KontRolPackage;

import static KontRolPackage.DASHBOARD.Police_Blanc;
import static KontRolPackage.DASHBOARD.Police_Bleu;
import static KontRolPackage.INSCRIPTION.bordureBlanche;
import static KontRolPackage.INSCRIPTION.bordureBleue;
import static KontRolPackage.RETWEETS_STATPARDEFAUT.a;
import static KontRolPackage.RETWEETS_STATPARDEFAUT.j;
import static KontRolPackage.RETWEETS_STATPARDEFAUT.m;
import static KontRolPackage.RETWEETS_STATPARDEFAUT.soustitre;
import javax.swing.event.ChangeEvent;

public class RETWEETS_CONFIG_STAT_PERS extends javax.swing.JFrame {

    public static int NbrJourRT=7,NbrMoisRT=7,NbrAnneesRT=7;
    
    public RETWEETS_CONFIG_STAT_PERS() {
        initComponents();
        sliderJours.setValue(NbrJourRT);
        sliderMois.setValue(NbrMoisRT);
        sliderAnnees.setValue(NbrAnneesRT);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sliderJours = new javax.swing.JSlider();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        nbrJours = new javax.swing.JLabel();
        nbrMois = new javax.swing.JLabel();
        nbrAnnees = new javax.swing.JLabel();
        sliderAnnees = new javax.swing.JSlider();
        sliderMois = new javax.swing.JSlider();
        btnSauvegarder_ = new javax.swing.JButton();
        btnExit1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(49, 6, 25));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        sliderJours.setBackground(new java.awt.Color(49, 6, 25));
        sliderJours.setForeground(new java.awt.Color(204, 204, 204));
        sliderJours.setMajorTickSpacing(1);
        sliderJours.setMaximum(30);
        sliderJours.setMinimum(1);
        sliderJours.setPaintTicks(true);
        sliderJours.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderJourschangementEtatSliderJours(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Période personnalisée");

        jTextPane1.setBackground(new java.awt.Color(49, 6, 25));
        jTextPane1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(204, 204, 204));
        jTextPane1.setText("Vous pouvez définir les paramètres que vous souhaitez,  par exemple : Jour = 2 vous montre les statistiques des deux dérniers jours (hier et aujourd'hui ) pareil pour les mois c'est à dire Mois = 4 vous montre les statistiques des 4 dérniers mois...\nVeuillez glissez le curseur bleu à droite ou à gauche pour définir la période.");
        jScrollPane1.setViewportView(jTextPane1);

        nbrJours.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nbrJours.setForeground(new java.awt.Color(255, 255, 255));
        nbrJours.setText("Jour(s) = 30");
        nbrJours.setToolTipText("");

        nbrMois.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nbrMois.setForeground(new java.awt.Color(255, 255, 255));
        nbrMois.setText("Mois = 20");

        nbrAnnees.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nbrAnnees.setForeground(new java.awt.Color(255, 255, 255));
        nbrAnnees.setText("Année(s) = 10");

        sliderAnnees.setBackground(new java.awt.Color(49, 6, 25));
        sliderAnnees.setForeground(new java.awt.Color(204, 204, 204));
        sliderAnnees.setMajorTickSpacing(1);
        sliderAnnees.setMaximum(10);
        sliderAnnees.setMinimum(1);
        sliderAnnees.setPaintTicks(true);
        sliderAnnees.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderAnneeschangementEtatSliderAnnees(evt);
            }
        });

        sliderMois.setBackground(new java.awt.Color(49, 6, 25));
        sliderMois.setForeground(new java.awt.Color(204, 204, 204));
        sliderMois.setMajorTickSpacing(1);
        sliderMois.setMaximum(20);
        sliderMois.setMinimum(1);
        sliderMois.setPaintTicks(true);
        sliderMois.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderMoischangementEtatSliderMois(evt);
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btnSauvegarder_, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nbrAnnees, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sliderMois, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                    .addComponent(sliderJours, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nbrJours, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nbrMois, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sliderAnnees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExit1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnExit1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nbrJours, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sliderJours, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nbrMois, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sliderMois, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nbrAnnees, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sliderAnnees, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnSauvegarder_, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sliderJourschangementEtatSliderJours(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderJourschangementEtatSliderJours
        stateChangedJours(evt);
    }//GEN-LAST:event_sliderJourschangementEtatSliderJours

    private void sliderAnneeschangementEtatSliderAnnees(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderAnneeschangementEtatSliderAnnees
        stateChangedAnnees(evt);
    }//GEN-LAST:event_sliderAnneeschangementEtatSliderAnnees

    private void sliderMoischangementEtatSliderMois(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderMoischangementEtatSliderMois
        stateChangedMois(evt);
    }//GEN-LAST:event_sliderMoischangementEtatSliderMois

    private void btnSauvegarder_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSauvegarder_MouseEntered
        bordureBleue(btnSauvegarder_);
        Police_Bleu(btnSauvegarder_);
    }//GEN-LAST:event_btnSauvegarder_MouseEntered

    private void btnSauvegarder_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSauvegarder_MouseExited
        bordureBlanche(btnSauvegarder_);
        Police_Blanc(btnSauvegarder_);
    }//GEN-LAST:event_btnSauvegarder_MouseExited

    private void btnSauvegarder_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSauvegarder_ActionPerformed
       
        soustitre.setText("Période personnalisée");
            j.setText("Nombre de retweets ce(s) "+NbrJourRT+ " dernier(s) jours.");
            m.setText("Nombre de retweets ce(s)  "+NbrMoisRT+" dernier(s) mois.");
            a.setText("Nombre de retweets ce(s) "+NbrAnneesRT+" dernière(s) année(s).");
            
            RETWEETS_STATPARDEFAUT.moisR=NbrMoisRT;
            RETWEETS_STATPARDEFAUT.jourR=NbrJourRT;
            RETWEETS_STATPARDEFAUT.anneeR=NbrAnneesRT;
            
            Retweet_mois_mois.nb=NbrMoisRT;
            Retweets_Mois.nb=NbrMoisRT;
            
            Retweet_annee_annee.nb=NbrAnneesRT;
            Retweets_Annees.nb=NbrAnneesRT;
           
            Retweets_Jours.nb=NbrJourRT;
            
          
        this.hide();
        
        
    }//GEN-LAST:event_btnSauvegarder_ActionPerformed

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed
        this.hide();
    }//GEN-LAST:event_btnExit1ActionPerformed

    public void stateChangedJours(ChangeEvent e) {
        
        NbrJourRT = sliderJours.getValue();
        nbrJours.setText("Jour(s) = "+NbrJourRT);
        
        
    }
    
    public void stateChangedMois(ChangeEvent e) {
        
        NbrMoisRT = sliderMois.getValue();
        nbrMois.setText("Mois = "+NbrMoisRT);
        
        
    }
    
    public void stateChangedAnnees(ChangeEvent e) {
        
        NbrAnneesRT = sliderAnnees.getValue();
        nbrAnnees.setText("Année(s) = "+NbrAnneesRT);
     
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit1;
    private javax.swing.JButton btnSauvegarder_;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel nbrAnnees;
    private javax.swing.JLabel nbrJours;
    private javax.swing.JLabel nbrMois;
    private javax.swing.JSlider sliderAnnees;
    private javax.swing.JSlider sliderJours;
    private javax.swing.JSlider sliderMois;
    // End of variables declaration//GEN-END:variables
}
