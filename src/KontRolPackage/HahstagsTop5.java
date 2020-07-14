
package KontRolPackage;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import javax.swing.JFrame;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxConstants;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxStylesheet;
import java.util.ArrayList;

import twitter4j.HashtagEntity;
import twitter4j.Paging;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;


public class HahstagsTop5  extends JFrame
{
	private static final long serialVersionUID = 1L;
	public HahstagsTop5() throws TwitterException
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
                
		Twitter cnx=INSCRIPTION.ConnexionAPI(INSCRIPTION.dev_consumerK,INSCRIPTION.dev_consumerS,INSCRIPTION.dev_accessT,INSCRIPTION.dev_accessS);

		String user = LOGIN_CIBLE.userCible; 
		int k=0,n;
		
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
  
		try
		{ 
			Map<String,Integer> map = new HashMap<String,Integer>();			
			for(Status tweet :statuses)
            {        	        
        	
				{         		      	
           	 {HashtagEntity hashTags[] = tweet.getHashtagEntities();                   
              for(HashtagEntity m : hashTags)
   	          { 
            	if(map.containsKey(m.getText()))
            	{   
            		k++;
            		n=map.get(m.getText());
            		n=k;           		               
   	            }
            	else
            	{
            		k=1;
            		map.put(m.getText(), k);
            	}
              }
        	  }
         }  }
		Map<String, Integer> result = map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,  (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		int i=0;  
        Set<String> set=result.keySet();
        String tab[]=new String[set.size()];
        Iterator<String> ii=set.iterator();
    	 while(ii.hasNext())
    	 {
    		 tab[i]=ii.next();
    		 i++; 		 
    	 }
    	 i=0;
    	 //pour voir les 5 hashtags les plus utilisés 
    	 if(set.size()>5)
         {
    	 while(i<4)
    	 {
    		 i++;
    	 }	
			Object v1 = graph.insertVertex(parent,  null,user,340,180, 170,170,"shape=ellipse;perimeter=100;;fillColor=#C71585;fontSize=18;fontColor=white;fontFace=\"Times New Roman\";size=70");  //#87CEFA
			Object v2 = graph.insertVertex(parent, null,"#"+tab[0],150, 180, 150, 150,"shape=ellipse;perimeter=100;;fillColor=#00BFFF;fontColor=white;fontSize=18");			
			Object v4 = graph.insertVertex(parent, null,"#"+tab[1], 340, 10, 150, 150,"shape=ellipse;perimeter=100;;fillColor=#00BFFF;fontColor=white;fontSize=18");			
			Object v6 = graph.insertVertex(parent, null, "#"+tab[2], 240,370, 150, 150,"shape=ellipse;perimeter=100;;fillColor=#00BFFF;fontColor=white;fontSize=18");
			Object v7 = graph.insertVertex(parent, null,"#"+tab[3], 500,350, 160, 160,"shape=ellipse;perimeter=100;;fillColor=#00BFFF;fontColor=white;fontSize=18");
			Object v8 = graph.insertVertex(parent, null,"#"+tab[4], 580, 180, 150, 150,"shape=ellipse;perimeter=100;;fillColor=#00BFFF;fontColor=white;fontSize=18");				
			graph.insertEdge(parent, null, "", v1, v2,"dashed=1;startArrow=oval;endArrow=ARROW_CLASSIC;sourcePerimeterSpacing=4;startFill=0;endFill=0;");			
			graph.insertEdge(parent, null, "", v1, v4,"dashed=1;startArrow=oval;endArrow=ARROW_OPEN;sourcePerimeterSpacing=4;startFill=0;endFill=0;");			
			graph.insertEdge(parent, null, "", v1, v6,"dashed=1;startArrow=oval;endArrow=block;sourcePerimeterSpacing=4;startFill=0;endFill=0;strokesize=10");
			graph.insertEdge(parent, null, "", v1, v7,"dashed=1;startArrow=oval;endArrow=block;sourcePerimeterSpacing=4;startFill=0;endFill=0;");
			graph.insertEdge(parent, null, "", v1, v8,"dashed=1;startArrow=oval;endArrow=block;sourcePerimeterSpacing=4;startFill=0;endFill=0;");	
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
                    else 
                    {
                            ERREUR_HASHTAGS_MoisDe5Hash erreur = new ERREUR_HASHTAGS_MoisDe5Hash();
                            erreur.setVisible(true);
                            erreur.setLocationRelativeTo(null);

                    }
                }
		finally
		{
			graph.getModel().endUpdate();
		}
		mxGraphComponent graphComponent = new mxGraphComponent(graph);
		getContentPane().add(graphComponent);		
	}		
		
}
