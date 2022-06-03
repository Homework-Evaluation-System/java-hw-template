package org.example;
import static  org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void pozitif_deger_dogru() {
        int number = 1453;
        App app = new App();
        boolean expResult = true;
        boolean result = app.isPositive(number);
        assertEquals(expResult, result);
    }


    @Test
    public void negatif_deger_yanlis() {
        int number = -1453;
        App app = new App();
        boolean expResult = false;
        boolean result = app.isPositive(number);
        assertEquals(expResult, result);
    }
}
