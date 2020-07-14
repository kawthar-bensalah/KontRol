
package KontRolPackage;

import static KontRolPackage.DASHBOARD.Barre;
import static KontRolPackage.DASHBOARD.Police_Bleu;
import static KontRolPackage.INSCRIPTION.bordureBlanche;
import static KontRolPackage.INSCRIPTION.bordureBleue;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import twitter4j.IDs;
import twitter4j.Twitter;
import twitter4j.TwitterException;

public class ABNMNTS_CHERCHER extends javax.swing.JFrame {
    
    

    public ABNMNTS_CHERCHER() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        abonnement = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblExiste = new javax.swing.JLabel();
        btnEtatChercherAbnmnt_ = new javax.swing.JButton();
        btnLancerRecherche_ = new javax.swing.JButton();
        btnExit2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 6, 25), 2));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Chercher abonnement");

        abonnement.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        abonnement.setToolTipText("Saisir le nom de l'utilisateur");

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(49, 6, 25));
        jLabel1.setText("Veuillez saisir l'utilisateur à chercher : ");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel3.setText("Ce profil :");

        lblExiste.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        lblExiste.setForeground(new java.awt.Color(0, 153, 255));
        lblExiste.setToolTipText("");

        btnEtatChercherAbnmnt_.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        btnEtatChercherAbnmnt_.setForeground(new java.awt.Color(49, 6, 25));
        btnEtatChercherAbnmnt_.setText("Voir état du compte");
        btnEtatChercherAbnmnt_.setToolTipText("Vérifier l'état du compte de l'utilisateur cherché");
        btnEtatChercherAbnmnt_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(49, 6, 25), 1, true));
        btnEtatChercherAbnmnt_.setContentAreaFilled(false);
        btnEtatChercherAbnmnt_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEtatChercherAbnmnt_.setFocusPainted(false);
        btnEtatChercherAbnmnt_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEtatChercherAbnmnt_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEtatChercherAbnmnt_MouseExited(evt);
            }
        });
        btnEtatChercherAbnmnt_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEtatChercherAbnmnt_ActionPerformed(evt);
            }
        });

        btnLancerRecherche_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Search_32px.png"))); // NOI18N
        btnLancerRecherche_.setToolTipText("Lancer la recherche");
        btnLancerRecherche_.setBorder(null);
        btnLancerRecherche_.setContentAreaFilled(false);
        btnLancerRecherche_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLancerRecherche_.setFocusPainted(false);
        btnLancerRecherche_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLancerRecherche_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLancerRecherche_MouseExited(evt);
            }
        });
        btnLancerRecherche_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLancerRecherche_ActionPerformed(evt);
            }
        });

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(abonnement, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEtatChercherAbnmnt_, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblExiste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLancerRecherche_, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExit2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnExit2)
                .addGap(7, 7, 7)
                .addComponent(jLabel5)
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(abonnement, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLancerRecherche_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblExiste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnEtatChercherAbnmnt_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void ChercherAbonnement (String user) throws TwitterException
    {
        
        Twitter cnx=INSCRIPTION.ConnexionAPI(INSCRIPTION.dev_consumerK,INSCRIPTION.dev_consumerS,INSCRIPTION.dev_accessT,INSCRIPTION.dev_accessS);
         
        
        //extraction de la liste / recupertion des ids 
         IDs ids = cnx.getFriendsIDs(user,-1);
 		
        if(ids==null)
            lblExiste.setText("Introuvable");
              
        else
        {
          List<String> l=new ArrayList<String>();
        
         //remplissage de la liste temporaire
		 do {
	            for (long id : ids.getIDs()) {                              
	                String Name = cnx.showUser(id).getScreenName();
	                l.add(Name);

	            }
	        } while (ids.hasNext());
                 
                
                 //chercher l'abonnement
              int i=0;
              int existe=0;
              while(i<l.size())
              {      
                  if(l.get(i).equals(abonnement.getText())) //screen name
                  { 
                      existe++;
                      
                      lblExiste.setText("Trouvé"); 
                      break;
                  }

                  i++;
              }
              if(existe==0)
                      lblExiste.setText("Introuvable");
                  
        }
        
        
    }
    
    private void btnEtatChercherAbnmnt_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEtatChercherAbnmnt_ActionPerformed
        try 
        {
           GrapheEtatDuCompte frame= new GrapheEtatDuCompte(abonnement.getText());
           Barre(frame);
        }
        catch (TwitterException ex)
        {
            Logger.getLogger(DASHBOARD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEtatChercherAbnmnt_ActionPerformed

    private void btnExit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit2ActionPerformed
       this.hide();
    }//GEN-LAST:event_btnExit2ActionPerformed

   
    
    private void btnLancerRecherche_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLancerRecherche_ActionPerformed

        try {
            ChercherAbonnement(LOGIN_CIBLE.userCible);
            
        } catch (TwitterException ex) {
            Logger.getLogger(ABONNES_CHERCHER.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLancerRecherche_ActionPerformed

   public static void Bordure_Police_Aubergine(JButton bouton)
   {
       bouton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49,6,25)));
       bouton.setForeground(new java.awt.Color(49,6,25));
   }
   
    private void btnLancerRecherche_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLancerRecherche_MouseEntered
        bordureBleue(btnLancerRecherche_);
        Police_Bleu(btnLancerRecherche_);
    }//GEN-LAST:event_btnLancerRecherche_MouseEntered

    private void btnLancerRecherche_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLancerRecherche_MouseExited
        bordureBlanche(btnLancerRecherche_);
    }//GEN-LAST:event_btnLancerRecherche_MouseExited

    private void btnEtatChercherAbnmnt_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEtatChercherAbnmnt_MouseEntered
        bordureBleue(btnEtatChercherAbnmnt_);
        Police_Bleu(btnEtatChercherAbnmnt_);
    }//GEN-LAST:event_btnEtatChercherAbnmnt_MouseEntered

    private void btnEtatChercherAbnmnt_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEtatChercherAbnmnt_MouseExited
          
           Bordure_Police_Aubergine(btnEtatChercherAbnmnt_);
    }//GEN-LAST:event_btnEtatChercherAbnmnt_MouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField abonnement;
    private javax.swing.JButton btnEtatChercherAbnmnt_;
    private javax.swing.JButton btnExit2;
    private javax.swing.JButton btnLancerRecherche_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblExiste;
    // End of variables declaration//GEN-END:variables
}
