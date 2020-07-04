package org.example.basic;

public class arr {
    public static double poww(int a, int n) {
        if(n==0){
            return 1;
        }
        int ans = 1;
        int base = a;
        int times=Math.abs(n);
        while(times != 0) {
            if((times & 1) != 0) {
                ans *= base;
            }
            base *= base;
            times >>= 1;
        }
        if(n<0){
            return 1.0/ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(poww(-3,-9));
        System.out.println(Math.pow(-3,-9));
    }
}
