package KontRolPackage;
import java.text.SimpleDateFormat;
import java.util.Map;
import javax.swing.JFrame;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxConstants;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxStylesheet;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.User;

public class GrapheEtatDuCompte  extends JFrame
{
	private static final long serialVersionUID = 1L;

	public GrapheEtatDuCompte(String user) throws TwitterException
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
		String s;
		
                Twitter cnx=INSCRIPTION.ConnexionAPI(INSCRIPTION.dev_consumerK,INSCRIPTION.dev_consumerS,INSCRIPTION.dev_accessT,INSCRIPTION.dev_accessS);
        
                
		User u=cnx.showUser(user); 
		try
		{ SimpleDateFormat sdf = new SimpleDateFormat("EEE dd/MM/yyyy à hh:mm:ss");
		if(!(u.isProtected()))		
			s="Profil publique";		
		else
			s="Profil Privé";
		 ResponseList<Status> resulted_tweets = cnx.getUserTimeline(user); 
		 Object objet=null;
                 if(resulted_tweets.size() ==0)
                    objet = graph.insertVertex(parent, null," Dernier tweet:\n<Pas de tweets>", 90, 340, 160, 160,"shape=ellipse;perimeter=100;;fillColor=#00BFFF;fontColor=white;fontSize=18");		
		 else	  
                 {  Status tweet=resulted_tweets.get(0);
                    objet = graph.insertVertex(parent, null," Dernier tweet:\n"+ sdf.format(tweet.getCreatedAt()), 90, 340, 160, 160,"shape=ellipse;perimeter=100;;fillColor=#00BFFF;fontColor=white;fontSize=18");		
                 }
                     
			Object v1 = graph.insertVertex(parent,  null,u.getScreenName(),340,180, 170,170,"shape=ellipse;perimeter=100;;fillColor=#C71585;fontSize=18;fontColor=white;fontFace=\"Times New Roman\";size=70");  //#87CEFA
			Object v2 = graph.insertVertex(parent, null," Abonnements:\n " +u.getFriendsCount(), 150, 180, 120, 120,"shape=ellipse;perimeter=100;;fillColor=#00BFFF;fontColor=white;fontSize=18");
			Object v3 = graph.insertVertex(parent, null, " Abonnés:\n "+u.getFollowersCount(), 90, 5, 165,165,"shape=ellipse;perimeter=100;;fillColor=#00BFFF;fontColor=white;fontSize=18");
			Object v4 = graph.insertVertex(parent, null," Tweets: "+u.getStatusesCount(), 340, 10, 120, 120,"shape=ellipse;perimeter=100;;fillColor=#00BFFF;fontColor=white;fontSize=18");
			Object v5 = graph.insertVertex(parent, null, " Date de création:\n"+sdf.format(u.getCreatedAt()), 600, 5, 160, 160,"shape=ellipse;perimeter=100;;fillColor=#00BFFF;fontColor=white;fontSize=18");
			Object v6 = graph.insertVertex(parent, null, " Listes: "+u.getListedCount(), 340,390, 120, 120,"shape=ellipse;perimeter=100;;fillColor=#00BFFF;fontColor=white;fontSize=18");
			Object v7 = graph.insertVertex(parent, null, s, 550,350, 130, 130,"shape=ellipse;perimeter=100;;fillColor=#00BFFF;fontColor=white;fontSize=18");
			Object v8 = graph.insertVertex(parent, null," Favoris: "+u.getFavouritesCount(), 550, 180, 110, 110,"shape=ellipse;perimeter=100;;fillColor=#00BFFF;fontColor=white;fontSize=18");
			Object v9 = objet;
                        graph.insertEdge(parent, null, "", v1, v2,"dashed=1;startArrow=oval;endArrow=ARROW_CLASSIC;sourcePerimeterSpacing=4;startFill=0;endFill=0;");
			graph.insertEdge(parent, null, "", v1, v3,"dashed=1;startArrow=oval;endArrow=ARROW_OPEN;sourcePerimeterSpacing=4;startFill=100;endFill=0;");
			graph.insertEdge(parent, null, "", v1, v4,"dashed=1;startArrow=oval;endArrow=ARROW_OPEN;sourcePerimeterSpacing=4;startFill=0;endFill=0;");			
			graph.insertEdge(parent, null, "", v1, v5,"dashed=1;startArrow=oval;endArrow=ARROW_OPEN;sourcePerimeterSpacing=4;startFill=0;endFill=0;");
			graph.insertEdge(parent, null, "", v1, v6,"dashed=1;startArrow=oval;endArrow=block;sourcePerimeterSpacing=4;startFill=0;endFill=0;strokesize=10");
			graph.insertEdge(parent, null, "", v1, v7,"dashed=1;startArrow=oval;endArrow=block;sourcePerimeterSpacing=4;startFill=0;endFill=0;");
			graph.insertEdge(parent, null, "", v1, v8,"dashed=1;startArrow=oval;endArrow=block;sourcePerimeterSpacing=4;startFill=0;endFill=0;");
			graph.insertEdge(parent, null, "", v1, v9,"dashed=1;startArrow=oval;endArrow=block;sourcePerimeterSpacing=4;startFill=0;endFill=0;");
			graph.addEdge(null, parent, v8, v9, 1);			
			graph.setCellsMovable(false); 						
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