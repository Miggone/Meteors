/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kentta;

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
        Arpoja arpoja = new Arpoja();
        arpoja.arvoTiheys(kentta);
        
        int rivit = arpoja.tiheys.size();
        
        assertEquals(rivit, 190);
    }
    @Test
    public void tiheysMinKaksi() {
        Kentta kentta = new Kentta(200);
        Arpoja arpoja = new Arpoja();
        arpoja.arvoTiheys(kentta);
        
        int pienin = 2;
        int i = 0;
        while (i < arpoja.tiheys.size()) {
            pienin = Math.min(arpoja.tiheys.get(i), 2);
            i++;
        }
        
        assertEquals(pienin, 2);
    }
    @Test
    public void tiheysMaxNelja() {
        Kentta kentta = new Kentta(200);
        Arpoja arpoja = new Arpoja();
        arpoja.arvoTiheys(kentta);
        
        int isoin = 4;
        int i = 0;
        while (i < arpoja.tiheys.size()) {
            isoin = Math.max(arpoja.tiheys.get(i), 4);
            i++;
        }
        
        assertEquals(isoin, 4);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
