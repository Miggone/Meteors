/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meteors.kentta;
import java.util.Random;
import java.util.ArrayList;
import meteors.kayttoliittyma.Kayttoliittyma;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
/**
 * Luokka sisältää metodit pelikentän sattumanvaraiseen täyttämiseen
 * @author Miggone
 */
public class Arpoja {
    List<Integer> tiheys;
    List<Integer> koordinaatit;
    private Random random;
    private Kentta taytettava;
    
    /**
     *
     * @param taytettavaKentta käyttäjän antama kenttä
     */
    public Arpoja(Kentta taytettavaKentta) {
        tiheys = new ArrayList<Integer>();       
        random = new Random();    
        taytettava = taytettavaKentta;
        koordinaatit = new ArrayList<Integer>();
    }

    /**
     * Metodi arpoo meteoriittien tiheyden per pelikentän rivi
     * eli kuinka monta meteoriittia kullekin riville tulee
     */
    public void arvoTiheys() {
        int rivit = taytettava.haeKorkeus() - 10;
        while (rivit > 0) {
            tiheys.add(2 + random.nextInt(3));
            rivit--;
        }
    }

    /**
     * Metodi arpoo pelikentän riveille tulevien meteoriittien koordinaatit
     * 
     */
    public void arvoKoordinaatit() {
        int i = 10;
        while (i < taytettava.haeKorkeus()) {
            int a = 0;
            while (a < tiheys.get(i - 10)) {
                int xkoordinaatti = 1 + random.nextInt(9);
                int koordinaatti = i * 10 + xkoordinaatti;
                if (!koordinaatit.contains(koordinaatti)) {  
                    koordinaatit.add(koordinaatti);
                    
                    a++;
                }
            }
            i++;
        }
    }
            
}
