package com.mycompany.app;

import static org.junit.Assert.*;
import org.junit.Test;

public class SqrtTest
{
    private static final double tolerance = 0.0001;

    @Test
    public void testCalc4() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.calc(), tolerance);
    }

    @Test
    public void testCalc9() {
        Sqrt sqrt = new Sqrt(9.0);
        assertEquals(3.0, sqrt.calc(), tolerance);
    }

    @Test
    public void testCalc2() {
        Sqrt sqrt = new Sqrt(2.0);
        assertEquals(Math.sqrt(2.0), sqrt.calc(), tolerance);
    }

    @Test
    public void testCalc1() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(1.0, sqrt.calc(), tolerance);
    }

    @Test
    public void testCalc25() {
        Sqrt sqrt = new Sqrt(25.0);
        assertEquals(5.0, sqrt.calc(), tolerance);
    }

    @Test
    public void testCalc100() {
        Sqrt sqrt = new Sqrt(100.0);
        assertEquals(10.0, sqrt.calc(), tolerance);
    }

    @Test
    public void testCalcFraction() {
        Sqrt sqrt = new Sqrt(0.25);
        assertEquals(0.5, sqrt.calc(), tolerance);
    }

    @Test
    public void testCalcSmall() {
        Sqrt sqrt = new Sqrt(0.01);
        assertEquals(0.1, sqrt.calc(), tolerance);
    }

    @Test
    public void testCalcLarge() {
        Sqrt sqrt = new Sqrt(10000.0);
        assertEquals(100.0, sqrt.calc(), tolerance);
    }

    @Test
    public void testAverage() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(5.0, sqrt.average(3.0, 7.0), tolerance);
    }

    @Test
    public void testAverageIdentical() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(4.0, sqrt.average(4.0, 4.0), tolerance);
    }

    @Test
    public void testGoodTrue() {
        Sqrt sqrt = new Sqrt(1.0);
        assertTrue(sqrt.good(3.0, 9.0));
    }

    @Test
    public void testGoodFalse() {
        Sqrt sqrt = new Sqrt(1.0);
        assertFalse(sqrt.good(2.0, 9.0));
    }

    @Test
    public void testImprove() {
        Sqrt sqrt = new Sqrt(1.0);
        double val = sqrt.improve(1.0, 4.0);
        assertEquals(2.5, val, tolerance);
    }

    @Test
    public void testIter() {
        Sqrt sqrt = new Sqrt(1.0);
        double val = sqrt.iter(1.0, 16.0);
        assertEquals(4.0, val, tolerance);
    }
}
