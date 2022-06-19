package ru.netology.stats.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldAmount() {


        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.amount(sales);
        int expected = 180;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAverageAmount() {


        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.averageAmount(sales);
        int expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / sales.length;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxSalesMonth() {


        StatsService service = new StatsService();
        int[] sales = {-2, 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maxSalesMonth(sales);
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldMinSalesMonth() {


        StatsService service = new StatsService();
        int[] sales = {-2, 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minSalesMonth(sales);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldQuantityMonthLessAverage() {


        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.quantityMonthLessAverage(sales);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldQuantityMonthMoreAverage() {


        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.quantityMonthMoreAverage(sales);
        int expected = 5;
        assertEquals(expected, actual);
    }
}
