package com.company;
import java.util.Scanner;

public class TakingInputFromUser {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int a = s.nextInt();
        System.out.println("Enter number 2:");
        int b = s.nextInt();
        int sum = a+b;
        System.out.println("The sum of these numbers is:");
        System.out.println(sum);

//        String str = s.next();
//       System.out.println(str);
//        boolean b1 = s.hasNextInt();
//        System.out.println(b1);

    }
}
