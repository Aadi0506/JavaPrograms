package com.company;
import java.util.Scanner;

public class Chapter5_Java_loops {
    public static void main(String[] args)
    {
        //while loop
//WAP to print natural numbers from 100 to 200
        /*int i = 100;
        System.out.println("Natural numbers from 100 to 200");
        while(i<=105) {
            System.out.println(i);
            i++;
        }
         */
        //do-while loop
//WAP to print first n natural numbers using do while loop
        /*int a = 1;
        System.out.println("First 10 natural numbers:");
        do{
            System.out.println(a);
            a++;
        }while (a<=10);
         */
        //for loop
// WAP to print first n odd numbers using for loop
       /* System.out.println("Enter number of odd numbers you would like to print:");
//        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        for (int i=0; i<b; i++)
        {
            System.out.println(2*i+1);
        }
        */
        //decrementing for loop
        /*for (int i=5; i>=1; i--){
            System.out.println(i);
         */
//WAP to print first n natural numbers in reverse order
       System.out.println("Enter number to be calculated in reverse order");
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i>0; i--)
        {
            System.out.println(i);
        }

        }
    }
