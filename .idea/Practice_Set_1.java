package com.company;
import com.sun.org.apache.bcel.internal.generic.FSUB;

import java.util.Scanner;

public class Practice_Set_1 {
    public static void main(String[] args) {
        float totalmarks = 500.0f;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subjects to be calculated:");
        float sub = sc.nextFloat();
        System.out.println("Enter Subject 1 marks : ");
        float subject1 = sc.nextFloat();
        System.out.println("Enter Subject 2 marks : ");
        float subject2 = sc.nextFloat();
        System.out.println("Enter Subject 3 marks : ");
        float subject3 = sc.nextFloat();
        System.out.println("Enter Subject 4 marks : ");
        float subject4 = sc.nextFloat();
        System.out.println("Enter Subject 5 marks : ");
        float subject5 = sc.nextFloat();
        float b = ((subject1+subject2+subject3+subject4+subject5)*100/totalmarks);
        System.out.println("Percentage is : ");
        System.out.println(b);
    }
}
