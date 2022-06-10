package com.company;

public class Chapter_7_MethodsInJava {
    static int logic(int x, int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        x=45;//Does not affect the values in main method this method logic stores copies of a and b from main method
        return z;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        c = logic(a,b);
        //method invocation using object creation
        //If static method is not created we can call creating an object
        //Chapter_7_MethodsInJava obj = new Chapter_7_MethodsInJava();
        //obj.logic(a, b) method to call logic
        //System.out.println(c);
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
