package ru.netology.stats;

import ru.netology.stats.Statistics;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsTest {
    @org.junit.jupiter.api.Test
    void StatisticsSum() {
        // подготавливаем данные:
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        Statistics service = new Statistics();

        // вызывыемый метод:
        int actual = service.calculateSum(sales);
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void StatisticsMean() {
        // подготавливаем данные:
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        float expected = 15;
        Statistics service = new Statistics();

        // вызывыемый метод:
        float actual = service.calculateMean(sales);
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void StatisticsMin() {
        // подготавливаем данные:
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        float expected = 7;
        Statistics service = new Statistics();

        // вызывыемый метод:
        float actual = service.calculateMin(sales);
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void StatisticsMax() {
        // подготавливаем данные:
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        float expected = 20;
        Statistics service = new Statistics();

        // вызывыемый метод:
        float actual = service.calculateMax(sales);
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void StatisticsAboveMean() {
        // подготавливаем данные:
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        float expected = 5;
        Statistics service = new Statistics();

        // вызывыемый метод:
        float actual = service.calculateAboveMean(sales);
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void StatisticsBelowMean() {
        // подготавливаем данные:
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        float expected = 5;
        Statistics service = new Statistics();

        // вызывыемый метод:
        float actual = service.calculateBelowMean(sales);
        assertEquals(expected, actual);

    }
}