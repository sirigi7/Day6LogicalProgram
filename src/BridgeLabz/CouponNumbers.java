package BridgeLabz;

import java.util.*;
public class CouponNumbers {
    private static Random random = new Random();

    public static int[] generateCoupons(int n) {
        int[] coupons = new int[n];
        for (int i = 0; i < n; i++) {
            coupons[i] = random.nextInt(1000) + 1; // generate a random coupon number
        }
        return coupons;
    }

    public static int countDistinctCoupons(int[] coupons) {
        Set<Integer> set = new HashSet<Integer>();
        int count = 0;
        for (int i = 0; i < coupons.length; i++) {
            if (!set.contains(coupons[i])) {
                set.add(coupons[i]);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of distinct coupon numbers: ");
        int n = sc.nextInt();

        int[] coupons = generateCoupons(n);
        int count = countDistinctCoupons(coupons);

        System.out.println("Number of random numbers needed: " + count);
        sc.close();
    }
}
