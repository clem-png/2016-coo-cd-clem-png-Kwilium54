package test;

import XML.ChargeurMagasin;
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





}
