package lab_2;

import java.util.Random;

public class III_Matrices {
    public static void main(String[] args) {
        final int ROWS = 5;
        final int COLS = 4;

        int[][] matrix = createRandomMatrix(ROWS, COLS, 0, 99);
        printMatrix(matrix, "Исходная матрица:");

        int[] vectorB = findMinIndices(matrix);
        printArray(vectorB, "Вектор B (номера минимальных элементов по столбцам):");
    }

    public static int[][] createRandomMatrix(int rows, int cols, int min, int max) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
        return matrix;
    }

    public static int[] findMinIndices(int[][] matrix) {
        int cols = matrix[0].length;
        int[] minIndices = new int[cols];

        for (int j = 0; j < cols; j++) {
            int minIndex = 0;
            for (int i = 1; i < matrix.length; i++) {
                if (matrix[i][j] < matrix[minIndex][j]) {
                    minIndex = i;
                }
            }
            minIndices[j] = minIndex;
        }

        return minIndices;
    }

    public static void printMatrix(int[][] matrix, String message) {
        System.out.println(message);
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }

    public static void printArray(int[] array, String message) {
        System.out.println(message);
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
