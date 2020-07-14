
package KontRolPackage;

import static KontRolPackage.DASHBOARD.Police_Blanc;
import static KontRolPackage.DASHBOARD.Police_Bleu;
import static KontRolPackage.INSCRIPTION.bordureBlanche;
import static KontRolPackage.INSCRIPTION.bordureBleue;
import static KontRolPackage.TWEET_STATPARDEFAUT.a;
import static KontRolPackage.TWEET_STATPARDEFAUT.j;
import static KontRolPackage.TWEET_STATPARDEFAUT.m;
import static KontRolPackage.TWEET_STATPARDEFAUT.soustitre;
import javax.swing.event.ChangeEvent;

public class TWEETS_CONFIG_STAT_PERS extends javax.swing.JFrame {

    public static int NbrJourT=7,NbrMoisT=7,NbrAnneesT=7;
    
    public TWEETS_CONFIG_STAT_PERS() {
        initComponents();
        sliderJours.setValue(NbrJourT);
        sliderMois.setValue(NbrMoisT);
        sliderAnnees.setValue(NbrAnneesT);
        
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
        btnFermer_2 = new javax.swing.JButton();
        btnSauvegarder_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

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
                changementEtatSliderJours(evt);
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
        nbrJours.setText("Jours");
        nbrJours.setToolTipText("");

        nbrMois.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nbrMois.setForeground(new java.awt.Color(255, 255, 255));
        nbrMois.setText("Mois");

        nbrAnnees.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nbrAnnees.setForeground(new java.awt.Color(255, 255, 255));
        nbrAnnees.setText("Années");

        sliderAnnees.setBackground(new java.awt.Color(49, 6, 25));
        sliderAnnees.setForeground(new java.awt.Color(204, 204, 204));
        sliderAnnees.setMajorTickSpacing(1);
        sliderAnnees.setMaximum(10);
        sliderAnnees.setMinimum(1);
        sliderAnnees.setPaintTicks(true);
        sliderAnnees.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                changementEtatSliderAnnees(evt);
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
                changementEtatSliderMois(evt);
            }
        });

        btnFermer_2.setBackground(new java.awt.Color(255, 255, 255));
        btnFermer_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Icones/Delete_22px.png"))); // NOI18N
        btnFermer_2.setToolTipText("Fermer la fenetre");
        btnFermer_2.setBorderPainted(false);
        btnFermer_2.setContentAreaFilled(false);
        btnFermer_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFermer_2.setFocusPainted(false);
        btnFermer_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFermer_2btnFermer_ActionPerformed(evt);
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
                .addComponent(btnFermer_2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nbrAnnees, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sliderMois, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                .addComponent(sliderJours, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nbrJours, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nbrMois, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sliderAnnees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btnSauvegarder_, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnFermer_2)
                .addGap(16, 16, 16)
                .addComponent(jLabel10)
                .addGap(25, 25, 25)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnSauvegarder_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void stateChangedJours(ChangeEvent e) {
        
        NbrJourT = sliderJours.getValue();
        nbrJours.setText("Jour(s) = "+NbrJourT);
        
        
    }
    
    public void stateChangedMois(ChangeEvent e) {
        
        NbrMoisT = sliderMois.getValue();
        nbrMois.setText("Mois = "+NbrMoisT);
        
        
    }
    
    public void stateChangedAnnees(ChangeEvent e) {
        
        NbrAnneesT = sliderAnnees.getValue();
        nbrAnnees.setText("Année(s) = "+NbrAnneesT);
     
    }
    
    private void changementEtatSliderJours(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_changementEtatSliderJours
        stateChangedJours(evt);
    }//GEN-LAST:event_changementEtatSliderJours

    private void changementEtatSliderMois(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_changementEtatSliderMois
        stateChangedMois(evt);
    }//GEN-LAST:event_changementEtatSliderMois

    private void changementEtatSliderAnnees(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_changementEtatSliderAnnees
       stateChangedAnnees(evt);
    }//GEN-LAST:event_changementEtatSliderAnnees

    private void btnFermer_2btnFermer_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFermer_2btnFermer_ActionPerformed
        this.hide();
    }//GEN-LAST:event_btnFermer_2btnFermer_ActionPerformed

    private void btnSauvegarder_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSauvegarder_ActionPerformed

        soustitre.setText("Période personnalisée");
            j.setText("Nombre de tweets ce(s) "+NbrJourT+ " dernier(s) jour(s).");
            m.setText("Nombre de tweets ce(s)  "+NbrMoisT+" dernier(s) mois.");
            a.setText("Nombre de tweets ce(s) "+NbrAnneesT+" dernière(s) année(s).");
            
            TWEET_STATPARDEFAUT.moisT=NbrMoisT;
            TWEET_STATPARDEFAUT.jourT=NbrJourT;
            TWEET_STATPARDEFAUT.anneeT=NbrAnneesT;
            
            Tweet_mois_mois.nb=NbrMoisT;
            Tweet_mois_sem.nb=NbrMoisT;
            
            Tweet_annee_annee.nb=NbrAnneesT;
            Tweet_annee_mois.nb=NbrAnneesT;
           
            Tweets_Jour.nb=NbrJourT;
            
          
        this.hide();
    }//GEN-LAST:event_btnSauvegarder_ActionPerformed

    private void btnSauvegarder_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSauvegarder_MouseEntered
      bordureBleue(btnSauvegarder_);
        Police_Bleu(btnSauvegarder_);
    }//GEN-LAST:event_btnSauvegarder_MouseEntered

    private void btnSauvegarder_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSauvegarder_MouseExited
        bordureBlanche(btnSauvegarder_);
        Police_Blanc(btnSauvegarder_);
    }//GEN-LAST:event_btnSauvegarder_MouseExited
 
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFermer_2;
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
