
package KontRolPackage;

import static KontRolPackage.TWEETS.Encadrer3Btns;
import static KontRolPackage.TWEETS.enlEncadrer3Btns;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ScrollPaneConstants;
import twitter4j.Twitter;
import twitter4j.TwitterException;

public final class INFOS_SUPP_PARENT extends javax.swing.JFrame {

    public INFOS_SUPP_PARENT() throws TwitterException, TwitterException {
        initComponents();
        
        InfoSuppParent();
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
        panel = new javax.swing.JScrollPane();
        infosSuppParent = new javax.swing.JTextArea();
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

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 6, 25), 2));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Informations supplémentaires");

        jSeparator2.setForeground(new java.awt.Color(0, 153, 255));

        jSeparator3.setForeground(new java.awt.Color(0, 153, 255));

        infosSuppParent.setColumns(20);
        infosSuppParent.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        infosSuppParent.setForeground(new java.awt.Color(51, 51, 51));
        infosSuppParent.setLineWrap(true);
        infosSuppParent.setRows(15);
        panel.setViewportView(infosSuppParent);
        panel.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                            .addComponent(btnTwitter_, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFacebook_, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel7))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnManuel_, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnProfil_, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(47, 47, 47)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProfil_, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnManuel_, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(panelMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelConf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMAJ_, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelMisesAJour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnApropos_, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCommentaire_, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTwitter_, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnFacebook_, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void InfoSuppParent() throws TwitterException
    {
         Twitter cnx=INSCRIPTION.ConnexionAPI(INSCRIPTION.dev_consumerK,INSCRIPTION.dev_consumerS,INSCRIPTION.dev_accessT,INSCRIPTION.dev_accessS);
       
        long idf = cnx.getId();
        int status = cnx.showUser(idf).getStatusesCount();
     
        String email = cnx.showUser(idf).getEmail();
        if(email==null)
            email="  <Pas d'adresse email disponible>";
        String emplacement = cnx.showUser(idf).getLocation();
        if(emplacement==null)
            emplacement="  <Pas d'emplacement disponible>";
        String temps = cnx.showUser(idf).getTimeZone();
        if(temps==null)
            temps="  <Pas de TimeZone disponible>";
        String url = cnx.showUser(idf).getURL();
        if(url==null)
            url="  <Pas d'URL disponible>";
        boolean verif = cnx.showUser(idf) .isVerified();
        String reponse;
        if(verif)
           reponse="Oui";
          else
            reponse="Non";
        
        boolean Location = cnx.showUser(idf).isGeoEnabled();
        String location;
        if(Location ) location="Activé";
                else location ="Désactivé";
        
       
        String infos="\n Id: "+idf+"\n    Le 'id' représente le numéro d'identification de l'utilisateur dans le réseau social Twitter."
                + "\n\n Nombre status: "+status+"\n    Le nombre de status/publications de l'utilisateur depuis la création de son compte."
                + "\n\n E-mail: "+email+"\n      L'adresse E-mail sert à prévenir l'utilisateur chaque fois qu'une personne le suit ou qu'une personne lui envoi un message privé.\n"
                + "\n\n Emplacement: "+emplacement+"\n    Indique le pays ou la ville de l'utilisateur.\n"
                + "\n\n Fuseau horaire: "+temps+"\n Le fuseau horaire, util notamment pour que l'on sache à quel moment vous avez publié un message.\n  "
                + "\n\n URL: "+url+"\n  Permet de réaliser de la publication gratuite pour son site,son blog...\n"
                + "\n \nService localisation: "+location+"\n    Permet de savoir si l'utilisateur utilise un service de localisation.\n"
                + "\n\n Compte vérifié: "+reponse+"\n   Indique si li compte de l'utilisateur possède le Badge de vérification Twitter.\n";
        
        infosSuppParent.setText(infos);
                
    }
    
    
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnMinimiserFenetreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimiserFenetreActionPerformed

        INFOS_SUPP_PARENT.this.setState(ICONIFIED);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBas3;
    private javax.swing.JPanel PanelHaut;
    private javax.swing.JButton btnApropos_;
    private javax.swing.JButton btnCommentaire_;
    private javax.swing.JButton btnDashboard_;
    private javax.swing.JButton btnDeconnection_1;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFacebook_;
    private javax.swing.JButton btnMAJ_;
    private javax.swing.JButton btnManuel_;
    private javax.swing.JButton btnMinimiserFenetre;
    private javax.swing.JButton btnPrecedent_;
    private javax.swing.JButton btnProfil_;
    private javax.swing.JButton btnTwitter_;
    private static javax.swing.JTextArea infosSuppParent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JScrollPane panel;
    private javax.swing.JPanel panelConf;
    private javax.swing.JPanel panelMisesAJour;
    private javax.swing.JPanel panelMsg;
    // End of variables declaration//GEN-END:variables
}
