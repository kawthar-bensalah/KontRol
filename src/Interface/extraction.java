/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
  
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import twitter4j.Paging;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;
  
public class extraction {
  
public static void main(String[] args) throws FileNotFoundException, TwitterException {
                               
PrintWriter ecrire = new PrintWriter ("twitter.json");
                               
ConfigurationBuilder cf = new ConfigurationBuilder();
cf.setDebugEnabled(true)
.setOAuthConsumerKey("lR52JRPmHcf34TbGv5r4HYuFR")
.setOAuthConsumerSecret("nEdgs1GwmCkLoe1b2yAoAWN5z97gwjgAdshIpoIhWYDeBoxT0J")
.setOAuthAccessToken("928361018761383936-4ijs8n1VWQ7OYNTzlNvwHzoWkvCvs8h")
.setOAuthAccessTokenSecret("SATFa5sLjURjUfD1frHdFG3FA9T2wA34gLTPrM0HbPSRI");
cf.setJSONStoreEnabled(true);
                
                 
Twitter twitter = new TwitterFactory(cf.build()).getInstance();
  
int pageno = 1;
String user = "PushYourPink";
List <Status> statuses = new ArrayList();
  
while (true) {
  
try {
  
int size = statuses.size();
Paging page = new Paging(pageno++, 100);
statuses.addAll(twitter.getUserTimeline(user, page));
    
if (statuses.size() == size)
break;
}
catch(TwitterException e) {
  
e.printStackTrace();
}
}
System.out.println("les tweets de " + user );
for (Status status : statuses) {
// formaaaaaaaaaat json
System.out.println("@" + status.getUser().getScreenName() + " ---- " + status.getText());
}
  
System.out.println(statuses.size()+" Total: ");

}}