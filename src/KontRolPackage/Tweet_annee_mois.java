
package KontRolPackage;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import twitter4j.Paging;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;

public class Tweet_annee_mois extends ApplicationFrame {
	private static final long serialVersionUID = 1L;
	static int nb;
    public Tweet_annee_mois(final String title) throws TwitterException {
        super(title);
        final CategoryDataset dataset = createDataset(nb);
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(500, 270));
        add(chartPanel);
    }
    private CategoryDataset createDataset(int nb) throws TwitterException {       
           
        Calendar cal = Calendar.getInstance();  
        int nbr=0;
		String type[]=new String[nb*12];
		nb=nb*12;
		while(nbr<nb)
		{ 
		type[nbr] = new SimpleDateFormat("MMM yyyy").format(cal.getTime());
		cal.add(Calendar.MONTH, -1);
        nbr++;        
		}   
        Twitter cnx=INSCRIPTION.ConnexionAPI(INSCRIPTION.dev_consumerK,INSCRIPTION.dev_consumerS,INSCRIPTION.dev_accessT,INSCRIPTION.dev_accessS);
        
		String user = LOGIN_CIBLE.userCible; 
        int tab []=new int [nb];
		int j=0,k=0;		
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
             LocalDate localDate = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
             int month = localDate.getMonthValue();  
             int year= localDate.getYear();
             while(j<nb)
             { 
            	 for(Status tweet :statuses)
             {  if(!(tweet.isRetweet()))
            		 { LocalDate localDate2 = tweet.getCreatedAt().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                     int month2 = localDate2.getMonthValue();    int year2=localDate2.getYear();         	
            	 if (month==month2 && year==year2)
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
 			 month = localDate.getMonthValue(); year= localDate.getYear();
             }
	   
        
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
  //les tweets
           int nbr2=nb-1;
        while( nbr2>-1)
        {  dataset.setValue(tab[nbr2], "Nombre de tweets", type[nbr2]);  nbr2--;}     
        return dataset;
    }
    
    
    private JFreeChart createChart(final CategoryDataset dataset) {      
        final JFreeChart chart = ChartFactory.createLineChart(
            "Nombre de tweets pendant le(s) "+nb+ "dernière(s) année(s)",       
            "mois",                   
            "Valeurs",                   
            dataset,                   
            PlotOrientation.VERTICAL,  
            true,                      
            true,                      
            false                      
        );
        chart.setBackgroundPaint(Color.white);
        final CategoryPlot plot = (CategoryPlot) chart.getPlot();
CategoryAxis x= plot.getDomainAxis();
        x.setCategoryLabelPositions(CategoryLabelPositions.UP_45);
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
