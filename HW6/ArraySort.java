package HW6;
import java.util.Random;
import java.util.Arrays;

public class ArraySort {
    /*
    Create an integer array of size of 10. Randomly populate the array  with integer from 1 to 100 into the array.
    Apply Selection Sort to the unsorted array. Create a counter to count the number of iteration needed to complete the sort of of the array. Display the result of the array after the sort, and the counter.
    
    Apply Merge Sort to the unsorted array. Create a counter to count the number of iteration needed to complete the sort of of the array. Display the result of the array after the sort, and the counter.


    repeat the above for an array of 10000 elements.
    Which sorting method would you recommend and why?
     */
    public static void main (String[] args) {
        Random rand = new Random();
        int[] array = new int[10];
        int[] array2 = new int[10000];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
        //System.out.println("Array (10): " + Arrays.toString(array));
        //SelectionSort(array);
        //System.out.println("Sorted Array (10) Using Selection Sort: " + Arrays.toString(array));

        for (int i = 0; i < array2.length; i++) {
            array2[i] = rand.nextInt(100);
        }
        //System.out.println("\nArray (10,000): " + Arrays.toString(array2));
        //SelectionSort(array2);
        //System.out.println("Sorted Array (10,000) Using Selection Sort: " + Arrays.toString(array2));

        System.out.println("\n----------------------------------------\n");

        System.out.println("Array (10): " + Arrays.toString(array));
        MergeSort(array);
        System.out.println("Sorted Array (10) Using Merge Sort: " + Arrays.toString(array));

        System.out.println("\nArray (10,000): " + Arrays.toString(array2));
        MergeSort(array2);
        //why does this not worK?
        //a: because it's too many iterations
        System.out.println("Sorted Array (10,000) Using Merge Sort: " + Arrays.toString(array2));
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
        System.out.println("Number of Iterations Using Selection Sort: " + counter);
    }
    
    public static void MergeSort(int[] array) {
        int counter = 0;
        if (array.length > 1) {
            int[] left = leftHalf(array);
            int[] right = rightHalf(array);
            MergeSort(left);
            MergeSort(right);
            merge(array, left, right);
            counter++;
        }
        System.out.println("Number of Iterations Using Merge Sort: " + counter);
    }

    public static int[] leftHalf(int[] array) {
        int size1 = array.length / 2;
        int[] left = new int[size1];
        for (int i = 0; i < size1; i++) {
            left[i] = array[i];
        }
        return left;
    }

    public static int[] rightHalf(int[] array) {
        int size1 = array.length / 2;
        int size2 = array.length - size1;
        int[] right = new int[size2];
        for (int i = 0; i < size2; i++) {
            right[i] = array[i + size1];
        }
        return right;
    }

    public static void merge(int[] result, int[] left, int[] right) {
        int i1 = 0;   
        int i2 = 0;   
        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
                result[i] = left[i1];   
                i1++;
            } else {
                result[i] = right[i2];   
                i2++;
            }
        }
    }
}

// Merge Sort is the better sorting method because it has a better time complexity.