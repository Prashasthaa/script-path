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
        // System.out.println((~(-1)));

        // Binary Left shift
        // System.out.println(5 << 2);

        // Binary Right Shift
        // System.out.println(6 >> 1);

        // oddOrEven(90);

        // getIthBit(15, 6);

        // setIthBit(4, 0);

        // clearIthBit(3, 1);

        System.out.println(updateIthBit(12, 0, 1));

    }
}
