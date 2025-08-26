public class BitManipulation {

    public static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 1) {
            System.out.println("odd number");
        } else {
            System.out.println("even number");
        }
    }

    public static void getIthBit(int n, int pos) {

        int bitMask = 1 << pos;
        if ((n & bitMask) == 0) {
            System.out.println(pos + " th pos has 0");
        } else {
            System.out.println(pos + " th pos has 1");
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        System.out.println(n & bitMask);
        return n & bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        System.out.println(n & bitMask);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        // if (newBit == 0) {
        // return clearIthBit(n, i);
        // } else {
        // return setIthBit(n, i);
        // }

        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;

    }

    public static int clearIBits(int n, int i) {
        int bitMask = (~0) << i;
        System.out.println(n & bitMask);
        return n & bitMask;
    }

    public static int clearRangeOfIBits(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - i;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean powerOfTwo(int n) {
        // if ((n & (n - 1)) == 0) {
        // System.out.println(n + " is Power of 2");
        // return true;
        // } else {
        // System.out.println(n + " is not power of 2");
        // return false;
        // }
        return (n & (n - 1)) == 0;

    }

    public static int countsBit(int n) {
        int count = 0;
        while (n > 0) {

            if ((n & 1) == 1) {
                count += 1;
            }

            n = n >> 1;
        }
        return count;
    }

    public static void main(String args[]) {

        // bitwise And &
        // System.out.println((6 & 5));

        // bitwise OR |
        // System.out.println((6 | 5));

        // bitwise XOR ^
        // System.out.println((6 ^ 5));

        // Binary 1's Complement
        // System.out.println((~5));
        // System.out.println((~6));
        // System.out.println((~(0)));
        // System.out.println((~(1)));
        // System.out.println((~(-1)));

        // Binary Left shift
        // System.out.println(5 << 2);

        // Binary Right Shift
        // System.out.println(6 >> 1);

        // oddOrEven(90);

        // getIthBit(15, 6);

        // setIthBit(4, 0);

        // clearIthBit(3, 1);

        // System.out.println(updateIthBit(12, 0, 1));

        // System.out.println(clearIBits(15, 3));

        // System.out.println(clearRangeOfIBits(15, 1, 2));

        // System.out.println(powerOfTwo(18));

        System.out.println(countsBit(15));
    }
}
