package meteors.kentta;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import meteors.nappulat.Meteoriitti;
import meteors.nappulat.Pelaaja;

/**
 *
 * @author Miggone
 */
public class Kentta {
    int korkeus;
    int leveys;
    
    public Kentta(int x) {
        korkeus = x;
        leveys = 10;     
    }
    public void taytaKentta() {
        Pelaaja pelaaja = new Pelaaja(1, 5);
        lisaaMeteoriitit();
    }
    public void lisaaMeteoriitit() {
        
    }
    public int haeKorkeus() {
        return korkeus;
    }
    
}
