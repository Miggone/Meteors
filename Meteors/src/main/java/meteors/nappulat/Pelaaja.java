package meteors.nappulat;


import meteors.nappulat.Pelinappula;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miggone
 */
public class Pelaaja extends Pelinappula {
    public Pelaaja(int x, int y) {
        super(x, y);
    }
    public void liikuVasen() {
        if (haeY() > 2) {
            ykoordinaatti--;
        }
    }
    public void liikuOikea() {
        if (haeY() < 9) {
            ykoordinaatti++;
        }
    }
}
