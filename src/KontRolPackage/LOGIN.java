package KontRolPackage;

import static KontRolPackage.DASHBOARD.Police_Gras;
import static KontRolPackage.DASHBOARD.Police_Normal;
import static KontRolPackage.INSCRIPTION.ConnexionNeo4j;
import static KontRolPackage.TWEETS.Encadrer3Btns;
import static KontRolPackage.TWEETS.enlEncadrer3Btns;
import org.neo4j.driver.v1.Session;
import org.neo4j.driver.v1.StatementResult;

public class LOGIN extends javax.swing.JFrame {
     

    public static String pseudo,userTwitter,mdp;
            
    public LOGIN() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        PseudoTitre = new javax.swing.JLabel();
        userTexte = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        adresseEmailTitre = new javax.swing.JLabel();
        pseudoTexte = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        MdpTitre = new javax.swing.JLabel();
        mdpTexte = new javax.swing.JPasswordField();
        btnReessayer = new javax.swing.JButton();
        btnSuivantLogin_ = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        btncreerNouvCompte_ = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnAnnulerLogin_ = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(50, 50));
        setUndecorated(true);
        setResizable(false);

        panel.setBackground(new java.awt.Color(49, 6, 25));
        panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        PseudoTitre.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        PseudoTitre.setForeground(new java.awt.Color(255, 255, 255));
        PseudoTitre.setText("Pseudo");

        userTexte.setBackground(new java.awt.Color(49, 6, 25));
        userTexte.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        userTexte.setForeground(new java.awt.Color(0, 153, 255));
        userTexte.setToolTipText("Saisissez votre nom d'utilisateur Twitter (Celui que vous avez introduit lors de votre inscription dans l'application)");
        userTexte.setBorder(null);

        jSeparator1.setForeground(new java.awt.Color(51, 0, 0));

        adresseEmailTitre.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        adresseEmailTitre.setForeground(new java.awt.Color(255, 255, 255));
        adresseEmailTitre.setText("Nom d'utilisateur Twitter");

        pseudoTexte.setBackground(new java.awt.Color(49, 6, 25));
        pseudoTexte.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        pseudoTexte.setForeground(new java.awt.Color(0, 153, 255));
        pseudoTexte.setToolTipText("Saisissez votre pseudo ");
        pseudoTexte.setBorder(null);

        jSeparator2.setForeground(new java.awt.Color(51, 0, 0));

        MdpTitre.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        MdpTitre.setForeground(new java.awt.Color(255, 255, 255));
        MdpTitre.setText("Mot de passe ");

        mdpTexte.setBackground(new java.awt.Color(49, 6, 25));
        mdpTexte.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        mdpTexte.setForeground(new java.awt.Color(0, 153, 255));
        mdpTexte.setToolTipText("Saisissez votre mot de passe");
        mdpTexte.setBorder(null);
        mdpTexte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdpTexteActionPerformed(evt);
            }
        });

        btnReessayer.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        btnReessayer.setForeground(new java.awt.Color(255, 255, 255));
        btnReessayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Replace_40px.png"))); // NOI18N
        btnReessayer.setToolTipText("Vider tous les champs pour tenter un nouvel essaie");
        btnReessayer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 6, 25)));
        btnReessayer.setContentAreaFilled(false);
        btnReessayer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReessayer.setFocusPainted(false);
        btnReessayer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReessayerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReessayerMouseExited(evt);
            }
        });
        btnReessayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReessayerActionPerformed(evt);
            }
        });

        btnSuivantLogin_.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        btnSuivantLogin_.setForeground(new java.awt.Color(255, 255, 255));
        btnSuivantLogin_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Forward_40px.png"))); // NOI18N
        btnSuivantLogin_.setToolTipText("Continuer vers les services");
        btnSuivantLogin_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(49, 6, 25), 1, true));
        btnSuivantLogin_.setContentAreaFilled(false);
        btnSuivantLogin_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSuivantLogin_.setFocusPainted(false);
        btnSuivantLogin_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSuivantLogin_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSuivantLogin_MouseExited(evt);
            }
        });
        btnSuivantLogin_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuivantLogin_Login_ActionPerformed(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(51, 0, 0));

        btncreerNouvCompte_.setBackground(new java.awt.Color(49, 6, 25));
        btncreerNouvCompte_.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        btncreerNouvCompte_.setForeground(new java.awt.Color(0, 153, 255));
        btncreerNouvCompte_.setText("Créer un nouveau compte ");
        btncreerNouvCompte_.setToolTipText("Inscription");
        btncreerNouvCompte_.setBorder(null);
        btncreerNouvCompte_.setBorderPainted(false);
        btncreerNouvCompte_.setContentAreaFilled(false);
        btncreerNouvCompte_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncreerNouvCompte_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btncreerNouvCompte_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btncreerNouvCompte_MouseExited(evt);
            }
        });
        btncreerNouvCompte_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreerNouvCompte__ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("Login");

        btnAnnulerLogin_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Back_40px.png"))); // NOI18N
        btnAnnulerLogin_.setToolTipText("Annuler le Login et retourner à l'étape précédente");
        btnAnnulerLogin_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(49, 6, 25), 1, true));
        btnAnnulerLogin_.setContentAreaFilled(false);
        btnAnnulerLogin_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnnulerLogin_.setFocusPainted(false);
        btnAnnulerLogin_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAnnulerLogin_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAnnulerLogin_MouseExited(evt);
            }
        });
        btnAnnulerLogin_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnulerLogin_ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Twitter_22px.png"))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Userwhite_22px.png"))); // NOI18N

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Lock white round_20px.png"))); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PseudoTitre)
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                        .addComponent(pseudoTexte, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(adresseEmailTitre)
                                    .addGap(106, 106, 106))
                                .addComponent(userTexte, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MdpTitre)
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(mdpTexte, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(9, 9, 9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnAnnulerLogin_)
                        .addGap(47, 47, 47)
                        .addComponent(btnReessayer, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnSuivantLogin_)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel3))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btncreerNouvCompte_, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addGap(36, 36, 36)
                .addComponent(PseudoTitre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(pseudoTexte, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 23, Short.MAX_VALUE)
                .addComponent(adresseEmailTitre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(userTexte, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(MdpTitre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addComponent(mdpTexte, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAnnulerLogin_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReessayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnSuivantLogin_))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btncreerNouvCompte_, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncreerNouvCompte__ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreerNouvCompte__ActionPerformed

        //acceder a l ecran INSCRIPTION pour creer un compte
        INSCRIPTION creerCompte = new INSCRIPTION();
        creerCompte.setVisible(true);
        creerCompte.setLocationRelativeTo(null);
        this.hide();
    }//GEN-LAST:event_btncreerNouvCompte__ActionPerformed

     //verifier le remplissage des champs 
    private boolean ChampsVidesLogin(String pseudo,String user,String mdp)
    {
        return(pseudo.isEmpty() || user.isEmpty() || mdp.isEmpty());
    }
    
    private void btnSuivantLogin_Login_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuivantLogin_Login_ActionPerformed

        //recuperer les informations 
        pseudo = pseudoTexte.getText();
        userTwitter = userTexte.getText();
        mdp = mdpTexte.getText();
        
        //établir une connexion avec la base de données
        Session session = ConnexionNeo4j ();

        //verifier les champs 
        boolean detecterChampsVides = ChampsVidesLogin(pseudo,userTwitter,mdp);
        if(detecterChampsVides)
        {
            //message d erreur
            ERREUR_STANDARD_ChampsVides erreur = new ERREUR_STANDARD_ChampsVides();
            erreur.setVisible(true);
            erreur.setLocationRelativeTo(null);
        }   
        else
        {
            // recherche du profil dans la base de donnée Neo4j
            StatementResult rechercheprofil = session.run("match (u:USER{username:'" + userTwitter + "'}) return u.username as UserName");

            // profil introuvable
            if (!rechercheprofil.hasNext()) 
            {
                ERREUR_STANDARD_ProfilInexistant erreur = new ERREUR_STANDARD_ProfilInexistant();
                erreur.setVisible(true);
                erreur.setLocationRelativeTo(null);
            } 
            
            //sinon : passer au choix de la cible
            else 
            {
                    LOGIN_CIBLE log = new LOGIN_CIBLE();
                    log.setVisible(true);
                    log.setLocationRelativeTo(null);
                    this.hide();
            }
        }
            

        
    }//GEN-LAST:event_btnSuivantLogin_Login_ActionPerformed

    private void btnReessayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReessayerActionPerformed

        //vider les champs pour ressayer 
        pseudoTexte.setText(null);
        userTexte.setText(null);
        mdpTexte.setText(null);
    }//GEN-LAST:event_btnReessayerActionPerformed

    private void btnAnnulerLogin_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnulerLogin_ActionPerformed
       
        //vider les champs 
        pseudoTexte.setText(null);
        userTexte.setText(null);
        mdpTexte.setText(null);
        
        //retour a l ecran inscription
        INSCRIPTION ins = new INSCRIPTION ();
        ins.setVisible(true);
        ins.setLocationRelativeTo(null);
        this.hide();
    }//GEN-LAST:event_btnAnnulerLogin_ActionPerformed

    private void btncreerNouvCompte_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncreerNouvCompte_MouseEntered

        Police_Gras(btncreerNouvCompte_);
    }//GEN-LAST:event_btncreerNouvCompte_MouseEntered

    private void btncreerNouvCompte_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncreerNouvCompte_MouseExited
        Police_Normal (btncreerNouvCompte_);
    }//GEN-LAST:event_btncreerNouvCompte_MouseExited

    private void btnSuivantLogin_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuivantLogin_MouseEntered
        Encadrer3Btns(btnSuivantLogin_);
    }//GEN-LAST:event_btnSuivantLogin_MouseEntered

    private void btnSuivantLogin_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuivantLogin_MouseExited
        enlEncadrer3Btns(btnSuivantLogin_);
    }//GEN-LAST:event_btnSuivantLogin_MouseExited

    private void btnReessayerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReessayerMouseEntered
        Encadrer3Btns(btnReessayer);
    }//GEN-LAST:event_btnReessayerMouseEntered

    private void btnReessayerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReessayerMouseExited
        enlEncadrer3Btns(btnReessayer);
    }//GEN-LAST:event_btnReessayerMouseExited

    private void btnAnnulerLogin_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnnulerLogin_MouseEntered
        Encadrer3Btns(btnAnnulerLogin_);
    }//GEN-LAST:event_btnAnnulerLogin_MouseEntered

    private void btnAnnulerLogin_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnnulerLogin_MouseExited
       enlEncadrer3Btns(btnAnnulerLogin_);
    }//GEN-LAST:event_btnAnnulerLogin_MouseExited

    private void mdpTexteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdpTexteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mdpTexteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MdpTitre;
    private javax.swing.JLabel PseudoTitre;
    private javax.swing.JLabel adresseEmailTitre;
    private javax.swing.JButton btnAnnulerLogin_;
    private javax.swing.JButton btnReessayer;
    private javax.swing.JButton btnSuivantLogin_;
    private javax.swing.JButton btncreerNouvCompte_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    public static javax.swing.JPasswordField mdpTexte;
    private javax.swing.JPanel panel;
    public static javax.swing.JTextField pseudoTexte;
    public static javax.swing.JTextField userTexte;
    // End of variables declaration//GEN-END:variables

       
}
