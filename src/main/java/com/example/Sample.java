package com.example;

public class Sample {
    public static int num() {
     return 10;
    }
    public static String string() {
      return "Loan Ipsum";
    }
    public static int sum(int n, int m) {
      return n + m;
    }
    public static boolean isPrime(int n) {
      if (n == 2) return true;
      if (n < 2 || n%2 == 0) return false;
      for (int i=3; i<= Math.sqrt((double)n); i+=2) {
        if (n%i == 0) return false;
      }
      return true;
    }
}
