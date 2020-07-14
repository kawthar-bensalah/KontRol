
package Interface;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import twitter4j.Paging;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

    
    
    
    
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import twitter4j.Paging;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class RetweetsParMois extends ApplicationFrame{
    
	private static final long serialVersionUID = 1L;
    public RetweetsParMois(final String title) {
        super(title);
        final CategoryDataset dataset = createDataset();
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(500, 270));
        setContentPane(chartPanel);
    }

    private CategoryDataset createDataset() {       
        final String series1 = "Retweet";         
        Calendar cal = Calendar.getInstance();  
        final String type7 = new SimpleDateFormat("MMM").format(cal.getTime());
        cal.add(Calendar.MONTH, -1);
        final String type6 = new SimpleDateFormat("MMM").format(cal.getTime());
        cal.add(Calendar.MONTH, -1);
        final String type5 = new SimpleDateFormat("MMM").format(cal.getTime());
        cal.add(Calendar.MONTH, -1);
        final String type4 = new SimpleDateFormat("MMM").format(cal.getTime());
        cal.add(Calendar.MONTH, -1);
        final String type3 = new SimpleDateFormat("MMM").format(cal.getTime());
        cal.add(Calendar.MONTH, -1);
        final String type2 = new SimpleDateFormat("MMM").format(cal.getTime());
        cal.add(Calendar.MONTH, -1);
        final String type1 =new SimpleDateFormat("MMM").format(cal.getTime());
        ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setJSONStoreEnabled(true);
	    cb.setOAuthConsumerKey("A6ilEOflUtPA5A1RlNg4Aykm4");
	    cb.setOAuthConsumerSecret("xO4JnjimrysJoS2F39X71f1IkJLn3siw9WHNO6QlyR3wzXoxEU");
	    cb.setOAuthAccessToken("959742305279365123-rS625dmQkPtgTzhUQgXg1SoGuOGYYh7");
	    cb.setOAuthAccessTokenSecret("BXTILpWohTltDo4LIEStAWxoYjbGkp97fuIhb3c0TOyyv");	  
        TwitterFactory tf=  new TwitterFactory(cb.build());
	    Twitter twitter= tf.getInstance();
		String user = "@TheDollBeauty"; 
        int tab []=new int [7];
		int j=0,k=0;
		Calendar c = Calendar.getInstance(); 			
	    try {		    	
             ResponseList<Status> resulted_tweets = twitter.getUserTimeline(user,new Paging(1,1000)); 	             
             Date d=new Date();	        
             LocalDate localDate = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
             int month = localDate.getMonthValue();
            
             while(j<7)
             { 
            	 for(Status tweet :resulted_tweets)
             {  if(tweet.isRetweet())
            		 { LocalDate localDate2 = tweet.getCreatedAt().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                     int month2 = localDate2.getMonthValue();            	
            	 if (month==month2)
            	 {  
            		 k++;  
            	 }
            	 tab[j]=k;
            	 
            		 }
             }       	
             k=0;
             j++;
             c.setTime(d); 
 			 c.add(Calendar.MONTH, -1);
 			 d=c.getTime();
 			localDate = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
 			 month = localDate.getMonthValue();
             }
	    }catch (Exception e) {
	            e.printStackTrace();
	        } 
        
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
  //les tweets
        dataset.addValue(tab[6], series1, type1);
        dataset.addValue(tab[5], series1, type2);
        dataset.addValue(tab[4], series1, type3);
        dataset.addValue(tab[3], series1, type4);
        dataset.addValue(tab[2], series1, type5);
        dataset.addValue(tab[1], series1, type6);
        dataset.addValue(tab[0], series1, type7);

        return dataset;
                
    }
    
    private JFreeChart createChart(final CategoryDataset dataset) {      
        final JFreeChart chart = ChartFactory.createLineChart(
            "Incrémentation de nombre de Retweets par mois",       
            "Mois",                   
            "Valeurs",                   
            dataset,                   
            PlotOrientation.VERTICAL,  
            true,                      
            true,                      
            false                      
        );
        chart.setBackgroundPaint(Color.white);
        final CategoryPlot plot = (CategoryPlot) chart.getPlot();
        plot.setBackgroundPaint(Color.lightGray);
        plot.setRangeGridlinePaint(Color.white);
        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        rangeAxis.setAutoRangeIncludesZero(true);    
        final LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer();
        renderer.setSeriesStroke(0, new BasicStroke(2.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 1.0f, new float[] {10.0f, 6.0f}, 0.0f ));
        renderer.setSeriesStroke(1, new BasicStroke( 2.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 1.0f, new float[] {6.0f, 6.0f}, 0.0f) );
        renderer.setSeriesStroke(2, new BasicStroke( 2.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND,1.0f, new float[] {2.0f, 6.0f}, 0.0f ) );       
        return chart;
    }
}



