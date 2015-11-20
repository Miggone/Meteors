package meteors.kentta;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import meteors.nappulat.Meteoriitti;
import meteors.nappulat.Pelaaja;

/**
 * Luokka sisältää pelikentän luomiseen liittyviä metodeja
 * @author Miggone
 */
public class Kentta {
    int korkeus;
    int leveys;
    
    /**
     * Määritellään kentän parametrit
     * @param x käyttäjän antama parametri
     */
    public Kentta(int x) {
        korkeus = x;
        leveys = 10;     
    }

    /**
     * Metodi lisää pelaajan ja meteoriitit pelikentälle
     */
    public void taytaKentta() {
        Pelaaja pelaaja = new Pelaaja(1, 5);
        lisaaMeteoriitit();
    }

    /**
     * Metodi lisää meteoriitit pelikentälle
     */
    public void lisaaMeteoriitit() {
        
    }

    /**
     *
     * @return palauttaa kentän korkeuden(pituus)
     */
    public int haeKorkeus() {
        return korkeus;
    }
    
}
