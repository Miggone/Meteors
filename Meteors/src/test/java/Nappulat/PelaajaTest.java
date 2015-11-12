/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nappulat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miggone
 */
public class PelaajaTest {
    
    public PelaajaTest() {
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
    public void liikkuminenYliReunojenEstettyVasen() {
        Pelaaja pelaaja = new Pelaaja(1 ,3);
        pelaaja.liikuVasen();
        pelaaja.liikuVasen();

        
        int y = pelaaja.haeY();
        
        assertEquals(y, 2);
    }
    @Test
    public void liikkuminenYliReunojenEstettyOikea() {
        Pelaaja pelaaja = new Pelaaja(1 ,8);
        pelaaja.liikuOikea();
        pelaaja.liikuOikea();

        int y = pelaaja.haeY();
        
        assertEquals(y, 9);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
