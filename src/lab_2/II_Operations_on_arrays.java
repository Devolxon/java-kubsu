package lab_2;

import java.util.ArrayList;


public class II_Operations_on_arrays {
        public static void main(String[] args) {
            int[] a = {20, -7, 2, 55, -2, 74, 12, -43, 0, 6, -167, 1254};
            printArray(a, "Исходный массив:");

            int[] b = filterAndDivide(a);
            printArray(b, "Массив положительных элементов, деленных на 3:");

            selectionSort(b);
            printArray(b, "Упорядоченный массив:");
        }

        public static int[] filterAndDivide(int[] array) {
            ArrayList<Integer> filteredList = new ArrayList<>();
            for (int num : array) {
                if (num > 0 && num % 3 == 0) {
                    filteredList.add(num / 3);
                }
            }
            int[] result = new int[filteredList.size()];
            for (int i = 0; i < filteredList.size(); i++) {
                result[i] = filteredList.get(i);
            }
            return result;
        }

        public static void selectionSort(int[] array) {
            for (int i = 0; i < array.length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] < array[minIndex]) {
                        minIndex = j;
                    }
                }
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
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
