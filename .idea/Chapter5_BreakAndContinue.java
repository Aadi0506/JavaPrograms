package com.company;

public class Chapter5_BreakAndContinue {
    public static void main(String[] args) {
        //break and continue using loops
        /*for (int i=0; i<5; i++){
            System.out.println("Java is great!");
            System.out.println(i);
            if(i==2){
                System.out.println("Ending the loop");
                break;
            }
        }
         */
        for (int a=0; a<5; a++){
            if(a==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(a);
            System.out.println("Java is great");
        }
    }
}
