package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 2800;
        int expected = 200;
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldWrongRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 3000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected, actual);
    }
}