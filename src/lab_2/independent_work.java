package lab_2;

import java.util.Arrays;
import java.util.Random;

public class independent_work {
    public static void main(String[] args) {
        int[] vector = fillRandomIntVector(30, 100, 200);
        printVector(vector, "Исходный вектор:");
        Arrays.sort(vector);
        printVector(vector, "Отсортированный вектор:");
    }

    public static int[] fillRandomIntVector(int size, int min, int max) {
        Random random = new Random();
        int[] vector = new int[size];
        for (int i = 0; i < size; i++) {
            vector[i] = random.nextInt(max - min + 1) + min;
        }
        return vector;
    }

    public static void printVector(int[] vector, String message) {
        System.out.println(message);
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}