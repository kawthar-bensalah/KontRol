
package KontRolPackage;

import static KontRolPackage.ABNMNTS_CHERCHER.Bordure_Police_Aubergine;
import static KontRolPackage.DASHBOARD.Police_Bleu;
import static KontRolPackage.INSCRIPTION.bordureBleue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import twitter4j.IDs;
import twitter4j.Twitter;
import twitter4j.TwitterException;

public class ABONNES_COMMUNS extends javax.swing.JFrame {

    public ABONNES_COMMUNS() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnEtatAbnCommun_ = new javax.swing.JButton();
        btnExit2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        liste = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 6, 25), 2));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(" Liste d'abonnés ");

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("en commun avec moi");

        btnEtatAbnCommun_.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        btnEtatAbnCommun_.setForeground(new java.awt.Color(49, 6, 25));
        btnEtatAbnCommun_.setText("Afficher la liste");
        btnEtatAbnCommun_.setToolTipText("");
        btnEtatAbnCommun_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(49, 6, 25), 1, true));
        btnEtatAbnCommun_.setContentAreaFilled(false);
        btnEtatAbnCommun_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEtatAbnCommun_.setFocusPainted(false);
        btnEtatAbnCommun_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEtatAbnCommun_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEtatAbnCommun_MouseExited(evt);
            }
        });
        btnEtatAbnCommun_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEtatAbnCommun_ActionPerformed(evt);
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

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Cliquez sur un compte pour voir son état actuel.");

        liste.setColumns(20);
        liste.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        liste.setForeground(new java.awt.Color(51, 51, 51));
        liste.setRows(20);
        jScrollPane1.setViewportView(liste);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExit2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(btnEtatAbnCommun_, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(btnExit2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(3, 3, 3)
                .addComponent(jLabel6)
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEtatAbnCommun_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
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

    
    public void ExtraireAbonnesEnCommuns(String user) throws TwitterException
    {
        Twitter cnx=INSCRIPTION.ConnexionAPI(INSCRIPTION.dev_consumerK,INSCRIPTION.dev_consumerS,INSCRIPTION.dev_accessT,INSCRIPTION.dev_accessS);
        
        //creation et remplissage de la liste d ids
        
        //---------------------------------enfant----------------------------------------
         List<String> enfant=new ArrayList<>();
        
         //extraction de la liste d abonnements de l enfant
         IDs ids = cnx.getFollowersIDs(user,-1);
 		
		 do {
	            for (long id : ids.getIDs()) {                              
	                String Name = cnx.showUser(id).getScreenName();
	                enfant.add(Name);

	            }
	        } while (ids.hasNext());
       
        //---------------------------------------parent---------------------------------- 
        List<String> parent=new ArrayList<>();
        
        ids = cnx.getFollowersIDs(cnx.getScreenName(),-1);
 		
		 do {
	            for (long id : ids.getIDs()) {                              
	                String Name = cnx.showUser(id).getScreenName();
	                parent.add(Name);

	            }
	        } while (ids.hasNext());
                 
        //--------------------------- traitement comparaison --------------------------------------------
        
        if(enfant.isEmpty()&& parent.isEmpty())
        {
            liste.setText("<Listes d'abonnés vides !>");
        }
        else
        {
        
            if(enfant.isEmpty())

                liste.setText("<L'utilisateur: "+user+" n'as pas d'abonnés>");

             else
             {
                 if(parent.isEmpty())
                     liste.setText("<L'utilisateur: "+cnx.getScreenName()+" n'as pas d'abonnés>");

                else
                 {


                         //choisir la taille de la jtextearea ( la plus grande)
                         int taille;
                         if(enfant.size()>parent.size())
                             taille=enfant.size();
                         else 
                             taille =parent.size();


                    liste.setRows(taille*2);
                    JButton TabListes[]=new JButton[liste.getRows()];
                    Font font = new Font("Segoe UI Light", 1, 14);
                    int i=0,j=0;
                    int y=3;


                    //pour la configuration
                      int compteur =0;

                      //verifier s'il y a eu une configuration 
                        
                      if(ABONNES_CONFIG.ok)
                      {
                          int limite =ABONNES_CONFIG.nombre;

                          if(enfant.size()<limite-1 && parent.size()<limite-1)
                              liste.setText("Extraction impossible: \nLes listes d'abonnés des utilisateurs contiennent moins de "+limite+" abonnés.");
                          else
                          {
                          if(enfant.size()<limite-1)

                              liste.setText("Extraction impossible: \nLa liste d'abonnés de "+user+" contient moins de "+limite+" abonnés.");
                          else
                          {
                              if( parent.size()<limite-1)
                                  liste.setText("Extraction impossible: \nLa liste d'abonnés de "+cnx.getScreenName()+" contient moins de "+limite+" abonnés.");

                          else
                          {
                            //comparer les 'limite' abonnements
                             while(i<limite-1)
                                       {j=0;
                                           while(j<limite-1)
                                           {
                                               if(parent.get(i).equals(enfant.get(j)))
                                               {
                                                        compteur++;
                                                         TabListes[i]=new JButton(enfant.get(i));
                                                         TabListes[i].setFont(font);
                                                         TabListes[i].setBorderPainted(false);
                                                         TabListes[i].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)); // ca
                                                         TabListes[i].setOpaque(false);
                                                         TabListes[i].setContentAreaFilled(false);
                                                         TabListes[i].setBounds(1,y,liste.getWidth(),20);
                                                         liste.add(TabListes[i]);

                                                         String titre=TabListes[i].getText();

                                                         TabListes[i].addActionListener(new ActionListener()
                                                         {  
                                                             public void actionPerformed(ActionEvent e)
                                                             {	

                                                                 try {
                                                                      GrapheEtatDuCompte g = new GrapheEtatDuCompte(titre);
                                                                    DASHBOARD.Barre(g);
                                                                 } catch (TwitterException ex) {
                                                                     Logger.getLogger(ABONNES_COMMUNS.class.getName()).log(Level.SEVERE, null, ex);
                                                                 }

                                                             }                          
                                                         });

                                                          y=y+30; 
                                                          break;
                                                    }
                                                   j++;   
                                                }
                                                 i++;  
                                           }
                              if(compteur == 0 )
                                 liste.setText("<Pas d'abonnés en commun dans les "+limite+"derniers abonnés>");
                          }
                      }

                          }
                      }

                      else
                      {
                           //comparer tous les abonnements
                                    while(i<parent.size())
                                     {j=0;
                                         while(j<enfant.size())
                                         {
                                             if(parent.get(i).equals(enfant.get(j)))
                                             {
                                                      compteur++;
                                                       TabListes[i]=new JButton(enfant.get(i));
                                                       TabListes[i].setFont(font);
                                                       TabListes[i].setBorderPainted(false);
                                                       TabListes[i].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)); // ca
                                                       TabListes[i].setOpaque(false);
                                                       TabListes[i].setContentAreaFilled(false);
                                                       TabListes[i].setBounds(1,y,liste.getWidth(),20);
                                                       liste.add(TabListes[i]);

                                                       String titre=TabListes[i].getText();

                                                       TabListes[i].addActionListener(new ActionListener()
                                                       {  
                                                           public void actionPerformed(ActionEvent e)
                                                           {	

                                                               try {
                                                                    GrapheEtatDuCompte g = new GrapheEtatDuCompte(titre);
                                                                  DASHBOARD.Barre(g);
                                                               } catch (TwitterException ex) {
                                                                   Logger.getLogger(ABONNES_COMMUNS.class.getName()).log(Level.SEVERE, null, ex);
                                                               }

                                                           }                          
                                                       });

                                                        y=y+30; 
                                                        break;
                                                  }
                                                 j++;   
                                              }
                                               i++;  
                                         }
                            if(compteur == 0 )
                               liste.setText("<Pas d'abonnés en commun>"); 
                      }

                 }
                 }
        }
        }                 
    
    
    private void btnEtatAbnCommun_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEtatAbnCommun_ActionPerformed

        try {
            // code extraction abonnes en communs
            ExtraireAbonnesEnCommuns(LOGIN_CIBLE.userCible);
        } catch (TwitterException ex) {
            Logger.getLogger(ABONNES_COMMUNS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEtatAbnCommun_ActionPerformed

    private void btnExit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit2ActionPerformed
        this.hide();
    }//GEN-LAST:event_btnExit2ActionPerformed

    private void btnEtatAbnCommun_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEtatAbnCommun_MouseEntered
         bordureBleue(btnEtatAbnCommun_);
        Police_Bleu(btnEtatAbnCommun_);
    }//GEN-LAST:event_btnEtatAbnCommun_MouseEntered

    private void btnEtatAbnCommun_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEtatAbnCommun_MouseExited
         Bordure_Police_Aubergine(btnEtatAbnCommun_);
    }//GEN-LAST:event_btnEtatAbnCommun_MouseExited

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEtatAbnCommun_;
    private javax.swing.JButton btnExit2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea liste;
    // End of variables declaration//GEN-END:variables
}
