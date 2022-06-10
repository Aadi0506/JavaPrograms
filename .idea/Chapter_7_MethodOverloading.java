package com.company;

public class Chapter_7_MethodOverloading {
    static void foo()
    {
        System.out.println("Good morning bro!");
    }
    static void foo(int a)
    {
        System.out.println("Good morning bro! " +a+ " Bro!");//overloaded function
    }
    static void foo(int a, int b)
    {
                System.out.println("Good morning bro! " +a+ " Bro!");
                System.out.println("Good morning bro! " +b+ " Bro!");
    }

//    static void change(int a){
//        a=88;
//    }
//    static void change1(int[] arr)
//    {
//        arr[2]=98;
//    }
    /*static void telljoke(){
        System.out.println("I invented a new world\n" +"Plagiarism");
    }
    public static void main(String[] args) {
    telljoke();
    }
     */
    public static void main(String[] args) {
//       case 1 :  changing the integer
//        int a = 45;
//        change(a);
//        System.out.println("The value of a after running change is " +a);
//        case 2 : Changing the array
//        int [] marks = {52,73,77,89,98,94};
//        change1(marks);
//        System.out.println("The value of arr after running change is: " +marks[2]);

        //METHOD OVERLOADING
        foo();
        foo(3000);
        foo(5,6);
        //arguments are actual!

        }
    }

