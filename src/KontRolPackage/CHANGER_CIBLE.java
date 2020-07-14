
package KontRolPackage;

import static KontRolPackage.INSCRIPTION.ConnexionAPI;
import static KontRolPackage.INSCRIPTION.VerifierUserNameTwitter;
import static KontRolPackage.INSCRIPTION.bordureBlanche;
import static KontRolPackage.INSCRIPTION.bordureBleue;
import static KontRolPackage.INSCRIPTION.session;
import static KontRolPackage.LOGIN.userTwitter;
import static KontRolPackage.USER_INFOS.userCible;
import org.neo4j.driver.v1.StatementResult;
import twitter4j.Twitter;

public class CHANGER_CIBLE extends javax.swing.JFrame {

    public static String newCible ;
    public CHANGER_CIBLE() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btnChangerCible_ = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nouvelleCible = new javax.swing.JTextField();
        btnExit2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 6, 25), 2));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nom du compte  ");

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel2.setText("Nom de la nouvelle cible :");

        btnChangerCible_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Change User_40px.png"))); // NOI18N
        btnChangerCible_.setToolTipText("Changer de cible");
        btnChangerCible_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnChangerCible_.setContentAreaFilled(false);
        btnChangerCible_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChangerCible_.setFocusPainted(false);
        btnChangerCible_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnChangerCible_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnChangerCible_MouseExited(evt);
            }
        });
        btnChangerCible_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangerCible_ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("@");

        nouvelleCible.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        nouvelleCible.setForeground(new java.awt.Color(0, 153, 255));
        nouvelleCible.setToolTipText("Donner le nom du compte utilisateur à surveiller.");
        nouvelleCible.setBorder(null);

        btnExit2.setBackground(new java.awt.Color(255, 255, 255));
        btnExit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/DeleteBluepx.png"))); // NOI18N
        btnExit2.setToolTipText("Fermer la fenetre");
        btnExit2.setBorderPainted(false);
        btnExit2.setContentAreaFilled(false);
        btnExit2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit2.setFocusPainted(false);
        btnExit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nouvelleCible, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExit2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(btnChangerCible_)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnExit2)
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nouvelleCible))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnChangerCible_)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangerCible_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangerCible_ActionPerformed

        // verification du userName
        Twitter AccesAPI = ConnexionAPI(INSCRIPTION.dev_consumerK,INSCRIPTION.dev_consumerS,INSCRIPTION.dev_accessT,INSCRIPTION.dev_accessS);
        
        newCible=nouvelleCible.getText();
         boolean verifierUser = VerifierUserNameTwitter(newCible, AccesAPI);
                if(verifierUser) // si le user existe réellement dans la base de donnes Twitter
                {
                    //verifier si la cible existe deja 
                    StatementResult requete_rechercheCible = session.run("MATCH (u:USER)-[s:SUIT]->(c:CIBLE)\n" +
                    "WHERE u.username = '"+userTwitter+"' and  c.username='"+newCible+"' \n" +
                    "RETURN c.username as cible");
                    
                    if(requete_rechercheCible.hasNext())
                    {
                        userCible=newCible;
                        
                        //message de reussite
                        MESSAGE_CHANGERCIBLE_reussi msg = new MESSAGE_CHANGERCIBLE_reussi();
                        msg.setVisible(true);
                        msg.setLocationRelativeTo(null);
                        this.hide();
                    }
                    else
                    {
                            //creation du noeud de la cible 
                            StatementResult requete_creerCible = session.run("create (c:CIBLE{username:'"+userCible+"'})return c.username ");
                            
                          //enregistrer le nom de la cible dans un nouveau noeud et le relier a l'utilisateur
                            StatementResult requete_lierCible = session.run("match (u:USER{username:'"+userTwitter+"'}),(c:CIBLE{username:'"+userCible+"'}) "
                                    + "create (u)-[s:SUIT]->(c) return c.username as cible ");
                            
                            if(requete_lierCible.hasNext() || requete_creerCible.hasNext())
                            {
                                userCible=newCible;
                        
                                //message de reussite
                                MESSAGE_CHANGERCIBLE_reussi msg = new MESSAGE_CHANGERCIBLE_reussi();
                                msg.setVisible(true);
                                msg.setLocationRelativeTo(null);
                                this.hide();
                                
                            }
                            else
                            {
                                ERREUR_CHANGERCIBLE_echec msg = new ERREUR_CHANGERCIBLE_echec();
                                msg.setVisible(true);
                                msg.setLocationRelativeTo(null);
                            }
                            
                    }
                  
                }
                else
                {
                    ERREUR_USERINFOS_user erreur = new ERREUR_USERINFOS_user();
                    erreur.setVisible(true);
                    erreur.setLocationRelativeTo(null);
                }
    }//GEN-LAST:event_btnChangerCible_ActionPerformed

    private void btnChangerCible_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangerCible_MouseEntered
        bordureBleue(btnChangerCible_);
    }//GEN-LAST:event_btnChangerCible_MouseEntered

    private void btnChangerCible_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangerCible_MouseExited
        bordureBlanche(btnChangerCible_);
    }//GEN-LAST:event_btnChangerCible_MouseExited

    private void btnExit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit2ActionPerformed
        this.hide();
    }//GEN-LAST:event_btnExit2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangerCible_;
    private javax.swing.JButton btnExit2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nouvelleCible;
    // End of variables declaration//GEN-END:variables
}
