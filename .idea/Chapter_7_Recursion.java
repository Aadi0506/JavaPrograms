package com.company;

public class Chapter_7_Recursion {
    // factorial(n) = n * (n-1) * ....1
// factorial(5) =  5*4*3*2*1 = 120
// factorial(n) = n * factorial(n-1);
   static int factorial_iterative(int n) {//Factorial using iterative for loop
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            int result = 1;
            for(int i=1;i<=n;i++){
                 result *= i;
            }
            return result;
        }

    }
    static int factorial(int n) {//Factorial using recursion
        if (n == 0 || n == 1) {
            return 1;
        } else
        {
           return (n * factorial(n - 1));
        }
    }
    public static void main(String[] args) {
        int x = 1;
        System.out.println("The value of factorial is: " + factorial(x));
        System.out.println("The value of factorial is: " + factorial_iterative(x));

    }
}
