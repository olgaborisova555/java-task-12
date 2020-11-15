package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        Statistics service = new Statistics();
        System.out.println(service.calculateSum(sales));
        System.out.println(service.calculateMean(sales));
        System.out.println(service.calculateMin(sales));
        System.out.println(service.calculateMax(sales));
        System.out.println(service.calculateAboveMean(sales));
        System.out.println(service.calculateBelowMean(sales));
    }
}
