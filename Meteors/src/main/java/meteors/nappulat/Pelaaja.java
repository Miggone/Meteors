package meteors.nappulat;


import meteors.nappulat.Pelinappula;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Luokka sisältää pelaaja-olion tarvitsemat metodit
 * @author Miggone
 */
public class Pelaaja extends Pelinappula {

    /**
     *
     * @param x ohjelman määrittämä aloituskoordinaatti
     * @param y ohjelman määrittämä aloituskoordinaatti
     */
    public Pelaaja(int x, int y) {
        super(x, y);
    }

    /**
     * Metodi liikuttaa pelaajaa vasemmalle, jollei pelaaja jo ole kentän reunalla
     */
    public void liikuVasen() {
        if (haeY() > 2) {
            setY(haeY() - 1);
        }
    }

    /**
     * Metodi liikuttaa pelaajaa oikealle, jollei pelaaja jo ole kentän reunalla
     */
    public void liikuOikea() {
        if (haeY() < 9) {
            setY(haeY() + 1);
        }
    }
}
