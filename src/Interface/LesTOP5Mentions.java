/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import javax.swing.JFrame;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxConstants;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxStylesheet;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.UserMentionEntity;
import twitter4j.conf.ConfigurationBuilder;

public class LesTOP5Mentions  extends JFrame
{
	private static final long serialVersionUID = 1L;
	public LesTOP5Mentions() throws TwitterException
	{
		mxGraph graph = new mxGraph();
		Object parent = graph.getDefaultParent();	
		Map<String, Object> style = graph.getStylesheet().getDefaultVertexStyle();	
		style.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_CONNECTOR);
		style.put(mxConstants.STYLE_ALIGN, mxConstants.ALIGN_RIGHT);
		style.put(mxConstants.STYLE_VERTICAL_ALIGN, mxConstants.ALIGN_RIGHT);
		style.put(mxConstants.STYLE_STROKECOLOR, "purple"); 
	    style.put(mxConstants.STYLE_FONTCOLOR, "purple");
        mxStylesheet edgeStyle = new mxStylesheet();
        edgeStyle.setDefaultEdgeStyle(style);
        graph.setStylesheet(edgeStyle);
		graph.getModel().beginUpdate();
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setJSONStoreEnabled(true);
	    cb.setOAuthConsumerKey("A6ilEOflUtPA5A1RlNg4Aykm4");
	    cb.setOAuthConsumerSecret("xO4JnjimrysJoS2F39X71f1IkJLn3siw9WHNO6QlyR3wzXoxEU");
	    cb.setOAuthAccessToken("959742305279365123-rS625dmQkPtgTzhUQgXg1SoGuOGYYh7");
	    cb.setOAuthAccessTokenSecret("BXTILpWohTltDo4LIEStAWxoYjbGkp97fuIhb3c0TOyyv");	  
	    TwitterFactory tf=  new TwitterFactory(cb.build());
	    Twitter twitter= tf.getInstance();
		String user = "@SafiaVendome"; 
		int k=0,n;
		try
		{ 
			ResponseList<Status> resulted_tweets = twitter.getUserTimeline(user);
			Map<String,Integer> map = new HashMap<String,Integer>();			
			for(Status tweet:resulted_tweets)
            {        	        
        	  //if(!tweet.isRetweet())
				{         		      	
           	 {UserMentionEntity[]  f=tweet.getUserMentionEntities();                
              for(UserMentionEntity m : f)
   	          { 
            	if(map.containsKey(m.getScreenName()))
            	{   
            		k++;
            		n=map.get(m.getScreenName());
            		n=k;           		               
   	            }
            	else
            	{
            		k=1;
            		map.put(m.getScreenName(), k);
            	}
              }
        	  }
         }  }
		Map<String, Integer> result = map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,  (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		int i=0;  
		System.out.println(result);
        Set<String> set=result.keySet();
        String tab[]=new String[set.size()];
        Iterator<String> ii=set.iterator();
    	 while(ii.hasNext())
    	 {
    		 tab[i]=ii.next();
    		 i++; 		 
    	 }
    	 i=0;
    	 if(set.size()>5)
    	 while(i<5)
    	 {
    		 System.out.println(tab[i]);
    		 i++;
    	 }	
			Object v1 = graph.insertVertex(parent,  null,user,340,180, 170,170,"shape=ellipse;perimeter=100;;fillColor=#C71585;fontSize=18;fontColor=white;fontFace=\"Times New Roman\";size=70");  //#87CEFA
			Object v2 = graph.insertVertex(parent, null,tab[1],150, 180, 150, 150,"shape=ellipse;perimeter=100;;fillColor=#00BFFF;fontColor=white;fontSize=18");			
			Object v4 = graph.insertVertex(parent, null,tab[2], 340, 10, 150, 150,"shape=ellipse;perimeter=100;;fillColor=#00BFFF;fontColor=white;fontSize=18");			
			Object v6 = graph.insertVertex(parent, null, tab[3], 240,370, 150, 150,"shape=ellipse;perimeter=100;;fillColor=#00BFFF;fontColor=white;fontSize=18");
			Object v7 = graph.insertVertex(parent, null,tab[4], 500,350, 160, 160,"shape=ellipse;perimeter=100;;fillColor=#00BFFF;fontColor=white;fontSize=18");
			Object v8 = graph.insertVertex(parent, null,tab[0], 580, 180, 150, 150,"shape=ellipse;perimeter=100;;fillColor=#00BFFF;fontColor=white;fontSize=18");				
			graph.insertEdge(parent, null, "", v1, v2,"dashed=1;startArrow=oval;endArrow=ARROW_CLASSIC;sourcePerimeterSpacing=4;startFill=0;endFill=0;");			
			graph.insertEdge(parent, null, "", v1, v4,"dashed=1;startArrow=oval;endArrow=ARROW_OPEN;sourcePerimeterSpacing=4;startFill=0;endFill=0;");			
			graph.insertEdge(parent, null, "", v1, v6,"dashed=1;startArrow=oval;endArrow=block;sourcePerimeterSpacing=4;startFill=0;endFill=0;strokesize=10");
			graph.insertEdge(parent, null, "", v1, v7,"dashed=1;startArrow=oval;endArrow=block;sourcePerimeterSpacing=4;startFill=0;endFill=0;");
			graph.insertEdge(parent, null, "", v1, v8,"dashed=1;startArrow=oval;endArrow=block;sourcePerimeterSpacing=4;startFill=0;endFill=0;");	
			graph.setCellsMovable(true); 						
			graph.setKeepEdgesInBackground(true);
			graph.setCellsResizable(false);
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
}
