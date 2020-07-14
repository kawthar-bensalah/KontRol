
package KontRolPackage;

import static KontRolPackage.ABONNEMENTS.bordureGris;
import static KontRolPackage.INSCRIPTION.bordureBleue;
import static KontRolPackage.TWEETS.Encadrer3Btns;
import static KontRolPackage.TWEETS.enlEncadrer3Btns;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import twitter4j.TwitterException;

public class LISTES extends javax.swing.JFrame {

    public LISTES() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelHaut = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnMinimiserFenetre = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnListeMembre_ = new javax.swing.JButton();
        btnTop5Listes_ = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnListesCree_ = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnProfil_ = new javax.swing.JButton();
        btnManuel_ = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnMAJ_ = new javax.swing.JButton();
        btnCommentaire_ = new javax.swing.JButton();
        btnApropos_ = new javax.swing.JButton();
        btnTwitter_ = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        panelConf = new javax.swing.JPanel();
        panelMisesAJour = new javax.swing.JPanel();
        panelMsg = new javax.swing.JPanel();
        btnConfiguration_ = new javax.swing.JButton();
        btnFacebook_ = new javax.swing.JButton();
        PanelBas3 = new javax.swing.JPanel();
        btnDeconnection_1 = new javax.swing.JButton();
        btnDashboard_ = new javax.swing.JButton();
        btnPrecedent_ = new javax.swing.JButton();

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 6, 25), 2));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Listes");

        jSeparator2.setForeground(new java.awt.Color(0, 153, 255));

        jSeparator3.setForeground(new java.awt.Color(0, 153, 255));

        jLabel16.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Afficher les listes où l'utilisateur est membre.");

        jLabel17.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Afficher les listes crées par l'utilisateur.");

        jLabel15.setFont(new java.awt.Font("Segoe UI Light", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 255));
        jLabel15.setText("Les listes crées");

        btnListeMembre_.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btnListeMembre_.setForeground(new java.awt.Color(0, 153, 255));
        btnListeMembre_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Add User Group Woman Man_45px.png"))); // NOI18N
        btnListeMembre_.setToolTipText("");
        btnListeMembre_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btnListeMembre_.setContentAreaFilled(false);
        btnListeMembre_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListeMembre_.setFocusPainted(false);
        btnListeMembre_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnListeMembre_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnListeMembre_MouseExited(evt);
            }
        });
        btnListeMembre_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListeMembre_ActionPerformed(evt);
            }
        });

        btnTop5Listes_.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btnTop5Listes_.setForeground(new java.awt.Color(0, 153, 255));
        btnTop5Listes_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/5_48px.png"))); // NOI18N
        btnTop5Listes_.setToolTipText("");
        btnTop5Listes_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btnTop5Listes_.setContentAreaFilled(false);
        btnTop5Listes_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTop5Listes_.setFocusPainted(false);
        btnTop5Listes_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTop5Listes_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTop5Listes_MouseExited(evt);
            }
        });
        btnTop5Listes_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTop5Listes_ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 255));
        jLabel9.setText("Les listes - membre");

        btnListesCree_.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btnListesCree_.setForeground(new java.awt.Color(0, 153, 255));
        btnListesCree_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Add List_45px.png"))); // NOI18N
        btnListesCree_.setToolTipText("");
        btnListesCree_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btnListesCree_.setContentAreaFilled(false);
        btnListesCree_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListesCree_.setFocusPainted(false);
        btnListesCree_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnListesCree_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnListesCree_MouseExited(evt);
            }
        });
        btnListesCree_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListesCree_ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Afficher les 5 dérnières listes aux quelles l'utilisateur a été ajouté.");

        jLabel20.setFont(new java.awt.Font("Segoe UI Light", 1, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 153, 255));
        jLabel20.setText("Top 5");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3)
                .addGap(19, 19, 19))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnListesCree_)
                    .addComponent(btnTop5Listes_)
                    .addComponent(btnListeMembre_))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 78, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19))
                    .addComponent(btnTop5Listes_))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnListesCree_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16))
                    .addComponent(btnListeMembre_))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(49, 6, 25));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Menu");

        btnProfil_.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        btnProfil_.setForeground(new java.awt.Color(255, 255, 255));
        btnProfil_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/User_18px.png"))); // NOI18N
        btnProfil_.setText(" Profil");
        btnProfil_.setBorderPainted(false);
        btnProfil_.setContentAreaFilled(false);
        btnProfil_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProfil_.setFocusPainted(false);
        btnProfil_.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProfil_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProfil_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProfil_MouseExited(evt);
            }
        });
        btnProfil_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfil_ActionPerformed(evt);
            }
        });

        btnManuel_.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        btnManuel_.setForeground(new java.awt.Color(255, 255, 255));
        btnManuel_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/User Manual_18px.png"))); // NOI18N
        btnManuel_.setText(" Manuel d'utilisateur");
        btnManuel_.setBorderPainted(false);
        btnManuel_.setContentAreaFilled(false);
        btnManuel_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManuel_.setFocusPainted(false);
        btnManuel_.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnManuel_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnManuel_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManuel_MouseExited(evt);
            }
        });
        btnManuel_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManuel_ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 255));
        jLabel7.setText("Trouvez-nous sur : ");

        btnMAJ_.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        btnMAJ_.setForeground(new java.awt.Color(255, 255, 255));
        btnMAJ_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Update_18px.png"))); // NOI18N
        btnMAJ_.setText(" Mises à jour");
        btnMAJ_.setBorderPainted(false);
        btnMAJ_.setContentAreaFilled(false);
        btnMAJ_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMAJ_.setFocusPainted(false);
        btnMAJ_.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMAJ_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMAJ_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMAJ_MouseExited(evt);
            }
        });
        btnMAJ_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMAJ_ActionPerformed(evt);
            }
        });

        btnCommentaire_.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        btnCommentaire_.setForeground(new java.awt.Color(255, 255, 255));
        btnCommentaire_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Topic_18px.png"))); // NOI18N
        btnCommentaire_.setText(" Commentaire");
        btnCommentaire_.setBorderPainted(false);
        btnCommentaire_.setContentAreaFilled(false);
        btnCommentaire_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCommentaire_.setFocusPainted(false);
        btnCommentaire_.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCommentaire_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCommentaire_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCommentaire_MouseExited(evt);
            }
        });
        btnCommentaire_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommentaire_ActionPerformed(evt);
            }
        });

        btnApropos_.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        btnApropos_.setForeground(new java.awt.Color(255, 255, 255));
        btnApropos_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Info_18px.png"))); // NOI18N
        btnApropos_.setText(" A propos");
        btnApropos_.setBorderPainted(false);
        btnApropos_.setContentAreaFilled(false);
        btnApropos_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnApropos_.setFocusPainted(false);
        btnApropos_.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnApropos_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnApropos_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnApropos_MouseExited(evt);
            }
        });
        btnApropos_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApropos_ActionPerformed(evt);
            }
        });

        btnTwitter_.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        btnTwitter_.setForeground(new java.awt.Color(255, 255, 255));
        btnTwitter_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Twitter_18px.png"))); // NOI18N
        btnTwitter_.setText("  Twitter");
        btnTwitter_.setBorderPainted(false);
        btnTwitter_.setContentAreaFilled(false);
        btnTwitter_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTwitter_.setFocusPainted(false);
        btnTwitter_.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTwitter_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTwitter_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTwitter_MouseExited(evt);
            }
        });
        btnTwitter_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwitter_ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 255));
        jLabel12.setText("Utilisateur");

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 255));
        jLabel13.setText("Contact");

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 255));
        jLabel14.setText("Application");

        panelConf.setBackground(new java.awt.Color(49, 6, 25));

        javax.swing.GroupLayout panelConfLayout = new javax.swing.GroupLayout(panelConf);
        panelConf.setLayout(panelConfLayout);
        panelConfLayout.setHorizontalGroup(
            panelConfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelConfLayout.setVerticalGroup(
            panelConfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        panelMisesAJour.setBackground(new java.awt.Color(49, 6, 25));

        javax.swing.GroupLayout panelMisesAJourLayout = new javax.swing.GroupLayout(panelMisesAJour);
        panelMisesAJour.setLayout(panelMisesAJourLayout);
        panelMisesAJourLayout.setHorizontalGroup(
            panelMisesAJourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelMisesAJourLayout.setVerticalGroup(
            panelMisesAJourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        panelMsg.setBackground(new java.awt.Color(49, 6, 25));

        javax.swing.GroupLayout panelMsgLayout = new javax.swing.GroupLayout(panelMsg);
        panelMsg.setLayout(panelMsgLayout);
        panelMsgLayout.setHorizontalGroup(
            panelMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelMsgLayout.setVerticalGroup(
            panelMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        btnConfiguration_.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        btnConfiguration_.setForeground(new java.awt.Color(255, 255, 255));
        btnConfiguration_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Settings_18px.png"))); // NOI18N
        btnConfiguration_.setText(" Configuration");
        btnConfiguration_.setBorderPainted(false);
        btnConfiguration_.setContentAreaFilled(false);
        btnConfiguration_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfiguration_.setFocusPainted(false);
        btnConfiguration_.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConfiguration_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConfiguration_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConfiguration_MouseExited(evt);
            }
        });
        btnConfiguration_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguration_ActionPerformed(evt);
            }
        });

        btnFacebook_.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        btnFacebook_.setForeground(new java.awt.Color(255, 255, 255));
        btnFacebook_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Facebook_18px.png"))); // NOI18N
        btnFacebook_.setText("  Facebook");
        btnFacebook_.setBorderPainted(false);
        btnFacebook_.setContentAreaFilled(false);
        btnFacebook_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFacebook_.setFocusPainted(false);
        btnFacebook_.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFacebook_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFacebook_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFacebook_MouseExited(evt);
            }
        });
        btnFacebook_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacebook_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel7))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(panelConf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panelMisesAJour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panelMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnApropos_, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCommentaire_, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMAJ_, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnConfiguration_, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTwitter_, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFacebook_, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnProfil_, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnManuel_, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(38, 38, 38)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProfil_, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnManuel_, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(panelMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(panelConf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMAJ_, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(panelMisesAJour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnApropos_, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnConfiguration_, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCommentaire_, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTwitter_, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnFacebook_, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
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

        btnPrecedent_.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnPrecedent_.setForeground(new java.awt.Color(255, 255, 255));
        btnPrecedent_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Return_22px.png"))); // NOI18N
        btnPrecedent_.setToolTipText("Retour à l'écran précédent.");
        btnPrecedent_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 6, 25)));
        btnPrecedent_.setContentAreaFilled(false);
        btnPrecedent_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrecedent_.setFocusPainted(false);
        btnPrecedent_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrecedent_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPrecedent_MouseExited(evt);
            }
        });
        btnPrecedent_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrecedent_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBas3Layout = new javax.swing.GroupLayout(PanelBas3);
        PanelBas3.setLayout(PanelBas3Layout);
        PanelBas3Layout.setHorizontalGroup(
            PanelBas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBas3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeconnection_1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDashboard_, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrecedent_, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(404, 404, 404))
        );
        PanelBas3Layout.setVerticalGroup(
            PanelBas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDeconnection_1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
            .addComponent(btnDashboard_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPrecedent_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelHaut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(PanelBas3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PanelHaut, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelBas3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        LISTES.this.setState(ICONIFIED);
    }//GEN-LAST:event_btnMinimiserFenetreActionPerformed

    private void btnProfil_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfil_MouseEntered

        DASHBOARD.Police_Gras(btnProfil_);
    }//GEN-LAST:event_btnProfil_MouseEntered

    private void btnProfil_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfil_MouseExited
        DASHBOARD.Police_Normal(btnProfil_);
    }//GEN-LAST:event_btnProfil_MouseExited

    private void btnProfil_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfil_ActionPerformed

        PROFIL profil = new PROFIL ();
        profil.setVisible(true);
        profil.setLocationRelativeTo(null);
        this.hide();
    }//GEN-LAST:event_btnProfil_ActionPerformed

    private void btnManuel_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManuel_MouseEntered
        DASHBOARD.Police_Gras(btnManuel_);
    }//GEN-LAST:event_btnManuel_MouseEntered

    private void btnManuel_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManuel_MouseExited
        DASHBOARD.Police_Normal(btnManuel_);
    }//GEN-LAST:event_btnManuel_MouseExited

    private void btnManuel_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManuel_ActionPerformed

        MANUEL man = new MANUEL ();
        man.setVisible(true);
        man.setLocationRelativeTo(null);
        this.hide();
    }//GEN-LAST:event_btnManuel_ActionPerformed

    private void btnMAJ_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMAJ_MouseEntered
        DASHBOARD.Police_Gras(btnMAJ_);
    }//GEN-LAST:event_btnMAJ_MouseEntered

    private void btnMAJ_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMAJ_MouseExited
        DASHBOARD.Police_Normal(btnMAJ_);
    }//GEN-LAST:event_btnMAJ_MouseExited

    private void btnMAJ_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMAJ_ActionPerformed
        MESSAGE_MAJ maj = new MESSAGE_MAJ();
        maj.setVisible(true);
        maj.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnMAJ_ActionPerformed

    private void btnCommentaire_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCommentaire_MouseEntered
        DASHBOARD.Police_Gras(btnCommentaire_);
    }//GEN-LAST:event_btnCommentaire_MouseEntered

    private void btnCommentaire_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCommentaire_MouseExited
        DASHBOARD.Police_Normal(btnCommentaire_);
    }//GEN-LAST:event_btnCommentaire_MouseExited

    private void btnCommentaire_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommentaire_ActionPerformed

        MESSAGE m = new MESSAGE();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCommentaire_ActionPerformed

    private void btnApropos_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApropos_MouseEntered
        DASHBOARD.Police_Gras(btnApropos_);
    }//GEN-LAST:event_btnApropos_MouseEntered

    private void btnApropos_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApropos_MouseExited
        DASHBOARD.Police_Normal(btnApropos_);
    }//GEN-LAST:event_btnApropos_MouseExited

    private void btnApropos_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApropos_ActionPerformed

        APROPOS apropos = new APROPOS();
        apropos.setVisible(true);
        apropos.setLocationRelativeTo(null);
        this.hide();
    }//GEN-LAST:event_btnApropos_ActionPerformed

    private void btnTwitter_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTwitter_MouseEntered
        DASHBOARD.Police_Bleu(btnTwitter_);
    }//GEN-LAST:event_btnTwitter_MouseEntered

    private void btnTwitter_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTwitter_MouseExited
        DASHBOARD.Police_Blanc(btnTwitter_);
    }//GEN-LAST:event_btnTwitter_MouseExited

    private void btnTwitter_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwitter_ActionPerformed

        try
        {
            Desktop.getDesktop().browse(new URI("https://twitter.com/DeveloppeursK"));
        }

        catch (IOException | URISyntaxException ex) {
            Logger.getLogger(DASHBOARD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTwitter_ActionPerformed

    private void btnConfiguration_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfiguration_MouseEntered
        DASHBOARD.Police_Gras(btnConfiguration_);
    }//GEN-LAST:event_btnConfiguration_MouseEntered

    private void btnConfiguration_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfiguration_MouseExited
        DASHBOARD.Police_Normal(btnConfiguration_);
    }//GEN-LAST:event_btnConfiguration_MouseExited

    private void btnConfiguration_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguration_ActionPerformed

       
    }//GEN-LAST:event_btnConfiguration_ActionPerformed

    private void btnFacebook_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacebook_MouseEntered
        DASHBOARD.Police_Bleu(btnFacebook_);
    }//GEN-LAST:event_btnFacebook_MouseEntered

    private void btnFacebook_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacebook_MouseExited
        DASHBOARD.Police_Blanc(btnFacebook_);
    }//GEN-LAST:event_btnFacebook_MouseExited

    private void btnFacebook_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacebook_ActionPerformed
        try 
        { 
                    Desktop.getDesktop().browse(new URI("https://www.facebook.com/KontRol-237123163687858/"));
        } 
        
        catch (IOException | URISyntaxException ex) {
            Logger.getLogger(DASHBOARD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnFacebook_ActionPerformed

    private void btnListeMembre_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListeMembre_MouseEntered
        bordureBleue(btnListeMembre_);
    }//GEN-LAST:event_btnListeMembre_MouseEntered

    private void btnListeMembre_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListeMembre_MouseExited
        bordureGris(btnListeMembre_);
    }//GEN-LAST:event_btnListeMembre_MouseExited

    private void btnListeMembre_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListeMembre_ActionPerformed

        LISTES_MEMBRE abnsL = new LISTES_MEMBRE();
        abnsL.setVisible(true);
        abnsL.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnListeMembre_ActionPerformed

    private void btnTop5Listes_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTop5Listes_MouseEntered
       bordureBleue(btnTop5Listes_);
    }//GEN-LAST:event_btnTop5Listes_MouseEntered

    private void btnTop5Listes_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTop5Listes_MouseExited
        bordureGris(btnTop5Listes_);
    }//GEN-LAST:event_btnTop5Listes_MouseExited

    private void btnTop5Listes_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTop5Listes_ActionPerformed

                ListeTop5 frame = null;
        try {
            frame = new ListeTop5();
        } catch (TwitterException ex) {
            Logger.getLogger(LISTES.class.getName()).log(Level.SEVERE, null, ex);
        }
		frame.setSize(800, 600);	
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnTop5Listes_ActionPerformed

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

    private void btnPrecedent_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrecedent_MouseEntered
        Encadrer3Btns(btnPrecedent_);
    }//GEN-LAST:event_btnPrecedent_MouseEntered

    private void btnPrecedent_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrecedent_MouseExited
        enlEncadrer3Btns(btnPrecedent_);
    }//GEN-LAST:event_btnPrecedent_MouseExited

    private void btnPrecedent_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrecedent_ActionPerformed

        DASHBOARD d = new  DASHBOARD();
        d.setVisible(true);
        d.setLocationRelativeTo(null);
        this.hide();
    }//GEN-LAST:event_btnPrecedent_ActionPerformed

    private void btnListesCree_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListesCree_MouseEntered
        bordureBleue(btnListesCree_);
    }//GEN-LAST:event_btnListesCree_MouseEntered

    private void btnListesCree_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListesCree_MouseExited
       bordureGris(btnListesCree_);
    }//GEN-LAST:event_btnListesCree_MouseExited

    private void btnListesCree_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListesCree_ActionPerformed

        LISTE_CREES l = new LISTE_CREES();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnListesCree_ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBas3;
    private javax.swing.JPanel PanelHaut;
    private javax.swing.JButton btnApropos_;
    private javax.swing.JButton btnCommentaire_;
    private javax.swing.JButton btnConfiguration_;
    private javax.swing.JButton btnDashboard_;
    private javax.swing.JButton btnDeconnection_1;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFacebook_;
    private javax.swing.JButton btnListeMembre_;
    private javax.swing.JButton btnListesCree_;
    private javax.swing.JButton btnMAJ_;
    private javax.swing.JButton btnManuel_;
    private javax.swing.JButton btnMinimiserFenetre;
    private javax.swing.JButton btnPrecedent_;
    private javax.swing.JButton btnProfil_;
    private javax.swing.JButton btnTop5Listes_;
    private javax.swing.JButton btnTwitter_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel panelConf;
    private javax.swing.JPanel panelMisesAJour;
    private javax.swing.JPanel panelMsg;
    // End of variables declaration//GEN-END:variables
}
