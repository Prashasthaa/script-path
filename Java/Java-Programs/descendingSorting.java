public class descendingSorting {
    // Print Array
    public static void print_array(int[] arr) {
        System.out.println(" Array :");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Bubble Sort
    public static void bubbleSort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                }
            }
        }
    }

    // selection sort
    public static void selectionSort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
    }

    // insertion sort
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int cur = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] < cur) {
                arr[prev + 1] = arr[prev];
                prev--;

            }
            arr[prev + 1] = cur;
        }
    }

    // countingSort
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // sorting
        int j = 0;
        for (int i = count.length - 1; i >= 0; i--) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;

            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 2, 3 };
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        countingSort(arr);
        print_array(arr);

    }
}
