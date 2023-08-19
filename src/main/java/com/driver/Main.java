package com.driver;

public class Main {
    public static void main(String[] args) {

        Product p = new Product();
        int ans = p.product(2,5);
        int ans1 = p.product(4,6,9);
        double ans2 = p.product(4.0,5.0);
        System.out.println(ans + " " + ans1 + " " + ans2);
    }
    static class Product{
        public int product(int x, int y) {
            return x*y;
        }

        public int product(int x, int y, int z) {
            return x*y*z;
        }

        public double product(double x, double y) {
            return x*y;
        }
    }

}