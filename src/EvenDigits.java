// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {
    public static void main(String[] args) {
        System.out.println();

        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));

    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // function to check whether a number has even numbers of digits or not
    static boolean even(int num) {
        int numOfDigits = digits(num);

        /*
        if (numOfDigits % 2 == 0) {
            return true;
        }
        return false;
         */

        return numOfDigits % 2 == 0;
    }

    static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }

        return (int)(Math.log10(num)) + 1;
    }
}
