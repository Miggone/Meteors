/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meteors.kayttoliittyma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * Luokka sisältää pisteiden tallennukseen ja esittämiseen tarvitut metodit
 * @author Miggone
 */
public class HiScore {
    List<String> scoret;
    
    /**
     *
     */
    public HiScore() {
        scoret = new ArrayList<String>();
    }

    /**
     * Metodi tallentaa käyttäjän nimimerkin ja saavuttaman pistemäärän listalle
     * @param nimi käyttäjän antama nimimerkki
     * @param pisteet käyttäjän saavuttama pistemäärä
     */
    public void lisaa(String nimi, int pisteet) {
        scoret.add(pisteet + " " + nimi);
        
    }
    public List topKymmenen() {
        return null;
    }
}
