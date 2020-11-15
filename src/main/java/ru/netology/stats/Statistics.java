package ru.netology.stats;

public class Statistics {
    public int calculateSum(int[] data){
        int sum = 0;
        for (int value : data){
            sum = sum + value;
        }
        return sum;
    }
    public float calculateMean(int[] data){
        int sum = 0;
        for (int value : data){
            sum = sum + value;
        }
        return (float) sum/12;
    }
    public int calculateMin(int[] data){
        int min = data[0];
        for (int value : data){
            if (value < min){
                min = value;
            }
        }
        return min;
    }
    public int calculateMax(int[] data){
        int max = data[0];
        for (int value : data){
            if (value > max){
                max = value;
            }
        }
        return max;
    }
    public int calculateAboveMean(int[] data){
        int sum = 0;
        for (int value : data){
            sum += value;
        }
        float mean = (float) sum/12;
        int count = 0;
        for (int value : data){
            if ( value > mean){
                count = count + 1;
            }
        }
        return count;
    }
    public int calculateBelowMean(int[] data){
        int sum = 0;
        for (int value : data){
            sum += value;
        }
        float mean = (float) sum/12;
        int count = 0;
        for (int value : data){
            if ( value < mean){
                count = count + 1;
            }
        }
        return count;
    }

}
