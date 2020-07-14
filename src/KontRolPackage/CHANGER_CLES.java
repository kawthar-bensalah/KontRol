
package KontRolPackage;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import static KontRolPackage.CLES_API.consumerK;
import static KontRolPackage.CLES_API.consumerS;
import static KontRolPackage.CLES_API.accessS;
import static KontRolPackage.CLES_API.accessT;
import static KontRolPackage.DASHBOARD.Police_Gras;
import static KontRolPackage.DASHBOARD.Police_Normal;
import static KontRolPackage.INSCRIPTION.session;
import static KontRolPackage.LOGIN.userTwitter;
import org.neo4j.driver.v1.StatementResult;

public class CHANGER_CLES extends javax.swing.JFrame {

    
    public CHANGER_CLES() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        texteconsumerk = new javax.swing.JTextField();
        texteconsumerS = new javax.swing.JTextField();
        texteaccesss = new javax.swing.JTextField();
        texteaccesst = new javax.swing.JTextField();
        btnSauvegarder_ = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        btnFermer_2 = new javax.swing.JButton();
        btnReesssayer_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(49, 6, 25));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Changer les clés API ");

        texteconsumerk.setBackground(new java.awt.Color(49, 6, 25));
        texteconsumerk.setFont(new java.awt.Font("Segoe UI Light", 1, 13)); // NOI18N
        texteconsumerk.setForeground(new java.awt.Color(255, 255, 255));
        texteconsumerk.setBorder(null);

        texteconsumerS.setBackground(new java.awt.Color(49, 6, 25));
        texteconsumerS.setFont(new java.awt.Font("Segoe UI Light", 1, 13)); // NOI18N
        texteconsumerS.setForeground(new java.awt.Color(255, 255, 255));
        texteconsumerS.setBorder(null);

        texteaccesss.setBackground(new java.awt.Color(49, 6, 25));
        texteaccesss.setFont(new java.awt.Font("Segoe UI Light", 1, 13)); // NOI18N
        texteaccesss.setForeground(new java.awt.Color(255, 255, 255));
        texteaccesss.setBorder(null);

        texteaccesst.setBackground(new java.awt.Color(49, 6, 25));
        texteaccesst.setFont(new java.awt.Font("Segoe UI Light", 1, 13)); // NOI18N
        texteaccesst.setForeground(new java.awt.Color(255, 255, 255));
        texteaccesst.setBorder(null);

        btnSauvegarder_.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnSauvegarder_.setForeground(new java.awt.Color(0, 153, 255));
        btnSauvegarder_.setText("Enregistrer");
        btnSauvegarder_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
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

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Consumer Key");

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Consumer Secret");

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Access Secret");

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Access Token");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Key 2_22px.png"))); // NOI18N

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Key 2_22px.png"))); // NOI18N

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Key 2_22px.png"))); // NOI18N

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Key 2_22px.png"))); // NOI18N

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

        btnReesssayer_.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnReesssayer_.setForeground(new java.awt.Color(0, 153, 255));
        btnReesssayer_.setText("Réessayer");
        btnReesssayer_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        btnReesssayer_.setContentAreaFilled(false);
        btnReesssayer_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReesssayer_.setFocusPainted(false);
        btnReesssayer_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReesssayer_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReesssayer_MouseExited(evt);
            }
        });
        btnReesssayer_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReesssayer_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFermer_2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(texteaccesss)
                            .addComponent(texteconsumerS)
                            .addComponent(texteaccesst)
                            .addComponent(texteconsumerk, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator4)
                            .addComponent(jSeparator5))
                        .addGap(29, 29, 29))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addComponent(btnReesssayer_, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(btnSauvegarder_, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addComponent(btnFermer_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(texteconsumerk))
                .addGap(2, 2, 2)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(texteconsumerS, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(2, 2, 2)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(texteaccesst, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(1, 1, 1)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(texteaccesss, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSauvegarder_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReesssayer_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSauvegarder_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSauvegarder_ActionPerformed

        try
        {
             Twitter twitter= INSCRIPTION.ConnexionAPI(texteconsumerk.getText(),texteconsumerS.getText(),texteaccesst.getText(),texteaccesss.getText());
             twitter.getOAuthRequestToken();
            //si l'identifiant du profil ayant les clés précédentes existe alors on sauvegarde les clés
            
                //on remplace ls anciennes cles par les nouvelles
                consumerK = texteconsumerk.getText();
                consumerS = texteconsumerS.getText();
                accessT= texteaccesst.getText();
                accessS=texteaccesss.getText();
                
                // on supprime les anciennes cles de la base de données
                StatementResult requete_suppressionCles = session.run("match (u:USER{username:'"+userTwitter+"'}) "
                        + "remove u.consumerK,u.consumerSecret,u.accessToken,u.accessSecret "
                        + "return u.username as utilisateur");
                
                //on insere les nouvelles cles
                StatementResult requete_ajoutCles = session.run("match (u:USER{username:'"+userTwitter+"'}) "
                        + "set u.consumerK:'"+consumerK+"',u.consumerSecret:'"+consumerS+"',u.accessToken:'"+accessT+"',u.accessSecret:'"+accessS+"' "
                        + "return u.username as utilisateur");
                
                //requetes reussites
                if(requete_suppressionCles.hasNext() && requete_ajoutCles.hasNext())
                {
                    MESSAGE_ChangmntClesReussi msg = new MESSAGE_ChangmntClesReussi();
                    msg.setVisible(true);
                    msg.setLocationRelativeTo(null);
                    this.hide(); 
                }
                else 
                {
                    MESSAGE_ChangmntClesEchoue msg = new MESSAGE_ChangmntClesEchoue();
                    msg.setVisible(true);
                    msg.setLocationRelativeTo(null);
                }
                
        }
        catch(TwitterException e)
        {
                ERREUR_CLESAPI_ClesInvalides erreur = new ERREUR_CLESAPI_ClesInvalides();
                erreur.setVisible(true);
                erreur.setLocationRelativeTo(null);
                
        }
        
    }//GEN-LAST:event_btnSauvegarder_ActionPerformed

    private void btnFermer_2btnFermer_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFermer_2btnFermer_ActionPerformed
       this.hide();
    }//GEN-LAST:event_btnFermer_2btnFermer_ActionPerformed

    private void btnReesssayer_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReesssayer_ActionPerformed
        texteaccesss.setText(null);
        texteaccesst.setText(null);
        texteconsumerS.setText(null);
        texteconsumerk.setText(null);
                
    }//GEN-LAST:event_btnReesssayer_ActionPerformed

    private void btnReesssayer_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReesssayer_MouseEntered
          
         btnReesssayer_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 2, true));
         Police_Gras(btnReesssayer_);
    }//GEN-LAST:event_btnReesssayer_MouseEntered

    private void btnReesssayer_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReesssayer_MouseExited
       
        btnReesssayer_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        Police_Normal(btnReesssayer_);
    }//GEN-LAST:event_btnReesssayer_MouseExited

    private void btnSauvegarder_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSauvegarder_MouseEntered
    
        btnSauvegarder_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 2, true));
        Police_Gras(btnSauvegarder_);
    }//GEN-LAST:event_btnSauvegarder_MouseEntered

    private void btnSauvegarder_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSauvegarder_MouseExited
       
        btnSauvegarder_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        Police_Normal(btnSauvegarder_);
    }//GEN-LAST:event_btnSauvegarder_MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFermer_2;
    private javax.swing.JButton btnReesssayer_;
    private javax.swing.JButton btnSauvegarder_;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    public static javax.swing.JTextField texteaccesss;
    public static javax.swing.JTextField texteaccesst;
    public static javax.swing.JTextField texteconsumerS;
    public static javax.swing.JTextField texteconsumerk;
    // End of variables declaration//GEN-END:variables
}
