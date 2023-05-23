package donnees;

public class SelecteurArtiste implements Selecteur{

    private String artiste;

    public SelecteurArtiste(String artiste){
        this.artiste = artiste;
    }

    public boolean garderCd(CD cd){
        if(cd.getArtiste().equals(artiste)){
            return true;
        }
        else{
            return false;
        }
    }
}
