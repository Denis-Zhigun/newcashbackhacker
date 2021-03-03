package ru.netology.domain;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

class CashbackHackerTest {
    public CashbackHacker cashbackHacker = new CashbackHacker();

    @Test
    void shouldCashBackSum900() {
        int actual = cashbackHacker.remain(900);
        int expected = 100;
        assertEquals(actual,expected);
    }
    @Test
    void shouldCashBackSum100() {
        int actual = cashbackHacker.remain(100);
        int expected = 900;
        assertEquals(actual,expected);
    }
    @Test
    void shouldCashBackSum5000() {
        int actual = cashbackHacker.remain(5000);  // Тест падает
        int expected = 0;
        assertEquals(actual,expected);
    }
    @Test
    void shouldCashBackSum1000() {
        int actual = cashbackHacker.remain(1000); // Тест падает
        int expected = 0;
        assertEquals(actual,expected);
    }
    @Test
    void shouldCashBackSum1100() {
        int actual = cashbackHacker.remain(1100);
        int expected = 900;
        assertEquals(actual,expected);
    }
    @Test
    void shouldCashBackSum5500() {
        int actual = cashbackHacker.remain(5500);
        int expected = 500;
        assertEquals(actual,expected);
    }



}
