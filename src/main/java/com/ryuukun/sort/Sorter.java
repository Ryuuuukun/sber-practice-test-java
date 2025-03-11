package com.ryuukun.sort;


public class Sorter {

    public static int[] bubble(int[] array) {
        return bubble(array, 0, array.length - 1);
    }

    public static int[] bubble(int[] array, int low, int high) {
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array.length - i - 1; ++j) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }

        return array;
    }

    public static long[] bubble(long[] array) {
        return bubble(array, 0, array.length - 1);
    }

    public static long[] bubble(long[] array, int low, int high) {
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array.length - i - 1; ++j) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }

        return array;
    }

    public static int[] quick(int[] array) {
        return quick(array, 0, array.length - 1);
    }

    public static int[] quick(int[] array, int low, int high) {
        if (low < high) {
            int p = partition(array, low, high);

            quick(array, low, p - 1);
            quick(array, p + 1, high);
        }

        return array;
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];

        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;

                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);

        return i + 1;
    }

    public static long[] quick(long[] array) {
        return quick(array, 0, array.length - 1);
    }

    public static long[] quick(long[] array, int low, int high) {
        if (low < high) {
            int p = partition(array, low, high);

            quick(array, low, p - 1);
            quick(array, p + 1, high);
        }

        return array;
    }

    public static int partition(long[] array, int low, int high) {
        long pivot = array[high];

        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;

                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);

        return i + 1;
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    private static void swap(long[] array, int i, int j) {
        long tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
