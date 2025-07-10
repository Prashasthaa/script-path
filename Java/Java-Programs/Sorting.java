public class Sorting {

    // Print Array
    public static void print_array(int[] arr) {
        System.out.println(" SORTED :");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Bubble Sort
    public static void bubbleSort(int arr[]) {

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
        print_array(arr);
    }

    // Selection Sort
    public static void selectionSort(int[] arr) {

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
        print_array(arr);
    }

    public static void insertionSort(int[] arr) {
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
        print_array(arr);
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 1, 3, 2 };
        // bubbleSort(arr);
        // selectionSort(arr);
        insertionSort(arr);

    }
}
