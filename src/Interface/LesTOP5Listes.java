package Interface;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxConstants;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxStylesheet;
import java.awt.Color;
import java.util.Map;
import javax.swing.JFrame;
import twitter4j.ResponseList;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.UserList;
import twitter4j.conf.ConfigurationBuilder;

public class LesTOP5Listes extends JFrame {
    private static final long serialVersionUID = 1L;
	public LesTOP5Listes() throws TwitterException
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
}