
package KontRolPackage;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
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
import twitter4j.Paging;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.UserMentionEntity;

public class Mentions_Mois extends JFrame {
    static int nb;
	private static final long serialVersionUID = 1L;
	public Mentions_Mois() {        
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
        setTitle("Nombre de mentions pendant le(s) "+nb+" denier(s) mois");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private CategoryDataset createDataset(int nb) {
    	
        Twitter cnx=INSCRIPTION.ConnexionAPI(INSCRIPTION.dev_consumerK,INSCRIPTION.dev_consumerS,INSCRIPTION.dev_accessT,INSCRIPTION.dev_accessS);
        
	     
	    int nbr=0;
		String type[]=new String[nb*4];
		 Calendar cal = Calendar.getInstance();  
		 nb=nb*4;
			while(nbr<nb)
			{ 
			type[nbr] = "Sem :"+new SimpleDateFormat("dd MMM").format(cal.getTime());
			cal.add(Calendar.DAY_OF_MONTH, -7);
	        nbr++;        
			}  
		     
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
            
             while(j<nb)
             {
            	 for(Status tweet :statuses)
             {  
             { LocalDate localDate2 = tweet.getCreatedAt().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            
             if ((localDate2.isBefore(localDate) || localDate2.isEqual(localDate)) && localDate2.isAfter(localDate.minusDays(7)) )
    	 {    
            		
            		 {UserMentionEntity[]  f=tweet.getUserMentionEntities();                
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
             }
             tab[j]=k; 
                        
             k=0;
             j++;
             c.setTime(d);            
             c.add(Calendar.DAY_OF_MONTH, -7);
 			 d=c.getTime(); 
 			 localDate = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();	
 			
             }
	   
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        int nbr2=nb-1;
        while(nbr2>-1)
        {  dataset.setValue(tab[nbr2], "Nombre de mentions", type[nbr2]);  nbr2--;}     
        return dataset;
    }
    private JFreeChart createChart(CategoryDataset dataset) {
        JFreeChart barChart = ChartFactory.createBarChart("Nombre de mentions pendant le(s) "+nb+" derniers mois ","","Nombre de mentions",dataset,PlotOrientation.VERTICAL,
            false, true, false);
        CategoryPlot plot = barChart.getCategoryPlot();
        barChart.getCategoryPlot().getRangeAxis().setLowerBound(0);
        CategoryAxis x= plot.getDomainAxis();
        x.setCategoryLabelPositions(CategoryLabelPositions.UP_45);
		BarRenderer renderer = (BarRenderer) plot.getRenderer();
		renderer.setSeriesPaint(0, new Color(00,99,255));      
        barChart.getTitle().setPaint(new Color(31,06,19));
        barChart.setBackgroundPaint(Color.white);
        return barChart;   }
    
    
}



