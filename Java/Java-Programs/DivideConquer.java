public class DivideConquer {

    public static void printArr(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // MERGESORT
    public static void merge(int arr[], int si, int ei, int mid) {
        int temp[] = new int[ei - si + 1];
        int i = si; // iterator for left
        int j = mid + 1; // iterator for right
        int k = 0; // iterator for temp

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original arr
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    // QuickSort
    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int partionId = partition(arr, si, ei);
        quickSort(arr, si, partionId - 1);// left side
        quickSort(arr, partionId + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // to make place for els smaller than pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return ei;
    }

    public static void mergeSort(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }

        // work
        int mid = si + (ei - si) / 2; // mid=(si+ei)/2
        mergeSort(arr, si, mid); // left part
        mergeSort(arr, mid + 1, ei); // right part
        merge(arr, si, ei, mid);
    }

    // Sorted Rotated Array

    public static int search(int arr[], int tar, int si, int ei) {
        // base case
        if (si > ei) {
            return -1;
        }

        // mid
        int mid = si + (ei - si) / 2;

        if (arr[mid] == tar) {
            return mid;
        }

        // L1
        // case:1
        if (arr[si] <= arr[mid]) {

            // case:a left of l1
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            }
            // case:b rigtt of mid
            else {
                return search(arr, tar, mid + 1, ei);
            }
        }
        // L2
        else {
            // case:c right of l2
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            }
            // case:d left of mid
            else {
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    public static int iterationSearch(int arr[], int tar, int si, int ei) {

        while (si <= ei) {

            // mid
            int mid = si + (ei - si) / 2;
            if (arr[mid] == tar) {
                return mid;
            }

            // L1
            // case:1
            if (arr[si] <= arr[mid]) {

                // case:a left of l1
                if (arr[si] <= tar && tar <= arr[mid]) {
                    ei = mid - 1;
                }
                // case:b rigtt of mid
                else {
                    si = mid + 1;
                }
            }
            // L2
            else {
                // case:c right of l2
                if (arr[mid] <= tar && tar <= arr[ei]) {
                    si = mid + 1;
                }
                // case:d left of mid
                else {
                    ei = mid - 1;
                }
            }

        }

        return -1;
    }

    // EXCISES
    public static void mergeSortString(String arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSortString(arr, si, mid);
        mergeSortString(arr, mid + 1, ei);
        mergeString(arr, si, mid, ei);
    }

    public static void mergeString(String arr[], int si, int mid, int ei) {
        String temp[] = new String[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            int compare = arr[i].compareTo(arr[j]);
            if (compare < 0) {
                temp[k] = arr[i];
                i++;

            } else {
                temp[k] = arr[j];
                j++;

            }
            k++;
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        // int arr[] = { 6, 3, 9, 5, 2, 8 };
        // printArr(arr);
        // mergeSort(arr, 0, arr.length - 1);
        // quickSort(arr, 0, arr.length - 1);
        // printArr(arr);

        // int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        // int arr[] = { 1 };

        // int target = 1; // 1; // 3;// 0; // output -> 4

        // System.out.println(iterationSearch(arr, target, 0, arr.length - 1));

        String arr[] = { "sun", "earth", "mars", "mercury" };
        printArr(arr);
        mergeSortString(arr, 0, arr.length - 1);
        printArr(arr);
    }

}
