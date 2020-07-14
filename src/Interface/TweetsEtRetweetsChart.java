package Interface;
import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TweetsEtRetweetsChart extends JFrame {
    private static final long serialVersionUID = 1L;
    public TweetsEtRetweetsChart(String applicationTitle, String chartTitle) throws TwitterException {
        super(applicationTitle);       
        PieDataset dataset = createDataset();       
        JFreeChart chart = createChart(dataset, chartTitle);       
        ChartPanel chartPanel = new ChartPanel(chart);       
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));    
        setContentPane(chartPanel);
    }
    private  PieDataset createDataset() throws TwitterException {
        DefaultPieDataset result = new DefaultPieDataset();
        ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setJSONStoreEnabled(true);
	    cb.setOAuthConsumerKey("A6ilEOflUtPA5A1RlNg4Aykm4");
	    cb.setOAuthConsumerSecret("xO4JnjimrysJoS2F39X71f1IkJLn3siw9WHNO6QlyR3wzXoxEU");
	    cb.setOAuthAccessToken("959742305279365123-rS625dmQkPtgTzhUQgXg1SoGuOGYYh7");
	    cb.setOAuthAccessTokenSecret("BXTILpWohTltDo4LIEStAWxoYjbGkp97fuIhb3c0TOyyv");	  
	    TwitterFactory tf=  new TwitterFactory(cb.build());
	    Twitter twitter= tf.getInstance();
		String user = "@Horia"; 
		 ResponseList<Status> resulted_tweets = twitter.getUserTimeline(user); 
		 int i=0,j=0;
		 for(Status status:resulted_tweets)
		 {
			if(status.isRetweet()) 
				j++;
			else
				i++;
		 }
        result.setValue("tweet", i);
        result.setValue("retweet", j);     
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