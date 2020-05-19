package ru.netology.stats;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    void amountOfPurchases() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.allAmount(purchases);
        int expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void averageOfPurchases() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.amountAverage(purchases);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void monthWithMaxPurchases() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.monthMax(purchases);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void monthWithMinPurchases() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.monthMin(purchases);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void quantityUnderAverage() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.quantityUnderAverage(purchases);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void quantityOverAverage() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.quantityOverAverage(purchases);
        int expected = 5;
        assertEquals(expected, actual);
    }

}