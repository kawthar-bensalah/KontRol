
package KontRolPackage;

import static KontRolPackage.INSCRIPTION.ConnexionAPI;
import static KontRolPackage.INSCRIPTION.VerifierUserNameTwitter;
import static KontRolPackage.INSCRIPTION.bordureBlanche;
import static KontRolPackage.INSCRIPTION.bordureBleue;
import static KontRolPackage.INSCRIPTION.dev_accessS;
import static KontRolPackage.INSCRIPTION.dev_accessT;
import static KontRolPackage.INSCRIPTION.dev_consumerK;
import static KontRolPackage.INSCRIPTION.dev_consumerS;
import static KontRolPackage.INSCRIPTION.session;
import static KontRolPackage.LOGIN.userTwitter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.neo4j.driver.v1.StatementResult;
import twitter4j.Twitter;
import twitter4j.TwitterException;

public class LOGIN_CIBLE extends javax.swing.JFrame {

    public static String userCible;
    public LOGIN_CIBLE() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        texteCible = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        btnOKcible_ = new javax.swing.JButton();
        btnExit_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 6, 25), 2));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nom d'utilisateur");

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(49, 6, 25));
        jLabel2.setText("Veuillez donner le nom d'utilisateur:");

        texteCible.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        texteCible.setForeground(new java.awt.Color(0, 153, 255));
        texteCible.setToolTipText("Introduire le nom de la cible ");
        texteCible.setBorder(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Email_22px.png"))); // NOI18N

        btnOKcible_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Ok_vert40px.png"))); // NOI18N
        btnOKcible_.setToolTipText("Valider le nom d'utilisateur du compte cible.");
        btnOKcible_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnOKcible_.setContentAreaFilled(false);
        btnOKcible_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOKcible_.setFocusPainted(false);
        btnOKcible_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOKcible_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOKcible_MouseExited(evt);
            }
        });
        btnOKcible_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKcible_ActionPerformed(evt);
            }
        });

        btnExit_.setBackground(new java.awt.Color(255, 255, 255));
        btnExit_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/DeleteBluepx.png"))); // NOI18N
        btnExit_.setToolTipText("Fermer la fenetre");
        btnExit_.setBorderPainted(false);
        btnExit_.setContentAreaFilled(false);
        btnExit_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit_.setFocusPainted(false);
        btnExit_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(btnOKcible_)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(37, 37, 37))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(texteCible, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 28, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExit_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnExit_)
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(texteCible)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOKcible_)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnOKcible_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOKcible_MouseEntered
        bordureBleue(btnOKcible_);
    }//GEN-LAST:event_btnOKcible_MouseEntered

    private void btnOKcible_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOKcible_MouseExited
         bordureBlanche(btnOKcible_);
    }//GEN-LAST:event_btnOKcible_MouseExited

    private void btnOKcible_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKcible_ActionPerformed

        // verification du userName
          Twitter AccesAPI = ConnexionAPI(dev_consumerK,dev_consumerS,dev_accessT,dev_accessS);

         userCible = texteCible.getText();
         boolean verifierUser = VerifierUserNameTwitter(userCible, AccesAPI);
        if(verifierUser) // si le user existe réellement dans la base de donnes Twitter
        {
            //chercher s'il n'existe pas deja dans neo4j
            StatementResult reqChercherCible = session.run("match(c:CIBLE{username:\""+userCible+"\"}) return c.username as cible");

            //la cible existe 
            if(reqChercherCible.hasNext())
            {
                //verification du lien
                StatementResult requeteChercherCible = session.run("match (u)-[s]->(c) where u.username='"+userTwitter+"' and c.username='"+userCible+"' return c.username as cible");

                //la cible n'est pas relie a l utilisateur 
                if(!requeteChercherCible.hasNext())
                {
                        //vider le champ de ma cible
                        texteCible.setText(null);
                        //message d erreur
                        ERREUR_LOGIN_CIBLE erreur = new ERREUR_LOGIN_CIBLE();
                        erreur.setVisible(true);
                        erreur.setLocationRelativeTo(null);

                }
                //la cible est valide
                else
                {
                   DEGRE_DANGER dash = new DEGRE_DANGER("");
                     try {
                         DEGRE_DANGER.aff();
                         this.hide();
                     } catch (TwitterException | IOException ex) {
                         Logger.getLogger(LOGIN_CIBLE.class.getName()).log(Level.SEVERE, null, ex);
                     } 

                }
            }
            else
            {
                //profil innexistant dans la bdd
                ERREUR_STANDARD_ProfilInexistant erreur = new ERREUR_STANDARD_ProfilInexistant();
                erreur.setVisible(true);
                erreur.setLocationRelativeTo(null);
            }
        }
        else
        {
            //le profil cible n'existe pas dans Twitter
                    ERREUR_USERINFOS_user erreur = new ERREUR_USERINFOS_user();
                    erreur.setVisible(true);
                    erreur.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_btnOKcible_ActionPerformed

    private void btnExit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit_ActionPerformed
        this.hide();
    }//GEN-LAST:event_btnExit_ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit_;
    private javax.swing.JButton btnOKcible_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTextField texteCible;
    // End of variables declaration//GEN-END:variables
}
