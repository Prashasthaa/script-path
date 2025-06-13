
public class JavaBasics {
    public static int hello() {
        System.out.println("HEllo world");
        return 3;
    }

    public static int Factorail(int a) {
        int fact = 1;
        for (int i = 2; i <= a; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isprime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static int binaryToDecimal(int n) {
        int sum = 0;
        for (int i = 0; n != 0; i++) {
            int digit = n % 10;
            sum += Math.pow(2, i) * digit;
            n = n / 10;

        }
        return sum;

    }

    public static int decimaltobinary(int n) {
        int pow = 0;
        int decimal = 0;

        while (n > 0) {
            int rem = n % 2;
            decimal += rem * Math.pow(10, pow);
            n = n / 2;
            pow++;

        }
        return decimal;

    }

    public static void average(int a, int b, int c) {
        System.out.println((a + b + c) / 3);
    }

    public static boolean isEven(int num) {
        boolean isEven = false;
        if (num % 2 == 0) {
            isEven = true;
        }
        return isEven;
    }

    public static void isPalindrome(int num) {
        int myNum = num;
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = (rev * 10) + digit;
            num = num / 10;
        }
        if (myNum == rev) {
            System.out.println(myNum + " is Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    public static void sumOfDigits(int num) {
        int myNum = num;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        System.out.println("Sum of " + myNum + " is " + sum);
    }

    public static void hallow_rectangle(int n, int m) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_rotated_half_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void half_pyramid_num(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floyds_triangle(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++, num++) {
                System.out.print(num + " ");

            }
            System.out.println();
        }
    }

    public static void triangle_0_1(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((j + i) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }

            }
            System.out.println();
        }
    }

    public static void butterfly(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (2 * (n - i)); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (2 * (n - i)); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solid_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n; k++) {
                if (i == 1 || i == n || k == 1 || k == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void diamond(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void number_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void num_pyramid(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= i; j++, num++) {

                System.out.print(num + "\t\t");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        num_pyramid(5);
    }

}
