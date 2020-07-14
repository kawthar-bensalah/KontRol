
package KontRolPackage;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;
import twitter4j.Paging;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.UserMentionEntity;

public class Mentions_Jours extends JFrame {
    
    private static final long serialVersionUID = 1L;
    
    public static int nb;
    
    public Mentions_Jours() throws TwitterException {
      
        PieDataset dataset = createDataset(nb);       
        JFreeChart chart = createChart(dataset,"Nombre de mentions utilisées pendant ce(s) "+Mentions_Jours.nb+" dérnier(s) jour(s)");       
        ChartPanel chartPanel = new ChartPanel(chart);       
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));    
        setContentPane(chartPanel);
    }
    
    private  PieDataset createDataset(int nb) throws TwitterException {
        DefaultPieDataset result = new DefaultPieDataset();
        
        Twitter cnx=INSCRIPTION.ConnexionAPI(INSCRIPTION.dev_consumerK,INSCRIPTION.dev_consumerS,INSCRIPTION.dev_accessT,INSCRIPTION.dev_accessS);
        
		String user = LOGIN_CIBLE.userCible; 
		Calendar c = Calendar.getInstance(); 			
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
                  }
                }
         
         Date d=new Date();	        
      	 int h=0,k=0;
         int tab[]=new int [nb];
                
         LocalDate localDate = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
         int month = localDate.getDayOfMonth(); 
        
         while(h<nb)
         {
            for(Status tweet:statuses)
              {    if(!(tweet.isRetweet()))
                   {
                      LocalDate localDate2 = tweet.getCreatedAt().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                      int month2 = localDate2.getDayOfMonth();            	
                      if (month==month2)
                      {
                         UserMentionEntity[]  f=tweet.getUserMentionEntities();                

                         for(UserMentionEntity m : f)
                         { 
                             if(m.getScreenName()!=null)
                             {
                                 k++;
                             }	                	
                         }
                      }
                   } 
              }
           tab[h]=k;    
           k=0;
           h++;
           c.setTime(d); 
           c.add(Calendar.DAY_OF_MONTH, -1);
           d=c.getTime(); 
           localDate = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
           month = localDate.getDayOfMonth();
        }
        
        int nbr=0;
 	String type[]=new String[nb*4];
 	Calendar cal = Calendar.getInstance();
 	while(nbr<nb)
 	{ 
 	    type[nbr] = new SimpleDateFormat("dd-MMM").format(cal.getTime());
 	    cal.add(Calendar.DAY_OF_MONTH, -1);
            nbr++;        
        }     
           
        nbr=0; int nbr2=nb-1;
        while(nbr<nb && nbr2>-1)
        { 
           result.setValue(type[nbr], tab[nbr2]); nbr++; nbr2--;
        }
           return result;
        }   
    
    private JFreeChart createChart(PieDataset dataset, String title) {
        JFreeChart chart = ChartFactory.createPieChart3D(title,dataset,true,true,false);
        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        return chart;
    }
    
} 
