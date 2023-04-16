package HW5; 
import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] array = new int[size];

        System.out.print("The array is: ");
        randArray(array, 0);

        System.out.println("\nThe sum of the array is: " + sumArray(array, 0));
    }

    private static void randArray(int[] array, int i) {
        if (i < array.length) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
            randArray(array, i + 1);
        }
    }

    private static int sumArray(int[] array, int i) {
        if (i < array.length) {
            return array[i] + sumArray(array, i + 1);
        }
        return 0;
    }
}

