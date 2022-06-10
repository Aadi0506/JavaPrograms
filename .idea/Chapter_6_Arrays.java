package com.company;

public class Chapter_6_Arrays {
    public static void main(String[] args) {
        //type 1 of Array declaration+memory allocation
       /* int[] marks = new int[4];
        marks[0] = 98;
        marks[1] = 97;
        marks[2] = 88;
        marks[3] = 97;
        System.out.println(marks[3]);
        System.out.println(marks.length);

        //type 2 of Array Declaration + initilize
        int[] marks1 = {98, 92, 89, 94, 87};
        System.out.println(mark s1[3]);
        System.out.println(marks1.length);

        //Array can be a float
        float[] marks2 = {90.8f,91.7f,92.5f,93.8f,94.4f};
        System.out.println(marks2[2]);
        System.out.println(marks2.length);

        //Array can be a String as well
        String[] Student = {"Harry", "Rohan", "Aaditya", "Nikeeta", "Swami"};
        System.out.println(Student[3]);
        System.out.println(Student.length);
        */
        // Diplaying the array (Naive way)
        int[] marks3 = {98, 92, 89, 94, 87};
        System.out.println(marks3[0]);
        System.out.println(marks3[1]);
        System.out.println(marks3[2]);
        System.out.println(marks3[3]);
        System.out.println(marks3[4]);
        // Displaying array using for loop
        System.out.println("Diplaying array using for loop");
        for (int i = 0; i < marks3.length; i++) {
            System.out.println(marks3[i]);
        }//This method is called array traversal
        // Displaying array in reverse order for loop
        System.out.println("Diplaying array using for loop in reverse order");
        for (int i = marks3.length - 1; i >= 0; i--)
            {
            System.out.println(marks3[i]);
            }
        // for each loop
        /*System.out.println("Displaying using for each loop");
        for(int element : marks3){
            System.out.println(element);
         */
    }


}

