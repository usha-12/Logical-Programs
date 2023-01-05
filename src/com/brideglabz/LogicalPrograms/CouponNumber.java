package com.brideglabz.LogicalPrograms;

import java.util.Scanner;

public class CouponNumber {
    public static void main(String[] args) {
        String str = " ";

        System.out.println("Welcome to the coupon number program");
        System.out.println("Enter the number of coupon to be generated :");
        Scanner sc = new Scanner(System.in);
        int coupons = sc.nextInt();
        String[] couponArray = new String[coupons];
        System.out.println();
        for (int counter = 0; counter < coupons; counter++){
            int coupon = getCoupon(10000);
            System.out.println("Coupon Number "+(counter+1)+" :   "+coupon);
        }
        sc.close();
    }
    static  String generateCoupon(String str){
        for (int counter = 0; counter <= 4; counter++){
            int randomDigit = (int)(Math.random()*10);
            String s=Integer.toString(randomDigit);
            str = str + randomDigit;
            System.out.println("Coupon number"+counter+1);
            }
        return null;
    }
    public static int getCoupon(int n) {
        return (int) (Math.random() * n);
    }
    static String checkCoupons(String newCoupon){
        int check = 0;
        String[] couponArray = new String[5];
        for (String existing : couponArray)
            if (newCoupon == existing)
                check++;
        if (check != 0)
            generateCoupon("brid");
        return newCoupon;
    }
}

