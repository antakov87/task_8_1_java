package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxOfTwo() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, 9};
        long expected = 9;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxNegative() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {-2, -5, -8, -11};
        long expected = -2;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

}
