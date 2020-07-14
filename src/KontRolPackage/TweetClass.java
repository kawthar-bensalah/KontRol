
package KontRolPackage;

import twitter4j.GeoLocation;
import twitter4j.Place;


public class TweetClass {
    String date ;
    String texte;
    String nom;
    int NbrFavoris;
    int NbrRetweet;
    boolean retwitteParMoi;
    int NbrComment;
    GeoLocation geolocation;
    Place place;
    String langue;
    
//a voir comment extraire like comment 
    public TweetClass(String nom,String date, String texte, int NbrFavoris, int NbrRetweet,boolean retwitteParMoi, String langue,GeoLocation geolocation,Place place) {
        this.date = date;
        this.texte = texte;
        this.NbrFavoris = NbrFavoris;
        this.NbrRetweet = NbrRetweet;
        this.retwitteParMoi = retwitteParMoi;
        this.langue = langue;
        this.nom=nom;
        this.geolocation=geolocation;
        this.place =place;
    }

    

public String getNom() {
        return nom;
    }
    public String getDate() {
        return date;
    }

    public String getTexte() {
        return texte;
    }
public int getNbrFavoris() {
        return NbrFavoris;
    }

    public int getNbrRetweet() {
        return NbrRetweet;
    }

    public boolean getRetwitteParMoi() {
        return retwitteParMoi;
    }

    public int getNbrComment() {
        return NbrComment;
    }
    public String getLangue() {
        return langue;
    }

    public GeoLocation getGeolocation() {
        return geolocation;
    }

    public Place getPlace() {
        return place;
    }
    
}
