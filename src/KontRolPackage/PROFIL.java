
package KontRolPackage;

import static KontRolPackage.ABNMNTS_CHERCHER.Bordure_Police_Aubergine;
import static KontRolPackage.CHANGER_CIBLE.newCible;
import static KontRolPackage.DASHBOARD.Police_Gras;
import static KontRolPackage.DASHBOARD.Police_Normal;
import static KontRolPackage.INSCRIPTION.ConnexionAPI;
import static KontRolPackage.INSCRIPTION.VerifierUserNameTwitter;
import static KontRolPackage.INSCRIPTION.session;
import static KontRolPackage.LOGIN.pseudo;
import static KontRolPackage.LOGIN.mdp;
import static KontRolPackage.LOGIN.userTwitter;
import static KontRolPackage.TWEETS.Encadrer3Btns;
import static KontRolPackage.TWEETS.enlEncadrer3Btns;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import org.neo4j.driver.v1.StatementResult;
import twitter4j.Twitter;

public class PROFIL extends javax.swing.JFrame {

    public static ImageIcon imageProfil;
    
    public PROFIL() {
        initComponents();
        
        
        lblPseudo.setText(pseudo);
        lblUserName.setText(userTwitter);
        imageDeProfil.setIcon(imageProfil);
        
        cible.setText("@"+LOGIN_CIBLE.userCible);
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        PanelHaut = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnMinimiserFenetre = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        imageDeProfil = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblPseudo = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        cible = new javax.swing.JLabel();
        btnModifierImage = new javax.swing.JButton();
        btnSupprimerPhoto_ = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnNouvelleCles_ = new javax.swing.JButton();
        texteNom = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btnChangerCible_ = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        btnSauvegarder_ = new javax.swing.JButton();
        btnSuppCompte_ = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        texteMdp = new javax.swing.JPasswordField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        texteConfirmerMdp = new javax.swing.JPasswordField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        PanelBas3 = new javax.swing.JPanel();
        btnDeconnection_1 = new javax.swing.JButton();
        btnDashboard_ = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(49, 6, 25));

        PanelHaut.setBackground(new java.awt.Color(49, 6, 25));

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Delete_22px.png"))); // NOI18N
        btnExit.setToolTipText("Fermer la fenetre");
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setFocusPainted(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnMinimiserFenetre.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimiserFenetre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Icones/Minus_22px.png"))); // NOI18N
        btnMinimiserFenetre.setToolTipText("Minimiser la fenetre");
        btnMinimiserFenetre.setBorderPainted(false);
        btnMinimiserFenetre.setContentAreaFilled(false);
        btnMinimiserFenetre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimiserFenetre.setFocusPainted(false);
        btnMinimiserFenetre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimiserFenetreActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("KontRol");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Version1.0");

        javax.swing.GroupLayout PanelHautLayout = new javax.swing.GroupLayout(PanelHaut);
        PanelHaut.setLayout(PanelHautLayout);
        PanelHautLayout.setHorizontalGroup(
            PanelHautLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelHautLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMinimiserFenetre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        PanelHautLayout.setVerticalGroup(
            PanelHautLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHautLayout.createSequentialGroup()
                .addGroup(PanelHautLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit)
                    .addComponent(btnMinimiserFenetre)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(49, 6, 25));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        imageDeProfil.setBackground(new java.awt.Color(255, 255, 255));
        imageDeProfil.setForeground(new java.awt.Color(255, 255, 255));
        imageDeProfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageDeProfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/images.jpeg"))); // NOI18N
        imageDeProfil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 2));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("Pseudo");

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setText("Nom d'utilisateur ");

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 255));
        jLabel6.setText("Cible");

        lblPseudo.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lblPseudo.setForeground(new java.awt.Color(255, 255, 255));
        lblPseudo.setText("Rania");

        lblUserName.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblUserName.setText("@Rania54685435");

        cible.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        cible.setForeground(new java.awt.Color(255, 255, 255));
        cible.setText("...");

        btnModifierImage.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnModifierImage.setForeground(new java.awt.Color(255, 255, 255));
        btnModifierImage.setText("Modifier image");
        btnModifierImage.setBorder(null);
        btnModifierImage.setContentAreaFilled(false);
        btnModifierImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModifierImage.setFocusPainted(false);
        btnModifierImage.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnModifierImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModifierImageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModifierImageMouseExited(evt);
            }
        });
        btnModifierImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierImageActionPerformed(evt);
            }
        });

        btnSupprimerPhoto_.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSupprimerPhoto_.setForeground(new java.awt.Color(255, 255, 255));
        btnSupprimerPhoto_.setText("X");
        btnSupprimerPhoto_.setToolTipText("Supprimer la photo de profil.");
        btnSupprimerPhoto_.setBorder(null);
        btnSupprimerPhoto_.setContentAreaFilled(false);
        btnSupprimerPhoto_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSupprimerPhoto_.setFocusPainted(false);
        btnSupprimerPhoto_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerPhoto_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPseudo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cible, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imageDeProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSupprimerPhoto_, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModifierImage, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnSupprimerPhoto_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imageDeProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModifierImage, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPseudo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cible)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Modifier le profil");

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(49, 6, 25));
        jLabel10.setText("Nom : ");

        btnNouvelleCles_.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btnNouvelleCles_.setForeground(new java.awt.Color(49, 6, 25));
        btnNouvelleCles_.setText("Nouvelles clés API");
        btnNouvelleCles_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(49, 6, 25), 1, true));
        btnNouvelleCles_.setContentAreaFilled(false);
        btnNouvelleCles_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNouvelleCles_.setFocusPainted(false);
        btnNouvelleCles_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNouvelleCles_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNouvelleCles_MouseExited(evt);
            }
        });
        btnNouvelleCles_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNouvelleCles_ActionPerformed(evt);
            }
        });

        texteNom.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        texteNom.setForeground(new java.awt.Color(51, 51, 51));
        texteNom.setBorder(null);

        btnChangerCible_.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btnChangerCible_.setForeground(new java.awt.Color(49, 6, 25));
        btnChangerCible_.setText("Changer de cible");
        btnChangerCible_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(49, 6, 25), 1, true));
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

        jSeparator6.setForeground(new java.awt.Color(0, 153, 255));

        jSeparator7.setForeground(new java.awt.Color(0, 153, 255));

        btnSauvegarder_.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnSauvegarder_.setForeground(new java.awt.Color(0, 153, 255));
        btnSauvegarder_.setText("Enregistrer");
        btnSauvegarder_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
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

        btnSuppCompte_.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btnSuppCompte_.setForeground(new java.awt.Color(49, 6, 25));
        btnSuppCompte_.setText("Supprimer le compte");
        btnSuppCompte_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(49, 6, 25), 1, true));
        btnSuppCompte_.setContentAreaFilled(false);
        btnSuppCompte_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSuppCompte_.setFocusPainted(false);
        btnSuppCompte_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSuppCompte_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSuppCompte_MouseExited(evt);
            }
        });
        btnSuppCompte_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuppCompte_ActionPerformed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/pen.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(49, 6, 25));
        jLabel13.setText("Mot de passe :");

        texteMdp.setBorder(null);

        jLabel16.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(49, 6, 25));
        jLabel16.setText("Confirmer le mot de passe :");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/pen.png"))); // NOI18N

        texteConfirmerMdp.setBorder(null);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/pen.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel10)
                                .addComponent(texteNom, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                .addComponent(jLabel16)
                                .addComponent(jSeparator3)
                                .addComponent(texteMdp)
                                .addComponent(jSeparator5))
                            .addComponent(jLabel13)
                            .addComponent(texteConfirmerMdp, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNouvelleCles_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnChangerCible_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSuppCompte_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)))
                        .addGap(65, 65, 65))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnSauvegarder_, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(284, 284, 284))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texteNom, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnNouvelleCles_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnChangerCible_, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texteMdp, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texteConfirmerMdp, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnSuppCompte_, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSauvegarder_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        PanelBas3.setBackground(new java.awt.Color(49, 6, 25));
        PanelBas3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        btnDeconnection_1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnDeconnection_1.setForeground(new java.awt.Color(255, 255, 255));
        btnDeconnection_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Logout Rounded Left_22px.png"))); // NOI18N
        btnDeconnection_1.setToolTipText("Se déconnecter et passer à l'écran Login");
        btnDeconnection_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 6, 25)));
        btnDeconnection_1.setContentAreaFilled(false);
        btnDeconnection_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeconnection_1.setFocusPainted(false);
        btnDeconnection_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeconnection_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeconnection_1MouseExited(evt);
            }
        });
        btnDeconnection_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeconnection_1ActionPerformed(evt);
            }
        });

        btnDashboard_.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnDashboard_.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Home_22px.png"))); // NOI18N
        btnDashboard_.setToolTipText("Retour à l'écran principal");
        btnDashboard_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 6, 25)));
        btnDashboard_.setContentAreaFilled(false);
        btnDashboard_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDashboard_.setFocusPainted(false);
        btnDashboard_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDashboard_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDashboard_MouseExited(evt);
            }
        });
        btnDashboard_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboard_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBas3Layout = new javax.swing.GroupLayout(PanelBas3);
        PanelBas3.setLayout(PanelBas3Layout);
        PanelBas3Layout.setHorizontalGroup(
            PanelBas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBas3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeconnection_1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDashboard_, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(410, 410, 410))
        );
        PanelBas3Layout.setVerticalGroup(
            PanelBas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDeconnection_1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
            .addComponent(btnDashboard_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelHaut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator1)
                    .addComponent(PanelBas3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PanelHaut, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelBas3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
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

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnMinimiserFenetreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimiserFenetreActionPerformed
        PROFIL.this.setState(ICONIFIED);
    }//GEN-LAST:event_btnMinimiserFenetreActionPerformed

    private void btnNouvelleCles_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNouvelleCles_ActionPerformed

        CHANGER_CLES cc = new CHANGER_CLES ();
        cc.setVisible(true);
        cc.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnNouvelleCles_ActionPerformed

    private void btnChangerCible_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangerCible_ActionPerformed
    
        CHANGER_CIBLE cc = new CHANGER_CIBLE();
        cc.setVisible(true);
        cc.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btnChangerCible_ActionPerformed

    private void btnSauvegarder_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSauvegarder_ActionPerformed

        boolean mdpVerifie=false,confMdpVerifie=false;
        StatementResult requete_ModificationNom,requete_ModificationUser,requete_ModificationMdp;
        
        //champ du nom / pseudo
        if(!texteNom.getText().isEmpty())
        {
            //si la syntaxe du pseudo est eronnee on affiche un message d erreur
            if(texteNom.getText().length()<4 || texteNom.getText().length()>16) 
                  { 
                      //si le pseudo introduit n'est pas coherant, une fenetre d erreur s affiche et les champs jugés necesaires seront vidés
                      ERREUR_INSCRIPTION_TaillePseudo erreur = new ERREUR_INSCRIPTION_TaillePseudo();
                      erreur.setVisible(true);
                      erreur.setLocationRelativeTo(null);
                  }
            //si elle est juste on remplace le pseudo dans la bdd
            else 
            {
                pseudo=texteNom.getText();
                
                requete_ModificationUser = session.run("match (u:USER{username:'"+userTwitter+"'})"
                    + " set u.pseudo='"+pseudo+"'"
                    + " return u.pseudo as pseudo");
                
                //si la requete echoue, on affiche un msg d erreur
                if(!requete_ModificationUser.hasNext())
                {
                    ERREUR_PROFIL_Modifications erreur = new ERREUR_PROFIL_Modifications();
                    erreur.setVisible(true);
                    erreur.setLocationRelativeTo(null);
                }
            }
           
        }
        
        
        //champs mot de passe et confirmation mot de passe 
        if(!texteMdp.getText().isEmpty())
        {
            //si la syntaxe du mot de passe est eronne on affiche un msg d erreur 
            if(texteMdp.getText().length()<8 || texteMdp.getText().length()>16)
                  {   //pareil pour le mot de passe 
                      ERREUR_INSCRIPTION_MDP erreur = new ERREUR_INSCRIPTION_MDP();
                      erreur.setVisible(true);
                      erreur.setLocationRelativeTo(null);
                  }
            //sinon  si elle est juste on met a true le premier boolean
            else mdpVerifie=true;

            //si les deux mots de passes ne sont pas identiques on affiche un message d erreur
            if(!texteMdp.getText().equals(texteConfirmerMdp.getText()))
                  { 
                      // meme remarque ici
                      ERREUR_INSCRIPTION_MDPconf erreur = new ERREUR_INSCRIPTION_MDPconf();
                      erreur.setVisible(true);
                      erreur.setLocationRelativeTo(null);
                  }
            //sinon si ils le sont on met le deuxieme boolean a true
            else  confMdpVerifie=true;
            
            // si les deux booleans sont a true alors on sauvegarde le mot de passe dans la bdd
            if(mdpVerifie && confMdpVerifie)
            {
                mdp=texteMdp.getText();
                requete_ModificationMdp= session.run("match (u:USER{username:'"+userTwitter+"'})"
                    + " set u.mdp='"+mdp+"'"
                    + " return u.mdp as mot_de_passe");
                
                //si la requete echoue on affiche un msg d erreur 
                if(!requete_ModificationMdp.hasNext())
                {
                    ERREUR_PROFIL_Modifications erreur = new ERREUR_PROFIL_Modifications();
                    erreur.setVisible(true);
                    erreur.setLocationRelativeTo(null);
                }
            }
        }
        
        
    }//GEN-LAST:event_btnSauvegarder_ActionPerformed

    private void btnSuppCompte_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuppCompte_ActionPerformed

        MESSAGE_SUPPRESSION msg = new MESSAGE_SUPPRESSION();
        msg.setVisible(true);
        msg.setLocationRelativeTo(null);
        
        if(MESSAGE_SUPPRESSION.supp)
        {
         Twitter AccesAPI = ConnexionAPI(INSCRIPTION.dev_consumerK,INSCRIPTION.dev_consumerS,INSCRIPTION.dev_accessT,INSCRIPTION.dev_accessS);
         boolean verifierUser = VerifierUserNameTwitter(newCible, AccesAPI);
                if(verifierUser) // si le user existe réellement dans la base de donnes Twitter
                {
                    //compter toutes les relations 
                    StatementResult requeteCompter = session.run("MATCH ()-->() RETURN count(*) as relation");
                    int nbr=Integer.valueOf(requeteCompter.toString());
                    
                    int i=1;
                    while(i<nbr)
                    {
                        //verifier si la cible existe deja dans la bdd neo4j
                        StatementResult requeteCouperRelation = session.run("match(u:USER{username:'"+userTwitter+"'})-[s:SUIT]->(c:CIBLE) "
                        + "delete s return as supprime");

                        if(requeteCouperRelation.hasNext())
                        {
                            StatementResult requeteSupprimerCibles = session.run("match(c:CIBLE) "
                            + "delete c return as supprime");

                            if(requeteSupprimerCibles.hasNext())
                            {
                                StatementResult requeteSupprimerUser = session.run("match(u:USER{username:'"+userTwitter+"'}) "
                                + "delete u return as supprime");
                                
                                if(requeteSupprimerUser.hasNext())
                                {
                                    //redirection vers l'ecran login
                                    LOGIN l= new LOGIN();
                                    l.setVisible(true);
                                    l.setLocationRelativeTo(null);
                                    this.hide();
                                }
                               
                            }
                        }
                    }
                }
        }
        else
        {
            ERREUR_SUPPRESSION_echouee erreur = new ERREUR_SUPPRESSION_echouee();
            erreur.setVisible(true);
            erreur.setLocationRelativeTo(null);
        }
    
    }//GEN-LAST:event_btnSuppCompte_ActionPerformed

    private void btnNouvelleCles_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNouvelleCles_MouseEntered
        INSCRIPTION.bordureBleue(btnNouvelleCles_);
         btnNouvelleCles_.setForeground(new java.awt.Color(0, 153, 255));
         

    }//GEN-LAST:event_btnNouvelleCles_MouseEntered

    private void btnNouvelleCles_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNouvelleCles_MouseExited
          Bordure_Police_Aubergine(btnNouvelleCles_);
    }//GEN-LAST:event_btnNouvelleCles_MouseExited

    private void btnChangerCible_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangerCible_MouseEntered
        INSCRIPTION.bordureBleue(btnChangerCible_);
         btnChangerCible_.setForeground(new java.awt.Color(0, 153, 255));
    }//GEN-LAST:event_btnChangerCible_MouseEntered

    private void btnChangerCible_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangerCible_MouseExited
        Bordure_Police_Aubergine(btnChangerCible_);
    }//GEN-LAST:event_btnChangerCible_MouseExited

    private void btnSuppCompte_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuppCompte_MouseEntered
         INSCRIPTION.bordureBleue(btnSuppCompte_);
         btnSuppCompte_.setForeground(new java.awt.Color(0, 153, 255));
    }//GEN-LAST:event_btnSuppCompte_MouseEntered

    private void btnSuppCompte_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuppCompte_MouseExited
         Bordure_Police_Aubergine(btnSuppCompte_);
    }//GEN-LAST:event_btnSuppCompte_MouseExited

    private void btnModifierImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierImageActionPerformed
       
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        
        File fichier = chooser.getSelectedFile();
        
        String NomFichier = fichier.getAbsolutePath();
        
        ImageIcon image =new ImageIcon(NomFichier);
        
        Image img = image.getImage();
        Image newimg = img.getScaledInstance(imageDeProfil.getWidth(), imageDeProfil.getHeight(), Image.SCALE_SMOOTH);
        
        ImageIcon photo = new ImageIcon(newimg);
        
        imageProfil=photo;
        imageDeProfil.setIcon(imageProfil);
    }//GEN-LAST:event_btnModifierImageActionPerformed

    private void btnModifierImageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifierImageMouseEntered
        
        btnModifierImage.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); 

    }//GEN-LAST:event_btnModifierImageMouseEntered

    private void btnModifierImageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifierImageMouseExited
        
        btnModifierImage.setFont(new java.awt.Font("Segoe UI Light",0, 12)); 
    }//GEN-LAST:event_btnModifierImageMouseExited

    private void btnSupprimerPhoto_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerPhoto_ActionPerformed
        ImageIcon i= new ImageIcon("C:\\Users\\RANIA\\Documents\\NetBeansProjects\\TwitterPFE\\src\\KontRolPackage\\Icones\\NoPicture.png"); 
        Image img = i.getImage();
        Image newimg = img.getScaledInstance(imageDeProfil.getWidth(), imageDeProfil.getHeight(), Image.SCALE_SMOOTH);
        imageProfil.setImage(newimg);
        imageDeProfil.setIcon(imageProfil);
    }//GEN-LAST:event_btnSupprimerPhoto_ActionPerformed

    private void btnSauvegarder_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSauvegarder_MouseEntered
        Police_Gras(btnSauvegarder_);
        btnSauvegarder_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 2, true));

    }//GEN-LAST:event_btnSauvegarder_MouseEntered

    private void btnSauvegarder_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSauvegarder_MouseExited
        
        Police_Normal(btnSauvegarder_);
        btnSauvegarder_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));

    }//GEN-LAST:event_btnSauvegarder_MouseExited

    private void btnDeconnection_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeconnection_1MouseEntered
        Encadrer3Btns(btnDeconnection_1);
    }//GEN-LAST:event_btnDeconnection_1MouseEntered

    private void btnDeconnection_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeconnection_1MouseExited
        enlEncadrer3Btns(btnDeconnection_1);
    }//GEN-LAST:event_btnDeconnection_1MouseExited

    private void btnDeconnection_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeconnection_1ActionPerformed

        DASHBOARD.seDeconnecter();
    }//GEN-LAST:event_btnDeconnection_1ActionPerformed

    private void btnDashboard_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboard_MouseEntered
        Encadrer3Btns(btnDashboard_);
    }//GEN-LAST:event_btnDashboard_MouseEntered

    private void btnDashboard_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboard_MouseExited
        enlEncadrer3Btns(btnDashboard_);
    }//GEN-LAST:event_btnDashboard_MouseExited

    private void btnDashboard_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboard_ActionPerformed

        DASHBOARD dash = new DASHBOARD();
        dash.setVisible(true);
        dash.setLocationRelativeTo(null);
        this.hide();
    }//GEN-LAST:event_btnDashboard_ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBas3;
    private javax.swing.JPanel PanelHaut;
    private javax.swing.JButton btnChangerCible_;
    private javax.swing.JButton btnDashboard_;
    private javax.swing.JButton btnDeconnection_1;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMinimiserFenetre;
    private javax.swing.JButton btnModifierImage;
    private javax.swing.JButton btnNouvelleCles_;
    private javax.swing.JButton btnSauvegarder_;
    private javax.swing.JButton btnSuppCompte_;
    private javax.swing.JButton btnSupprimerPhoto_;
    public static javax.swing.JLabel cible;
    public static javax.swing.JLabel imageDeProfil;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblPseudo;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPasswordField texteConfirmerMdp;
    private javax.swing.JPasswordField texteMdp;
    private javax.swing.JTextField texteNom;
    // End of variables declaration//GEN-END:variables
}
