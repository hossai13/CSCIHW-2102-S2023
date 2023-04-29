package HW6;
import java.util.Random;
import java.util.Arrays;

public class ArraySort {
    public static void main (String[] args) {
        Random rand = new Random();
        int[] array = new int[10];
        int[] array2 = new int[10000];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
        
        System.out.println("Array (10): " + Arrays.toString(array));

        for (int i = 0; i < array2.length; i++) {
            array2[i] = rand.nextInt(100);
        }
        System.out.println("\nArray (10,000): " + Arrays.toString(array2));

        System.out.println("\n----------------------------------------\n");

        System.out.println("Sorted Array (10) Using Selection Sort: " + Arrays.toString(array));
        SelectionSort(array);

        System.out.println("\nSorted Array (10,000) Using Selection Sort: " + Arrays.toString(array2));
        SelectionSort(array2);

        System.out.println("\n----------------------------------------\n");

        System.out.println("Sorted Array (10) Using Merge Sort: " + Arrays.toString(array));
        MergeSort(array);
        
        System.out.println("\nSorted Array (10,000) Using Merge Sort: " + Arrays.toString(array2));
        MergeSort(array2);
    }

    public static void SelectionSort(int[] array) {
        int min;
        int temp;
        int counter = 0;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j; 
                }
                counter++;
            }
            temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        System.out.println("\nNumber of Iterations Using Selection Sort: " + (counter));
    }
    
    public static void MergeSort(int[] array) {
        int counter = 0;
        int[] temp = new int[array.length];
        for (int i = 1; i < array.length; i *= 2) {
            for (int j = 0; j < array.length - i; j += 2 * i) {
                Merge(array, temp, j, j + i, Math.min(j + 2 * i, array.length));
                counter++;
            }
        }
        System.out.println("\nNumber of Iterations Using Merge Sort: " + counter);
    }

    public static void MergeSort2(int[] array) {
        int[] temp = new int[array.length];
        MergeSort2(array, temp, 0, array.length);
    }

    public static void MergeSort2(int[] array, int[] temp, int left, int right) {
        if (right - left > 1) {
            int mid = (left + right) / 2;
            MergeSort2(array, temp, left, mid);
            MergeSort2(array, temp, mid, right);
            Merge(array, temp, left, mid, right);
        }
    }

    public static void Merge(int[] array, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid;
        for (int k = left; k < right; k++) {
            if (i == mid) {
                temp[k] = array[j++];
            }
            else if (j == right) {
                temp[k] = array[i++];
            }
            else if (array[j] < array[i]) {
                temp[k] = array[j++];
            }
            else {
                temp[k] = array[i++];
            }
        }
        for (int k = left; k < right; k++) {
            array[k] = temp[k];
        }
    } 
}

// Merge Sort is the better sorting method because it has a better time complexity.