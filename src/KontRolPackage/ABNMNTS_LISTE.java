
package KontRolPackage;

import static KontRolPackage.ABNMNTS_CHERCHER.Bordure_Police_Aubergine;
import static KontRolPackage.DASHBOARD.Police_Bleu;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.ScrollPaneConstants;
import twitter4j.IDs;
import twitter4j.Twitter;
import twitter4j.TwitterException;

public class ABNMNTS_LISTE extends javax.swing.JFrame {

    public ABNMNTS_LISTE() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnAfficherListeAbns_ = new javax.swing.JButton();
        btnExit2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        liste = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 6, 25), 2));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Liste d'abonnements");

        btnAfficherListeAbns_.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        btnAfficherListeAbns_.setForeground(new java.awt.Color(49, 6, 25));
        btnAfficherListeAbns_.setText("Afficher la liste");
        btnAfficherListeAbns_.setToolTipText("");
        btnAfficherListeAbns_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(49, 6, 25), 1, true));
        btnAfficherListeAbns_.setContentAreaFilled(false);
        btnAfficherListeAbns_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAfficherListeAbns_.setFocusPainted(false);
        btnAfficherListeAbns_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAfficherListeAbns_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAfficherListeAbns_MouseExited(evt);
            }
        });
        btnAfficherListeAbns_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfficherListeAbns_ActionPerformed(evt);
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

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Cliquez sur un compte pour voir son état actuel.");

        liste.setColumns(20);
        liste.setRows(1000);
        scroll.setViewportView(liste);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(btnAfficherListeAbns_, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addComponent(scroll))
                .addContainerGap(38, Short.MAX_VALUE))
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExit2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(btnExit2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAfficherListeAbns_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAfficherListeAbns_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAfficherListeAbns_MouseEntered
        INSCRIPTION.bordureBleue(btnAfficherListeAbns_);
        Police_Bleu(btnAfficherListeAbns_);
    }//GEN-LAST:event_btnAfficherListeAbns_MouseEntered

    private void btnAfficherListeAbns_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAfficherListeAbns_MouseExited
        Bordure_Police_Aubergine(btnAfficherListeAbns_);
    }//GEN-LAST:event_btnAfficherListeAbns_MouseExited

    private void btnAfficherListeAbns_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfficherListeAbns_ActionPerformed
        try {
            ExtractionAbonnements(LOGIN_CIBLE.userCible);
        } catch (TwitterException ex) {
            Logger.getLogger(ABONNES_LISTE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAfficherListeAbns_ActionPerformed

    private void btnExit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit2ActionPerformed
        this.hide();
    }//GEN-LAST:event_btnExit2ActionPerformed

    
    
    public void ExtractionAbonnements ( String user) throws TwitterException
    {   
        //connexion a l api 
         Twitter cnx=INSCRIPTION.ConnexionAPI(INSCRIPTION.dev_consumerK,INSCRIPTION.dev_consumerS,INSCRIPTION.dev_accessT,INSCRIPTION.dev_accessS);
         
         
         List<String> l=new ArrayList<String>();
         
         Font font = new Font("Segoe UI Light", 1, 14);
         int i=0;
         int y=3;
         
         //extraction de la liste / recupertion des ids 
         IDs ids = cnx.getFriendsIDs(user,-1);
 		
        if(ids==null)
            liste.setText("<La liste d'abonnés de "+user+" est vide>");
              
        else
        {
         //remplissage de la liste temporaire
		 do {
	            for (long id : ids.getIDs()) {                              
	                String Name = cnx.showUser(id).getScreenName();
	                l.add(Name);

	            }
	        } while (ids.hasNext());
             
        liste.setRows(l.size()*2);
        
        JButton TabListes[]=new JButton[l.size()];
          
            while(i<l.size())
		{
		 TabListes[i]=new JButton(l.get(i));
                        TabListes[i].setFont(font);
                        TabListes[i].setBorderPainted(false);
                        TabListes[i].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)); // ca
                        TabListes[i].setOpaque(false);
                        TabListes[i].setContentAreaFilled(false);
			TabListes[i].setBounds(1,y,liste.getWidth(),20);
                        liste.add(TabListes[i]);
			String name = TabListes[i].getText();
                       TabListes[i].addActionListener(new ActionListener()
                        {  
                            public void actionPerformed(ActionEvent e)
                            {	
                               
                                                    try {
                                                         GrapheEtatDuCompte frame = new GrapheEtatDuCompte(name);
                                                         DASHBOARD.Barre(frame);
                                                    } 
                                                    catch (TwitterException ex) {
                                                        Logger.getLogger(DASHBOARD.class.getName()).log(Level.SEVERE, null, ex);
                                                    }
                                                       
                                                }
		               		}
                            
                        );
                        y=y+30;
                        i++;
                }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAfficherListeAbns_;
    private javax.swing.JButton btnExit2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JTextArea liste;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
