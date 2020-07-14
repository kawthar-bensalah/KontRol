
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

public class LISTE_ABNMNTS_PARENT extends javax.swing.JFrame {

    public LISTE_ABNMNTS_PARENT() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnExit2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        liste = new javax.swing.JTextArea();
        btnEtatAbnCommun_ = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 6, 25), 2));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(" Liste d'abonnements ");

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

        liste.setColumns(20);
        liste.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        liste.setForeground(new java.awt.Color(102, 102, 102));
        liste.setLineWrap(true);
        liste.setRows(1000);
        jScrollPane2.setViewportView(liste);

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

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Cliquez sur un compte pour voir son état actuel.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExit2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btnEtatAbnCommun_, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(btnExit2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEtatAbnCommun_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void ExtraireAbonnementsEnCommuns_Parent() throws TwitterException
    {
       //connexion a l api 
         Twitter cnx=INSCRIPTION.ConnexionAPI(INSCRIPTION.dev_consumerK,INSCRIPTION.dev_consumerS,INSCRIPTION.dev_accessT,INSCRIPTION.dev_accessS);
         
         
         List<String> l=new ArrayList<String>();
         
         Font font = new Font("Segoe UI Light", 1, 14);
         int i=0;
         int y=3;
         
         //extraction de la liste / recupertion des ids 
         IDs ids = cnx.getFriendsIDs(cnx.getScreenName(),-1);
 		
        if(ids==null)
            liste.setText("<La liste d'abonnements de "+cnx.getScreenName()+" est vide>");
              
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
          
        //opas de precision extraire toute la liste
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

    private void btnEtatAbnCommun_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEtatAbnCommun_ActionPerformed

        try {
            // code extraction abonnements en communs

            ExtraireAbonnementsEnCommuns_Parent();
        } catch (TwitterException ex) {
            Logger.getLogger(LISTE_ABNMNTS_PARENT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEtatAbnCommun_ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEtatAbnCommun_;
    private javax.swing.JButton btnExit2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea liste;
    // End of variables declaration//GEN-END:variables
}
