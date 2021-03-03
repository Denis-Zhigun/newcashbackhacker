package ru.netology.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackerTest {
    public CashbackHacker cashbackHacker = new CashbackHacker();

    @Test
    void shouldCashBackSum900() {
        int actual = cashbackHacker.remain(900);
        int expected = 100;
        assertEquals(expected,actual);
    }
    @Test
    void shouldCashBackSum100() {
        int actual = cashbackHacker.remain(100);
        int expected = 900;
        assertEquals(expected,actual);
    }
    @Test
    void shouldCashBackSum5000() {
        int actual = cashbackHacker.remain(5000);
        int expected = 0;
        assertEquals(expected,actual);
    }
    @Test
    void shouldCashBackSum1000() {
        int actual = cashbackHacker.remain(1000);// тест падает
        int expected = 0;
        assertEquals(expected,actual);
    }
    @Test
    void shouldCashBackSum1100() {
        int actual = cashbackHacker.remain(1100);
        int expected = 900;
        assertEquals(expected,actual);
    }
    @Test
    void shouldCashBackSum5500() {
        int actual = cashbackHacker.remain(5500);
        int expected = 500;
        assertEquals(expected,actual);
    }


}
