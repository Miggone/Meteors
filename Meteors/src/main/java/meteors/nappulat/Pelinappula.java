package meteors.nappulat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Luokka sisältää pelinappuloille yleiset metodit paikannusta varten
 * @author Miggone
 */
public class Pelinappula {

    private int xkoordinaatti;
    private int ykoordinaatti;
    /**
     * 
     * @param x ohjelman määrittämä x-koordinaatti
     * @param y ohjelman määrittämä y-koordinaatti
     */
    public Pelinappula(int x, int y) {
        xkoordinaatti = x;
        ykoordinaatti = y;
    }

    /**
     *
     * @return palauttaa nappulan x-koordinaatin
     */
    public int haeX() {
        return xkoordinaatti;
    }

    /**
     *
     * @return palauttaa nappulan y-koordinaatin
     */
    public int haeY() {
        return ykoordinaatti;
    }
    /**
     * asettaa uuden y-koordinaatin arvon
     * @param haluttu uusi y-koordinaatin arvo
     */
    public void setY(int haluttu) {
        ykoordinaatti = haluttu;
    }
}
