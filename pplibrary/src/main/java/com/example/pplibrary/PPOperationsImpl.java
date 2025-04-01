package com.example.pplibrary;

public class PPOperationsImpl implements IOperation {
    @Override
    public int sum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    @Override
    public double average(int[] array) {
        return (double) sum(array) / array.length;
    }

    @Override
    public int max(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    @Override
    public int min(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

}