
package KontRolPackage;

import static KontRolPackage.INSCRIPTION.ConnexionAPI;
import java.util.logging.Level;
import java.util.logging.Logger;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;

public class TWEETER extends javax.swing.JFrame {

    
    public TWEETER() {
        initComponents();
        parent.setText(LOGIN.userTwitter);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        parent = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texteTweet = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnPublierTweet_ = new javax.swing.JButton();
        btnViderTweet_ = new javax.swing.JButton();
        btnExit_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(49, 6, 25), 2, true));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(49, 6, 25));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Publier un Tweet");

        parent.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        parent.setForeground(new java.awt.Color(0, 153, 255));
        parent.setText("@parent");
        parent.setToolTipText("Votre compte Twitter");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Customer_22px.png"))); // NOI18N

        texteTweet.setColumns(20);
        texteTweet.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        texteTweet.setForeground(new java.awt.Color(51, 51, 51));
        texteTweet.setLineWrap(true);
        texteTweet.setRows(288);
        texteTweet.setToolTipText("Champ de saisie du commentaire");
        jScrollPane1.setViewportView(texteTweet);

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(49, 6, 25));
        jLabel4.setText("Veuillez saisir votre tweet :");

        btnPublierTweet_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Sent_32px.png"))); // NOI18N
        btnPublierTweet_.setToolTipText("Publier le tweet");
        btnPublierTweet_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnPublierTweet_.setContentAreaFilled(false);
        btnPublierTweet_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPublierTweet_.setFocusPainted(false);
        btnPublierTweet_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPublierTweet_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPublierTweet_MouseExited(evt);
            }
        });
        btnPublierTweet_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublierTweet_ActionPerformed(evt);
            }
        });

        btnViderTweet_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Replace_32px.png"))); // NOI18N
        btnViderTweet_.setToolTipText("Vider le champ du tweet");
        btnViderTweet_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnViderTweet_.setContentAreaFilled(false);
        btnViderTweet_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViderTweet_.setFocusPainted(false);
        btnViderTweet_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnViderTweet_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnViderTweet_MouseExited(evt);
            }
        });
        btnViderTweet_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViderTweet_ActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnViderTweet_, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(btnPublierTweet_, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183))
                    .addComponent(btnExit_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(parent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnExit_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(parent, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnViderTweet_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPublierTweet_, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addGap(29, 29, 29))
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

    private void btnPublierTweet_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublierTweet_ActionPerformed

        Twitter AccesAPI = ConnexionAPI(CLES_API.consumerK,CLES_API.consumerS,CLES_API.accessT,CLES_API.accessS);
        String texte = texteTweet.getText();
        try 
        {
            Status status = AccesAPI.updateStatus(texte);
            
            //message de succès
            MESSAGE_TWEETER m = new MESSAGE_TWEETER();
            m.setVisible(true);
            m.setLocationRelativeTo(null);
            this.hide();
        } 
        catch (TwitterException ex) 
        {
            Logger.getLogger(TWEETER.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPublierTweet_ActionPerformed

    private void btnViderTweet_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViderTweet_ActionPerformed

        //vider le champ du tweet
        texteTweet.setText("");

    }//GEN-LAST:event_btnViderTweet_ActionPerformed

    private void btnExit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit_ActionPerformed
        this.hide();
    }//GEN-LAST:event_btnExit_ActionPerformed

    private void btnPublierTweet_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPublierTweet_MouseEntered
        INSCRIPTION.bordureBleue(btnPublierTweet_);
    }//GEN-LAST:event_btnPublierTweet_MouseEntered

    private void btnPublierTweet_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPublierTweet_MouseExited
        INSCRIPTION.bordureBlanche(btnPublierTweet_);
    }//GEN-LAST:event_btnPublierTweet_MouseExited

    private void btnViderTweet_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViderTweet_MouseEntered
         INSCRIPTION.bordureBleue(btnViderTweet_);
    }//GEN-LAST:event_btnViderTweet_MouseEntered

    private void btnViderTweet_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViderTweet_MouseExited
        INSCRIPTION.bordureBlanche(btnViderTweet_);
    }//GEN-LAST:event_btnViderTweet_MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit_;
    private javax.swing.JButton btnPublierTweet_;
    private javax.swing.JButton btnViderTweet_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel parent;
    private javax.swing.JTextArea texteTweet;
    // End of variables declaration//GEN-END:variables
}
