/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meteors.kentta;

import meteors.kentta.Kentta;
import meteors.kentta.Arpoja;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;



/**
 *
 * @author Miggone
 */
public class ArpojaTest {
    
    public ArpojaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void tiheydenArpominenArpooKaikilleRiveille() {
        Kentta kentta = new Kentta(200);
        Arpoja arpoja = new Arpoja(kentta);
        arpoja.arvoTiheys();
        
        int rivit = arpoja.tiheys.size();
        
        assertEquals(190, rivit);
    }
    @Test
    public void tiheysMinKaksi() {
        Kentta kentta = new Kentta(200);
        Arpoja arpoja = new Arpoja(kentta);
        arpoja.arvoTiheys();
        
        int pienin = 3;
        int i = 0;
        while (i < arpoja.tiheys.size()) {
            pienin = Math.min(arpoja.tiheys.get(i), pienin);
            i++;
        }
        
        assertEquals(2, pienin);
    }
    @Test
    public void tiheysMaxNelja() {
        Kentta kentta = new Kentta(200);
        Arpoja arpoja = new Arpoja(kentta);
        arpoja.arvoTiheys();
        
        int isoin = 1;
        int i = 0;
        while (i < arpoja.tiheys.size()) {
            isoin = Math.max(arpoja.tiheys.get(i), isoin);
            i++;
        }
        
        assertEquals(4, isoin);
    }
    @Test
    public void koordinaattejaOikeaMaara() {
        Kentta kentta = new Kentta(200);
        Arpoja arpoja = new Arpoja(kentta);
        arpoja.arvoTiheys();
        arpoja.arvoKoordinaatit();
        
        int koordinaattejaPitaisiOlla = 0;
        int i = 0;
        while (i < arpoja.tiheys.size()) {
            koordinaattejaPitaisiOlla = koordinaattejaPitaisiOlla + arpoja.tiheys.get(i);
            i++;
        }
        int b = arpoja.koordinaatit.size();
        
        
        assertEquals(koordinaattejaPitaisiOlla, b);
    }
    @Test
    public void xKoordinaatitMinYksi() {
        Kentta kentta = new Kentta(200);
        Arpoja arpoja = new Arpoja(kentta);
        arpoja.arvoTiheys();
        arpoja.arvoKoordinaatit();
      
        int pienin = 2;
        int a = 10;
        int i = 0;
        
        while (a - 10 < arpoja.tiheys.size()) {
            
            while (a * 10 + 10 > arpoja.koordinaatit.get(i)) {
                int xkoordinaatti = arpoja.koordinaatit.get(i) - 10 * a;
                pienin = Math.min(xkoordinaatti, pienin);
                i++;
                if (i == arpoja.koordinaatit.size()) {
                    break;
                }
            }
            a++;
     }
      
      assertEquals(1, pienin);
       
    }
    @Test
    public void xKoordinaatitMaxYhdeksan() {
        Kentta kentta = new Kentta(200);
        Arpoja arpoja = new Arpoja(kentta);
        arpoja.arvoTiheys();
        arpoja.arvoKoordinaatit();
      
        int isoin = 2;
        int a = 10;
        int i = 0;
        
        while (a - 10 < arpoja.tiheys.size()) {
            
            while (a * 10 + 10 > arpoja.koordinaatit.get(i)) {
                int xkoordinaatti = arpoja.koordinaatit.get(i) - 10 * a;
                isoin = Math.max(xkoordinaatti, isoin);
                i++;
                if (i == arpoja.koordinaatit.size()) {
                    break;
                }
            }
            a++;
     }
      
      assertEquals(9, isoin);
       
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
