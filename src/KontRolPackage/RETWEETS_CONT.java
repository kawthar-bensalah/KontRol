
package KontRolPackage;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import twitter4j.Paging;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;

public class RETWEETS_CONT extends javax.swing.JFrame {

    public RETWEETS_CONT() {
        initComponents();
    }

    public void ExtractionRT (String user) throws TwitterException{
        
         DefaultListModel<RetweetClass> listModel = new DefaultListModel<>();
    
        Twitter cnx=INSCRIPTION.ConnexionAPI(INSCRIPTION.dev_consumerK,INSCRIPTION.dev_consumerS,INSCRIPTION.dev_accessT,INSCRIPTION.dev_accessS);
        int pageno = 1;
        
        List <Status> statuses = new ArrayList();

        while (true) {

            int size = statuses.size();
            Paging page = new Paging(pageno++, 100);
            statuses.addAll(cnx.getUserTimeline(user, page));
            if (statuses.size() == size)
                break;
        }
        SimpleDateFormat simpleDate = new SimpleDateFormat("EEE dd/MM/yyyy à hh:mm:ss");
        boolean B= false;
        for (Status status : statuses) 
        {
          Date date = status.getCreatedAt();
          if(status.isRetweet()==true)
          {RetweetClass rte = new RetweetClass(status.getUser().getScreenName(),status.getRetweetedStatus().getUser().getScreenName(),simpleDate.format(date),status.getRetweetedStatus().getText(),status.getFavoriteCount(),status.getRetweetCount(),status.isRetweetedByMe(),status.getLang(),status.getGeoLocation(),status.getPlace());
          listModel.addElement(rte);
          B=true;
          }
        }
        if(!B)
        {
            JOptionPane.showMessageDialog(null,"Pas de Retweets dans ce compte\nCliquez sur 'Ok' puis réessayez.","ATTENTION !", JOptionPane.WARNING_MESSAGE);
            DASHBOARD d = new DASHBOARD();
            d.setVisible(true);
            d.setLocationRelativeTo(null);
            this.hide();
        }
        
        texteRetweets.setLineWrap(true);
        listeRetweets.setModel(listModel);
        
         listeRetweets.getSelectionModel().addListSelectionListener(e -> {
            RetweetClass s = listeRetweets.getSelectedValue();
            
            texteRetweets.setText(s.getTexte());
          texteInfosRetweets.setText(" Retweet de : @"+s.getNom()+"\n Tweet de : @"+s.getNomRT()+"\n Favoris : "+String.valueOf(s.getNbrFavoris())+"\n Retweets : "+String.valueOf(s.getNbrRetweet())+"\n Langue : "+s.getLangue()+"\n Place : "+s.getGeolocation()+" , "+s.getPlace()); 
          
        });
    }
    
    public void ExtractionRT_Date(String user,Date dateDeb,Date dateFin) throws TwitterException{
        
         DefaultListModel<RetweetClass> listModel = new DefaultListModel<>();
    
        Twitter cnx=INSCRIPTION.ConnexionAPI(INSCRIPTION.dev_consumerK,INSCRIPTION.dev_consumerS,INSCRIPTION.dev_accessT,INSCRIPTION.dev_accessS);
        
        int pageno = 1;
        
        List <Status> statuses = new ArrayList();

        while (true) {

            int size = statuses.size();
            Paging page = new Paging(pageno++, 100);
            statuses.addAll(cnx.getUserTimeline(user, page));
            if (statuses.size() == size)
                break;
        }
        SimpleDateFormat simpleDate = new SimpleDateFormat("EEE dd/MM/yyyy à hh:mm:ss");
        boolean B= false;
        for (Status status : statuses) 
        {
          Date date = status.getCreatedAt();
          if(status.isRetweet()==true)
          {     
              if(status.getCreatedAt().after(dateDeb) && status.getCreatedAt().before(dateFin))
              {
                RetweetClass rte = new RetweetClass(status.getUser().getScreenName(),status.getRetweetedStatus().getUser().getScreenName(),simpleDate.format(date),status.getRetweetedStatus().getText(),status.getFavoriteCount(),status.getRetweetCount(),status.isRetweetedByMe(),status.getLang(),status.getGeoLocation(),status.getPlace());
                listModel.addElement(rte);
                B=true;
              }
          }
        }
        if(!B)
        {
            JOptionPane.showMessageDialog(null,"Pas de Retweets dans ce compte\nCliquez sur 'Ok' puis réessayez.","ATTENTION !", JOptionPane.WARNING_MESSAGE);
            DASHBOARD d = new DASHBOARD();
            d.setVisible(true);
            d.setLocationRelativeTo(null);
            this.hide();
        }
                  
        listeRetweets.setModel(listModel);
        texteRetweets.setLineWrap(true);
         listeRetweets.getSelectionModel().addListSelectionListener(e -> {
            RetweetClass s = listeRetweets.getSelectedValue();
            
            texteRetweets.setText(s.getTexte());
          texteInfosRetweets.setText(" Retweet de : @"+s.getNom()+"\n Date de création : "+s.getDate()+"\n Tweet de : @"+s.getNomRT()+"\n Favoris : "+String.valueOf(s.getNbrFavoris())+"\n Retweets : "+String.valueOf(s.getNbrRetweet())+"\n Langue : "+s.getLangue()+"\n Place : "+s.getGeolocation()+" , "+s.getPlace()); 
          
        });
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
        PanelBas = new javax.swing.JPanel();
        btnDeconnection = new javax.swing.JButton();
        btnDashboard_ = new javax.swing.JButton();
        btnPrecedent_ = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listeRetweets = new javax.swing.JList<>();
        btnSauvegarder_ = new javax.swing.JButton();
        btnViderRetweets_ = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnAfficherRetweets_ = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        texteRetweets = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        texteInfosRetweets = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        btnProfil_ = new javax.swing.JButton();
        btnManuel_ = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        btnMAJ_ = new javax.swing.JButton();
        btnCommentaire_ = new javax.swing.JButton();
        btnApropos_ = new javax.swing.JButton();
        btnTwitter_ = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        panelConf = new javax.swing.JPanel();
        panelMisesAJour = new javax.swing.JPanel();
        panelMsg = new javax.swing.JPanel();
        btnConfiguration_ = new javax.swing.JButton();
        btnFacebook_ = new javax.swing.JButton();

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

        javax.swing.GroupLayout PanelHautLayout = new javax.swing.GroupLayout(PanelHaut);
        PanelHaut.setLayout(PanelHautLayout);
        PanelHautLayout.setHorizontalGroup(
            PanelHautLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelHautLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelHautLayout.setVerticalGroup(
            PanelHautLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHautLayout.createSequentialGroup()
                .addGroup(PanelHautLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnFermer_.setBackground(new java.awt.Color(255, 255, 255));
        btnFermer_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Icones/Delete_22px.png"))); // NOI18N
        btnFermer_.setToolTipText("Minimiser la fenetre");
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

        PanelBas.setBackground(new java.awt.Color(49, 6, 25));
        PanelBas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        btnDeconnection.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnDeconnection.setForeground(new java.awt.Color(255, 255, 255));
        btnDeconnection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Logout Rounded Left_22px.png"))); // NOI18N
        btnDeconnection.setToolTipText("Se déconnecter et passer à l'écran Login");
        btnDeconnection.setBorderPainted(false);
        btnDeconnection.setContentAreaFilled(false);
        btnDeconnection.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeconnection.setFocusPainted(false);
        btnDeconnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeconnectionActionPerformed(evt);
            }
        });

        btnDashboard_.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnDashboard_.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Home_22px.png"))); // NOI18N
        btnDashboard_.setToolTipText("Retour à l'écran principal");
        btnDashboard_.setBorderPainted(false);
        btnDashboard_.setContentAreaFilled(false);
        btnDashboard_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDashboard_.setFocusPainted(false);
        btnDashboard_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboard_ActionPerformed(evt);
            }
        });

        btnPrecedent_.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnPrecedent_.setForeground(new java.awt.Color(255, 255, 255));
        btnPrecedent_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Return_22px.png"))); // NOI18N
        btnPrecedent_.setToolTipText("Retour à l'écran précédent.");
        btnPrecedent_.setBorderPainted(false);
        btnPrecedent_.setContentAreaFilled(false);
        btnPrecedent_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrecedent_.setFocusPainted(false);
        btnPrecedent_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrecedent_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBasLayout = new javax.swing.GroupLayout(PanelBas);
        PanelBas.setLayout(PanelBasLayout);
        PanelBasLayout.setHorizontalGroup(
            PanelBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBasLayout.createSequentialGroup()
                .addContainerGap(397, Short.MAX_VALUE)
                .addComponent(btnDeconnection, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDashboard_, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrecedent_, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(404, 404, 404))
        );
        PanelBasLayout.setVerticalGroup(
            PanelBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBasLayout.createSequentialGroup()
                .addGroup(PanelBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDashboard_)
                    .addComponent(btnDeconnection)
                    .addComponent(btnPrecedent_))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 6, 25)));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Contenu Retweets");

        jSeparator3.setForeground(new java.awt.Color(0, 153, 255));

        jSeparator4.setForeground(new java.awt.Color(0, 153, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(49, 6, 25));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Texte du Retweet");

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(49, 6, 25));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Informations sur le Retweet");

        listeRetweets.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(49, 6, 25), 1, true));
        listeRetweets.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        listeRetweets.setForeground(new java.awt.Color(51, 51, 51));
        listeRetweets.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listeRetweets);

        btnSauvegarder_.setFont(new java.awt.Font("Segoe UI Light", 1, 15)); // NOI18N
        btnSauvegarder_.setForeground(new java.awt.Color(0, 153, 255));
        btnSauvegarder_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Save_27px.png"))); // NOI18N
        btnSauvegarder_.setToolTipText("Sauvegarder les informations affichés du tweet");
        btnSauvegarder_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btnSauvegarder_.setContentAreaFilled(false);
        btnSauvegarder_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSauvegarder_.setFocusPainted(false);
        btnSauvegarder_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSauvegarder_ActionPerformed(evt);
            }
        });

        btnViderRetweets_.setFont(new java.awt.Font("Segoe UI Light", 1, 15)); // NOI18N
        btnViderRetweets_.setForeground(new java.awt.Color(0, 153, 255));
        btnViderRetweets_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Rewind_39px.png"))); // NOI18N
        btnViderRetweets_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btnViderRetweets_.setContentAreaFilled(false);
        btnViderRetweets_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViderRetweets_.setFocusPainted(false);
        btnViderRetweets_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViderRetweets_ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(49, 6, 25));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Liste des Retweets");

        btnAfficherRetweets_.setFont(new java.awt.Font("Segoe UI Light", 1, 15)); // NOI18N
        btnAfficherRetweets_.setForeground(new java.awt.Color(0, 153, 255));
        btnAfficherRetweets_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Fast Forward_39px.png"))); // NOI18N
        btnAfficherRetweets_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btnAfficherRetweets_.setContentAreaFilled(false);
        btnAfficherRetweets_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAfficherRetweets_.setFocusPainted(false);
        btnAfficherRetweets_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfficherRetweets_ActionPerformed(evt);
            }
        });

        texteRetweets.setColumns(20);
        texteRetweets.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        texteRetweets.setForeground(new java.awt.Color(51, 51, 51));
        texteRetweets.setRows(5);
        texteRetweets.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(49, 6, 25), 1, true));
        jScrollPane2.setViewportView(texteRetweets);

        texteInfosRetweets.setColumns(20);
        texteInfosRetweets.setFont(new java.awt.Font("Segoe UI Light", 1, 13)); // NOI18N
        texteInfosRetweets.setForeground(new java.awt.Color(51, 51, 51));
        texteInfosRetweets.setRows(5);
        texteInfosRetweets.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(49, 6, 25), 1, true));
        jScrollPane3.setViewportView(texteInfosRetweets);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSauvegarder_, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnViderRetweets_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAfficherRetweets_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(4, 4, 4)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(btnAfficherRetweets_)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnViderRetweets_))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(btnSauvegarder_, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3)))))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(49, 6, 25));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Menu");

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

        jLabel18.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 153, 255));
        jLabel18.setText("Trouvez-nous sur : ");

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

        jLabel20.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 153, 255));
        jLabel20.setText("Contact");

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelConf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelMisesAJour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnApropos_, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCommentaire_, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMAJ_, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConfiguration_, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTwitter_, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFacebook_, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProfil_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btnManuel_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(5, 5, 5))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel18))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(28, 28, 28)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnProfil_, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnManuel_, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(panelMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(panelConf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMAJ_, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(panelMisesAJour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnApropos_, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnConfiguration_, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCommentaire_, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTwitter_, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(btnFacebook_, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PanelHaut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMinimiserFenetre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFermer_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PanelBas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(PanelHaut, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnFermer_))
                    .addComponent(btnMinimiserFenetre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelBas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
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

    private void btnFermer_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFermer_ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnFermer_ActionPerformed

    private void btnAfficherRetweets_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfficherRetweets_ActionPerformed

         try 
         { 
            if(RETWEETS_CONFIG_CONT.dateDR)
            {  
                ExtractionRT(LOGIN_CIBLE.userCible);
            }
            else 
            {
                if(RETWEETS_CONFIG_CONT.datePR)
                {
                    ExtractionRT_Date(LOGIN_CIBLE.userCible, RETWEETS_CONFIG_CONT.date1R, RETWEETS_CONFIG_CONT.date2R);
                }
                else
                {
                     //dans le cas ou le user n'a rien configuré on passe à l extraction par defaut ( le tout)
            ExtractionRT(LOGIN_CIBLE.userCible); 
                }
            }
           
         }
          
        catch (TwitterException ex) 
        {
                Logger.getLogger(RETWEETS_CONT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAfficherRetweets_ActionPerformed

    private void btnViderRetweets_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViderRetweets_ActionPerformed

        texteRetweets.setText("");
        texteInfosRetweets.setText("");
    }//GEN-LAST:event_btnViderRetweets_ActionPerformed

    private void btnSauvegarder_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSauvegarder_ActionPerformed
         
        //message d i nfor
        MESSAGE_SAUVEGARDER_Tweet msg = new MESSAGE_SAUVEGARDER_Tweet(texteInfosRetweets,texteRetweets);
        msg.setVisible(true);
        msg.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnSauvegarder_ActionPerformed

    private void btnDeconnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeconnectionActionPerformed

        DASHBOARD.seDeconnecter();
    }//GEN-LAST:event_btnDeconnectionActionPerformed

    private void btnDashboard_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboard_ActionPerformed

        DASHBOARD dash = new DASHBOARD();
        dash.setVisible(true);
        dash.setLocationRelativeTo(null);
        this.hide();
    }//GEN-LAST:event_btnDashboard_ActionPerformed

    private void btnPrecedent_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrecedent_ActionPerformed

        RETWEETS d = new RETWEETS();
        d.setVisible(true);
        d.setLocationRelativeTo(null);
        this.hide();
    }//GEN-LAST:event_btnPrecedent_ActionPerformed

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

        RETWEETS_CONFIG_CONT conf = new RETWEETS_CONFIG_CONT ();
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

    private void btnMinimiserFenetreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimiserFenetreActionPerformed
        RETWEETS_CONT.this.setState(ICONIFIED);
    }//GEN-LAST:event_btnMinimiserFenetreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBas;
    private javax.swing.JPanel PanelHaut;
    private javax.swing.JButton btnAfficherRetweets_;
    private javax.swing.JButton btnApropos_;
    private javax.swing.JButton btnCommentaire_;
    private javax.swing.JButton btnConfiguration_;
    private javax.swing.JButton btnDashboard_;
    private javax.swing.JButton btnDeconnection;
    private javax.swing.JButton btnFacebook_;
    private javax.swing.JButton btnFermer_;
    private javax.swing.JButton btnMAJ_;
    private javax.swing.JButton btnManuel_;
    private javax.swing.JButton btnMinimiserFenetre;
    private javax.swing.JButton btnPrecedent_;
    private javax.swing.JButton btnProfil_;
    private javax.swing.JButton btnSauvegarder_;
    private javax.swing.JButton btnTwitter_;
    private javax.swing.JButton btnViderRetweets_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JList<RetweetClass> listeRetweets;
    private javax.swing.JPanel panelConf;
    private javax.swing.JPanel panelMisesAJour;
    private javax.swing.JPanel panelMsg;
    private javax.swing.JTextArea texteInfosRetweets;
    private javax.swing.JTextArea texteRetweets;
    // End of variables declaration//GEN-END:variables
}
