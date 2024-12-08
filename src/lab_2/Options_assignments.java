package lab_2;

import java.util.Arrays;
import java.util.Random;

public class Options_assignments {
    public static void main(String[] args) {
        final int SIZE = 20;
        final int MIN = -99;
        final int MAX = 99;
        final int TOP_N = 5;

        int[] array = createRandomArray(SIZE, MIN, MAX);
        printArray(array, "Исходный массив:");

        double[] reciprocalArray = createReciprocalFraction(array);
        printArray(reciprocalArray, "Массив обратных значений:");

        int[] topMaxValues = getTopMaxValues(array, TOP_N);
        printArray(topMaxValues, "Топ " + TOP_N + " максимальных значений:");
    }

    public static int[] createRandomArray(int size, int min, int max) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }

    public static double[] createReciprocalFraction(int[] array) {
        double[] reciprocalArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            try {
                reciprocalArray[i] = 1.0 / array[i];
            } catch (ArithmeticException e) {
                reciprocalArray[i] = 0.0; // Обработка деления на ноль
            }
        }
        return reciprocalArray;
    }

    public static int[] getTopMaxValues(int[] array, int n) {
        int[] copy = Arrays.copyOf(array, array.length);
        Arrays.sort(copy);
        int[] topMaxValues = new int[n];
        for (int i = 0; i < n; i++) {
            topMaxValues[i] = copy[copy.length - 1 - i];
        }
        return topMaxValues;
    }

    public static void printArray(int[] array, String message) {
        System.out.println(message);
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printArray(double[] array, String message) {
        System.out.println(message);
        for (double num : array) {
            System.out.printf("%.2f ", num);
        }
        System.out.println();
    }
}