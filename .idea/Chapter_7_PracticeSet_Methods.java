package com.company;

public class Chapter_7_PracticeSet_Methods {
        static float C2F(float n){//Celsius to Farhenheit

            float Celsius = n;
            float Farhenheit;
           float Fahrenheit = (float) ((Celsius *1.8) + 32);
           return Fahrenheit;
        }

         static void pattern1_recursive ( int n){//problem 9
                 for (int i = 0; i < n; i++) {
                    for (int j = 0; j < i + 1; j++) {
                       System.out.print("*");
                                                    }
                       System.out.print("");
                                             }
                                                }

            static int avg ( int ...arr){//available as int[] arr//problem 7
                int sum = 0;
                int average = 0;
                for (int element : arr) {//for displaying elements using for each loop
                    average += element / arr.length;

                }
                return average;
            }
            static int fibonacci ( int n){//problem 6
                if (n == 1 || n == 2) {
                    return n - 1;
                } else {
                    return fibonacci(n - 1) + fibonacci(n - 2);
                }
            }
            static void pattern2 ( int n){//problem 4
                for (int i = 0; i < n; i--) {
                    for (int j = 0; j < n - 1; j--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            static int sum_recursive ( int n){//problem 3
                if (n == 1) {// base condition
                    return 1;
                }
                return n + sum_recursive(n - 1);

            }
            static void pattern1 ( int n){//problem 2
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < i + 1; j++) {
                        System.out.print("*");
                    }
                    System.out.print("");
                }
            }
            static void multiplication ( int n){//problem1 method
                for (int i = 1; i <= 10; i++) {
                    System.out.format("%d x %d = %d\n", n, i, n * i);
                }
            }
            public static void main (String[]args){
// write a java method to print multiplication table of number n
//        multiplication(9);
// problem 2
//      pattern1(5);
//write a recursive function to calculate sum of first n natural numbers
                //  int c =  sum_recursive(4);
                // System.out.println(c);
//write a function to print following pattern
                /*
                 * * * *
                 * * *
                 * *
                 *
                 */
                //pattern2(4);
//

// problem 5 :  fibonacci series = 0,1,1,2,3,5,8,13,21,34
//       int result = fibonacci(9);
//        System.out.println(result);


//problem 6 :WA function to find average of set of numbers passed as an argument
                //   System.out.println("The average of numbers provided is: " +avg(2,4,6,8));

//repeat problem using recursion
          float c =  C2F(35.2f);
          System.out.println("The conversion of Celsius to Farhenheit is: " +c);
   }
}
