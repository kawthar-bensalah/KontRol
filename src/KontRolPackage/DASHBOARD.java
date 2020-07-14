package KontRolPackage;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import twitter4j.TwitterException;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class DASHBOARD extends javax.swing.JFrame {

 
    static Timer tm1;
    static  int x = 0;
    //la liste des images 
    static String[] list = { "C:\\Users\\RANIA\\Documents\\NetBeansProjects\\TwitterPFE\\src\\KontRolPackage\\Icones\\CaptTout.png",
        "C:\\Users\\RANIA\\Documents\\NetBeansProjects\\TwitterPFE\\src\\KontRolPackage\\Icones\\CaptTRT.png",
        "C:\\Users\\RANIA\\Documents\\NetBeansProjects\\TwitterPFE\\src\\KontRolPackage\\Icones\\CaptAbn.png",
        "C:\\Users\\RANIA\\Documents\\NetBeansProjects\\TwitterPFE\\src\\KontRolPackage\\Icones\\CaptMentHash.png",
        "C:\\Users\\RANIA\\Documents\\NetBeansProjects\\TwitterPFE\\src\\KontRolPackage\\Icones\\CaptListes.png"};
    
    public DASHBOARD() {
        
        initComponents();
        slide();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        image2 = new javax.swing.JLabel();
        btnTimeLine_1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        PanelHaut = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnMinimiserFenetre = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        PanelBas = new javax.swing.JPanel();
        btnEtatDuCompte_ = new javax.swing.JButton();
        btnDeconnection = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnProfil_ = new javax.swing.JButton();
        btnManuel_ = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        btnMAJ_ = new javax.swing.JButton();
        btnFacebook_ = new javax.swing.JButton();
        btnCommentaire_ = new javax.swing.JButton();
        btnApropos_ = new javax.swing.JButton();
        btnTwitter_ = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        panelConf = new javax.swing.JPanel();
        panelMisesAJour = new javax.swing.JPanel();
        panelMsg = new javax.swing.JPanel();
        p = new javax.swing.JPanel();
        lbl = new javax.swing.JLabel();
        panel_PRINC_SEC = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btnTweets_ = new javax.swing.JButton();
        btnRetweets_ = new javax.swing.JButton();
        btnHashtags_ = new javax.swing.JButton();
        btnMentions_ = new javax.swing.JButton();
        btnAbonnes_ = new javax.swing.JButton();
        btnAbonnement_ = new javax.swing.JButton();
        btnListes_ = new javax.swing.JButton();
        labelTweets = new javax.swing.JLabel();
        labelHashtags = new javax.swing.JLabel();
        labelRetweets = new javax.swing.JLabel();
        labelMentions = new javax.swing.JLabel();
        labelAbonnes = new javax.swing.JLabel();
        labelAbonnement = new javax.swing.JLabel();
        labelListes = new javax.swing.JLabel();
        btnAutres_ = new javax.swing.JButton();
        labelAutres = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnTimeLine_ = new javax.swing.JButton();
        btnTweeter_ = new javax.swing.JButton();
        btnMsgsPrives_ = new javax.swing.JButton();
        btnAbnmns_ = new javax.swing.JButton();
        lblTimeLine = new javax.swing.JLabel();
        lblTweeter = new javax.swing.JLabel();
        lblMsgs = new javax.swing.JLabel();
        lblMesListes = new javax.swing.JLabel();
        btnMesListes_ = new javax.swing.JButton();
        lblParametre = new javax.swing.JLabel();
        lblMaListe = new javax.swing.JLabel();
        btnParametres_ = new javax.swing.JButton();
        btnAbns_ = new javax.swing.JButton();
        lblListesAbnmns = new javax.swing.JLabel();
        btnAutres2_ = new javax.swing.JButton();
        lblMesAutres = new javax.swing.JLabel();

        image2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/image1.jpg"))); // NOI18N

        btnTimeLine_1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnTimeLine_1.setForeground(new java.awt.Color(49, 6, 25));
        btnTimeLine_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Icones/Timeline_45px.png"))); // NOI18N
        btnTimeLine_1.setToolTipText("Consulter les statistiques ou le contenu des tweets de la personne.");
        btnTimeLine_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnTimeLine_1.setBorderPainted(false);
        btnTimeLine_1.setContentAreaFilled(false);
        btnTimeLine_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTimeLine_1.setFocusPainted(false);
        btnTimeLine_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTimeLine_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTimeLine_1MouseExited(evt);
            }
        });
        btnTimeLine_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimeLine_1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(49, 6, 25));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 6, 25), 2));

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

        PanelBas.setBackground(new java.awt.Color(49, 6, 25));
        PanelBas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        btnEtatDuCompte_.setFont(new java.awt.Font("Segoe UI Light", 1, 13)); // NOI18N
        btnEtatDuCompte_.setForeground(new java.awt.Color(255, 255, 255));
        btnEtatDuCompte_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Mind Map_22px.png"))); // NOI18N
        btnEtatDuCompte_.setText(" Etat du compte");
        btnEtatDuCompte_.setToolTipText("Afficher un résumé sur l'état du compte de la personne.");
        btnEtatDuCompte_.setBorderPainted(false);
        btnEtatDuCompte_.setContentAreaFilled(false);
        btnEtatDuCompte_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEtatDuCompte_.setFocusPainted(false);
        btnEtatDuCompte_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEtatDuCompte_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEtatDuCompte_MouseExited(evt);
            }
        });
        btnEtatDuCompte_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEtatDuCompte_ActionPerformed(evt);
            }
        });

        btnDeconnection.setFont(new java.awt.Font("Segoe UI Light", 1, 13)); // NOI18N
        btnDeconnection.setForeground(new java.awt.Color(255, 255, 255));
        btnDeconnection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Logout Rounded Left_22px.png"))); // NOI18N
        btnDeconnection.setText(" Se déconnecter");
        btnDeconnection.setToolTipText("Se déconnecter et passer à l'écran Login");
        btnDeconnection.setBorderPainted(false);
        btnDeconnection.setContentAreaFilled(false);
        btnDeconnection.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeconnection.setFocusPainted(false);
        btnDeconnection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeconnectionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeconnectionMouseExited(evt);
            }
        });
        btnDeconnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeconnectionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBasLayout = new javax.swing.GroupLayout(PanelBas);
        PanelBas.setLayout(PanelBasLayout);
        PanelBasLayout.setHorizontalGroup(
            PanelBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDeconnection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEtatDuCompte_)
                .addContainerGap())
        );
        PanelBasLayout.setVerticalGroup(
            PanelBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnEtatDuCompte_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeconnection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(49, 6, 25));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu");

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

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("Trouvez-nous sur : ");

        jPanel6.setBackground(new java.awt.Color(49, 6, 25));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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

        btnFacebook_.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnFacebook_.setForeground(new java.awt.Color(255, 255, 255));
        btnFacebook_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Facebook_18px.png"))); // NOI18N
        btnFacebook_.setText(" Facebook");
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

        btnTwitter_.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnTwitter_.setForeground(new java.awt.Color(255, 255, 255));
        btnTwitter_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Twitter_18px.png"))); // NOI18N
        btnTwitter_.setText(" Twitter");
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnTwitter_, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(panelConf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(panelMisesAJour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(panelMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnManuel_, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                                    .addComponent(btnProfil_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(btnMAJ_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(btnCommentaire_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addComponent(btnApropos_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addComponent(btnFacebook_, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnProfil_, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnManuel_, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(panelConf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMisesAJour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34))
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnMAJ_, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnApropos_, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCommentaire_, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTwitter_, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFacebook_, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        p.setBackground(new java.awt.Color(255, 255, 255));
        p.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/CaptTRT.PNG"))); // NOI18N

        javax.swing.GroupLayout pLayout = new javax.swing.GroupLayout(p);
        p.setLayout(pLayout);
        pLayout.setHorizontalGroup(
            pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLayout.createSequentialGroup()
                .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pLayout.setVerticalGroup(
            pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLayout.createSequentialGroup()
                .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 187, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        panel_PRINC_SEC.setBackground(new java.awt.Color(255, 255, 255));
        panel_PRINC_SEC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 6, 25)));
        panel_PRINC_SEC.setForeground(new java.awt.Color(0, 153, 255));
        panel_PRINC_SEC.setToolTipText("");
        panel_PRINC_SEC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_PRINC_SEC.setFont(new java.awt.Font("Segoe UI Light", 1, 13)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnTweets_.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnTweets_.setForeground(new java.awt.Color(49, 6, 25));
        btnTweets_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Icones/Twitter_45px.png"))); // NOI18N
        btnTweets_.setToolTipText("Consulter les statistiques ou le contenu des tweets de la personne.");
        btnTweets_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnTweets_.setBorderPainted(false);
        btnTweets_.setContentAreaFilled(false);
        btnTweets_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTweets_.setFocusPainted(false);
        btnTweets_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTweets_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTweets_MouseExited(evt);
            }
        });
        btnTweets_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTweets_ActionPerformed(evt);
            }
        });

        btnRetweets_.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnRetweets_.setForeground(new java.awt.Color(49, 6, 25));
        btnRetweets_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Icones/Synchronize_45px.png"))); // NOI18N
        btnRetweets_.setToolTipText("Consulter les statistiques ou le contenu des retweets de la personne");
        btnRetweets_.setBorderPainted(false);
        btnRetweets_.setContentAreaFilled(false);
        btnRetweets_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRetweets_.setFocusPainted(false);
        btnRetweets_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRetweets_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRetweets_MouseExited(evt);
            }
        });
        btnRetweets_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetweets_ActionPerformed(evt);
            }
        });

        btnHashtags_.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnHashtags_.setForeground(new java.awt.Color(49, 6, 25));
        btnHashtags_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Icones/Hashtag Large_40px.png"))); // NOI18N
        btnHashtags_.setToolTipText("Consulter les statistiques ou le contenu des hashtags de la personne.");
        btnHashtags_.setBorderPainted(false);
        btnHashtags_.setContentAreaFilled(false);
        btnHashtags_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHashtags_.setFocusPainted(false);
        btnHashtags_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHashtags_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHashtags_MouseExited(evt);
            }
        });
        btnHashtags_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHashtags_ActionPerformed(evt);
            }
        });

        btnMentions_.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnMentions_.setForeground(new java.awt.Color(49, 6, 25));
        btnMentions_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Icones/Email_pink_45px.png"))); // NOI18N
        btnMentions_.setToolTipText("Consulter les statistiques ou le contenu desmentions de la personne.");
        btnMentions_.setBorderPainted(false);
        btnMentions_.setContentAreaFilled(false);
        btnMentions_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMentions_.setFocusPainted(false);
        btnMentions_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMentions_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMentions_MouseExited(evt);
            }
        });
        btnMentions_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMentions_ActionPerformed(evt);
            }
        });

        btnAbonnes_.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnAbonnes_.setForeground(new java.awt.Color(49, 6, 25));
        btnAbonnes_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Icones/User Groups_45px.png"))); // NOI18N
        btnAbonnes_.setToolTipText("Consulter les statistiques ou la liste d'abonnés de la personne.");
        btnAbonnes_.setBorderPainted(false);
        btnAbonnes_.setContentAreaFilled(false);
        btnAbonnes_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbonnes_.setFocusPainted(false);
        btnAbonnes_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAbonnes_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAbonnes_MouseExited(evt);
            }
        });
        btnAbonnes_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbonnes_ActionPerformed(evt);
            }
        });

        btnAbonnement_.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnAbonnement_.setForeground(new java.awt.Color(49, 6, 25));
        btnAbonnement_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Icones/Show Property_45px.png"))); // NOI18N
        btnAbonnement_.setToolTipText("Consulter la liste d'abonnements de la personne.");
        btnAbonnement_.setBorderPainted(false);
        btnAbonnement_.setContentAreaFilled(false);
        btnAbonnement_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbonnement_.setFocusPainted(false);
        btnAbonnement_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAbonnement_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAbonnement_MouseExited(evt);
            }
        });
        btnAbonnement_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbonnement_ActionPerformed(evt);
            }
        });

        btnListes_.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnListes_.setForeground(new java.awt.Color(49, 6, 25));
        btnListes_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Icones/User Menu Male_45px.png"))); // NOI18N
        btnListes_.setToolTipText("Consulter les listes de la personne.");
        btnListes_.setBorderPainted(false);
        btnListes_.setContentAreaFilled(false);
        btnListes_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListes_.setFocusPainted(false);
        btnListes_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnListes_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnListes_MouseExited(evt);
            }
        });
        btnListes_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListes_ActionPerformed(evt);
            }
        });

        labelTweets.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        labelTweets.setForeground(new java.awt.Color(49, 6, 25));
        labelTweets.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTweets.setText("Tweets");
        labelTweets.setToolTipText("Consulter les statistiques ou le contenu des tweets de la personne.");

        labelHashtags.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        labelHashtags.setForeground(new java.awt.Color(49, 6, 25));
        labelHashtags.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHashtags.setText("Hashtags");
        labelHashtags.setToolTipText("Consulter les statistiques ou le contenu des hashtags de la personne.");

        labelRetweets.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        labelRetweets.setForeground(new java.awt.Color(49, 6, 25));
        labelRetweets.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRetweets.setText("Retweets");
        labelRetweets.setToolTipText("Consulter les statistiques ou le contenu des retweets de la personne");

        labelMentions.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        labelMentions.setForeground(new java.awt.Color(49, 6, 25));
        labelMentions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMentions.setText("Mentions");
        labelMentions.setToolTipText("Consulter les statistiques ou le contenu des mentions de la personne.");

        labelAbonnes.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        labelAbonnes.setForeground(new java.awt.Color(49, 6, 25));
        labelAbonnes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAbonnes.setText("Abonnés");
        labelAbonnes.setToolTipText("Consulter les statistiques ou la liste d'abonnés de la personne.");

        labelAbonnement.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        labelAbonnement.setForeground(new java.awt.Color(49, 6, 25));
        labelAbonnement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAbonnement.setText("Abonnements");
        labelAbonnement.setToolTipText("Consulter la liste d'abonnements de la personne.");

        labelListes.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        labelListes.setForeground(new java.awt.Color(49, 6, 25));
        labelListes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelListes.setText("Listes");
        labelListes.setToolTipText("Consulter les listes de la personne.");

        btnAutres_.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnAutres_.setForeground(new java.awt.Color(49, 6, 25));
        btnAutres_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Icones/View More_45px.png"))); // NOI18N
        btnAutres_.setToolTipText("Consulter les statistiques ou le contenu desmentions de la personne.");
        btnAutres_.setBorderPainted(false);
        btnAutres_.setContentAreaFilled(false);
        btnAutres_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAutres_.setFocusPainted(false);
        btnAutres_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAutres_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAutres_MouseExited(evt);
            }
        });
        btnAutres_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutres_ActionPerformed(evt);
            }
        });

        labelAutres.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        labelAutres.setForeground(new java.awt.Color(49, 6, 25));
        labelAutres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAutres.setText("Autres");
        labelAutres.setToolTipText("Consulter les listes de la personne.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(80, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTweets_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAbonnes_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTweets, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAbonnement_, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRetweets_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelRetweets, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelAbonnes, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(labelAbonnement, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnHashtags_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelHashtags, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelListes, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnListes_, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMentions, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMentions_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAutres_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAutres, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(91, 91, 91))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMentions_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnHashtags_, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRetweets_, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnTweets_, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelHashtags)
                        .addComponent(labelMentions))
                    .addComponent(labelTweets)
                    .addComponent(labelRetweets))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAbonnement_, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAbonnes_, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnAutres_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btnListes_, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAbonnes)
                    .addComponent(labelAbonnement)
                    .addComponent(labelListes)
                    .addComponent(labelAutres))
                .addGap(24, 24, 24))
        );

        panel_PRINC_SEC.addTab("  Fonctionalités principales  ", jPanel2);

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(49, 6, 25));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Mon compte");

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(49, 6, 25));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Queslques options concernant mon compte Twitter.");

        btnTimeLine_.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnTimeLine_.setForeground(new java.awt.Color(49, 6, 25));
        btnTimeLine_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Icones/Timeline_45px.png"))); // NOI18N
        btnTimeLine_.setToolTipText("Consulter les statistiques ou le contenu des tweets de la personne.");
        btnTimeLine_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnTimeLine_.setBorderPainted(false);
        btnTimeLine_.setContentAreaFilled(false);
        btnTimeLine_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTimeLine_.setFocusPainted(false);
        btnTimeLine_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTimeLine_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTimeLine_MouseExited(evt);
            }
        });
        btnTimeLine_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimeLine_ActionPerformed(evt);
            }
        });

        btnTweeter_.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnTweeter_.setForeground(new java.awt.Color(49, 6, 25));
        btnTweeter_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Icones/Stack of Tweets_45px.png"))); // NOI18N
        btnTweeter_.setToolTipText("Consulter les statistiques ou le contenu des tweets de la personne.");
        btnTweeter_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnTweeter_.setBorderPainted(false);
        btnTweeter_.setContentAreaFilled(false);
        btnTweeter_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTweeter_.setFocusPainted(false);
        btnTweeter_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTweeter_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTweeter_MouseExited(evt);
            }
        });
        btnTweeter_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTweeter_ActionPerformed(evt);
            }
        });

        btnMsgsPrives_.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnMsgsPrives_.setForeground(new java.awt.Color(49, 6, 25));
        btnMsgsPrives_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Icones/Read Message_45px.png"))); // NOI18N
        btnMsgsPrives_.setToolTipText("Consulter les statistiques ou le contenu des tweets de la personne.");
        btnMsgsPrives_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnMsgsPrives_.setBorderPainted(false);
        btnMsgsPrives_.setContentAreaFilled(false);
        btnMsgsPrives_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMsgsPrives_.setFocusPainted(false);
        btnMsgsPrives_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMsgsPrives_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMsgsPrives_MouseExited(evt);
            }
        });
        btnMsgsPrives_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMsgsPrives_ActionPerformed(evt);
            }
        });

        btnAbnmns_.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnAbnmns_.setForeground(new java.awt.Color(49, 6, 25));
        btnAbnmns_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Icones/Show Property_45px.png"))); // NOI18N
        btnAbnmns_.setToolTipText("Consulter les statistiques ou le contenu des tweets de la personne.");
        btnAbnmns_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnAbnmns_.setBorderPainted(false);
        btnAbnmns_.setContentAreaFilled(false);
        btnAbnmns_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbnmns_.setFocusPainted(false);
        btnAbnmns_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAbnmns_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAbnmns_MouseExited(evt);
            }
        });
        btnAbnmns_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbnmns_ActionPerformed(evt);
            }
        });

        lblTimeLine.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lblTimeLine.setForeground(new java.awt.Color(49, 6, 25));
        lblTimeLine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTimeLine.setText("TimeLine");
        lblTimeLine.setToolTipText("Consulter les statistiques ou le contenu des tweets de la personne.");

        lblTweeter.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lblTweeter.setForeground(new java.awt.Color(49, 6, 25));
        lblTweeter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTweeter.setText("Tweeter");
        lblTweeter.setToolTipText("Consulter les statistiques ou le contenu des tweets de la personne.");

        lblMsgs.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lblMsgs.setForeground(new java.awt.Color(49, 6, 25));
        lblMsgs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMsgs.setText("Messages privés");
        lblMsgs.setToolTipText("Consulter les statistiques ou le contenu des tweets de la personne.");

        lblMesListes.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lblMesListes.setForeground(new java.awt.Color(49, 6, 25));
        lblMesListes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMesListes.setText("Listes");
        lblMesListes.setToolTipText("Consulter les statistiques ou le contenu des tweets de la personne.");

        btnMesListes_.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnMesListes_.setForeground(new java.awt.Color(49, 6, 25));
        btnMesListes_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Icones/Google Groups_45px.png"))); // NOI18N
        btnMesListes_.setToolTipText("Consulter les statistiques ou le contenu des tweets de la personne.");
        btnMesListes_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnMesListes_.setBorderPainted(false);
        btnMesListes_.setContentAreaFilled(false);
        btnMesListes_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMesListes_.setFocusPainted(false);
        btnMesListes_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMesListes_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMesListes_MouseExited(evt);
            }
        });
        btnMesListes_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesListes_ActionPerformed(evt);
            }
        });

        lblParametre.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lblParametre.setForeground(new java.awt.Color(49, 6, 25));
        lblParametre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblParametre.setText("Paramètres d'affichage");
        lblParametre.setToolTipText("Consulter les statistiques ou le contenu des tweets de la personne.");

        lblMaListe.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lblMaListe.setForeground(new java.awt.Color(49, 6, 25));
        lblMaListe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaListe.setText("Liste d'abonnés");
        lblMaListe.setToolTipText("Consulter les statistiques ou le contenu des tweets de la personne.");

        btnParametres_.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnParametres_.setForeground(new java.awt.Color(49, 6, 25));
        btnParametres_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Icones/Services_45px.png"))); // NOI18N
        btnParametres_.setToolTipText("Consulter les statistiques ou le contenu des tweets de la personne.");
        btnParametres_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnParametres_.setBorderPainted(false);
        btnParametres_.setContentAreaFilled(false);
        btnParametres_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnParametres_.setFocusPainted(false);
        btnParametres_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnParametres_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnParametres_MouseExited(evt);
            }
        });
        btnParametres_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParametres_ActionPerformed(evt);
            }
        });

        btnAbns_.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnAbns_.setForeground(new java.awt.Color(49, 6, 25));
        btnAbns_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Icones/User Groups_45px.png"))); // NOI18N
        btnAbns_.setToolTipText("Consulter les statistiques ou le contenu des tweets de la personne.");
        btnAbns_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnAbns_.setBorderPainted(false);
        btnAbns_.setContentAreaFilled(false);
        btnAbns_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbns_.setFocusPainted(false);
        btnAbns_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAbns_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAbns_MouseExited(evt);
            }
        });
        btnAbns_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbns_ActionPerformed(evt);
            }
        });

        lblListesAbnmns.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lblListesAbnmns.setForeground(new java.awt.Color(49, 6, 25));
        lblListesAbnmns.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblListesAbnmns.setText("Liste d'abonnements");
        lblListesAbnmns.setToolTipText("Consulter les statistiques ou le contenu des tweets de la personne.");

        btnAutres2_.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnAutres2_.setForeground(new java.awt.Color(49, 6, 25));
        btnAutres2_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Icones/View More_45px.png"))); // NOI18N
        btnAutres2_.setToolTipText("Consulter les statistiques ou le contenu des tweets de la personne.");
        btnAutres2_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnAutres2_.setBorderPainted(false);
        btnAutres2_.setContentAreaFilled(false);
        btnAutres2_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAutres2_.setFocusPainted(false);
        btnAutres2_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAutres2_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAutres2_MouseExited(evt);
            }
        });
        btnAutres2_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutres2_ActionPerformed(evt);
            }
        });

        lblMesAutres.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lblMesAutres.setForeground(new java.awt.Color(49, 6, 25));
        lblMesAutres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMesAutres.setText("Autres");
        lblMesAutres.setToolTipText("Consulter les statistiques ou le contenu des tweets de la personne.");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(lblTimeLine, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(btnTimeLine_, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblParametre, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblMaListe, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(btnParametres_, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblTweeter, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnTweeter_, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnAbns_, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(52, 52, 52)))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblListesAbnmns, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblMsgs, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(52, 52, 52)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblMesListes, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblMesAutres, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(53, 53, 53))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(btnMsgsPrives_, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(97, 97, 97)
                                        .addComponent(btnMesListes_, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(btnAbnmns_, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(100, 100, 100)
                                        .addComponent(btnAutres2_, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTimeLine_, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(btnMsgsPrives_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTweeter_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMesListes_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblMsgs)
                                .addComponent(lblMesListes)
                                .addComponent(lblTweeter))
                            .addComponent(lblTimeLine))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAbnmns_)
                            .addComponent(btnParametres_)
                            .addComponent(btnAbns_)))
                    .addComponent(btnAutres2_))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblParametre)
                    .addComponent(lblMaListe)
                    .addComponent(lblListesAbnmns)
                    .addComponent(lblMesAutres))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel4);

        panel_PRINC_SEC.addTab("  Fonctionnalités secondaires  ", jScrollPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelHaut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel_PRINC_SEC, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addComponent(PanelBas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PanelHaut, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_PRINC_SEC, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelBas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        p.add(lbl);

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

    //methode d affichage du tableau de bord 
    public static void TableauDeBord()
    {
        DASHBOARD d = new DASHBOARD();
        d.setVisible(true);
        d.setLocationRelativeTo(null);
        
    }
    
    //le slideshow du menu pricipal
    public static void slide(){
        
        SetImageSize(0);
        tm1 = new Timer(4500,new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent e) {
               SetImageSize(x);
                x += 1;
                if(x >= list.length )
                    x = 0; 
            }}
        );
        tm1.start();
        
    }
    
    public static void SetImageSize(int i){
        ImageIcon icon = new ImageIcon(list[i]);
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        
        lbl.setIcon(newImc);
     
    }
    
    //methode de deconnexion de l application
    public static void seDeconnecter(){
        
        //message de confirmation de deconnexion
        MESSAGE_DECONNEXION msg = new MESSAGE_DECONNEXION ();
        msg.setVisible(true);
        msg.setLocationRelativeTo(null);
    }
    
    //barre de menu 
    public static void Barre(Frame frame)
    {
        JMenuBar  PanelHaut=new JMenuBar();
                    
	           JButton  btnExit  =new JButton(new ImageIcon("C:\\Users\\RANIA\\Documents\\NetBeansProjects\\TwitterPFE\\src\\KontRolPackage\\Icones\\Delete_22px.png"));
	          btnExit.setBackground(new java.awt.Color(255, 255, 255));
	          btnExit.setToolTipText("Fermer la fenetre");
	          btnExit.setBorderPainted(false);
	          btnExit.setContentAreaFilled(false);
	          btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
	          btnExit.setFocusPainted(false);
	          btnExit.addActionListener(new ActionListener() {
                      @Override
	              public void actionPerformed(ActionEvent e) {  
	          frame.setVisible(false);
	              }});
	          JButton  btnMinimiserFenetre  =new JButton(  new ImageIcon("C:\\Users\\RANIA\\Documents\\NetBeansProjects\\TwitterPFE\\src\\KontRolPackage\\Icones\\Minus_22px.png"));
	          btnMinimiserFenetre.setBackground(new java.awt.Color(255, 255, 255));      
	          btnMinimiserFenetre.setToolTipText("Minimiser la fenetre");
	          btnMinimiserFenetre.setBorderPainted(false);
	          btnMinimiserFenetre.setContentAreaFilled(false);
	          btnMinimiserFenetre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
	          btnMinimiserFenetre.setFocusPainted(false);
	          btnMinimiserFenetre.addActionListener(new ActionListener() {
	              public void actionPerformed(ActionEvent e) {  
	          frame.setState(Frame.ICONIFIED);
	              }});
	          JLabel  jLabel4=new JLabel();
	          jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
	          jLabel4.setForeground(new java.awt.Color(255, 255, 255));
	          jLabel4.setText("KontRol");
	          JLabel  jLabel3=new JLabel();
	          jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
	          jLabel3.setForeground(new java.awt.Color(255, 255, 255));

	          jLabel3.setText("Version1.0");
	          javax.swing.GroupLayout PanelHautLayout = new javax.swing.GroupLayout(PanelHaut);
	          PanelHaut.setLayout(PanelHautLayout);
                  PanelHaut.setBackground(new java.awt.Color(49, 6, 25));
	          PanelHautLayout.setHorizontalGroup(
	              PanelHautLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelHautLayout.createSequentialGroup()
	              .addContainerGap()
	              .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
	              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	              .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
	              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 712, Short.MAX_VALUE)
	              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	              .addComponent(btnMinimiserFenetre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	              .addGap(2, 2, 2)
	              .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	              .addContainerGap())      );

	          PanelHautLayout.setVerticalGroup(
	          PanelHautLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	          .addGroup(PanelHautLayout.createSequentialGroup()
	          .addGroup(PanelHautLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	          .addComponent(btnExit)
	          .addComponent(btnMinimiserFenetre)
	          .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	          .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
	          .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
                  
                    frame.add(PanelHaut, BorderLayout.NORTH);
                    frame.setSize(850, 600);
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
    }
    
    //methodes d affichage
    public static void Police_Bleu(JButton bouton)
    {
       bouton.setForeground(new java.awt.Color(0, 153, 255));
       
    }
    public static void Police_Blanc(JButton bouton)
    {
       bouton.setForeground(new java.awt.Color(255, 255, 255));
       
    }
    
    public void FonctionnalitesCouleursEtTaille(JLabel label){
        
        label.setFont(new java.awt.Font("Segoe UI Light", 1, 14));
        label.setForeground(new java.awt.Color(0, 153, 255));
    }
    
    public void enl_FonctionnalitesCouleurEtTaille(JLabel label){
        
        label.setFont(new java.awt.Font("Segoe UI Light", 0, 14));
        label.setForeground(new java.awt.Color(49, 6, 25));
    }
    
    public static void Police_Gras(JButton bouton)
    {
        bouton.setFont(new java.awt.Font("Segoe UI Light", 1, 13));
    }
    
    public static void Police_Normal(JButton bouton)
    {
        bouton.setFont(new java.awt.Font("Segoe UI Light", 0, 13));
    }
    
    //-------------------------------------- FONCTIONNALITEES PRINCIPALES ---------------------------------------
    
    private void btnDeconnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeconnectionActionPerformed
        //afficher un message de deconnection
            seDeconnecter();
    }//GEN-LAST:event_btnDeconnectionActionPerformed

    private void btnTweets_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTweets_ActionPerformed

        TWEETS tweets = new TWEETS();
        tweets.setVisible(true);
        tweets.setLocationRelativeTo(null);
        this.hide();
    }//GEN-LAST:event_btnTweets_ActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnRetweets_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetweets_ActionPerformed
      
        RETWEETS retweet = new RETWEETS ();
        retweet.setVisible(true);
        retweet.setLocationRelativeTo(null);
        this.hide();
    }//GEN-LAST:event_btnRetweets_ActionPerformed

    private void btnHashtags_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHashtags_ActionPerformed
      
        HASHTAGS hash = new HASHTAGS();
        hash.setVisible(true);
        hash.setLocationRelativeTo(null);
        this.hide();
    }//GEN-LAST:event_btnHashtags_ActionPerformed

    private void btnAbonnes_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbonnes_ActionPerformed
        ABONNES a = new ABONNES();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        this.hide();
    }//GEN-LAST:event_btnAbonnes_ActionPerformed

    private void btnMentions_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMentions_ActionPerformed
        MENTIONS a = new MENTIONS();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        this.hide();
    }//GEN-LAST:event_btnMentions_ActionPerformed

    private void btnAbonnement_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbonnement_ActionPerformed
        ABONNEMENTS a = new ABONNEMENTS();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        this.hide();
    }//GEN-LAST:event_btnAbonnement_ActionPerformed

    private void btnListes_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListes_ActionPerformed
            LISTES l = new LISTES();
            l.setVisible(true);
            l.setLocationRelativeTo(null);
            this.hide();
                    
    }//GEN-LAST:event_btnListes_ActionPerformed

    private void btnMinimiserFenetreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimiserFenetreActionPerformed

        DASHBOARD.this.setState(ICONIFIED);
    }//GEN-LAST:event_btnMinimiserFenetreActionPerformed

    private void btnFacebook_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacebook_ActionPerformed
        try 
        {  // adresse de la page facebook de l application
            Desktop.getDesktop().browse(new URI("https://www.facebook.com/KontRol-237123163687858/"));
        } 
        catch (IOException | URISyntaxException ex) 
        {
            Logger.getLogger(DASHBOARD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnFacebook_ActionPerformed

    private void btnTwitter_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwitter_ActionPerformed
        
        try 
        {  // adresse du compte twitter de l'application
            Desktop.getDesktop().browse(new URI("https://twitter.com/DeveloppeursK"));
        } 
        catch (IOException | URISyntaxException ex) 
        {
            Logger.getLogger(DASHBOARD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTwitter_ActionPerformed

    private void btnApropos_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApropos_ActionPerformed
        
       APROPOS apropos = new APROPOS();
       apropos.setVisible(true);
       apropos.setLocationRelativeTo(null);
       this.hide();
       
    }//GEN-LAST:event_btnApropos_ActionPerformed

    private void btnMAJ_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMAJ_ActionPerformed
        MESSAGE_MAJ maj = new MESSAGE_MAJ();
        maj.setVisible(true);
        maj.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btnMAJ_ActionPerformed

    private void btnProfil_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfil_ActionPerformed
    
        PROFIL profil = new PROFIL ();
        profil.setVisible(true);
        profil.setLocationRelativeTo(null);
        this.hide();
    }//GEN-LAST:event_btnProfil_ActionPerformed

    private void btnManuel_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManuel_ActionPerformed
       
        MANUEL man = new MANUEL ();
        man.setVisible(true);
        man.setLocationRelativeTo(null);
        this.hide();
        
    }//GEN-LAST:event_btnManuel_ActionPerformed

    private void btnCommentaire_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommentaire_ActionPerformed
         
        MESSAGE m = new MESSAGE();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btnCommentaire_ActionPerformed

    
    private void btnDeconnectionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeconnectionMouseEntered
       
        Police_Bleu(btnDeconnection);
    }//GEN-LAST:event_btnDeconnectionMouseEntered

    private void btnDeconnectionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeconnectionMouseExited
        Police_Blanc(btnDeconnection);
    }//GEN-LAST:event_btnDeconnectionMouseExited

    private void btnEtatDuCompte_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEtatDuCompte_MouseEntered
        Police_Bleu(btnEtatDuCompte_);
    }//GEN-LAST:event_btnEtatDuCompte_MouseEntered

    private void btnEtatDuCompte_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEtatDuCompte_MouseExited
       Police_Blanc(btnEtatDuCompte_);
    }//GEN-LAST:event_btnEtatDuCompte_MouseExited

    
    private void btnProfil_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfil_MouseEntered
        
        Police_Gras(btnProfil_);
    }//GEN-LAST:event_btnProfil_MouseEntered

    private void btnProfil_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfil_MouseExited
       Police_Normal(btnProfil_);
    }//GEN-LAST:event_btnProfil_MouseExited

    private void btnManuel_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManuel_MouseEntered
        Police_Gras(btnManuel_);
    }//GEN-LAST:event_btnManuel_MouseEntered

    private void btnManuel_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManuel_MouseExited
        Police_Normal(btnManuel_);
    }//GEN-LAST:event_btnManuel_MouseExited

    private void btnApropos_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApropos_MouseEntered
        Police_Gras(btnApropos_);
    }//GEN-LAST:event_btnApropos_MouseEntered

    private void btnApropos_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApropos_MouseExited
        Police_Normal(btnApropos_);
    }//GEN-LAST:event_btnApropos_MouseExited

    private void btnMAJ_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMAJ_MouseEntered
        Police_Gras(btnMAJ_);
    }//GEN-LAST:event_btnMAJ_MouseEntered

    private void btnMAJ_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMAJ_MouseExited
        Police_Normal(btnMAJ_);
    }//GEN-LAST:event_btnMAJ_MouseExited

    
    private void btnTweets_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTweets_MouseEntered
        FonctionnalitesCouleursEtTaille(labelTweets);
    }//GEN-LAST:event_btnTweets_MouseEntered

    private void btnTweets_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTweets_MouseExited
         enl_FonctionnalitesCouleurEtTaille(labelTweets);
    }//GEN-LAST:event_btnTweets_MouseExited

    private void btnCommentaire_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCommentaire_MouseEntered
        Police_Gras(btnCommentaire_);
    }//GEN-LAST:event_btnCommentaire_MouseEntered

    private void btnCommentaire_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCommentaire_MouseExited
        Police_Normal(btnCommentaire_);
    }//GEN-LAST:event_btnCommentaire_MouseExited

    private void btnTwitter_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTwitter_MouseEntered
        Police_Bleu(btnTwitter_);
    }//GEN-LAST:event_btnTwitter_MouseEntered

    private void btnTwitter_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTwitter_MouseExited
        Police_Blanc(btnTwitter_);
    }//GEN-LAST:event_btnTwitter_MouseExited

    private void btnFacebook_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacebook_MouseEntered
        Police_Bleu(btnFacebook_);
    }//GEN-LAST:event_btnFacebook_MouseEntered

    private void btnFacebook_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacebook_MouseExited
        Police_Blanc(btnFacebook_);
    }//GEN-LAST:event_btnFacebook_MouseExited

    private void btnRetweets_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetweets_MouseEntered
        
        FonctionnalitesCouleursEtTaille(labelRetweets);
    }//GEN-LAST:event_btnRetweets_MouseEntered

    private void btnRetweets_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetweets_MouseExited
        enl_FonctionnalitesCouleurEtTaille(labelRetweets);
    }//GEN-LAST:event_btnRetweets_MouseExited

    private void btnHashtags_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHashtags_MouseEntered
        FonctionnalitesCouleursEtTaille(labelHashtags);
    }//GEN-LAST:event_btnHashtags_MouseEntered

    private void btnHashtags_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHashtags_MouseExited
        enl_FonctionnalitesCouleurEtTaille(labelHashtags);
    }//GEN-LAST:event_btnHashtags_MouseExited

    private void btnMentions_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMentions_MouseEntered
       
        FonctionnalitesCouleursEtTaille(labelMentions);
    }//GEN-LAST:event_btnMentions_MouseEntered

    private void btnMentions_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMentions_MouseExited
        
        enl_FonctionnalitesCouleurEtTaille(labelMentions);
    }//GEN-LAST:event_btnMentions_MouseExited

    private void btnAbonnes_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbonnes_MouseEntered
        FonctionnalitesCouleursEtTaille(labelAbonnes);
    }//GEN-LAST:event_btnAbonnes_MouseEntered

    private void btnAbonnes_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbonnes_MouseExited
     enl_FonctionnalitesCouleurEtTaille(labelAbonnes);
    }//GEN-LAST:event_btnAbonnes_MouseExited

    private void btnAbonnement_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbonnement_MouseEntered
     FonctionnalitesCouleursEtTaille(labelAbonnement);   

    }//GEN-LAST:event_btnAbonnement_MouseEntered

    private void btnAbonnement_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbonnement_MouseExited
        
        enl_FonctionnalitesCouleurEtTaille(labelAbonnement);
    }//GEN-LAST:event_btnAbonnement_MouseExited

    private void btnListes_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListes_MouseEntered
       FonctionnalitesCouleursEtTaille(labelListes);
    }//GEN-LAST:event_btnListes_MouseEntered

    private void btnListes_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListes_MouseExited
       enl_FonctionnalitesCouleurEtTaille(labelListes);
    }//GEN-LAST:event_btnListes_MouseExited

    private void btnAutres_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAutres_MouseEntered
        FonctionnalitesCouleursEtTaille(labelAutres);
    }//GEN-LAST:event_btnAutres_MouseEntered

    private void btnAutres_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAutres_MouseExited
       enl_FonctionnalitesCouleurEtTaille(labelAutres);
    }//GEN-LAST:event_btnAutres_MouseExited

    private void btnAutres_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutres_ActionPerformed
AUTRES_CIBLE a = new AUTRES_CIBLE();
a.setVisible(true);
a.setLocationRelativeTo(null);
this.hide();
    }//GEN-LAST:event_btnAutres_ActionPerformed

    
    
    
    //---------------------------------------------------- FONCTIONNALITEES SECONDAIRES -----------------------------------------------------
    
    
    private void btnTimeLine_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimeLine_MouseEntered
     FonctionnalitesCouleursEtTaille(lblTimeLine);   
    }//GEN-LAST:event_btnTimeLine_MouseEntered

    private void btnTimeLine_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimeLine_MouseExited
        enl_FonctionnalitesCouleurEtTaille(lblTimeLine);
    }//GEN-LAST:event_btnTimeLine_MouseExited

    private void btnTimeLine_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimeLine_ActionPerformed

        TIMELINE t = new TIMELINE();
        t.setVisible(true);
        t.setLocationRelativeTo(null);
        this.hide();
    }//GEN-LAST:event_btnTimeLine_ActionPerformed

    private void btnTweeter_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTweeter_MouseEntered
       FonctionnalitesCouleursEtTaille(lblTweeter);  
    }//GEN-LAST:event_btnTweeter_MouseEntered

    private void btnTweeter_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTweeter_MouseExited
       enl_FonctionnalitesCouleurEtTaille(lblTweeter);
    }//GEN-LAST:event_btnTweeter_MouseExited

    private void btnTweeter_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTweeter_ActionPerformed

        TWEETER t = new TWEETER();
        t.setVisible(true);
        t.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btnTweeter_ActionPerformed

    private void btnMsgsPrives_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMsgsPrives_MouseEntered
        FonctionnalitesCouleursEtTaille(lblMsgs);  
    }//GEN-LAST:event_btnMsgsPrives_MouseEntered

    private void btnMsgsPrives_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMsgsPrives_MouseExited
        enl_FonctionnalitesCouleurEtTaille(lblMsgs);
    }//GEN-LAST:event_btnMsgsPrives_MouseExited

    private void btnMsgsPrives_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMsgsPrives_ActionPerformed
        
        MESSAGES_PRIVES m = new MESSAGES_PRIVES();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
        this.hide();
        
    }//GEN-LAST:event_btnMsgsPrives_ActionPerformed

    private void btnAbnmns_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbnmns_MouseEntered
    FonctionnalitesCouleursEtTaille(lblListesAbnmns);  
    }//GEN-LAST:event_btnAbnmns_MouseEntered

    private void btnAbnmns_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbnmns_MouseExited
       enl_FonctionnalitesCouleurEtTaille(lblListesAbnmns);
    }//GEN-LAST:event_btnAbnmns_MouseExited

    private void btnAbnmns_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbnmns_ActionPerformed
        LISTE_ABNMNTS_PARENT a = new LISTE_ABNMNTS_PARENT();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
      
    }//GEN-LAST:event_btnAbnmns_ActionPerformed

    private void btnTimeLine_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimeLine_1MouseEntered
      
    }//GEN-LAST:event_btnTimeLine_1MouseEntered

    private void btnTimeLine_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimeLine_1MouseExited
       
    }//GEN-LAST:event_btnTimeLine_1MouseExited

    private void btnTimeLine_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimeLine_1ActionPerformed
       
    }//GEN-LAST:event_btnTimeLine_1ActionPerformed

    private void btnMesListes_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMesListes_MouseEntered
       FonctionnalitesCouleursEtTaille(lblMesListes);  
    }//GEN-LAST:event_btnMesListes_MouseEntered

    private void btnMesListes_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMesListes_MouseExited
      enl_FonctionnalitesCouleurEtTaille(lblMesListes);
    }//GEN-LAST:event_btnMesListes_MouseExited

    private void btnMesListes_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesListes_ActionPerformed
    LISTE_CREES_PARENT l = new LISTE_CREES_PARENT();
    l.setVisible(true);
    l.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnMesListes_ActionPerformed

    private void btnParametres_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnParametres_MouseEntered
      FonctionnalitesCouleursEtTaille(lblParametre);  
    }//GEN-LAST:event_btnParametres_MouseEntered

    private void btnParametres_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnParametres_MouseExited
       enl_FonctionnalitesCouleurEtTaille(lblParametre);
    }//GEN-LAST:event_btnParametres_MouseExited

    private void btnParametres_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParametres_ActionPerformed
        PARAMS_AFF_PARENT a = null;
        try 
        {
            a = new PARAMS_AFF_PARENT();
            a.setVisible(true);
            a.setLocationRelativeTo(null);
            this.hide();
        } 
        catch (TwitterException | IOException ex) {
            Logger.getLogger(DASHBOARD.class.getName()).log(Level.SEVERE, null, ex);
        } 
       
    }//GEN-LAST:event_btnParametres_ActionPerformed

    private void btnAbns_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbns_MouseEntered
        FonctionnalitesCouleursEtTaille(lblMaListe);  
    }//GEN-LAST:event_btnAbns_MouseEntered

    private void btnAbns_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbns_MouseExited
        enl_FonctionnalitesCouleurEtTaille(lblMaListe);
    }//GEN-LAST:event_btnAbns_MouseExited

    private void btnAbns_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbns_ActionPerformed
       LISTE_ABONNES_PARENT l = new LISTE_ABONNES_PARENT();
       l.setVisible(true);
       l.setLocationRelativeTo(null);
       
    }//GEN-LAST:event_btnAbns_ActionPerformed

    private void btnAutres2_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAutres2_MouseEntered
       FonctionnalitesCouleursEtTaille(lblMesAutres);  
    }//GEN-LAST:event_btnAutres2_MouseEntered

    private void btnAutres2_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAutres2_MouseExited
        enl_FonctionnalitesCouleurEtTaille(lblMesAutres);
    }//GEN-LAST:event_btnAutres2_MouseExited

    private void btnAutres2_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutres2_ActionPerformed
        AUTRES_PARENT a = new AUTRES_PARENT();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        this.hide();
    }//GEN-LAST:event_btnAutres2_ActionPerformed

    private void btnEtatDuCompte_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEtatDuCompte_ActionPerformed
           
             try 
             {  //graphe de l etat general du compte de la cible 
                    GrapheEtatDuCompte frame = new GrapheEtatDuCompte(LOGIN_CIBLE.userCible);
                    Barre(frame);
                   
             } 
             catch (TwitterException ex) 
             {
                 Logger.getLogger(DASHBOARD.class.getName()).log(Level.SEVERE, null, ex);
             }
		
    }//GEN-LAST:event_btnEtatDuCompte_ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBas;
    private javax.swing.JPanel PanelHaut;
    private javax.swing.JButton btnAbnmns_;
    private javax.swing.JButton btnAbns_;
    private javax.swing.JButton btnAbonnement_;
    private javax.swing.JButton btnAbonnes_;
    private javax.swing.JButton btnApropos_;
    private javax.swing.JButton btnAutres2_;
    private javax.swing.JButton btnAutres_;
    private javax.swing.JButton btnCommentaire_;
    private javax.swing.JButton btnDeconnection;
    private javax.swing.JButton btnEtatDuCompte_;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFacebook_;
    private javax.swing.JButton btnHashtags_;
    private javax.swing.JButton btnListes_;
    private javax.swing.JButton btnMAJ_;
    private javax.swing.JButton btnManuel_;
    private javax.swing.JButton btnMentions_;
    private javax.swing.JButton btnMesListes_;
    private javax.swing.JButton btnMinimiserFenetre;
    private javax.swing.JButton btnMsgsPrives_;
    private javax.swing.JButton btnParametres_;
    private javax.swing.JButton btnProfil_;
    private javax.swing.JButton btnRetweets_;
    private javax.swing.JButton btnTimeLine_;
    private javax.swing.JButton btnTimeLine_1;
    private javax.swing.JButton btnTweeter_;
    private javax.swing.JButton btnTweets_;
    private javax.swing.JButton btnTwitter_;
    private javax.swing.JLabel image2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelAbonnement;
    private javax.swing.JLabel labelAbonnes;
    private javax.swing.JLabel labelAutres;
    private javax.swing.JLabel labelHashtags;
    private javax.swing.JLabel labelListes;
    private javax.swing.JLabel labelMentions;
    private javax.swing.JLabel labelRetweets;
    private javax.swing.JLabel labelTweets;
    private static javax.swing.JLabel lbl;
    private javax.swing.JLabel lblListesAbnmns;
    private javax.swing.JLabel lblMaListe;
    private javax.swing.JLabel lblMesAutres;
    private javax.swing.JLabel lblMesListes;
    private javax.swing.JLabel lblMsgs;
    private javax.swing.JLabel lblParametre;
    private javax.swing.JLabel lblTimeLine;
    private javax.swing.JLabel lblTweeter;
    private javax.swing.JPanel p;
    private javax.swing.JPanel panelConf;
    private javax.swing.JPanel panelMisesAJour;
    private javax.swing.JPanel panelMsg;
    private javax.swing.JTabbedPane panel_PRINC_SEC;
    // End of variables declaration//GEN-END:variables
}
