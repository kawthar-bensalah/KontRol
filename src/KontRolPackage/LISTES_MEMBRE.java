
package KontRolPackage;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.ScrollPaneConstants;
import twitter4j.ResponseList;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.UserList;

public class LISTES_MEMBRE extends javax.swing.JFrame {

    public LISTES_MEMBRE() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnExit4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        infosListe = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        btnAfficher_ = new javax.swing.JButton();
        scrollPanel = new javax.swing.JScrollPane();
        listes = new javax.swing.JTextArea();
        btnVider_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 6, 25), 2));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Séléctionnez une liste pour voir ses informations.");

        btnExit4.setBackground(new java.awt.Color(255, 255, 255));
        btnExit4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/DeleteBluepx.png"))); // NOI18N
        btnExit4.setToolTipText("Fermer la fenetre");
        btnExit4.setBorderPainted(false);
        btnExit4.setContentAreaFilled(false);
        btnExit4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit4.setFocusPainted(false);
        btnExit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit4ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Les listes contenant l'utilisateur");

        infosListe.setColumns(20);
        infosListe.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        infosListe.setRows(5);
        infosListe.setToolTipText("Informations sur la liste séléctionnée.");
        jScrollPane1.setViewportView(infosListe);

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Informations liste :");

        btnAfficher_.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btnAfficher_.setForeground(new java.awt.Color(49, 6, 25));
        btnAfficher_.setText("Afficher");
        btnAfficher_.setToolTipText("Afficher les listes.");
        btnAfficher_.setBorder(null);
        btnAfficher_.setContentAreaFilled(false);
        btnAfficher_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAfficher_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAfficher_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAfficher_MouseExited(evt);
            }
        });
        btnAfficher_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfficher_ActionPerformed(evt);
            }
        });

        listes.setColumns(20);
        listes.setRows(1000);
        listes.setToolTipText("Les listes où la cible est membre.");
        scrollPanel.setViewportView(listes);
        scrollPanel.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        btnVider_.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btnVider_.setForeground(new java.awt.Color(49, 6, 25));
        btnVider_.setText("Vider");
        btnVider_.setToolTipText("Vider le champs d'informations.");
        btnVider_.setBorder(null);
        btnVider_.setContentAreaFilled(false);
        btnVider_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVider_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVider_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVider_MouseExited(evt);
            }
        });
        btnVider_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVider_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(98, 98, 98))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAfficher_, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVider_, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(scrollPanel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExit4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(btnExit4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVider_)
                    .addComponent(btnAfficher_))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit4ActionPerformed
        this.hide();
    }//GEN-LAST:event_btnExit4ActionPerformed

    private void btnAfficher_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAfficher_MouseEntered
        DASHBOARD.Police_Bleu(btnAfficher_);
    }//GEN-LAST:event_btnAfficher_MouseEntered

    private void btnAfficher_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAfficher_MouseExited
        btnAfficher_.setForeground(new java.awt.Color(49, 6, 25));
    }//GEN-LAST:event_btnAfficher_MouseExited

    private void btnAfficher_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfficher_ActionPerformed
        try {
            ExtractionListesMembre(LOGIN_CIBLE.userCible);
        } catch (TwitterException ex) {
             Logger.getLogger(LISTE_CREES.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAfficher_ActionPerformed

    private void btnVider_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVider_MouseEntered
        DASHBOARD.Police_Bleu(btnVider_);
    }//GEN-LAST:event_btnVider_MouseEntered

    private void btnVider_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVider_MouseExited
        btnVider_.setForeground(new java.awt.Color(49, 6, 25));
    }//GEN-LAST:event_btnVider_MouseExited

    private void btnVider_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVider_ActionPerformed
        infosListe.setText(null);
    }//GEN-LAST:event_btnVider_ActionPerformed

    
    public void ExtractionListesMembre ( String user) throws TwitterException
    {   
        //connexion a l api 
         Twitter cnx=INSCRIPTION.ConnexionAPI(INSCRIPTION.dev_consumerK,INSCRIPTION.dev_consumerS,INSCRIPTION.dev_accessT,INSCRIPTION.dev_accessS);
         
         SimpleDateFormat simpleDate = new SimpleDateFormat("EEE dd/MM/yyyy à hh:mm:ss");
         
         ResponseList<UserList> l= cnx.getUserListMemberships(user,-1);
         
         if(l.isEmpty())
         {
             listes.setText("<Pas de listes où l'utilisateur est membre>");
         }

         else
         {
            listes.setRows(l.size()*2);

            JButton TabListes[]=new JButton[l.size()];

            Font font = new Font("Segoe UI Light", 1, 14);
            int i=0;
            int y=3;

            ArrayList<String> compare = new ArrayList<String>();

            for(UserList list:l)
            {
                compare.add(list.getName());
            }


                   while(i<l.size())
                   {
                           TabListes[i]=new JButton(l.get(i).getName());
                           TabListes[i].setFont(font);
                           TabListes[i].setBorderPainted(false);
                           TabListes[i].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)); // ca
                           TabListes[i].setOpaque(false);
                           TabListes[i].setContentAreaFilled(false);
                           TabListes[i].setBounds(1,y,listes.getWidth(),20);
                           listes.add(TabListes[i]);

                           String titre=TabListes[i].getText();
                        TabListes[i].addActionListener(new ActionListener()
                           {  
                               public void actionPerformed(ActionEvent e)
                               {	
                                   for(UserList u:l)
                                           {
                                                   if(titre.compareTo(u.getName())==0)
                                                   {
                                                       infosListe.setText(" Nom complet: "+u.getFullName()+"\n Date de création: "+simpleDate.format(u.getCreatedAt())+"\n Nombre membres: "+u.getMemberCount()+"\n Description: "+u.getDescription());
                                                   }
                                           }
                               }
                           });
                           y=y+30;
                           i++;
                   }
                }   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAfficher_;
    private javax.swing.JButton btnExit4;
    private javax.swing.JButton btnVider_;
    private javax.swing.JTextArea infosListe;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea listes;
    private javax.swing.JScrollPane scrollPanel;
    // End of variables declaration//GEN-END:variables
}
