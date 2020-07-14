package KontRolPackage;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.Timer;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlotState;
import org.jfree.chart.plot.RingPlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RectangleInsets;
import org.jfree.ui.RefineryUtilities;

import twitter4j.Paging;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.conf.ConfigurationBuilder;


public class DEGRE_DANGER extends ApplicationFrame {
	 static Image img;
	 static int deg=0;
	 static int nbTw=4; //nombre de tweets 
	 static Graphics2D g2;
	 static JMenuBar  PanelHaut=new JMenuBar();
	 static float k; //la variable representant le pourcentage
	 static Color c=Color.green; //couleur la couleur qui change selon le seuil
	 static JLabel l=new JLabel();
	 static JLabel l2=new JLabel();
	static int nbrSem=1; //nombre de semaine 
	static ChartPanel panel;
	static  JButton buttong2 = new JButton(new ImageIcon("C:\\Users\\RANIA\\Documents\\NetBeansProjects\\TwitterPFE\\src\\KontRolPackage\\Icones\\kikagauche (2).png")); 
	static JButton buttond1 = new JButton(new ImageIcon("C:\\Users\\RANIA\\Documents\\NetBeansProjects\\TwitterPFE\\src\\KontRolPackage\\Icones\\kikadroite.png")); 
	static JButton buttond2 = new JButton(new ImageIcon("C:\\Users\\RANIA\\Documents\\NetBeansProjects\\TwitterPFE\\src\\KontRolPackage\\Icones\\kikadroite.png")); 
	static JButton buttong3 = new JButton(new ImageIcon("C:\\Users\\RANIA\\Documents\\NetBeansProjects\\TwitterPFE\\src\\KontRolPackage\\Icones\\kikagauche (2).png"));
	static int nb;
	static JLabel tf = new JLabel();
	
	 private static int blinkInterval = 1020;   
	 static  CustomRingPlot plot;
	 private static boolean blinkState = false;
     private static final long serialVersionUID = 1L;
     public static User u;

    public DEGRE_DANGER(String title) {
        super(title);
    }
     static class CustomRingPlot extends RingPlot {
		private static final long serialVersionUID = 1L;
		private Font centerTextFont; 
        private Color centerTextColor;
        
        public CustomRingPlot(PieDataset dataset) {
            super(dataset);
            this.centerTextFont = new Font( Font.SERIF,Font.ITALIC, 90);
            this.centerTextColor =Color.WHITE;
       }    
        protected void drawItem(Graphics2D g2, int section, 
                Rectangle2D dataArea, PiePlotState state, int currentPass) {
            super.drawItem(g2, section, dataArea, state, currentPass);
            if (currentPass == 1 && section == 0) {             
                g2.setFont(this.centerTextFont);
                g2.setPaint(this.centerTextColor); 
                if(nb==1)
                {  Image img = Toolkit.getDefaultToolkit().getImage("C:\\Users\\RANIA\\Documents\\NetBeansProjects\\TwitterPFE\\src\\KontRolPackage\\Icones\\circle-twitter_icon-icons.com_66835.png");

                g2.drawImage(img,370,135,null); }
                else
                	if(nb==2)
                    { 
                		 img = Toolkit.getDefaultToolkit().getImage("C:\\Users\\RANIA\\Documents\\NetBeansProjects\\TwitterPFE\\src\\KontRolPackage\\Icones\\people_14383.png");

                        g2.drawImage(img,370,135,null);
                    }
                	else
                	{	 img = Toolkit.getDefaultToolkit().getImage("C:\\Users\\RANIA\\Documents\\NetBeansProjects\\TwitterPFE\\src\\KontRolPackage\\Icones\\people_14383.png");

                g2.drawImage(img,370,135,null);}
               }
     } 
    }  
    private static PieDataset createDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A", new Double(250)); 
        return dataset;
    }  
    private static JFreeChart createChart(PieDataset dataset) throws IOException {
        plot = new CustomRingPlot(dataset);
      
        JFreeChart chart = new JFreeChart("",JFreeChart.DEFAULT_TITLE_FONT, plot, false); 
       
       
        chart.getTitle().setPaint(new Color(00,99,255));
        Image image = ImageIO.read(new File("C:\\Users\\RANIA\\Documents\\NetBeansProjects\\TwitterPFE\\src\\KontRolPackage\\Icones\\degre.jpg"));
        chart.setBackgroundImage(image);
        plot.setBackgroundPaint(null);
        plot.setOutlineVisible(false);    
        plot.setLabelGenerator(null);
        Timer makeItBlink = new Timer(blinkInterval,
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        blinkState = !blinkState;
                        if (blinkState) {
                            setBlinkTextColor();
                        }
                        else {
                            setNormalTextColor(c);
                        }
                    }
                });
        
        makeItBlink.start();
        plot.setSectionPaint("A",Color.RED);
        plot.setSectionDepth(0.02);
        plot.setSectionOutlinesVisible(false);
        plot.setShadowPaint(null);
        return chart;
    }
    private static void setNormalTextColor(Color c1) {      
        plot.setSectionPaint("A",c1);
    }
    private static void setBlinkTextColor() {
    	plot.setSectionPaint("A",new Color(Color.WHITE.getRed(), Color.WHITE.getGreen(), Color.WHITE.getBlue(), 10));
    }
    
        
    public static void aff() throws TwitterException, IOException{    
    	Twitter cnx = INSCRIPTION.ConnexionAPI(INSCRIPTION.dev_consumerK,INSCRIPTION.dev_consumerS,INSCRIPTION.dev_accessT,INSCRIPTION.dev_accessS);
        
	String user = LOGIN_CIBLE.userCible; 
	u=cnx.showUser(user); 		
        JFreeChart chart = createChart(createDataset());
        chart.setPadding(new RectangleInsets(40, 8, 180, 20));
        panel = new ChartPanel(chart);    
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(600, 300)); 
        panel.setLayout(null);      
        buttond1.setBorderPainted(false);
        buttond1.setBounds(800,200,70,70);
        buttond1.setContentAreaFilled(false); 
        buttond1.setFocusPainted(false); 
        buttond1.setOpaque(false);
        panel.add(buttond1);
        DEGRE_DANGER demo = new DEGRE_DANGER("Kontrol");
        demo.add(panel); 
        int tab[]=new int[7*nbrSem];
        List <Status> statuses = new ArrayList<Status>();
		int pageno = 1;
        while (true) {
        try {      	 
        int size = statuses.size();
        Paging page = new Paging(pageno++, 100);
        statuses.addAll(cnx.getUserTimeline(user, page));
        if (statuses.size() == size)
        break;
            }
        catch(TwitterException e) {
        e.printStackTrace();
            }}
        Calendar cal = Calendar.getInstance(); 
        Date d=new Date();	        
        LocalDate localDate = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = localDate.getDayOfMonth();
        int j=0,cmp=0;
        while(j<nbrSem*7)
        { 
       	 for(Status tweet :statuses) 
       		 { LocalDate localDate2 = tweet.getCreatedAt().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                int month2 = localDate2.getDayOfMonth();            	
       	 if (month==month2)
       	 {  
       		 cmp++;  
       	 }
       	 
       	 
       	 tab[j]=cmp;
        }       	
        cmp=0;
        j++;
        cal.setTime(d); 
		 cal.add(Calendar.DAY_OF_MONTH, -1);
		 d=cal.getTime();
		localDate = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		 month = localDate.getDayOfMonth();
        }
        int i=0;
        for(i=0;i<nbrSem*7;i++)  
        {
            if (tab[i]>nbTw)  
                deg++;
        }
        if (((deg*nbTw)-nbTw)>=nbTw*7) 
            {
                       k=100;
                       tf.setText(k+"%"); 
                       c=Color.RED;
                       l.setText("Le nombre de TWEETS est élevé !");
                       l2.setText(" Cliquez sur 'Tableau de bord' pour accéder aux fonctionnalités");}
else 
   deg=1;
        { if(deg>=2) 
            {
             k=(((deg*nbTw)-(nbTw*2)))*100/(28); 
            
             c=Color.RED;
             l.setText("Le nombre de TWEETS est élevé !");
             l2.setText(" Cliquez sur 'Tableau de bord' pour accéder aux fonctionnalités"); 
             tf.setText(String.format("%.2f", k)+"%"); 
            } 
            else
            { 
            c=Color.GREEN;   
            l.setText("Le nombre de TWEETS est moyen");
            l2.setText(" Cliquez sur 'Tableau de bord' pour accéder aux fonctionnalités"); 
            tf.setText("");
            } 
        }
        nb=1;
        tf.setFont(new java.awt.Font("Segoe UI", 0, 30));
        tf.setForeground(Color.white);
        tf.setBounds(400,5,250,50);
        panel.add(tf); 
        buttond1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	 buttong2.setEnabled(true);
            	 buttond2.setEnabled(true);
               ((JButton) e.getSource()).setEnabled(false);
               new Timer(1, new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                     panel.setLocation(panel.getX() - 2, 45);                   
                     if (panel.getX() + panel.getWidth() == 0  ) {
                   ((Timer) e.getSource()).stop(); 
                   panel.setLocation(0, 0);
                   panel.setLayout(null);  
                   if ((u.getFollowersCount())>=1000) {
                       k=100;
                       tf.setText(k+"%"); 
                       c=Color.RED;
                       l.setText("Le nombre d'ABONNÉS est élevé !");
                       l2.setText(" Cliquez sur 'Tableau de bord' pour accéder aux fonctionnalités");}
                   else
                   {  if(u.getFollowersCount()>100) {
                	   k=((u.getFollowersCount()-100)*100)/1000;
                	   c=Color.RED; 
                	   l.setText("Le nombre d'ABONNÉS est élevé !");
                       l2.setText(" Cliquez sur 'Tableau de bord' pour accéder aux fonctionnalités"); tf.setText(String.format("%.2f", k)+"%");  } 
                   else  {c=Color.GREEN;
                   l.setText("Le nombre d'ABONNÉS est moyen");
                   l2.setText(" Cliquez sur 'Tableau de bord' pour accéder aux fonctionnalités");tf.setText("");  }  }
                   panel.remove(buttond1);
                   l.setForeground(Color.WHITE);
                   
                   tf.setBounds(415,5,250,50);
                   nb=2;
                   
                   panel.setLayout(null);
                   panel.remove(buttond1);                   
                   buttond2.setBorderPainted(false);
                   buttond2.setBounds(800,200,70,70);
                   buttond2.setContentAreaFilled(false); 
                   buttond2.setFocusPainted(false); 
                   buttond2.setOpaque(false);
                   panel.add(buttond2);
                   buttong2.setBorderPainted(false);       
                   buttong2.setBounds(15,200,70,70);
                   buttong2.setContentAreaFilled(false); 
                   buttong2.setFocusPainted(false); 
                   buttong2.setOpaque(false);
                   panel.add(buttong2);
                          }
                             }
                          }).start();
                       } });                      
                  buttong3.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
          	      buttond2.setEnabled(true);
          	      buttong2.setEnabled(true);
                  ((JButton) e.getSource()).setEnabled(false);
                  new Timer(1, new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                     panel.setLocation(panel.getX() +2, 45);                  
                     if ((panel.getWidth()- panel.getX()) == 0) {                              	
                   ((Timer) e.getSource()).stop();  
                   panel.setLocation(0, 0);
                   nb=1;
                   panel.setLayout(null);
                   tf.setBounds(415,5,270,90);
                   if ((u.getFollowersCount())>=1000)
                   { k=100;
                       tf.setText(k+"%"); 
                       c=Color.RED;
                       l.setText("Le nombre d'ABONNÉS est élevé !");
                       l2.setText(" Cliquez sur 'Tableau de bord' pour accéder aux fonctionnalités");}
                   else
                   {  if(u.getFollowersCount()>100) {
                	   k=((u.getFollowersCount()-100)*100)/1000;
                	   c=Color.RED; 
                	   l.setText("Le nombre d'ABONNÉS est élevé !");
                       l2.setText(" Cliquez sur 'Tableau de bord' pour accéder aux fonctionnalités"); tf.setText(String.format("%.2f", k)+"%");  } 
                   else  {c=Color.GREEN;
                   l.setText("Le nombre d'ABONNÉS est moyen");
                   l2.setText(" Cliquez sur 'Tableau de bord' pour accéder aux fonctionnalités");tf.setText("");  }  }
                   l.setForeground(Color.WHITE);
                   nb=3;
                                                       
                   panel.remove(buttong3);  
                   buttond2.setEnabled(true);
                   panel.add(buttond2);
                   buttong2.setEnabled(true);
                   panel.add(buttong2);           
               }}}).start();
            }
         });
        buttond2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
         	   buttong3.setEnabled(true);
               ((JButton) e.getSource()).setEnabled(false);
               new Timer(1, new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                     panel.setLocation(panel.getX() - 2, 45);                   
                     if (panel.getX() + panel.getWidth() == 0  ) {
                   ((Timer) e.getSource()).stop();      
                   panel.setLocation(0, 0);
                   panel.remove(buttond1);
                   panel.remove(buttond2);
                   panel.remove(buttong2);     
                   if ((u.getFriendsCount())>=1000) 
                   { k=100;
                       tf.setText(k+"%"); 
                       c=Color.RED;
                       l.setText("Le nombre d'ABONNEMENTS est élevé !");
                       l2.setText(" Cliquez sur 'Tableau de bord' pour accéder aux fonctionnalités");}
                   else
                   { if(u.getFriendsCount()>100) {
                	   k=((u.getFriendsCount()-100)*100)/1000;
                	   c=Color.RED; 
                	   l.setText("Le nombre d'ABONNEMENTS est élevé !");
                       l2.setText(" Cliquez sur 'Tableau de bord' pour accéder aux fonctionnalités"); tf.setText(String.format("%.2f", k)+"%");  } 
                   else  {c=Color.GREEN;
                   l.setText("Le nombre d'ABONNEMENTS est moyen ");
                   l2.setText(" Cliquez sur 'Tableau de bord' pour accéder aux fonctionnalités"); tf.setText("");  }  }
                   tf.setBounds(390,350,270,55);
                   l.setForeground(Color.WHITE);
                     
                   tf.setBounds(400,5,270,90);
                  
                   nb=3;
                //   panel.setLayout(null);                              
                   buttong3.setBorderPainted(false);       
                   buttong3.setBounds(15,200,70,70);
                   buttong3.setContentAreaFilled(false); 
                   buttong3.setFocusPainted(false); 
                   buttong3.setOpaque(false);
                   panel.add(buttong3);      }
                  }
               }).start();
            }          
         });   
        
        buttong2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {  
         	   buttond1.setEnabled(true);
               ((JButton) e.getSource()).setEnabled(false);
               new Timer(2, new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                     panel.setLocation(panel.getX() +2, 45);                  
                     if ((panel.getWidth()- panel.getX()) == 0) {                              	
                   ((Timer) e.getSource()).stop();  
                   if (((deg*nbTw)-nbTw)>=nbTw*7) 
                        {
                       k=100;
                       tf.setText(k+"%"); 
                       c=Color.RED;
                       l.setText("Le nombre de TWEETS est élevé !");
                       l2.setText(" Cliquez sur 'Tableau de bord' pour accéder aux fonctionnalités");}
else 
   deg=1;
        { if(deg>=2) 
            {
             k=(((deg*nbTw)-(nbTw*2)))*100/(28); 
            
             c=Color.RED;
             l.setText("Le nombre de TWEETS est élevé !");
             l2.setText(" Cliquez sur 'Tableau de bord' pour accéder aux fonctionnalités"); 
             tf.setText(String.format("%.2f", k)+"%"); 
            } 
            else
            { 
            c=Color.GREEN;   
            l.setText("Le nombre de TWEETS est moyen");
            l2.setText(" Cliquez sur 'Tableau de bord' pour accéder aux fonctionnalités"); 
            tf.setText("");
            } 
        }
                panel.setLocation(0, 0);
                l.setForeground(Color.WHITE);
                
               nb=1;
                 tf.setBounds(400,5,250,55);
                 panel.setLayout(null);
                 panel.remove(buttong2);
                 panel.remove(buttond2);  
                 buttond1.setEnabled(true);
                 panel.add(buttond1);                     
               }
                  }
               }).start();
            }
         });
        
        
        JButton buttone=new JButton("Tableau de bord");
        buttone.setFont(new java.awt.Font("Segoe UI Light", 1, 15));
        buttone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        buttone.setFocusPainted(false);
        buttone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));   
        buttone.setForeground(new java.awt.Color(0, 153, 255));
        buttone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                	 DASHBOARD d = new DASHBOARD();
                    d.setVisible(true);
                    d.setLocationRelativeTo(null);
                    demo.setVisible(false);
                    
        demo.setVisible(false);      
            }});
          buttone.setBounds(340,370,200,30);
          panel.add(buttone);
        
          l.setForeground(Color.WHITE);
        l2.setForeground(Color.WHITE);
        l.setBounds(320,380,650,100);
        l.setFont(new java.awt.Font("Segoe UI", 1, 15));
        panel.add(l);
        l2.setBounds(230,400,650,100);
        l2.setFont(new java.awt.Font("Segoe UI", 1, 15));
        panel.add(l2);
          JMenuBar  PanelHaut=new JMenuBar();
          PanelHaut.setBackground(new java.awt.Color(49, 6, 25));
  		  PanelHaut.setSize(700, 50); 
  		  
  
          JButton  btnExit  =new JButton(new ImageIcon("C:\\Users\\RANIA\\Documents\\NetBeansProjects\\TwitterPFE\\src\\KontRolPackage\\Icones\\Delete_22px.png"));
          btnExit.setBackground(new java.awt.Color(255, 255, 255));
          btnExit.setToolTipText("Fermer la fenetre");
          btnExit.setBorderPainted(false);
          btnExit.setContentAreaFilled(false);
          btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
          btnExit.setFocusPainted(false);
          btnExit.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {  
          demo.setVisible(false);
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
          demo.setState(Frame.ICONIFIED);
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
        panel.setLayout(new BorderLayout());
        demo.add(PanelHaut, BorderLayout.NORTH);
        demo.setSize(900,600);
        
        RefineryUtilities.centerFrameOnScreen(demo);
        
        demo.setUndecorated(true);
        demo.setVisible(true);      
        
    }
   
                      
                      }
