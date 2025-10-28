import java.util.Scanner;

public class Recursion {

    public static void printDecNum(int n) {
        if (n < 1) {
            return;
        }
        System.out.print(n + " ");
        printDecNum(n - 1);
    }

    public static void printIncNum(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printIncNum(n - 1);
        System.out.print(n + " ");

    }

    public static int printFact(int n) {
        if (n == 0 || n == 1) {

            return 1;
        }
        return printFact(n - 1) * n;

    }

    public static int printSumOfNum(int n) {
        if (n == 0 || n == 1) {

            return 1;
        }
        return printSumOfNum(n - 1) + n;

    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);

    }

    public static int firstIndex(int arr[], int i, int key) {

        if (arr[i] == key) {
            return i;
        }
        if (i == arr.length - 1) {
            return -1;
        }

        return firstIndex(arr, i + 1, key);
    }

    public static int lastOccurance(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        int lastFound = lastOccurance(arr, i + 1, key);
        if (lastFound == -1 && arr[i] == key) {
            return i;

        }
        return lastFound;
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static int optimizedPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(x, n / 2);
        int halfPowerSq = halfPower * halfPower;

        // n is odd
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;

        }
        return halfPowerSq;
    }

    public static int tailingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int vertical = tailingProblem(n - 1);
        int horizontal = tailingProblem(n - 2);
        int totalWays = vertical + horizontal;
        return totalWays;
        // return tailingProblem(n - 1) + tailingProblem(n - 2);
    }

    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char curChar = str.charAt(idx);

        if (map[curChar - 'a'] == true) {
            // Duplicate
            removeDuplicate(str, idx + 1, newStr, map);
        } else {
            map[curChar - 'a'] = true;
            removeDuplicate(str, idx + 1, newStr.append(curChar), map);
        }

    }

    public static int friendsPairing(int n) {

        // baseCase
        if (n == 1 || n == 2) {
            return n;
        }

        // choices

        // single
        // int fnm1 = friendsPairing(n - 1);

        // // pair
        // int fnm2 = friendsPairing(n - 2);
        // int pairWays = (n - 1) * fnm2;

        // // totalWays
        // int totalWays = fnm1 + pairWays;
        // return totalWays;

        return friendsPairing(n - 1) + ((n - 1) * friendsPairing(n - 2));
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number:");
        // int n = sc.nextInt();
        // printDecNum(n);
        // printIncNum(n);
        // System.out.println("Factorial of " + n + " is " + printFact(n));
        // System.out.println("Sum of " + n + " numbers is " + printSumOfNum(n));
        // System.out.println("Fibonacci of " + n + "th numbers is " + fibonacci(n));

        // System.out.println(fibonacci(5));

        // int arr[] = { 10, 3, 3, 4, 5, 6, 6 };
        // System.out.println(isSorted(arr, 0));
        // System.out.println(firstIndex(arr, 0, 6));
        // System.out.println(lastOccurance(arr, 0, 3));
        // System.out.println(power(2, 3));

        // System.out.println(optimizedPower(5, 4));

        // System.out.println(tailingProblem(3));
        // System.out.println(tailingProblem(1));
        // System.out.println(tailingProblem(4));

        // removeDuplicate("prashastha", 0, new StringBuilder(""), new boolean[26]);
        // removeDuplicate("helloworld", 0, new StringBuilder(""), new boolean[26]);

        System.out.println(friendsPairing(4));
        System.out.println(friendsPairing(3));
    }

}
