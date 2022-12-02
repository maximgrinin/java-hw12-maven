package org.maximgrinin;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void calcSumPositive() {
        int answer = Main.calcSum(2, 2);
        assertEquals(4, answer);
    }

    @Test
    public void calcSumNegative() {
        int answer = Main.calcSum(-2, -2);
        assertEquals(-4, answer);
    }

    @Test
    public void calcSumMixed() {
        int answer = Main.calcSum(2, -2);
        assertEquals(0, answer);
        answer = Main.calcSum(-2, 2);
        assertEquals(0, answer);
    }

    @Test
    public void calcDiffPositive() {
        int answer = Main.calcDiff(2, 2);
        assertEquals(0, answer);
    }

    @Test
    public void calcDiffNegative() {
        int answer = Main.calcDiff(-2, -2);
        assertEquals(0, answer);
    }

    @Test
    public void calcDiffMixed() {
        int answer = Main.calcDiff(-2, 2);
        assertEquals(-4, answer);
        answer = Main.calcDiff(2, -2);
        assertEquals(4, answer);
    }

    @Test
    public void calcMultPositive() {
        int answer = Main.calcMult(2, 2);
        assertEquals(4, answer);
    }

    @Test
    public void calcMultNegative() {
        int answer = Main.calcMult(-2, -2);
        assertEquals(4, answer);
    }

    @Test
    public void calcMultMixed() {
        int answer = Main.calcMult(-2, 2);
        assertEquals(-4, answer);
        answer = Main.calcMult(2, -2);
        assertEquals(-4, answer);
    }

    @Test
    public void calcDivPositive() {
        double answer = Main.calcDiv(2, 2);
        assertEquals(1.0, answer, 0);
    }

    @Test
    public void calcDivNegative() {
        double answer = Main.calcDiv(-2, -2);
        assertEquals(1.0, answer, 0);
    }

    @Test
    public void calcDivMixed() {
        double answer = Main.calcDiv(-2, 2);
        assertEquals(-1.0, answer, 0);
        answer = Main.calcDiv(2, -2);
        assertEquals(-1.0, answer, 0);
    }

    @Test
    public void calcDivByZero() {
        double answer = Main.calcDiv(2, 0);
        assertEquals("Divide by zero gives infinity as result", true, Double.isInfinite(answer));
    }
}
