
package KontRolPackage;

import static KontRolPackage.INSCRIPTION.ConnexionAPI;
import static KontRolPackage.INSCRIPTION.dev_accessS;
import static KontRolPackage.INSCRIPTION.dev_accessT;
import static KontRolPackage.INSCRIPTION.dev_consumerK;
import static KontRolPackage.INSCRIPTION.dev_consumerS;
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
import twitter4j.HashtagEntity;
import twitter4j.Paging;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;

public class Hashtags_annee_annee extends JFrame {
    static int nb;
	private static final long serialVersionUID = 1L;
	public Hashtags_annee_annee () {        
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
    	
        Twitter AccesAPI = ConnexionAPI(dev_consumerK,dev_consumerS,dev_accessT,dev_accessS);
                
	   
	    Calendar cal = Calendar.getInstance();  
	    int nbr=0;
		String type[]=new String[nb];
	
		while(nbr<nb)
		{ 
		type[nbr] = new SimpleDateFormat("yyyy").format(cal.getTime());
		cal.add(Calendar.YEAR, -1);
        nbr++;        
		}           
		String user = LOGIN_CIBLE.userCible;
		int tab []=new int [nb];
		int j=0,k=0,h=0;
		Calendar c = Calendar.getInstance(); 			
		List <Status> statuses = new ArrayList<Status>();
		int pageno = 1;
        while (true) {
        try {
        int size = statuses.size();
        Paging page = new Paging(pageno++, 100);
        statuses.addAll(AccesAPI.getUserTimeline(user, page));
        if (statuses.size() == size)
        break;
            }
        catch(TwitterException e) {
        e.printStackTrace();
            }
              } 
        int m;
             Date d=new Date();	
             LocalDate localDate = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
             m=localDate.getYear();
             
             while(j<nb)
             {
            	 for(Status tweet :statuses)
                 {  
                 { LocalDate localDate2 = tweet.getCreatedAt().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                 int month2 = localDate2.getYear();           	
        	 if (m==month2)
        	 {    
                		 HashtagEntity hashTags[] = tweet.getHashtagEntities();          		 
                		 h=hashTags.length;           		           		
                	 }
                	 
                 }   
                 k=k+h;
                 h=0;
                 tab[j]=k; 
                 }           
                 k=0;
                 j++;
                 c.setTime(d); 
     			 c.add(Calendar.YEAR, -1);
     			 d=c.getTime(); 
     			localDate = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    			 m= localDate.getYear();
     					
                 }
	   
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        int nbr2=nb-1;
        while(nbr2>-1)
        {  dataset.setValue(tab[nbr2], "Nombre de hashtags", type[nbr2]); nbr2--;}     
        return dataset;
    }
    private JFreeChart createChart(CategoryDataset dataset) {
        JFreeChart barChart = ChartFactory.createBarChart("Nombre de hashtags pendant le(s) "+nb+" dernière(s) année(s) ","","Nombre de hashtags",dataset,PlotOrientation.VERTICAL,
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




