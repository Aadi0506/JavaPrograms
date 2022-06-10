package com.company;
import java.util.Scanner;

public class Chapter_4_elseif {
    public static void main(String[] args) {
        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        // Switch case statement
        switch (age) {
            case 18:
                System.out.println("You're an adult now!");
                break;
            case 24:
                System.out.println("You should get a job!");
                break;
            case 30:
                System.out.println("You should get married!");
                break;
            case 58:
                System.out.println("You're retired!");
                break;
            default:
                System.out.println("Enjoy your life!");
        }
        /*
        // else-if statement
        if(age>58)
        {
            System.out.println("You're on service retirement, take good care the rest of your life!");
        }
        else if (age>19)
        {
            System.out.println("You're eligible for election!");
        }
        else if (age<18)
        {
            System.out.println("You're not eligible to vote!");
        }
        else
        {
            System.out.println("You're not eligible to vote!");
        }
         */
       //String ripple ="Nikki";
        /*System.out.println("Enter your partner's name:");
        Scanner ab = new Scanner(System.in);
        String name = ab.next();
        if(name.equals("Nikki")){
//            System.out.pintln(a);
            System.out.println("Nikki is your life partner xoxo");
        }
        else {
            System.out.println("This is not your life partner");

        }
         */

    }
}
