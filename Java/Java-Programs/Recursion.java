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

    public static void printBinary(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        printBinary(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinary(n - 1, 1, str + "1");
        }

        // if (lastPlace == 0) {
        // printBinary(n - 1, 0, str.append("0"));
        // printBinary(n - 1, 1, str.append("1"));

        // } else {
        // printBinary(n - 1, 0, str.append("0"));
        // }
    }

    public static void indexOfOccurence(int arr[], int key, int n) {
        if (n == arr.length) {
            return;
        }
        if (arr[n] == key) {
            System.out.print(n + " ");
        }
        indexOfOccurence(arr, key, n + 1);
    }

    public static void numberToString(int n) {
        if (n == 0) {
            return;
        }
        numberToString(n / 10);
        // printString(n);
        printString(n % 10);
    }

    public static void printString(int n) {
        switch (n) {
            case 1:
                System.out.print("one ");
                break;
            case 2:
                System.out.print("Two ");
                break;
            case 3:
                System.out.print("Three ");
                break;
            case 4:
                System.out.print("Four ");
                break;
            case 5:
                System.out.print("Five ");
                break;
            case 6:
                System.out.print("Six ");
                break;
            case 7:
                System.out.print("Seven ");
                break;
            case 8:
                System.out.print("Eight ");
                break;
            case 9:
                System.out.print("Nine ");
                break;

            default:
                System.out.print("Zero ");
                break;
        }
    }

    public static int lengthOfString(String str) {
        if (str == null || str == "") {
            return 0;

        }
        return lengthOfString(str.substring(1)) + 1;
    }

    // public static int countOfSubstrings(String str, int n) {
    // if (n == str.length()) {
    // return 0;
    // }
    // if (str.substring(n, n + 1) == str.substring(n + 1, n + 1)) {
    // System.out.println(str.substring(n, n + 1));
    // return countOfSubstrings(str, n + 1) + 1;
    // }
    // System.out.println("k");
    // return countOfSubstrings(str, n + 1) + 1;
    // }

    public static void towerOfHanoi(int n, String s, String h, String d) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + s + " to " + d);

            System.out.println();
            return;
        }
        towerOfHanoi(n - 1, s, d, h);
        System.out.println("transfer disk " + n + " from " + s + " to " + d);

        towerOfHanoi(n - 1, h, s, d);
    }

    public static void reverseOfString(String str, int idx) {
        if (idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reverseOfString(str, idx - 1);
    }

    public static void numberToStringII(int n) {
        if (n == 0) {
            return;
        }
        String[] numString = { "Zero", "One", "Two", "Three", "Four", "five", "Six", "Seven", "eight", "nine" };

        numberToStringII(n / 10);
        System.out.print(numString[n % 10] + " ");

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
        // System.out.println(isSorted(arr, 0));f
        // System.out.println(firstIndex(arr, 0, 6));
        // System.out.println(lastOccurance(arr, 0, 3));
        // System.out.println(power(2, 3));

        // System.out.println(optimizedPower(5, 4));

        // System.out.println(tailingProblem(3));
        // System.out.println(tailingProblem(1));
        // System.out.println(tailingProblem(4));

        // removeDuplicate("prashastha", 0, new StringBuilder(""), new boolean[26]);
        // removeDuplicate("helloworld", 0, new StringBuilder(""), new boolean[26]);

        // System.out.println(friendsPairing(4));
        // System.out.println(friendsPairing(3));

        // printBinary(3, 0, new String(""));
        // printBinary(2, 0, new String(""));

        // int arr[] = { 6, 3, 3, 4, 5, 6, 6 };
        // indexOfOccurence(arr, 6, 0);

        // numberToString(123);
        // numberToString(456789);

        // System.out.println("hello".substring(1));
        // System.out.println(lengthOfString("prashastha"));
        // System.out.println(lengthOfString("p"));

        // System.out.println(countOfSubstrings("aba", 0));

        // towerOfHanoi(3, "Source", "helper", "destination");
        // towerOfHanoi(2, "Source", "helper", "destination");

        // reverseOfString("null", "null".length() - 1);

        numberToStringII(123);

    }

}
