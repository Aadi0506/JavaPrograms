package com.company;
import java.util.Scanner;

public class Chapter5_PracticeSet {
    public static void main(String[] args) {
        /*WAP to print the following pattern
         * * * *
         * * *
         * *
         *
         */
        /*int n = 4;
        for(int i=n; i>0; i--)
        {
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
         */
//WAP to sum first n even numbers using while loop
       /* System.out.println("Ener numbers you want to calculate sum of even numbers");
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int ab = sc.nextInt();
        for(int i = 0; i<ab; i++){
            sum = sum + (2*i);
        }
        System.out.print("Sum of even numbers is: ");
        System.out.println(sum);
        */
//WAP to print multiplication table of a given number n
        /*int n = 5;
        for (int i = 1; i<=10; i++){
            System.out.printf("%d x %d = %d\n", n, i, n*i);
        }
         */
//WAP to print multiplication od 10 in reverse order
        /*int n = 10;
        for (int i = 10; i >= 1; i--) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }
         */
//WAP to find factorial of a given number using while loop
          //int n = 5;
//what is factorial n = n * n-1 * n-2......n
// factorial of 5! = 5*4*3*2*1
            /*int i = 1;
            int factorial = 1;
            while(i<=n){
                factorial *= i;
                i++;
            }
        System.out.println(factorial);
             */
//WAP to find factorial of a given number using for loop
        /*int n = 5;
        int factorial = 1;
        for(int i = n; i >= 1; i--){
            factorial *= i;
        }
        System.out.println(factorial);
         */
//WAP to print problem 1 using while loop
       /* int n = 4;
        int i = 0;
        int j = 0;
        while(i<n){
            while (i>n){
                System.out.print("*");
                n++;
            }
            System.out.print("*");
            n--;

        }
        */
        /*int n = 8;
        int sum = 0;
        for (int i = 1; i<=10; i++){
            sum += n*i;
        }
        System.out.println(sum);
         */
    }
}

