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
/**
 *
 * @author Miggone
 */
public class Arpoja {
    List<Integer> tiheys;
    List<Integer> koordinaatit;
    Random random;
    
    public Arpoja() {
        tiheys = new ArrayList<Integer>();
        koordinaatit = new ArrayList<Integer>();
        random = new Random();     
    }
    public void arvoTiheys(Kentta taytettavaKentta) {
        int rivit = taytettavaKentta.haeKorkeus() - 10;
        while (rivit > 0) {
            tiheys.add(2 + random.nextInt(3));
            rivit--;
        }
    }
    public void arvoKoordinaatit() {
        
    }
            
}
