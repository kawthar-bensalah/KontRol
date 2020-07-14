
package KontRolPackage;

import static KontRolPackage.ABONNEMENTS.bordureGris;
import static KontRolPackage.INSCRIPTION.bordureBleue;
import static KontRolPackage.TWEETS.Encadrer3Btns;
import static KontRolPackage.TWEETS.enlEncadrer3Btns;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.ScrollPaneConstants;
import twitter4j.HashtagEntity;
import twitter4j.Paging;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;

public class HASHTAGS_TWEETS extends javax.swing.JFrame {

    static ArrayList<String> h;
    static JButton b[];
    static int i=0,nn=0;
    static ArrayList<ObjetHM> tw=new ArrayList<ObjetHM>();
    static String inf;
    static String[] g;
    static String d;
        
    public HASHTAGS_TWEETS() {
        initComponents();
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelHaut = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnFermer_ = new javax.swing.JButton();
        btnMinimiserFenetre = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        btnAfficherHahstags_ = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        texteTweets = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        texteInfosTweets = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnViderHahstags_ = new javax.swing.JButton();
        btnSauvegarder_ = new javax.swing.JButton();
        btnHashtagSuiv_ = new javax.swing.JButton();
        btnHashtagPre_ = new javax.swing.JButton();
        panelScroll = new javax.swing.JScrollPane(listeHashtags);
        listeHashtags = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnProfil_ = new javax.swing.JButton();
        btnManuel_ = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
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
        PanelBas2 = new javax.swing.JPanel();
        btnDeconnection_ = new javax.swing.JButton();
        btnDashboard_ = new javax.swing.JButton();
        btnPrecedent_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(49, 6, 25));

        PanelHaut.setBackground(new java.awt.Color(49, 6, 25));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("KontRol");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Version1.0");

        btnFermer_.setBackground(new java.awt.Color(255, 255, 255));
        btnFermer_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Icones/Delete_22px.png"))); // NOI18N
        btnFermer_.setToolTipText("Fermer la fenetre");
        btnFermer_.setBorderPainted(false);
        btnFermer_.setContentAreaFilled(false);
        btnFermer_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFermer_.setFocusPainted(false);
        btnFermer_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFermer_ActionPerformed(evt);
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
                .addComponent(btnFermer_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        PanelHautLayout.setVerticalGroup(
            PanelHautLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHautLayout.createSequentialGroup()
                .addGroup(PanelHautLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMinimiserFenetre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFermer_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelHautLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 6, 25)));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Contenu Hashtags");

        jSeparator3.setForeground(new java.awt.Color(0, 153, 255));

        jSeparator4.setForeground(new java.awt.Color(0, 153, 255));

        btnAfficherHahstags_.setFont(new java.awt.Font("Segoe UI Light", 1, 15)); // NOI18N
        btnAfficherHahstags_.setForeground(new java.awt.Color(0, 153, 255));
        btnAfficherHahstags_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Fast Forward_39px.png"))); // NOI18N
        btnAfficherHahstags_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btnAfficherHahstags_.setContentAreaFilled(false);
        btnAfficherHahstags_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAfficherHahstags_.setFocusPainted(false);
        btnAfficherHahstags_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAfficherHahstags_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAfficherHahstags_MouseExited(evt);
            }
        });
        btnAfficherHahstags_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfficherHahstags_ActionPerformed(evt);
            }
        });

        texteTweets.setColumns(20);
        texteTweets.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        texteTweets.setForeground(new java.awt.Color(51, 51, 51));
        texteTweets.setRows(5);
        texteTweets.setToolTipText("Le texte du tweet séléctionné");
        texteTweets.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(49, 6, 25), 1, true));
        texteTweets.setFocusable(false);
        jScrollPane2.setViewportView(texteTweets);

        texteInfosTweets.setColumns(20);
        texteInfosTweets.setFont(new java.awt.Font("Segoe UI Light", 1, 13)); // NOI18N
        texteInfosTweets.setForeground(new java.awt.Color(51, 51, 51));
        texteInfosTweets.setRows(5);
        texteInfosTweets.setToolTipText("Les informations concernant le tweet séléctionné");
        texteInfosTweets.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(49, 6, 25), 1, true));
        texteInfosTweets.setFocusable(false);
        jScrollPane3.setViewportView(texteInfosTweets);

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(49, 6, 25));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Texte du Tweet/RT consernant le Hashtag");

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(49, 6, 25));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Informations sur le Tweet/RT");

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(49, 6, 25));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Liste des Hashtags");

        btnViderHahstags_.setFont(new java.awt.Font("Segoe UI Light", 1, 15)); // NOI18N
        btnViderHahstags_.setForeground(new java.awt.Color(0, 153, 255));
        btnViderHahstags_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Rewind_39px.png"))); // NOI18N
        btnViderHahstags_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btnViderHahstags_.setContentAreaFilled(false);
        btnViderHahstags_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViderHahstags_.setFocusPainted(false);
        btnViderHahstags_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnViderHahstags_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnViderHahstags_MouseExited(evt);
            }
        });
        btnViderHahstags_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViderHahstags_ActionPerformed(evt);
            }
        });

        btnSauvegarder_.setFont(new java.awt.Font("Segoe UI Light", 1, 15)); // NOI18N
        btnSauvegarder_.setForeground(new java.awt.Color(0, 153, 255));
        btnSauvegarder_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Save_30px.png"))); // NOI18N
        btnSauvegarder_.setToolTipText("Sauvegarder les informations affichés du tweet");
        btnSauvegarder_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
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

        btnHashtagSuiv_.setFont(new java.awt.Font("Segoe UI Light", 1, 15)); // NOI18N
        btnHashtagSuiv_.setForeground(new java.awt.Color(0, 153, 255));
        btnHashtagSuiv_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Chevron Right_22px.png"))); // NOI18N
        btnHashtagSuiv_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(49, 6, 25), 1, true));
        btnHashtagSuiv_.setContentAreaFilled(false);
        btnHashtagSuiv_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHashtagSuiv_.setFocusPainted(false);
        btnHashtagSuiv_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHashtagSuiv_ActionPerformed(evt);
            }
        });

        btnHashtagPre_.setFont(new java.awt.Font("Segoe UI Light", 1, 15)); // NOI18N
        btnHashtagPre_.setForeground(new java.awt.Color(0, 153, 255));
        btnHashtagPre_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Chevron Left_22px.png"))); // NOI18N
        btnHashtagPre_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(49, 6, 25), 1, true));
        btnHashtagPre_.setContentAreaFilled(false);
        btnHashtagPre_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHashtagPre_.setFocusPainted(false);
        btnHashtagPre_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHashtagPre_ActionPerformed(evt);
            }
        });

        panelScroll.setBackground(new java.awt.Color(255, 255, 255));

        listeHashtags.setColumns(20);
        listeHashtags.setRows(1000);
        listeHashtags.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(49, 6, 25), 1, true));
        listeHashtags.setFocusable(false);
        panelScroll.setViewportView(listeHashtags);
        panelScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnViderHahstags_, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAfficherHahstags_))
                    .addComponent(btnSauvegarder_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnHashtagPre_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHashtagSuiv_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnHashtagSuiv_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHashtagPre_, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnAfficherHahstags_)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnViderHahstags_)
                                .addGap(36, 36, 36)
                                .addComponent(btnSauvegarder_, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(49, 6, 25));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Menu");

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

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 255));
        jLabel10.setText("Trouvez-nous sur : ");

        jPanel7.setBackground(new java.awt.Color(49, 6, 25));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(49, 6, 25));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(49, 6, 25));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(49, 6, 25));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

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
        btnApropos_.setText(" À propos");
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
                        .addGap(1, 1, 1)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                            .addComponent(btnProfil_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnManuel_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(5, 5, 5))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel10))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnProfil_, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnManuel_, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
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
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCommentaire_, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTwitter_, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(btnFacebook_, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        PanelBas2.setBackground(new java.awt.Color(49, 6, 25));
        PanelBas2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        btnDeconnection_.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnDeconnection_.setForeground(new java.awt.Color(255, 255, 255));
        btnDeconnection_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Logout Rounded Left_22px.png"))); // NOI18N
        btnDeconnection_.setToolTipText("Se déconnecter et passer à l'écran Login");
        btnDeconnection_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 6, 25)));
        btnDeconnection_.setContentAreaFilled(false);
        btnDeconnection_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeconnection_.setFocusPainted(false);
        btnDeconnection_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeconnection_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeconnection_MouseExited(evt);
            }
        });
        btnDeconnection_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeconnection_ActionPerformed(evt);
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

        javax.swing.GroupLayout PanelBas2Layout = new javax.swing.GroupLayout(PanelBas2);
        PanelBas2.setLayout(PanelBas2Layout);
        PanelBas2Layout.setHorizontalGroup(
            PanelBas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBas2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeconnection_, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDashboard_, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrecedent_, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(404, 404, 404))
        );
        PanelBas2Layout.setVerticalGroup(
            PanelBas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDeconnection_, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PanelBas2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1))
                        .addContainerGap())))
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
                .addComponent(PanelBas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
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
public void ExtractionHashtags_DATE(String user,Date date1,Date date2)
    {
        //Connection à Twitter API
        Twitter cnx=INSCRIPTION.ConnexionAPI(INSCRIPTION.dev_consumerK,INSCRIPTION.dev_consumerS,INSCRIPTION.dev_accessT,INSCRIPTION.dev_accessS);
        
	List <Status> statuses1 = new ArrayList<Status>();
	int pageno = 1;
		
        while (true) 
        {
            try 
            {
                int size = statuses1.size();
                Paging page = new Paging(pageno++, 100);
                statuses1.addAll(cnx.getUserTimeline(user, page));
                listeHashtags.setRows(statuses1.size());
                if (statuses1.size() == size)
                break;
            }
            catch(TwitterException e) 
            {
                e.printStackTrace();
            }
        } 

        int k=0; 
	h=new ArrayList<String>();
        while (i<statuses1.size()) 
        {    
             Status u=statuses1.get(i);
             if(!(u.isRetweet()))
             { 
            	 if(u.getCreatedAt().after(date1) && u.getCreatedAt().before(date2))
                 { 
             HashtagEntity hashTags[] = u.getHashtagEntities();
             while(k<hashTags.length)
             { 
                h.add(hashTags[k].getText());                
                k++; 
             }
            k=0;
             }}
             i++;
             }
        if(h.isEmpty())
        {
            texteTweets.setText("Pas de hashtags pendant cette période...");          	    
            texteInfosTweets.setText("");
        }
         
        
        i=0;
	int y=5;
	Set<String> set = new HashSet<String>() ;
	set.addAll(h) ;
	ArrayList<String> h2 = new ArrayList<String>(set) ;
	b=new JButton[h2.size()];
        while(i<h2.size())
	{	 
            b[i] = new JButton("#"+h2.get(i));	
            Font font = new Font("Segoe UI Light", 1, 14);
            b[i].setFont(font);
            b[i].setBorderPainted(false);
            b[i].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)); //ca 
      	    b[i].setOpaque(false);
            b[i].setContentAreaFilled(false);	
            listeHashtags.setLayout(null);
            b[i].setBounds(1,y,200,20);
            listeHashtags.add(b[i]);
            y=y+30;
	    String haash=h2.get(i);
            // faire une couleur pour les boutons
	    b[i].addActionListener(new ActionListener(){  
	    	 String texte;
             
             ObjetHM obj;
            public void actionPerformed(ActionEvent e)
            {		
                
	 	int a=0;
	        tw.clear(); nn=0;  
	        SimpleDateFormat simpleDate = new SimpleDateFormat("EEE dd/MM/yyyy à hh:mm:ss");
                for(Status status:statuses1)
	     	{              if (!status.isRetweet())
                    {                     
                        HashtagEntity hashTags[] = status.getHashtagEntities();         		      
                        String tab[]=new String[hashTags.length];

                        while(a<hashTags.length && (status.getCreatedAt().after(date1) && status.getCreatedAt().before(date2)))
                        {
                            tab[a]=hashTags[a].getText();	      	               
                            if(tab[a].compareTo(haash)==0)
                            { 	 	    	      	            			        	 	    	      	            		  
                                a++; 
                                Date date = status.getCreatedAt();
                                TweetClass te = new TweetClass(status.getUser().getScreenName(),simpleDate.format(date),status.getText(),status.getFavoriteCount(),status.getRetweetCount(),status.isRetweetedByMe(),status.getLang(),status.getGeoLocation(),status.getPlace());


                                //variables infos 
                                    String d =te.getDate(); 
                                    String nom = te.getNom();
                                    String j=String.valueOf(te.getNbrFavoris());
                                    String nbR=String.valueOf(te.getNbrRetweet());
                                    String l=te.getLangue();
                                    
                                
    	 	    	      	texte = status.getText();
                             
    	 	    	      	inf =" Date de création: "+d+"\n Nom d'utilisateur: "+nom+"\n 'J'aimes': "+j+"\n Retweets: "+nbR+"\n Langue: "+l;     
    	 	    	      	obj=new ObjetHM(texte, inf);
                            tw.add(obj); 
    	 	    	}
    	 	    	    
    	 	    	else	          	             
    	 	    	    a++;
    	 	    }
    	 	    	 a=0;
    	 	    	}
        
                          	
        }
                            	         		  		
    	 	        texteTweets.setLineWrap(true);
                    texteTweets.setText(tw.get(nn).texte);          	    
    	 	        texteInfosTweets.setText(tw.get(nn).infos);
                    texteInfosTweets.setLineWrap(true);
    	 	}
                });          
            i++;     	
        }
    
    }     
        
    public void ExtractionHashtags(String user)
    {
        //Connection à Twitter API
        Twitter cnx=INSCRIPTION.ConnexionAPI(INSCRIPTION.dev_consumerK,INSCRIPTION.dev_consumerS,INSCRIPTION.dev_accessT,INSCRIPTION.dev_accessS);
        
	List <Status> statuses1 = new ArrayList<Status>();
	int pageno = 1;
		
        while (true) 
        {
            try 
            {
                int size = statuses1.size();
                Paging page = new Paging(pageno++, 100);
                statuses1.addAll(cnx.getUserTimeline(user, page));
                listeHashtags.setRows(statuses1.size());
                if (statuses1.size() == size)
                break;
            }
            catch(TwitterException e) 
            {
                e.printStackTrace();
            }
        } 

        int k=0; 
	h=new ArrayList<String>();
        while (i<statuses1.size()) 
        {     
             Status u=statuses1.get(i);
             if(!(u.isRetweet()) )
             {
             HashtagEntity hashTags[] = u.getHashtagEntities();
             while(k<hashTags.length)
             { 
                h.add(hashTags[k].getText());                
                k++; 
             }
            k=0;
        }
            i++;
        } 
        if(h.isEmpty())
        	listeHashtags.setText("<Pas de mentions>");
        else
        {
        i=0;
	int y=5;
	Set<String> set = new HashSet<String>() ;
	set.addAll(h) ;
	ArrayList<String> h2 = new ArrayList<String>(set) ;
	b=new JButton[h2.size()];
        while(i<h2.size())
	{	 
            b[i] = new JButton("#"+h2.get(i));	
            Font font = new Font("Segoe UI Light", 1, 15);
            b[i].setFont(font);
            b[i].setBorderPainted(false);
      	    b[i].setOpaque(false);
            b[i].setContentAreaFilled(false);	
            listeHashtags.setLayout(null);
            b[i].setBounds(1,y,200,20);
            listeHashtags.add(b[i]);
            y=y+30;
	    String haash=h2.get(i);
	    b[i].addActionListener(new ActionListener(){  
	    	 String texte;
             
             ObjetHM obj;
            public void actionPerformed(ActionEvent e)
            {		        	               				        	                      			     	                   
	 	int a=0;
	        tw.clear(); nn=0;  
	        SimpleDateFormat simpleDate = new SimpleDateFormat("EEE dd/MM/yyyy à hh:mm:ss");
                for(Status status:statuses1)
	 	{         if (!status.isRetweet())
        {    
	 	    HashtagEntity hashTags[] = status.getHashtagEntities();         		      
	 	    String tab[]=new String[hashTags.length];
	 	   
                    while(a<hashTags.length)
	 	    {
	 	    	tab[a]=hashTags[a].getText();	      	               
	 	    	if(tab[a].compareTo(haash)==0)
	 	    	{ 	 	    	      	            			        	 	    	      	            		  
	 	    	    a++; 
                            Date date = status.getCreatedAt();
                            TweetClass te = new TweetClass(status.getUser().getScreenName(),simpleDate.format(date),status.getText(),status.getFavoriteCount(),status.getRetweetCount(),status.isRetweetedByMe(),status.getLang(),status.getGeoLocation(),status.getPlace());
                             
                          //variables infos 
                            String d =te.getDate(); 
                            String nom = te.getNom();
                            String j=String.valueOf(te.getNbrFavoris());
                            String nbR=String.valueOf(te.getNbrRetweet());
                            String l=te.getLangue();
                            
                        
 	    	      	texte = status.getText();
                     
 	    	      	inf =" Date de création: "+d+"\n Nom d'utilisateur: "+nom+"\n 'J'aimes': "+j+"\n Retweets: "+nbR+"\n Langue: "+l;     
 	    	      	obj=new ObjetHM(texte, inf);
                    tw.add(obj); 
 	    	}
 	    	    
 	    	else	          	             
 	    	    a++;
 	    }
 	    	 a=0;
 	    	}
                  	
 	
                    }	         		  		
 	   texteTweets.setLineWrap(true);
            texteTweets.setText(tw.get(nn).texte);          	    
 	texteInfosTweets.setText(tw.get(nn).infos);
            texteInfosTweets.setLineWrap(true);
 	}
        });          
    i++;     	
}}}
    private void btnFermer_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFermer_ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnFermer_ActionPerformed

    private void btnMinimiserFenetreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimiserFenetreActionPerformed
        HASHTAGS_TWEETS.this.setState(ICONIFIED);
    }//GEN-LAST:event_btnMinimiserFenetreActionPerformed

    private void btnAfficherHahstags_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfficherHahstags_ActionPerformed
        
        if(HASHTAGS_CONFIG_CONT.dateD)
        { 
             ExtractionHashtags(LOGIN_CIBLE.userCible); 
        }
        else 
        {
            if(HASHTAGS_CONFIG_CONT.dateP)
            {
                ExtractionHashtags_DATE(LOGIN_CIBLE.userCible, HASHTAGS_CONFIG_CONT.date1H, HASHTAGS_CONFIG_CONT.date2H);
            }
            else
                  //dans le cas ou le user n'a rien configuré on passe à l extraction par defaut ( le tout)
                ExtractionHashtags(LOGIN_CIBLE.userCible); 
        }
      
                                                   
    }//GEN-LAST:event_btnAfficherHahstags_ActionPerformed

    private void btnViderHahstags_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViderHahstags_ActionPerformed

        texteTweets.setText("");
        texteInfosTweets.setText("");
    }//GEN-LAST:event_btnViderHahstags_ActionPerformed

    private void btnSauvegarder_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSauvegarder_ActionPerformed
       
        MESSAGE_SAUVEGARDER_Hashtag msg = new MESSAGE_SAUVEGARDER_Hashtag(texteInfosTweets,texteTweets,listeHashtags.getSelectedText());
        msg.setVisible(true);
        msg.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btnSauvegarder_ActionPerformed

    private void btnHashtagSuiv_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHashtagSuiv_ActionPerformed
	 nn++;
     	if(nn>tw.size()-1) { texteTweets.setText("<Pas de tweets> ");  
             texteInfosTweets.setText("");
     	}
     	else
     		{
     		texteTweets.setText(tw.get(nn).texte);          	    
 	 	texteInfosTweets.setText(tw.get(nn).infos);}
    }//GEN-LAST:event_btnHashtagSuiv_ActionPerformed

    private void btnHashtagPre_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHashtagPre_ActionPerformed
         nn--;
         if(nn<=0)
         {   nn=0;
      	   texteTweets.setText(tw.get(nn).texte);          	    
  	    texteInfosTweets.setText(tw.get(nn).infos); }
         else
         {
      	if(nn>=tw.size()-1) 
      	{	nn=tw.size()-1;
      	   texteTweets.setText(tw.get(nn).texte);          	    
  	 	   texteInfosTweets.setText(tw.get(nn).infos); }
      	else 
      	{
      		texteTweets.setText(tw.get(nn).texte);          	    
      	 	texteInfosTweets.setText(tw.get(nn).infos);
      	}
         }
           
    }//GEN-LAST:event_btnHashtagPre_ActionPerformed

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

        HASHTAGS_CONFIG_CONT conf = new HASHTAGS_CONFIG_CONT ();
        conf.setVisible(true);
        conf.setLocationRelativeTo(null);
        
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

    
    
    
    
    
    
    private void btnAfficherHahstags_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAfficherHahstags_MouseEntered
       bordureBleue(btnAfficherHahstags_);
    }//GEN-LAST:event_btnAfficherHahstags_MouseEntered

    private void btnAfficherHahstags_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAfficherHahstags_MouseExited
        bordureGris(btnAfficherHahstags_);
    }//GEN-LAST:event_btnAfficherHahstags_MouseExited

    private void btnViderHahstags_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViderHahstags_MouseEntered
       bordureBleue(btnViderHahstags_);
    }//GEN-LAST:event_btnViderHahstags_MouseEntered

    private void btnViderHahstags_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViderHahstags_MouseExited
     bordureGris(btnViderHahstags_);
    }//GEN-LAST:event_btnViderHahstags_MouseExited

    private void btnSauvegarder_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSauvegarder_MouseEntered
        bordureBleue(btnSauvegarder_);
    }//GEN-LAST:event_btnSauvegarder_MouseEntered

    private void btnSauvegarder_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSauvegarder_MouseExited
         bordureGris(btnSauvegarder_);
    }//GEN-LAST:event_btnSauvegarder_MouseExited

    private void btnDeconnection_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeconnection_MouseEntered
        Encadrer3Btns(btnDeconnection_);
    }//GEN-LAST:event_btnDeconnection_MouseEntered

    private void btnDeconnection_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeconnection_MouseExited
        enlEncadrer3Btns(btnDeconnection_);
    }//GEN-LAST:event_btnDeconnection_MouseExited

    private void btnDeconnection_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeconnection_ActionPerformed
        DASHBOARD.seDeconnecter();
    }//GEN-LAST:event_btnDeconnection_ActionPerformed

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

        HASHTAGS d = new  HASHTAGS();
        d.setVisible(true);
        d.setLocationRelativeTo(null);
        this.hide();
    }//GEN-LAST:event_btnPrecedent_ActionPerformed


    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBas2;
    private javax.swing.JPanel PanelHaut;
    private javax.swing.JButton btnAfficherHahstags_;
    private javax.swing.JButton btnApropos_;
    private javax.swing.JButton btnCommentaire_;
    private javax.swing.JButton btnConfiguration_;
    private javax.swing.JButton btnDashboard_;
    private javax.swing.JButton btnDeconnection_;
    private javax.swing.JButton btnFacebook_;
    private javax.swing.JButton btnFermer_;
    private javax.swing.JButton btnHashtagPre_;
    private javax.swing.JButton btnHashtagSuiv_;
    private javax.swing.JButton btnMAJ_;
    private javax.swing.JButton btnManuel_;
    private javax.swing.JButton btnMinimiserFenetre;
    private javax.swing.JButton btnPrecedent_;
    private javax.swing.JButton btnProfil_;
    private javax.swing.JButton btnSauvegarder_;
    private javax.swing.JButton btnTwitter_;
    private javax.swing.JButton btnViderHahstags_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextArea listeHashtags;
    private javax.swing.JPanel panelConf;
    private javax.swing.JPanel panelMisesAJour;
    private javax.swing.JPanel panelMsg;
    private javax.swing.JScrollPane panelScroll;
    private javax.swing.JTextArea texteInfosTweets;
    private javax.swing.JTextArea texteTweets;
    // End of variables declaration//GEN-END:variables
}
