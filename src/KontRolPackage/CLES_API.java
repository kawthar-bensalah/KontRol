package KontRolPackage;

import static KontRolPackage.DASHBOARD.Police_Bleu;
import static KontRolPackage.INSCRIPTION.bordureBlanche;
import static KontRolPackage.INSCRIPTION.bordureBleue;
import twitter4j.Twitter;
import twitter4j.TwitterException;

public class CLES_API extends javax.swing.JFrame {

   public static String consumerK ,consumerS,accessT,accessS;
             
   public CLES_API() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        consumerKey = new javax.swing.JTextField();
        consumerSecret = new javax.swing.JTextField();
        accessSecret = new javax.swing.JTextField();
        accessToken = new javax.swing.JTextField();
        btnAnnulerCles_ = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnSuivantCles_ = new javax.swing.JButton();
        btnReessayerCles_ = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        btnAideCles_ = new javax.swing.JButton();

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Key 2_30px.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 6, 25), 2));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(49, 6, 25));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Insertion des clés Twitter API");

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(49, 6, 25));
        jLabel2.setText("Consumer Key");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(49, 6, 25));
        jLabel3.setText("Consumer Secret");

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(49, 6, 25));
        jLabel4.setText("Access Token");

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(49, 6, 25));
        jLabel5.setText("Access Secret");

        consumerKey.setFont(new java.awt.Font("Segoe UI Light", 1, 13)); // NOI18N
        consumerKey.setForeground(new java.awt.Color(51, 51, 51));
        consumerKey.setBorder(null);

        consumerSecret.setFont(new java.awt.Font("Segoe UI Light", 1, 13)); // NOI18N
        consumerSecret.setForeground(new java.awt.Color(51, 51, 51));
        consumerSecret.setBorder(null);

        accessSecret.setFont(new java.awt.Font("Segoe UI Light", 1, 13)); // NOI18N
        accessSecret.setForeground(new java.awt.Color(51, 51, 51));
        accessSecret.setBorder(null);

        accessToken.setFont(new java.awt.Font("Segoe UI Light", 1, 13)); // NOI18N
        accessToken.setForeground(new java.awt.Color(51, 51, 51));
        accessToken.setBorder(null);

        btnAnnulerCles_.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        btnAnnulerCles_.setForeground(new java.awt.Color(0, 153, 255));
        btnAnnulerCles_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Back_40px.png"))); // NOI18N
        btnAnnulerCles_.setToolTipText("Retourner à l'étape précédente");
        btnAnnulerCles_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnAnnulerCles_.setContentAreaFilled(false);
        btnAnnulerCles_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnnulerCles_.setFocusPainted(false);
        btnAnnulerCles_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAnnulerCles_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAnnulerCles_MouseExited(evt);
            }
        });
        btnAnnulerCles_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnulerCles_ActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Key 2_22px.png"))); // NOI18N

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Key 2_22px.png"))); // NOI18N

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Key 2_22px.png"))); // NOI18N

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Key 2_22px.png"))); // NOI18N

        btnSuivantCles_.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        btnSuivantCles_.setForeground(new java.awt.Color(0, 153, 255));
        btnSuivantCles_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Forward_40px.png"))); // NOI18N
        btnSuivantCles_.setToolTipText("Passer à l'étape suivante");
        btnSuivantCles_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnSuivantCles_.setContentAreaFilled(false);
        btnSuivantCles_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSuivantCles_.setFocusPainted(false);
        btnSuivantCles_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSuivantCles_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSuivantCles_MouseExited(evt);
            }
        });
        btnSuivantCles_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuivantCles_ActionPerformed(evt);
            }
        });

        btnReessayerCles_.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        btnReessayerCles_.setForeground(new java.awt.Color(255, 255, 255));
        btnReessayerCles_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Replace_40px.png"))); // NOI18N
        btnReessayerCles_.setToolTipText("Vider tous les champs et réessayer");
        btnReessayerCles_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnReessayerCles_.setContentAreaFilled(false);
        btnReessayerCles_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReessayerCles_.setFocusPainted(false);
        btnReessayerCles_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReessayerCles_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReessayerCles_MouseExited(evt);
            }
        });
        btnReessayerCles_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReessayerCles_ActionPerformed(evt);
            }
        });

        btnAideCles_.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnAideCles_.setForeground(new java.awt.Color(51, 51, 51));
        btnAideCles_.setText("Clés API ? Aide.");
        btnAideCles_.setBorder(null);
        btnAideCles_.setContentAreaFilled(false);
        btnAideCles_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAideCles_.setFocusPainted(false);
        btnAideCles_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAideCles_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAideCles_MouseExited(evt);
            }
        });
        btnAideCles_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAideCles_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(accessToken)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2)
                                    .addComponent(consumerSecret))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator3)
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(consumerKey, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(accessSecret))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(btnAnnulerCles_)
                                .addGap(49, 49, 49)
                                .addComponent(btnReessayerCles_)
                                .addGap(45, 45, 45)
                                .addComponent(btnSuivantCles_))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(btnAideCles_, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consumerKey, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(consumerSecret))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(accessToken))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(accessSecret))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAnnulerCles_))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(btnSuivantCles_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnReessayerCles_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAideCles_)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnnulerCles_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnulerCles_ActionPerformed
   
        //vider tous les champs et retourner à l'ecran Login
        consumerKey.setText(null);
        consumerSecret.setText(null);
        accessToken.setText(null);
        accessSecret.setText(null);
        
        //retour a l ecran d inscription
        INSCRIPTION log = new INSCRIPTION();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
        this.hide();
        
    }//GEN-LAST:event_btnAnnulerCles_ActionPerformed

    private void btnSuivantCles_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuivantCles_ActionPerformed
       
        //recuperation des cles api 
         consumerK = consumerKey.getText();
         consumerS = consumerSecret.getText();
         accessT = accessToken.getText();
         accessS = accessSecret.getText();
        
        //verification des cles 
        Twitter twitter= INSCRIPTION.ConnexionAPI(consumerK,consumerS,accessT,accessS);
        String name=null;
        try 
        {
            //exemple de tentation de connexion 
            name = twitter.getScreenName();
            
            //introduction du nom de l'utilisateur
            USER_INFOS user = new USER_INFOS();
            user.setLocationRelativeTo(null);
            user.setVisible(true);
            this.hide();
        } 
        catch (TwitterException ex) 
        {
             //message d'erreur
             ERREUR_CLESAPI_ClesInvalides erreur = new ERREUR_CLESAPI_ClesInvalides();
             erreur.setLocationRelativeTo(null);
             erreur.setVisible(true);

        } 
    }//GEN-LAST:event_btnSuivantCles_ActionPerformed

    private void btnReessayerCles_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReessayerCles_ActionPerformed

       //vider tous les champs pour reessayer
        consumerKey.setText(null);
        consumerSecret.setText(null);
        accessToken.setText(null);
        accessSecret.setText(null);
    }//GEN-LAST:event_btnReessayerCles_ActionPerformed

    private void btnSuivantCles_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuivantCles_MouseEntered
        bordureBleue(btnSuivantCles_);
    }//GEN-LAST:event_btnSuivantCles_MouseEntered

    private void btnSuivantCles_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuivantCles_MouseExited
       bordureBlanche(btnSuivantCles_);
    }//GEN-LAST:event_btnSuivantCles_MouseExited

    private void btnReessayerCles_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReessayerCles_MouseEntered
        bordureBleue(btnReessayerCles_);
    }//GEN-LAST:event_btnReessayerCles_MouseEntered

    private void btnReessayerCles_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReessayerCles_MouseExited
        bordureBlanche(btnReessayerCles_);
    }//GEN-LAST:event_btnReessayerCles_MouseExited

    private void btnAnnulerCles_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnnulerCles_MouseEntered
        bordureBleue(btnAnnulerCles_);
    }//GEN-LAST:event_btnAnnulerCles_MouseEntered

    private void btnAnnulerCles_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnnulerCles_MouseExited
        bordureBlanche(btnAnnulerCles_);
    }//GEN-LAST:event_btnAnnulerCles_MouseExited

    private void btnAideCles_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAideCles_MouseEntered
        Police_Bleu(btnAideCles_);
    }//GEN-LAST:event_btnAideCles_MouseEntered

    private void btnAideCles_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAideCles_MouseExited
       btnAideCles_.setForeground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_btnAideCles_MouseExited

    private void btnAideCles_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAideCles_ActionPerformed
        
        //ecran d'aide pour la recuperation des cles api
        AIDE_CLESAPI a = new AIDE_CLESAPI();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAideCles_ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accessSecret;
    private javax.swing.JTextField accessToken;
    private javax.swing.JButton btnAideCles_;
    private javax.swing.JButton btnAnnulerCles_;
    private javax.swing.JButton btnReessayerCles_;
    private javax.swing.JButton btnSuivantCles_;
    private javax.swing.JTextField consumerKey;
    private javax.swing.JTextField consumerSecret;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
