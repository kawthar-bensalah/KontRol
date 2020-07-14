
package KontRolPackage;

import static KontRolPackage.DASHBOARD.Police_Blanc;
import static KontRolPackage.DASHBOARD.Police_Bleu;
import static KontRolPackage.INSCRIPTION.bordureBlanche;
import static KontRolPackage.INSCRIPTION.bordureBleue;
import java.util.Date;

public class RETWEETS_CONFIG_CONT extends javax.swing.JFrame {

     public static boolean dateDR = false;
    public static boolean datePR =false;
    public static Date date1R,date2R;
    
    public RETWEETS_CONFIG_CONT() {
        initComponents();
         checkBoxParDef.setSelected(dateDR);
        checkBoxPers.setSelected(datePR);
        
        if(checkBoxPers.isSelected())
        {
            dateDebut.setDate(date1R); 
            dateFin.setDate(date2R);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        checkBoxPers = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        checkBoxParDef = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dateFin = new com.toedter.calendar.JDateChooser();
        dateDebut = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSauvegarder_ = new javax.swing.JButton();
        btnExit1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(49, 6, 25));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jTextPane1.setBackground(new java.awt.Color(49, 6, 25));
        jTextPane1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane1.setText("Le mode par défaut permet d'afficher tous les retweets dans le compte depuis sa création.");
        jTextPane1.setAutoscrolls(false);
        jScrollPane1.setViewportView(jTextPane1);

        checkBoxPers.setBackground(new java.awt.Color(49, 6, 25));
        checkBoxPers.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        checkBoxPers.setForeground(new java.awt.Color(0, 153, 255));
        checkBoxPers.setText("Personnalisée");
        checkBoxPers.setFocusPainted(false);
        checkBoxPers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxPersActionPerformed(evt);
            }
        });

        jTextPane2.setBackground(new java.awt.Color(49, 6, 25));
        jTextPane2.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jTextPane2.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane2.setText("Le mode personnalisé permet de définir une date de début et une date de fin pour un affichage plus précis des retweets.");
        jScrollPane2.setViewportView(jTextPane2);

        checkBoxParDef.setBackground(new java.awt.Color(49, 6, 25));
        checkBoxParDef.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        checkBoxParDef.setForeground(new java.awt.Color(0, 153, 255));
        checkBoxParDef.setText("Par défaut");
        checkBoxParDef.setFocusPainted(false);
        checkBoxParDef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxParDefActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Configuration contenu");

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Veuillez définir la période : ");

        dateFin.setBackground(new java.awt.Color(49, 6, 25));
        dateFin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        dateFin.setForeground(new java.awt.Color(0, 153, 255));
        dateFin.setDateFormatString("dd MM yyyy");
        dateFin.setEnabled(false);
        dateFin.setFocusable(false);
        dateFin.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N

        dateDebut.setBackground(new java.awt.Color(49, 6, 25));
        dateDebut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        dateDebut.setForeground(new java.awt.Color(0, 153, 255));
        dateDebut.setToolTipText("Séléctionner la date de début d'extraction");
        dateDebut.setDateFormatString("dd MM yyyy");
        dateDebut.setEnabled(false);
        dateDebut.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("Date début");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("Date fin");

        btnSauvegarder_.setBackground(new java.awt.Color(49, 6, 25));
        btnSauvegarder_.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btnSauvegarder_.setForeground(new java.awt.Color(255, 255, 255));
        btnSauvegarder_.setText("Terminé");
        btnSauvegarder_.setToolTipText("Sauvegarder les changements et sortir");
        btnSauvegarder_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnSauvegarder_.setContentAreaFilled(false);
        btnSauvegarder_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSauvegarder_.setFocusPainted(false);
        btnSauvegarder_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSauvegarder_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSauvegarder_MouseExited(evt);
            }
        });
        btnSauvegarder_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSauvegarder_ActionPerformed(evt);
            }
        });

        btnExit1.setBackground(new java.awt.Color(255, 255, 255));
        btnExit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Delete_22px.png"))); // NOI18N
        btnExit1.setToolTipText("Fermer la fenetre");
        btnExit1.setBorderPainted(false);
        btnExit1.setContentAreaFilled(false);
        btnExit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit1.setFocusPainted(false);
        btnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBoxPers)
                            .addComponent(checkBoxParDef)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateDebut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(dateFin, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btnSauvegarder_, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExit1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnExit1)
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBoxParDef)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBoxPers)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateDebut, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnSauvegarder_, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkBoxParDefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxParDefActionPerformed
        if(checkBoxParDef.isSelected())
        {  checkBoxPers.setSelected(false);
        
        }
    }//GEN-LAST:event_checkBoxParDefActionPerformed

    private void btnSauvegarder_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSauvegarder_MouseEntered
        bordureBleue(btnSauvegarder_);
        Police_Bleu(btnSauvegarder_);
    }//GEN-LAST:event_btnSauvegarder_MouseEntered

    private void btnSauvegarder_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSauvegarder_MouseExited
        bordureBlanche(btnSauvegarder_);
        Police_Blanc(btnSauvegarder_);
    }//GEN-LAST:event_btnSauvegarder_MouseExited

    private void btnSauvegarder_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSauvegarder_ActionPerformed
        //si la periode par defaut a ete chosiit
        if(checkBoxParDef.isSelected())  
            dateDR=true;
        
        else
        {   // si une periode personnalisee a ete choisit
            if(checkBoxPers.isSelected())
            {
                datePR=true;
                
                //sauvegarder les dates
                date1R=dateDebut.getDate();
                date2R=dateFin.getDate();
                
            }
        }
        
        this.hide();
    }//GEN-LAST:event_btnSauvegarder_ActionPerformed

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed
        this.hide();
    }//GEN-LAST:event_btnExit1ActionPerformed

    private void checkBoxPersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxPersActionPerformed
        
        if(checkBoxPers.isSelected())
        {    
             checkBoxParDef.setSelected(false);
             dateDebut.setEnabled(true);
             dateFin.setEnabled(true);
        }
        else
        {
            if(!checkBoxPers.isSelected())
            {
                dateDebut.setEnabled(false);
                dateFin.setEnabled(false);
            }
        }
    }//GEN-LAST:event_checkBoxPersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit1;
    private javax.swing.JButton btnSauvegarder_;
    private javax.swing.JCheckBox checkBoxParDef;
    private javax.swing.JCheckBox checkBoxPers;
    private com.toedter.calendar.JDateChooser dateDebut;
    private com.toedter.calendar.JDateChooser dateFin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration//GEN-END:variables
}
