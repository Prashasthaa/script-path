import java.util.Scanner;

public class Array {
    // Linear Search
    public static int linearSearch(int numbers[], int key) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void largest(int numbers[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Largest :" + max);
    }

    public static void smallest(int numbers[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Smallest :" + min);
    }

    public static void binarySearch(int numbers[], int key) {
        int start = 0;
        int end = (numbers.length) - 1;
        int mid = (end + start) / 2;
        boolean flag = false;
        while (start <= end) {
            mid = (end + start) / 2;
            if (numbers[mid] == key) {
                flag = true;
                break;
            } else if (mid > key) {
                // left
                end = mid - 1;
            } else {
                // right
                start = mid + 1;
            }

        }
        if (flag) {
            System.out.println("Key is found at " + mid);
        } else {
            System.out.println("Key is NOT found ");
        }
    }

    public static void reverse(int numbers[]) {
        int first = 0;
        int last = (numbers.length) - 1;
        while (first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
        System.out.println("reverse : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void pair(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("( " + numbers[i] + "," + numbers[j] + ") ");
            }
            System.out.println();
        }
    }

    public static void subArray(int numbers[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            int sum = 0;

            for (int j = i; j < numbers.length; j++) {
                int end = j;
                sum = 0;
                for (int k = start; k <= end; k++) {
                    sum += numbers[k];
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
                System.out.println("Sum : " + sum);
                System.out.println();
                if (sum > max) {
                    max = sum;
                }
                if (sum < min) {
                    min = sum;
                }

            }

            System.out.println();
        }
        System.out.println("Max sum: " + max);
        System.out.println("Min sum: " + min);
    }

    public static void prefixArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int prefix[] = new int[nums.length];

        prefix[0] = nums[0];

        // calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            int start = i;
            sum = 0;

            for (int j = i; j < nums.length; j++) {
                int end = j;
                sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (sum > max) {
                    max = sum;
                }

            }

        }
        System.out.println(max);
    }

    public static void kadens(int nums[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < nums.length; i++) {
            cs = cs + nums[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Maximum subarray sum is: " + ms);

    }

    public static void trappedRainWater(int height[]) {
        int n = height.length;
        // calculate left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // calculate right max boundary
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;
        // loop
        for (int i = 0; i < n; i++) {
            // waterlevel = min(leftmax bound,rightmax bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trappedWater=waterlevel-height[i]
            trappedWater += waterLevel - height[i];
        }
        System.out.println("Trapped water :" + trappedWater);

    }

    public static void buySellStocks(int[] price) {
        int buyingPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < price.length; i++) {
            if (buyingPrice < price[i]) {
                int profit = price[i] - buyingPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyingPrice = price[i];
            }
        }
        System.out.println("Max Profit : " + maxProfit);
    }

    public static int search(int[] nums, int target) {
        int n = nums.length;
        int high = n - 1;
        int low = 0;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[low] <= nums[mid]) {
                if (target >= nums[low] && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target >= nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;

    }

    public static void main(String[] args) {

        int n[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(search(n, 5));

    }
}


