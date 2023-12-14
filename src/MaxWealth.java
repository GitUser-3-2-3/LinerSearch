// https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {
    public static void main(String[] args) {
        System.out.println();

        int[][] accounts = {{1, 2, 3}, {3, 2, 1, 1}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        // person = row
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
