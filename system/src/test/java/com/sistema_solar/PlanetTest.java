package com.sistema_solar;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class PlanetTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testIsOuter() {
        Planet earth = new Planet("Earth", 1, 5.972e24, 1.08321e21, 12742, 149597870, true, Type.TERRESTRE);
        Planet saturn = new Planet("Saturn", 82, 5.6846e26, 8.271e14, 120536, 1433529376, true, Type.GASEOSO);

        assertFalse(earth.isOutter());
        assertTrue(saturn.isOutter());
    }
}
