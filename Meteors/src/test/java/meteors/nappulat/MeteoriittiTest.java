/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meteors.nappulat;

import meteors.nappulat.Meteoriitti;
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
public class MeteoriittiTest {
    
    public MeteoriittiTest() {
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
    public void luodaanOikein() {
        Meteoriitti meteoriitti = new Meteoriitti(4, 6);
        int x = meteoriitti.haeX();
        int y = meteoriitti.haeY();
        
        assertEquals(x, 4 & y, 6);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
