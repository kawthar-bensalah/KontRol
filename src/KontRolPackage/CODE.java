
package KontRolPackage;

import static KontRolPackage.DASHBOARD.Police_Gras;
import static KontRolPackage.DASHBOARD.Police_Normal;


public class CODE extends javax.swing.JFrame {

    public CODE() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        codeConfirmation = new javax.swing.JTextField();
        btnSoumettreCode_ = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnExit_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 6, 25), 2));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Code de confirmation");

        codeConfirmation.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        codeConfirmation.setForeground(new java.awt.Color(51, 51, 51));
        codeConfirmation.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        codeConfirmation.setToolTipText("");
        codeConfirmation.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        codeConfirmation.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnSoumettreCode_.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        btnSoumettreCode_.setForeground(new java.awt.Color(0, 153, 255));
        btnSoumettreCode_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Thumbs Up_22px.png"))); // NOI18N
        btnSoumettreCode_.setText("Soumettre");
        btnSoumettreCode_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        btnSoumettreCode_.setContentAreaFilled(false);
        btnSoumettreCode_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSoumettreCode_.setFocusPainted(false);
        btnSoumettreCode_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSoumettreCode_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSoumettreCode_MouseExited(evt);
            }
        });
        btnSoumettreCode_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoumettreCode_ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(49, 6, 25));
        jLabel2.setText("Veuillez saisir le code :");

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
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExit_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(codeConfirmation, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btnSoumettreCode_, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnExit_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codeConfirmation, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSoumettreCode_, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //methode qui verifie si le code saisit par l utilisateur est bon ( le meme que celui envoyé)
    public boolean VerifierCodeConfirmation()
    {
        return INSCRIPTION.code.equals( codeConfirmation.getText());
    }
    
    private void btnSoumettreCode_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoumettreCode_ActionPerformed

        
        if(!codeConfirmation.getText().isEmpty())
        {
            if(VerifierCodeConfirmation())
            {
                    //inscription terminé passer a l ecran LOGIN
                    CLES_API cles = new CLES_API();
                    cles.setVisible(true);
                    cles.setLocationRelativeTo(null);
                    this.hide();
                }
              
            else 
            {
                ERREUR_CODE_CodeIncorrect erreur = new ERREUR_CODE_CodeIncorrect();
                erreur.setVisible(true);
                erreur.setLocationRelativeTo(null);
            }
        }
        else 
        {
                ERREUR_CODE_ChampVide erreur = new ERREUR_CODE_ChampVide();
                erreur.setVisible(true);
                erreur.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_btnSoumettreCode_ActionPerformed

    private void btnExit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit_ActionPerformed
        this.hide();
    }//GEN-LAST:event_btnExit_ActionPerformed

    private void btnSoumettreCode_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSoumettreCode_MouseEntered
        Police_Gras(btnSoumettreCode_);
    }//GEN-LAST:event_btnSoumettreCode_MouseEntered

    private void btnSoumettreCode_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSoumettreCode_MouseExited
         Police_Normal(btnSoumettreCode_);
    }//GEN-LAST:event_btnSoumettreCode_MouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit_;
    private javax.swing.JButton btnSoumettreCode_;
    private javax.swing.JTextField codeConfirmation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}