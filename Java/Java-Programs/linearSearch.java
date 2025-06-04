import java.util.Scanner;

public class linearSearch {
    // Linear Search
    public static int linearSearc(int numbers[], int key) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int n[] = { 2, 4, 6, 17, 15, 34 };
        int key = 7;
        int index = linearSearc(n, key);

        if (index == -1) {
            System.out.println("NOT FOUND!!");
        } else

            System.out.println("Key is at index " + index);
    }
}
