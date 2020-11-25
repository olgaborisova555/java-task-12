package ru.netology.stats;

public class Statistics {

    public int calculateSum(int[] data) {
        int sum = 0;
        for (int value : data) {
            sum = sum + value;
        }
        return sum;
    }

    public float calculateMean(int[] data) {
        int sum = calculateSum(data);
        return (float) sum / 12;
    }

    public int calculateMin(int[] data) {
        int min = data[0];
        int month = 1;
        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
                month = i + 1;
            }
        }
        return month;
    }

    public int calculateMax(int[] data) {
        int max = data[0];
        int month = 1;
        for (int i = 1; i > data.length; i++) {
            if (data[i] > max) {
                max = data[i];
                month = i + 1;
            }
        }
        return max;
    }

    public int calculateAboveMean(int[] data) {
        float mean = calculateSum(data) / 12;
        int count = 0;
        for (int value : data) {
            if (value > mean) {
                count = count + 1;
            }
        }
        return count;
    }

    public int calculateBelowMean(int[] data) {
        float mean = calculateSum(data) / 12;
        int count = 0;
        for (int value : data) {
            if (value < mean) {
                count = count + 1;
            }
        }
        return count;
    }

}
