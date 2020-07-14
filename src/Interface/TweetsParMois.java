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
import org.jfree.ui.RefineryUtilities;
import twitter4j.Paging;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TweetsParMois extends ApplicationFrame {
	private static final long serialVersionUID = 1L;
    public TweetsParMois(final String title) {
        super(title);
        final CategoryDataset dataset = createDataset();
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(500, 270));
        setContentPane(chartPanel);
    }
    private CategoryDataset createDataset() {       
        final String series1 = "tweet";         
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
		String user = "@Kim Kardashian"; 
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
             {  if(!(tweet.isRetweet()))
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
            "Incrémentation de nombre de tweets par mois",       
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


         


/*
import javax.swing.JFrame;
import java.util.Map;
import javax.swing.JFrame;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxConstants;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxStylesheet;
import java.awt.Color;
import twitter4j.ResponseList;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.UserList;
import twitter4j.conf.ConfigurationBuilder;

    /*
	private static final long serialVersionUID = 1L;

	public TweetsParMois() {        
        initUI();
    }
        
    private void initUI() {
        CategoryDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);
        add(chartPanel);
        pack();
        setTitle("Nombre de tweets des 7 denier jours");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private CategoryDataset createDataset() {
    	ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setJSONStoreEnabled(true);
	    cb.setOAuthConsumerKey("A6ilEOflUtPA5A1RlNg4Aykm4");
	    cb.setOAuthConsumerSecret("xO4JnjimrysJoS2F39X71f1IkJLn3siw9WHNO6QlyR3wzXoxEU");
	    cb.setOAuthAccessToken("959742305279365123-rS625dmQkPtgTzhUQgXg1SoGuOGYYh7");
	    cb.setOAuthAccessTokenSecret("BXTILpWohTltDo4LIEStAWxoYjbGkp97fuIhb3c0TOyyv");	  
        TwitterFactory tf=  new TwitterFactory(cb.build());
	    Twitter twitter= tf.getInstance();
		String user = "@kawthar85794554";   //labiba12 Kawthar85794554 
		int tab []=new int [7];
		int j=0,k=0;
		Calendar c = Calendar.getInstance(); 			
	    try {		    	
             ResponseList<Status> resulted_tweets = twitter.getUserTimeline(user); 	             
             Date d=new Date();	
             SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
             String s=dateFormat.format(d);
             String s2;
             while(j<7)
             {
            	 for(Status tweet :resulted_tweets)
             {  s2=dateFormat.format(tweet.getCreatedAt());
            	 if (s2.equals(s))
            	 {  k++;  
            		 System.out.println(tweet.getText());
            		 System.out.println(tweet.getCreatedAt());
            	 }
            	 tab[j]=k;            	
             }
             k=0;
             j++;
             c.setTime(d); 
 			 c.add(Calendar.DAY_OF_YEAR, -1);
 			 d=c.getTime(); 
 			 s=dateFormat.format(d);
             }
	    }catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } 
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
        JFreeChart barChart = ChartFactory.createBarChart(
                "LAST 7 DAYS ",
                "",
                "Nombre de tweets",
                dataset,
                PlotOrientation.VERTICAL,
                false, true, false);
        return barChart;
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TweetsParMois ex = new TweetsParMois();
            ex.setVisible(true);
        });
    }

}
/*
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;
import javax.swing.Timer;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlotState;
import org.jfree.chart.plot.RingPlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.text.TextUtilities;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RectangleInsets;
import org.jfree.ui.RefineryUtilities;
import org.jfree.ui.TextAnchor;

public class TweetsParMois extends ApplicationFrame {
		   private static int blinkInterval = 1000;   // in milliseconds
		   static  CustomRingPlot plot;
		   private static boolean blinkState = false;
    private static final long serialVersionUID = 1L;
static class CustomRingPlot extends RingPlot {
		private static final long serialVersionUID = 1L;
		private Font centerTextFont; 
        private Color centerTextColor;
        public CustomRingPlot(PieDataset dataset) {
            super(dataset);
            this.centerTextFont = new Font(Font.SANS_SERIF, Font.BOLD, 24);
            this.centerTextColor =Color.BLACK;//new  Color(00,99,255);
             } 
        
        protected void drawItem(Graphics2D g2, int section, 
                Rectangle2D dataArea, PiePlotState state, int currentPass) {
                super.drawItem(g2, section, dataArea, state, currentPass);
                if (currentPass == 1 && section == 0) {             
                g2.setFont(this.centerTextFont);
                g2.setPaint(this.centerTextColor);
                TextUtilities.drawAlignedString("50%", g2,(float) dataArea.getCenterX(),(float) dataArea.getCenterY(),TextAnchor.CENTER);
      }
     }
    }  
    public TweetsParMois(String title) {
        super(title);
        setContentPane(createDemoPanel());
    }
    private static PieDataset createDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A", new Double(250)); //new Double(210)
        return dataset;
    }  
    private static JFreeChart createChart(PieDataset dataset) {
        plot = new CustomRingPlot(dataset);
        JFreeChart chart = new JFreeChart("Degré de danger",JFreeChart.DEFAULT_TITLE_FONT, plot, false); 
        chart.getTitle().setPaint(Color.black);//new Color(00,99,255));
        chart.setBackgroundPaint(Color.pink);//new GradientPaint(new Point(0, 0), new Color(20,20,20), new Point(400, 100),Color.pink ));     //(75,10,33) new Color(199,21,133)
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
                            setNormalTextColor();
                        }
                    }
                });       
        makeItBlink.start();
        // plot.setSectionPaint("A",new GradientPaint(new Point(0, 0), new Color(20,20,20), new Point(400, 100),Color.WHITE));//new Color(00,99,255));      
        plot.setSectionDepth(0.09);
        plot.setSectionOutlinesVisible(false);
        plot.setShadowPaint(null);
        return chart;
    }
    private static void setNormalTextColor() {
       
        plot.setSectionPaint("A",Color.green);
    }
    private static void setBlinkTextColor() {
    	plot.setSectionPaint("A",Color.white);
    }
    public static JPanel createDemoPanel() {
        JFreeChart chart = createChart(createDataset());
        chart.setPadding(new RectangleInsets(4, 8, 2, 2));
        ChartPanel panel = new ChartPanel(chart);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(600, 300));
        return panel;
    }
    public static void main(String[] args) {
        TweetsParMois demo = new TweetsParMois("Kontrol");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);
    }
}






*/



//********************** tweets et retweets les couleurs ***************************************



/*


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

public class TweetsParMois extends JFrame {
    private static final long serialVersionUID = 1L;
    public TweetsParMois(String applicationTitle) throws TwitterException {
        super(applicationTitle);       
        PieDataset dataset = createDataset();       
        JFreeChart chart = createChart(dataset, "");       
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
		String user = "@Rania06902998"; 
		 ResponseList<Status> resulted_tweets = twitter.getUserTimeline(user); 
		 int i=0,j=0;
		 for(Status status:resulted_tweets)
		 {
			if(status.isRetweet()) 
				j++;
			else
				i++;
		 }
        result.setValue("Tweets", i);
        result.setValue("Retweets", j);     
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
   public static void main(String[] args) throws TwitterException {
           TweetsParMois demo = new TweetsParMois("Tweets & Retweets");
            demo.setSize(700, 450);
            demo.setVisible(true);
            demo.setLocationRelativeTo(null);
        }
}




/*---------------------------------------- graphe mentions fonctionne mais faut faire qlq changements 
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

public class TweetsParMois extends JFrame {
    
	private static final long serialVersionUID = 1L;
	public TweetsParMois() throws TwitterException {        
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
        setTitle("Nombre de mensions des 7 denier jours");
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
		String user = "@TheDollBeauty ";   //labiba12 Kawthar85794554 
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
         System.out.println(tab[h]);
         k=0;
         h++;
         c.setTime(d); 
		 c.add(Calendar.DAY_OF_YEAR, -1);
		 d=c.getTime(); 
		 s=dateFormat.format(d);
        }
           	
            //les mensions dans les tweets            
        	   
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        // les day i doivent changer on met la date direct et les couleurs du texte doivent changer 
        //changer l unite
        dataset.setValue(tab[0], "Nombre de tweets", "Jour 1");
        dataset.setValue(tab[1], "Nombre de tweets", "Jour 2");
        dataset.setValue(tab[2], "Nombre de tweets", "Jour 3");
        dataset.setValue(tab[3], "Nombre de tweets", "Jour 4");
        dataset.setValue(tab[4], "Nombre de tweets", "Jour 5");
        dataset.setValue(tab[5], "Nombre de tweets", "Jour 6");
        dataset.setValue(tab[6], "Nombre de tweets", "Jour 7");
        return dataset;
    }
    private JFreeChart createChart(CategoryDataset dataset) {
        JFreeChart barChart = ChartFactory.createBarChart("Cette semaine ","","Nombre de mensions",dataset,
                PlotOrientation.VERTICAL,
                false, true, false);
        CategoryPlot plot = barChart.getCategoryPlot();
		BarRenderer renderer = (BarRenderer) plot.getRenderer();
		renderer.setSeriesPaint(0, new Color(00,99,255));      
        barChart.getTitle().setPaint(new Color(31,06,19));
        barChart.setBackgroundPaint(Color.white);
        return barChart;
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TweetsParMois ex = null;
			try {
				ex = new TweetsParMois();
			} catch (TwitterException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            ex.setVisible(true);
        });
    }

}
*/

//------------------------------------------------------------ les listes graph ----------------------------------------------------------
/*

public class TweetsParMois extends JFrame {
    private static final long serialVersionUID = 1L;
	public TweetsParMois() throws TwitterException
	{
		mxGraph graph = new mxGraph();
		Object parent = graph.getDefaultParent();	
		
                Map<String, Object> style = graph.getStylesheet().getDefaultVertexStyle();	
		style.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_CONNECTOR);
		style.put(mxConstants.STYLE_ALIGN, mxConstants.ALIGN_RIGHT);
		style.put(mxConstants.STYLE_VERTICAL_ALIGN, mxConstants.ALIGN_RIGHT);
		style.put(mxConstants.STYLE_STROKECOLOR, "#310619"); 
                style.put(mxConstants.STYLE_FONTCOLOR, "#310619");
                
                mxStylesheet edgeStyle = new mxStylesheet();
                edgeStyle.setDefaultEdgeStyle(style);
                
                graph.setStylesheet(edgeStyle);
		graph.getModel().beginUpdate();
		
                try
		{ 
                    ConfigurationBuilder cb = new ConfigurationBuilder();
                    cb.setJSONStoreEnabled(true);
		    cb.setOAuthConsumerKey("A6ilEOflUtPA5A1RlNg4Aykm4");
		    cb.setOAuthConsumerSecret("xO4JnjimrysJoS2F39X71f1IkJLn3siw9WHNO6QlyR3wzXoxEU");
		    cb.setOAuthAccessToken("959742305279365123-rS625dmQkPtgTzhUQgXg1SoGuOGYYh7");
		    cb.setOAuthAccessTokenSecret("BXTILpWohTltDo4LIEStAWxoYjbGkp97fuIhb3c0TOyyv");
		    
                    TwitterFactory tf=  new TwitterFactory(cb.build());
		    Twitter twitter= tf.getInstance();
		    
                    String user="@jenesuispasjoli";
		    
                    long cursor = -1;
                    ResponseList<UserList> l= twitter.getUserListMemberships(user,cursor);	
		    
                    System.out.println("le nombre de listes auquelles '"+user+"' appartient : "+l.size());
                    System.out.println("Donnez le nombre : ");
                    java.util.Scanner scanner = new java.util.Scanner (System.in);
                    int nbr = scanner.nextInt();
                    while(nbr<1 || nbr>l.size())
                    {
                         System.out.println("Donnez un nombre (entre 1 et "+l.size()+") : ");
                         nbr = scanner.nextInt();
                    }
                    
                    System.out.println("Vous avez choisis : "+nbr);
                    
		    String tab[]=new String[nbr];
		    
		    int i=0;
                    while(i<nbr)
		    {
			UserList li=l.get(i);
		    	tab[i]=li.getName();
		    	i++;
		    }
                   
                   
                    Object v1 = graph.insertVertex(parent,  null,user,340,180, 170,170,"shape=ellipse;perimeter=100;fillColor=#310619;fontSize=18;fontColor=white;fontFace=\"Segoe UI Light\";size=70");  //#87CEFA
                    Object v2,v4,v6,v7,v8;
                    
                    switch(i)
                    {
                            case 1:
                                  
                            v2 = graph.insertVertex(parent, null,tab[0],150, 150, 170, 170,"shape=ellipse;perimeter=100;fillColor=#0099FF;fontColor=white;fontFace=\"Segoe UI Light\";fontSize=18");			
			    graph.insertEdge(parent, null, "", v1, v2,"dashed=1;startArrow=oval;endArrow=block;sourcePerimeterSpacing=4;startFill=0;endFill=0;");			
                            break;
                    //----------------------------------------------------------------------------------------------------------------------
                            case 2:
                            
                            v2 = graph.insertVertex(parent, null,tab[0],150, 150, 170, 170,"shape=ellipse;perimeter=100;fillColor=#0099FF;fontColor=white;fontFace=\"Segoe UI Light\";fontSize=18");			
                            graph.insertEdge(parent, null, "", v1, v2,"dashed=1;startArrow=oval;endArrow=block;sourcePerimeterSpacing=4;startFill=0;endFill=0;");			
			
                            v4 = graph.insertVertex(parent, null,tab[1], 340, 1, 170, 170,"shape=ellipse;perimeter=100;fillColor=#0099FF;fontColor=white;fontFace=\"Segoe UI Light\";fontSize=18");			
                            graph.insertEdge(parent, null, "", v1, v4,"dashed=1;startArrow=oval;endArrow=block;sourcePerimeterSpacing=4;startFill=0;endFill=0;");			
                            break;
                    //----------------------------------------------------------------------------------------------------------------------
                            case 3:
                                
                            v2 = graph.insertVertex(parent, null,tab[0],150, 150, 170, 170,"shape=ellipse;perimeter=100;fillColor=#0099FF;fontColor=white;fontFace=\"Segoe UI Light\";fontSize=18");			
                            graph.insertEdge(parent, null, "", v1, v2,"dashed=1;startArrow=oval;endArrow=block;sourcePerimeterSpacing=4;startFill=0;endFill=0;");			
			
                            v4 = graph.insertVertex(parent, null,tab[1], 340, 1, 170, 170,"shape=ellipse;perimeter=100;fillColor=#0099FF;fontColor=white;fontFace=\"Segoe UI Light\";fontSize=18");			
                            graph.insertEdge(parent, null, "", v1, v4,"dashed=1;startArrow=oval;endArrow=block;sourcePerimeterSpacing=4;startFill=0;endFill=0;");			
			
                            v6 = graph.insertVertex(parent, null, tab[2], 240,370, 170, 170,"shape=ellipse;perimeter=100;fillColor=#0099FF;fontColor=white;fontFace=\"Segoe UI Light\";fontSize=18");
                            graph.insertEdge(parent, null, "", v1, v6,"dashed=1;startArrow=oval;endArrow=block;sourcePerimeterSpacing=4;startFill=0;endFill=0;strokesize=10");
                            break;
                    //----------------------------------------------------------------------------------------------------------------------
                            case 4:
                                
                            v2 = graph.insertVertex(parent, null,tab[0],150, 150, 170, 170,"shape=ellipse;perimeter=100;fillColor=#0099FF;fontColor=white;fontFace=\"Segoe UI Light\";fontSize=18");			
                            graph.insertEdge(parent, null, "", v1, v2,"dashed=1;startArrow=oval;endArrow=block;sourcePerimeterSpacing=4;startFill=0;endFill=0;");			
			
                            v4 = graph.insertVertex(parent, null,tab[1], 340, 1, 170, 170,"shape=ellipse;perimeter=100;fillColor=#0099FF;fontColor=white;fontFace=\"Segoe UI Light\";fontSize=18");			
                            graph.insertEdge(parent, null, "", v1, v4,"dashed=1;startArrow=oval;endArrow=block;sourcePerimeterSpacing=4;startFill=0;endFill=0;");			
			
                            v6 = graph.insertVertex(parent, null, tab[2], 240,370, 170, 170,"shape=ellipse;perimeter=100;fillColor=#0099FF;fontColor=white;fontFace=\"Segoe UI Light\";fontSize=18");
                            graph.insertEdge(parent, null, "", v1, v6,"dashed=1;startArrow=oval;endArrow=block;sourcePerimeterSpacing=4;startFill=0;endFill=0;strokesize=10");
			
                            v7 = graph.insertVertex(parent, null,tab[3], 500,350, 170, 170,"shape=ellipse;perimeter=100;fillColor=#0099FF;fontColor=white;fontFace=\"Segoe UI Light\";fontSize=18");
                            graph.insertEdge(parent, null, "", v1, v7,"dashed=1;startArrow=oval;endArrow=block;sourcePerimeterSpacing=4;startFill=0;endFill=0;");
                            break;
                    //----------------------------------------------------------------------------------------------------------------------
                            case 5:
                            
                            v2 = graph.insertVertex(parent, null,tab[0],150, 150, 170, 170,"shape=ellipse;perimeter=100;fillColor=#0099FF;fontColor=white;fontFace=\"Segoe UI Light\";fontSize=18");			
                            graph.insertEdge(parent, null, "", v1, v2,"dashed=1;startArrow=oval;endArrow=block;sourcePerimeterSpacing=4;startFill=0;endFill=0;");			
			
                            v4 = graph.insertVertex(parent, null,tab[1], 340, 1, 170, 170,"shape=ellipse;perimeter=100;fillColor=#0099FF;fontColor=white;fontFace=\"Segoe UI Light\";fontSize=18");			
                            graph.insertEdge(parent, null, "", v1, v4,"dashed=1;startArrow=oval;endArrow=block;sourcePerimeterSpacing=4;startFill=0;endFill=0;");			
			
                            v6 = graph.insertVertex(parent, null, tab[2], 240,370, 170, 170,"shape=ellipse;perimeter=100;fillColor=#0099FF;fontColor=white;fontFace=\"Segoe UI Light\";fontSize=18");
                            graph.insertEdge(parent, null, "", v1, v6,"dashed=1;startArrow=oval;endArrow=block;sourcePerimeterSpacing=4;startFill=0;endFill=0;strokesize=10");
			
                            v7 = graph.insertVertex(parent, null,tab[3], 500,350, 170, 170,"shape=ellipse;perimeter=100;fillColor=#0099FF;fontColor=white;fontFace=\"Segoe UI Light\";fontSize=18");
                            graph.insertEdge(parent, null, "", v1, v7,"dashed=1;startArrow=oval;endArrow=block;sourcePerimeterSpacing=4;startFill=0;endFill=0;");
			
                            v8 = graph.insertVertex(parent, null,tab[4], 580, 180, 170, 170,"shape=ellipse;perimeter=100;fillColor=#0099FF;fontColor=white;fontFace=\"Segoe UI Light\";fontSize=18");				
                            graph.insertEdge(parent, null, "", v1, v8,"dashed=1;startArrow=oval;endArrow=block;sourcePerimeterSpacing=4;startFill=0;endFill=0;");	
                            break;
                    //----------------------------------------------------------------------------------------------------------------------
                            default : break;
                    }
			 
			graph.setCellsMovable(true); 						
			graph.setKeepEdgesInBackground(true);
			graph.setCellsResizable(true);
			graph.setEdgeLabelsMovable(false);
			graph.setEventsEnabled(false);		
			graph.setCellsDisconnectable(false);
			graph.setResetEdgesOnMove(true);
			graph.setCellsSelectable(true);
			graph.setCellsEditable(false);
		}
		finally
		{
			graph.getModel().endUpdate();
		}
		mxGraphComponent graphComponent = new mxGraphComponent(graph);
		getContentPane().add(graphComponent);		
	}		
		public static void main(String[] args) throws TwitterException
		{		
                    TweetsParMois frame=new TweetsParMois();
                    frame.setSize(800, 600);	
                    frame.setBackground(Color.WHITE);
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
		}
}
*/