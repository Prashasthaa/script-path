import java.util.*;

public class Strings {

    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static boolean palindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {

                return false;
            }
        }

        return true;
    }

    public static void shortestPath(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'N') {
                y++;
            } else if (str.charAt(i) == 'S') {
                y--;
            } else if (str.charAt(i) == 'E') {
                x++;
            } else {
                x--;
            }
        }
        int x2 = x * x;
        int y2 = y * y;

        double distance = Math.sqrt(x2 + y2);
        System.out.println("Shortest Path is " + distance);

    }

    public static String subString(String str, int si, int ei) {

        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        System.out.println(substr);
        return substr;
    }

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));

            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String stringCompress(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count.toString();
            }
        }
        return newStr;
    }

    public static void main(String args[]) {
        // char arr[] = { 'a', 'b', 'c', 'd' };
        // String str = "abcd";
        // String str1 = new String("XYZ");

        // // Strings are immutable

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        // String fullName = "Tony Stark";
        // System.out.println(fullName.length());

        // concatenation
        // String firstName = "Prashastha";
        // String lastName = "Poojary";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName);
        // System.out.println(fullName.charAt(0));
        // printLetters(fullName);

        // boolean ispalindrome = palindrome("1");
        // if (ispalindrome) {
        // System.out.println("palindrome");
        // } else {
        // System.out.println("Not palindrome");
        // }

        // String str = "WNEENESENNN";
        // shortestPath(str);

        // Compare
        // String s1 = "Tony";
        // String s2 = "Tony";
        // String s3 = new String("Tony");

        // if (s1 == s3) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Strings are not equal");
        // }
        // if (s1.equals(s3)) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Strings are not equal");
        // }

        // Substring
        // String str = "Hello world";
        // System.out.println(subString(str, 4, 8));
        // System.out.println(str.substring(0, 5));

        // compareTo
        // String fruits[] = { "apple", "Apple", "mango", "banana" };
        // String fruits[] = { "A", "a" };
        // String largest = fruits[0];
        // for (int i = 1; i < fruits.length; i++) {
        // if (largest.compareTo(fruits[i]) < 0) {
        // largest = fruits[i];
        // }

        // }

        // System.out.println(largest);

        // // StringBuilder
        // StringBuilder sb = new StringBuilder("");
        // for (char ch = 'a'; ch <= 'z'; ch++) {
        // sb.append(ch);
        // }
        // // O(26)
        // // abcdefghijklmnopqrstuvwxyz;
        // System.out.println(sb);
        // System.out.println(sb.length());

        // String str = "hi, i am prashastha";
        // System.out.println(toUpperCase(str));

        // String Compressor
        String str = "abcd";
        // String str = "aaabbcccdd";
        System.out.println(stringCompress(str));

    }
}
