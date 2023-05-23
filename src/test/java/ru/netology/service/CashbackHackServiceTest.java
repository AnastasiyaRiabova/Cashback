package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void remain1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals ( actual, expected);
    }

    @org.testng.annotations.Test
    public void remain2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals ( actual, expected);
    }
    @org.testng.annotations.Test
    public void remain3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals ( actual, expected);
    }
    @org.testng.annotations.Test
    public void remain4() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals ( actual, expected);
    }
    @org.testng.annotations.Test
    public void remain5() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals ( actual, expected);
    }
    @org.testng.annotations.Test
    public void remain6() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1001;
        assertEquals ( actual, expected);
    }
    @org.testng.annotations.Test
    public void remain7() {
        CashbackHackService service = new CashbackHackService();
        int amount = 700;
        int actual = service.remain(amount);
        int expected = 300;
        assertEquals ( actual, expected);
    }
}