package lab_2;

import java.util.Random;

public class IV_Actions_on_matrices {
    public static void main(String[] args) {
        final int SIZE = 4; // Размер матрицы
        int[][] matrix = createRandomMatrix(SIZE, -50, 50);
        printMatrix(matrix, "Исходная матрица:");

        double average = findPositiveSecondaryDiagonalAverage(matrix);
        System.out.printf("Среднее арифметическое положительных элементов побочной диагонали: %.2f%n", average);
    }

    public static int[][] createRandomMatrix(int size, int min, int max) {
        Random random = new Random();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
        return matrix;
    }

    public static double findPositiveSecondaryDiagonalAverage(int[][] matrix) {
        int n = matrix.length;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int element = matrix[i][n - 1 - i];
            if (element > 0) {
                sum += element;
                count++;
            }
        }

        return count > 0 ? (double) sum / count : 0.0;
    }

    public static void printMatrix(int[][] matrix, String message) {
        System.out.println(message);
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
    }
}
