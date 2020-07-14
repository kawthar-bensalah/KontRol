
package KontRolPackage;

import twitter4j.GeoLocation;
import twitter4j.Place;

public class RetweetClass extends TweetClass 
{
    String nomRT;
    
    public RetweetClass(String nom, String nomRT,String date, String texte, int NbrFavoris, int NbrRetweet,boolean retParMoi, String langue,GeoLocation geolocation,Place place) {
        super(nom, date, texte, NbrFavoris, NbrRetweet,retParMoi, langue,geolocation,place);
        this.nomRT=nomRT;
    }

    public String getNomRT() {
        return nomRT;
    }
    
    
    
}
