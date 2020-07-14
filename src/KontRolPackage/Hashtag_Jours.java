
package KontRolPackage;

import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import twitter4j.HashtagEntity;
import twitter4j.Paging;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;

public class Hashtag_Jours extends JFrame {
    public static int nb;
	private static final long serialVersionUID = 1L;
	public Hashtag_Jours() {        
        initUI();
    }
    private void initUI() {
    	
        CategoryDataset dataset = createDataset(nb);
        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);
        add(chartPanel);
        pack();
        setTitle("");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private CategoryDataset createDataset(int nb) {
    	
         Twitter cnx=INSCRIPTION.ConnexionAPI(INSCRIPTION.dev_consumerK,INSCRIPTION.dev_consumerS,INSCRIPTION.dev_accessT,INSCRIPTION.dev_accessS);
        
        
		String user =LOGIN_CIBLE.userCible;
		int tab []=new int [nb];
		int j=0,k=0,h=0;
		Calendar c = Calendar.getInstance(); 
		int nbr=0;
		String type[]=new String[nb];
		while(nbr<nb)
		{ 
		type[nbr] = new SimpleDateFormat("dd MMM").format(c.getTime());
        c.add(Calendar.DAY_OF_MONTH, -1);
        nbr++;        
		}
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
             SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
             String s=dateFormat.format(d);           
             String s2;
             while(j<nb)
             {
            	 for(Status tweet :statuses)
             {  s2=dateFormat.format(tweet.getCreatedAt());
            	 if (s2.equals(s))
            	 {  
            		 HashtagEntity hashTags[] = tweet.getHashtagEntities();          		 
            		 h=hashTags.length;           		           		
            	 }          	 
             }   
             k=k+h;
             h=0;
             tab[j]=k;           
             k=0;
             j++;
             c.setTime(d); 
 			 c.add(Calendar.DAY_OF_YEAR, -1);
 			 d=c.getTime(); 
 			 s=dateFormat.format(d);		
             }   
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        nbr=0; int nbr2=nb-1;
        while(nbr<nb && nbr2>-1)
        {  dataset.setValue(tab[nbr], "Nombre de hashtags", type[nbr2]); nbr++; nbr2--;}     
        return dataset;
    }
    private JFreeChart createChart(CategoryDataset dataset) {
        JFreeChart barChart = ChartFactory.createBarChart("Nombre de hashtags pendant le(s) "+nb+" dernier(s) jour(s)","","Nombre de hashtags",dataset,PlotOrientation.VERTICAL,
            false, true, false);
        CategoryPlot plot = barChart.getCategoryPlot();
        CategoryAxis x= plot.getDomainAxis();
        x.setCategoryLabelPositions(CategoryLabelPositions.UP_45);
		BarRenderer renderer = (BarRenderer) plot.getRenderer();
		renderer.setSeriesPaint(0, new Color(00,99,255)); 
		renderer.setBaseItemLabelFont(new Font(Font.SANS_SERIF, Font.PLAIN, 8));
        barChart.getTitle().setPaint(new Color(31,06,19));
        barChart.setBackgroundPaint(Color.white);
        return barChart;   }
   
}
