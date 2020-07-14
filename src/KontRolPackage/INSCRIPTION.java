package KontRolPackage;

import static KontRolPackage.DASHBOARD.Police_Bleu;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import org.neo4j.driver.v1.AuthTokens;
import org.neo4j.driver.v1.Driver;
import org.neo4j.driver.v1.GraphDatabase;
import org.neo4j.driver.v1.Session;
import org.neo4j.driver.v1.StatementResult;
import org.neo4j.driver.v1.exceptions.ClientException;
import twitter4j.DirectMessage;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class INSCRIPTION extends javax.swing.JFrame {

  
        public  static String nouv_nom,user,nouv_mdp,nouv_conf_mdp,code ;
        public static  Session session ;
        
        //cles des developpeurs de Kontrol pour l'utilisation adminitrative de l'application
        public static String dev_consumerK="1Jf0ry1UNLe6nYJwrKEOaHn2y",dev_consumerS="NUCSUJKIDEuSUcq4ZATH3TQncM7oVPL7HX1a89TW7ABqU1lnn1",
                             dev_accessT = "959742305279365123-OQzwaUEcFAinxrq7ZBHlsZc8zqS6FVw",dev_accessS="R1AjYeqmwJMTs53i1s2jHxqWP1lzJfi0eWNxq5b09oNBR";
        public static boolean clique=false;
        
    public INSCRIPTION() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        user_insc = new javax.swing.JTextField();
        nom_insc = new javax.swing.JTextField();
        mdp_insc = new javax.swing.JPasswordField();
        mdp_conf_insc = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        btnSuivantInscription_ = new javax.swing.JButton();
        btnRéessayerInscription_ = new javax.swing.JButton();
        btnLogin_ = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        btnAnnuler_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 6, 25), 2));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(49, 6, 25));
        jLabel2.setText("Pseudo");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(49, 6, 25));
        jLabel3.setText("Nom d'utilisateur Twitter ");

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(49, 6, 25));
        jLabel4.setText("Mot de passe ");

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(49, 6, 25));
        jLabel5.setText("Confirmez le mot de passe ");

        user_insc.setFont(new java.awt.Font("Segoe UI Light", 1, 13)); // NOI18N
        user_insc.setForeground(new java.awt.Color(51, 51, 51));
        user_insc.setToolTipText("Introduisez votre nom d'utilisateur Twitter (ScreenName).");
        user_insc.setBorder(null);

        nom_insc.setFont(new java.awt.Font("Segoe UI Light", 1, 13)); // NOI18N
        nom_insc.setForeground(new java.awt.Color(51, 51, 51));
        nom_insc.setToolTipText("Choisissez votre nom de profil dans l'application");
        nom_insc.setBorder(null);

        mdp_insc.setFont(new java.awt.Font("Segoe UI Light", 1, 13)); // NOI18N
        mdp_insc.setForeground(new java.awt.Color(51, 51, 51));
        mdp_insc.setToolTipText("Le mot de passe de votre profil dans l'application ");
        mdp_insc.setBorder(null);

        mdp_conf_insc.setFont(new java.awt.Font("Segoe UI Light", 1, 13)); // NOI18N
        mdp_conf_insc.setForeground(new java.awt.Color(51, 51, 51));
        mdp_conf_insc.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(49, 6, 25));
        jLabel1.setText("Inscription");

        btnSuivantInscription_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Forward_30px.png"))); // NOI18N
        btnSuivantInscription_.setToolTipText("S'inscrire et passer à l'étape suiante");
        btnSuivantInscription_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnSuivantInscription_.setContentAreaFilled(false);
        btnSuivantInscription_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSuivantInscription_.setFocusPainted(false);
        btnSuivantInscription_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSuivantInscription_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSuivantInscription_MouseExited(evt);
            }
        });
        btnSuivantInscription_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuivantInscription_ActionPerformed(evt);
            }
        });

        btnRéessayerInscription_.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        btnRéessayerInscription_.setForeground(new java.awt.Color(0, 153, 255));
        btnRéessayerInscription_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Replace_30px.png"))); // NOI18N
        btnRéessayerInscription_.setToolTipText("Vider tous les champs et réessayer");
        btnRéessayerInscription_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnRéessayerInscription_.setContentAreaFilled(false);
        btnRéessayerInscription_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRéessayerInscription_.setFocusPainted(false);
        btnRéessayerInscription_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRéessayerInscription_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRéessayerInscription_MouseExited(evt);
            }
        });
        btnRéessayerInscription_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRéessayerInscription_ActionPerformed(evt);
            }
        });

        btnLogin_.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnLogin_.setForeground(new java.awt.Color(51, 51, 51));
        btnLogin_.setText("Déjà inscris? Login");
        btnLogin_.setBorder(null);
        btnLogin_.setContentAreaFilled(false);
        btnLogin_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin_.setFocusPainted(false);
        btnLogin_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogin_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogin_MouseExited(evt);
            }
        });
        btnLogin_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin_ActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/User_22px.png"))); // NOI18N

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Twittercarre_22px.png"))); // NOI18N

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Unlock 2_22px.png"))); // NOI18N

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Lock_22px.png"))); // NOI18N
        jLabel9.setFocusable(false);

        btnAnnuler_.setBackground(new java.awt.Color(255, 255, 255));
        btnAnnuler_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/KontRolPackage/Delete_30px.png"))); // NOI18N
        btnAnnuler_.setToolTipText("Annuler l'inscription");
        btnAnnuler_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnAnnuler_.setContentAreaFilled(false);
        btnAnnuler_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnnuler_.setFocusPainted(false);
        btnAnnuler_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAnnuler_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAnnuler_MouseExited(evt);
            }
        });
        btnAnnuler_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnuler_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(user_insc, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                    .addComponent(jSeparator2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mdp_insc, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                    .addComponent(jSeparator3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                    .addComponent(nom_insc, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(btnAnnuler_)
                                        .addGap(37, 37, 37)
                                        .addComponent(btnRéessayerInscription_)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSuivantInscription_)
                                        .addGap(23, 23, 23))
                                    .addComponent(mdp_conf_insc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btnLogin_, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(nom_insc))
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(user_insc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mdp_insc, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(mdp_conf_insc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSuivantInscription_)
                            .addComponent(btnRéessayerInscription_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addComponent(btnLogin_)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAnnuler_)
                        .addGap(48, 48, 48))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //établir une connexion avec la base de données (neo4j c'est le nom de l'utilisateur (admin) et rania le mdp)
    public static Session ConnexionNeo4j ()
    {
       try
       {
           
            Driver driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "rania"));
            session= driver.session();  
       }
       catch (ClientException e) 
       {
           //message d'erreur en cas d'echec
            ERREUR_INTERNET i = new ERREUR_INTERNET();
            ERREUR_INTERNET.internet.setText("Accès à la BDD interrompu!");
            i.setVisible(true);
            i.setLocationRelativeTo(null);
      }
        return session;
    }
    
    //methode de verification des champs 
    private boolean ChampsVidesInsc(String nouv_nom,String user,String nouv_mdp,String nouv_conf_mdp)
    {
        return (nouv_nom.isEmpty() || user.isEmpty() || nouv_mdp.isEmpty() || nouv_conf_mdp.isEmpty());
    }
    
    //verification syntaxique des informations  
    public boolean VerifierTailleChamps (String nouv_nom,String user,String nouv_mdp,String nouv_conf_mdp)
    {
            // pseudo
              if(nouv_nom.length()<4 || nouv_nom.length()>16) 
              { 
                  //message d erreur
                  ERREUR_INSCRIPTION_TaillePseudo erreur = new ERREUR_INSCRIPTION_TaillePseudo();
                  erreur.setVisible(true);
                  erreur.setLocationRelativeTo(null);
                  return true; 
              }
              
              //nom d utilisateur contient le symbol '@'
              if(user.contains("@"))
              {
                  //message d erreur
                  ERREUR_INSCRIPTION_ArobaseUser erreur = new ERREUR_INSCRIPTION_ArobaseUser();
                  erreur.setVisible(true);
                  erreur.setLocationRelativeTo(null);
                  return true;
              }
              
              //mot de passe 
              if((nouv_mdp.length()<8 || nouv_mdp.length()>16))
              {   
                  //message d erreur 
                  ERREUR_INSCRIPTION_MDP erreur = new ERREUR_INSCRIPTION_MDP();
                  erreur.setVisible(true);
                  erreur.setLocationRelativeTo(null);
                  return true;
              }
               
              //confirmation invalide du mot de passe 
              if(!nouv_mdp.equals(nouv_conf_mdp))
              { 
                  //message d erreur 
                  ERREUR_INSCRIPTION_MDPconf erreur = new ERREUR_INSCRIPTION_MDPconf();
                  erreur.setVisible(true);
                  erreur.setLocationRelativeTo(null);
                  return true;
              }
              
        return false;
    }
    
    //Etablir une connexion avec l'API de Twitter
    public static Twitter ConnexionAPI(String consumerKey,String consumerSecret,String AccessToken,String AccessSecret)
    {
            Twitter twitter = null;
            //introduction des clés et build
                ConfigurationBuilder cb = new ConfigurationBuilder();
                        cb.setJSONStoreEnabled(true); //format json 
                        cb.setTweetModeExtended(true); // affichage complet des tweets
                        //les clés API
                        cb.setOAuthConsumerKey(consumerKey);
                        cb.setOAuthConsumerSecret(consumerSecret);
                        cb.setOAuthAccessToken(AccessToken);
                        cb.setOAuthAccessTokenSecret(AccessSecret);

                TwitterFactory tf=  new TwitterFactory(cb.build());
                twitter= tf.getInstance();
           
        return twitter;
    }

    //methode de verification de l existance d un nom d utilisateur sur Twitter
    public static boolean VerifierUserNameTwitter (String user,Twitter twitter)
    {
         try{  
                // afficher le nom d utilisateur 
                twitter.showUser(user);
                return true ; 
            } 
         catch(TwitterException te )
            {  
                return false;  
            } 
    }
    
    //Vérifier l'existance de l'utilisateur dans la bdd
    public boolean VerifierUserNameNeo4j(String user,Session session)
    {
        //requete de recherche d un profil dans la base de données
        StatementResult rechercheInsc = session.run("match (u:USER{username:'"+user+"'})return u.username as UserName");
        return (rechercheInsc.hasNext()); 
    }
    
    //methodes d'affichages 
    public static void bordureBleue(JButton bouton)
    {
        bouton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
    }
    
    public static void bordureBlanche(JButton bouton)
    {
        bouton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }
    
    
    private void btnSuivantInscription_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuivantInscription_ActionPerformed
        
        //récupérer les informations que contiennent les champs 
        nouv_nom=nom_insc.getText();
        user = user_insc.getText();
        nouv_mdp=mdp_insc.getText();
        nouv_conf_mdp = mdp_conf_insc.getText();
        
        //connexion a la base de donnees 
                Session session = ConnexionNeo4j();
         
                //connexion a l'api twitter
                Twitter AccesAPI = ConnexionAPI(dev_consumerK,dev_consumerS,dev_accessT,dev_accessS);
                
                
        //detection d'erreurs de saisie 
        boolean detecterChampsVides = ChampsVidesInsc(nouv_nom, user, nouv_mdp, nouv_conf_mdp);
        if(detecterChampsVides)
        {
            //message d'erreur : champs vides 
            ERREUR_INSCRIPTION_ChampsVides erreur = new ERREUR_INSCRIPTION_ChampsVides();
            erreur.setVisible(true);
            erreur.setLocationRelativeTo(null);
            
        }  
        else 
        {   
            //Vérifier la taille des informations ( les messages d'erreurs sont inclut dans la methode utilisée)
            boolean tailleChamps = VerifierTailleChamps(nouv_nom, user, nouv_mdp, nouv_conf_mdp);
            
            //champs non vides et tailles valides 
            if(!tailleChamps) 
            {
                
                //Verifier l'existance de l'utilisateur dans la base de donnee de Twitter
                boolean verifierUser = VerifierUserNameTwitter(user, AccesAPI);
                
                // le profil existe dans Twitter
                if(verifierUser)
                {
                     //verifier l'existance du profil dans la base de donnée
                     boolean userExiste = VerifierUserNameNeo4j(user, session);   
                     
                     //le profil n'existe pas dans la base de données
                     if(!userExiste)
                     {  
                         //generer un code de confirmation composé de 4 chiffres 
                        code=""+((int)(Math.random()*9000)+1000);
                        String directMessage="Veuillez confirmer votre inscription en introduisant ces 4 chiffres dans le champ 'Code de confirmation' :"+code;
                        String twitterName =user;
                        
                        try 
                        {
                              // envoi du message de confirmation
                              DirectMessage envoyerMsg = AccesAPI.sendDirectMessage(twitterName, directMessage);
                              
                              //message de redirection vers Twitter pour la confirmation 
                              MESSAGE_CODE_CONFIRMATION c = new MESSAGE_CODE_CONFIRMATION();
                              c.setVisible(true);
                              c.setLocationRelativeTo(null);
                              this.hide();
                        } 
                        catch (TwitterException ex) 
                        {
                             Logger.getLogger(INSCRIPTION.class.getName()).log(Level.SEVERE, null, ex);
                        }
                       
                     }
                    // le profil existe dans la base de donnees
                    else
                    { 
                        
                        ERREUR_INSCRIPTION_ProfilExistant erreur = new ERREUR_INSCRIPTION_ProfilExistant();
                        erreur.setVisible(true);
                        erreur.setLocationRelativeTo(null);
                        
                        //vider les champs 
                        nom_insc.setText(null);
                        mdp_insc.setText(null);
                        mdp_conf_insc.setText(null);
                        user_insc.setText(null);
                    }
                }
                //le profil n'existe pas dans Twitter
                else 
                {
                      ERREUR_INSCRIPTION_User erreur = new ERREUR_INSCRIPTION_User();
                      erreur.setVisible(true);
                      erreur.setLocationRelativeTo(null);
                      
                }
            }
        }     
    }//GEN-LAST:event_btnSuivantInscription_ActionPerformed

    private void btnRéessayerInscription_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRéessayerInscription_ActionPerformed
                    
        //vider tous les champs 
        nom_insc.setText(null);
        mdp_insc.setText(null);
        mdp_conf_insc.setText(null);
        user_insc.setText(null);
        
    }//GEN-LAST:event_btnRéessayerInscription_ActionPerformed

    private void btnLogin_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin_ActionPerformed
      
        //l'utilisateur est deja inscrit, passage a l'ecran login
        clique =true;

        LOGIN logIn = new LOGIN();
        logIn.setVisible(true);
        logIn.setLocationRelativeTo(null);
        this.hide();
        
    }//GEN-LAST:event_btnLogin_ActionPerformed

    private void btnAnnuler_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnuler_ActionPerformed
      
        //fermeture de l'application
        System.exit(0);
        
    }//GEN-LAST:event_btnAnnuler_ActionPerformed

    private void btnAnnuler_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnnuler_MouseEntered
        bordureBleue(btnAnnuler_);
    }//GEN-LAST:event_btnAnnuler_MouseEntered

    private void btnAnnuler_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnnuler_MouseExited
        bordureBlanche(btnAnnuler_);
    }//GEN-LAST:event_btnAnnuler_MouseExited

    private void btnRéessayerInscription_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRéessayerInscription_MouseEntered
         bordureBleue(btnRéessayerInscription_);
    }//GEN-LAST:event_btnRéessayerInscription_MouseEntered

    private void btnRéessayerInscription_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRéessayerInscription_MouseExited
         bordureBlanche(btnRéessayerInscription_);
    }//GEN-LAST:event_btnRéessayerInscription_MouseExited

    private void btnSuivantInscription_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuivantInscription_MouseEntered
        bordureBleue(btnSuivantInscription_);
    }//GEN-LAST:event_btnSuivantInscription_MouseEntered

    private void btnSuivantInscription_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuivantInscription_MouseExited
        bordureBlanche(btnSuivantInscription_);
    }//GEN-LAST:event_btnSuivantInscription_MouseExited

    private void btnLogin_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogin_MouseEntered
        Police_Bleu(btnLogin_);
    }//GEN-LAST:event_btnLogin_MouseEntered

    private void btnLogin_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogin_MouseExited
        btnLogin_.setForeground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_btnLogin_MouseExited

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnuler_;
    private javax.swing.JButton btnLogin_;
    private javax.swing.JButton btnRéessayerInscription_;
    private javax.swing.JButton btnSuivantInscription_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    public static javax.swing.JPasswordField mdp_conf_insc;
    public static javax.swing.JPasswordField mdp_insc;
    public static javax.swing.JTextField nom_insc;
    public static javax.swing.JTextField user_insc;
    // End of variables declaration//GEN-END:variables
}
