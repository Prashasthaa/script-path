import java.util.Arrays;
import java.util.Collections;

public class Sorting {

    // Print Array
    public static void print_array(Integer[] arr) {
        System.out.println(" SORTED :");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Bubble Sort
    public static void bubbleSort(Integer arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {

                    // swap
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    // Selection Sort
    public static void selectionSort(Integer[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            // swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }

    }

    public static void insertionSort(Integer[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // finding out the correct position to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insesrtion
            arr[prev + 1] = curr;
        }
    }

    public static int compare(int a, int b) {
        // a > b -ve
        // a == b 0
        // a < b +ve
        return a - b;

    }

    public static void main(String args[]) {
        Integer arr[] = { 5, 4, 1, 3, 2 };
        // bubbleSort(arr);

        // selectionSort(arr);

        // insertionSort(arr);

        // builtin sort
        // Arrays.sort(arr, 1, 5);
        // Arrays.sort(arr, Collections.reverseOrder());
        // Arrays.sort(arr, 1, 5, Collections.reverseOrder());
        // Arrays.sort(arr, 0, 3, Collections.reverseOrder());

        print_array(arr);
    }
}
