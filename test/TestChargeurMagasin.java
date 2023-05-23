package test;


import donnees.CD;

import XML.ChargeurMagasin;
import donnees.ComparateurAlbum;
import donnees.ComparateurArtiste;
import donnees.Magasin;

import org.junit.Assert;
import org.junit.Test;
import org.junit.*;

import java.io.FileNotFoundException;

public class TestChargeurMagasin {
    //classe de teste de ChargeurMagasin
    private ChargeurMagasin chargeurMagasin;



    //marche pas
    @Test
    public void testChargerMagasinRepertoireValide() {
        try {
            chargeurMagasin = new ChargeurMagasin("musicbrainzSimple");
            Magasin magasin = chargeurMagasin.chargerMagasin();
        } catch (FileNotFoundException e) {
            Assert.fail("Une exception ne devrait pas être levée ici.");
        }
    }

    @Test
    public void testChargerMagasinRepertoireInexistant() throws FileNotFoundException {
        try {
            chargeurMagasin = new ChargeurMagasin("../musicbrainzSimple/Inexistant.xml");
            chargeurMagasin.chargerMagasin();
            Assert.fail("Une exception devrait être levée ici.");
        } catch (FileNotFoundException e) {
            // OK
        }
    }

    @Test
    //teste de la methode trier
    public void testTrier() {
        Magasin m = new Magasin();
        CD cd1 = new CD("Bieber", "Believe");
        m.ajouteCd(cd1);
        CD cd2 = new CD("Red Hot Chili Pepper", "Califormication");
        m.ajouteCd(cd2);
        CD cd3 = new CD("Vian", "Le deserteur");
        m.ajouteCd(cd3);
        CD cd4 = new CD("Juliette", "Mutatis Mutandis");
        m.ajouteCd(cd4);

        m.trier(new ComparateurArtiste());

        Assert.assertEquals(cd4, m.getCd(1));
        Assert.assertEquals(cd2, m.getCd(2));
        Assert.assertEquals(cd1, m.getCd(0));

        m.trier(new ComparateurAlbum());

        Assert.assertEquals(cd1, m.getCd(0));
        Assert.assertEquals(cd2, m.getCd(1));
        Assert.assertEquals(cd3, m.getCd(2));
        Assert.assertEquals(cd4, m.getCd(3));



    }






}
