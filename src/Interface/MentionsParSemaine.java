/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.UserMentionEntity;
import twitter4j.conf.ConfigurationBuilder;

public class MentionsParSemaine extends JFrame {
    
	private static final long serialVersionUID = 1L;
	public MentionsParSemaine() throws TwitterException {        
        initUI();
    }
    private void initUI() throws TwitterException {
        CategoryDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);
        add(chartPanel);
        pack();
        setTitle("Nombre de mentions des 7 denier jours");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private CategoryDataset createDataset() throws TwitterException {
    	ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setJSONStoreEnabled(true);
	    cb.setOAuthConsumerKey("A6ilEOflUtPA5A1RlNg4Aykm4");
	    cb.setOAuthConsumerSecret("xO4JnjimrysJoS2F39X71f1IkJLn3siw9WHNO6QlyR3wzXoxEU");
	    cb.setOAuthAccessToken("959742305279365123-rS625dmQkPtgTzhUQgXg1SoGuOGYYh7");
	    cb.setOAuthAccessTokenSecret("BXTILpWohTltDo4LIEStAWxoYjbGkp97fuIhb3c0TOyyv");	  
        TwitterFactory tf=  new TwitterFactory(cb.build());
	    Twitter twitter= tf.getInstance();
		String user = "@KimKardashian ";   //labiba12 Kawthar85794554 
		 ResponseList<Status> resulted_tweets = twitter.getUserTimeline(user);
         Calendar c = Calendar.getInstance(); 				    	 	             
         Date d=new Date();	
         SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
         String s=dateFormat.format(d);
         String s2;	 int h=0,k=0;
         int tab[]=new int [7];
         while(h<7){
          for(Status tweet:resulted_tweets)
            {   
        	 s2=dateFormat.format(tweet.getCreatedAt());           
        	  if(!tweet.isRetweet()){         		
           	 if (s2.equals(s))
           	 {UserMentionEntity[]  f=tweet.getUserMentionEntities();                
              for(UserMentionEntity m : f)
   	          { 
            	if(m.getScreenName()!=null)
            	{
   	            k++;
   	            }	                	
              }
        	  }
         }  }
         tab[h]=k;
         //System.out.println(tab[h]);
         k=0;
         h++;
         c.setTime(d); 
		 c.add(Calendar.DAY_OF_YEAR, -1);
		 d=c.getTime(); 
		 s=dateFormat.format(d);
        }
           	
            //les mensions dans les tweets            
        	   
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(tab[0], "Nombre de tweets", "DAY1");
        dataset.setValue(tab[1], "Nombre de tweets", "DAY2");
        dataset.setValue(tab[2], "Nombre de tweets", "DAY3");
        dataset.setValue(tab[3], "Nombre de tweets", "DAY4");
        dataset.setValue(tab[4], "Nombre de tweets", "DAY5");
        dataset.setValue(tab[5], "Nombre de tweets", "DAY6");
        dataset.setValue(tab[6], "Nombre de tweets", "DAY7");
        return dataset;
    }
    private JFreeChart createChart(CategoryDataset dataset) {
        JFreeChart barChart = ChartFactory.createBarChart("Cette semaine ","","Nombre de mentions",dataset,
                PlotOrientation.VERTICAL,
                false, true, false);
        CategoryPlot plot = barChart.getCategoryPlot();
		BarRenderer renderer = (BarRenderer) plot.getRenderer();
		renderer.setSeriesPaint(0, new Color(00,99,255));      
        barChart.getTitle().setPaint(new Color(31,06,19));
        barChart.setBackgroundPaint(Color.white);
        return barChart;
    }}