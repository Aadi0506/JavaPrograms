package com.company;

public class Chapter_6_PracticeSet {
    public static void main(String[] args) {
        //Problem 1 create array of 5 floats and calculate their sum
        /*float marks[] = {50.3f, 45.5f, 67.4f, 63.2f, 100.0f};
        float sum = 0;
        for(float element:marks)
        {
            sum = sum + element;
        }
        System.out.println("The value of sum is " +sum);
         */
        //WAP to find whether a given integer is present in an array or not
        /*float marks1[] = {50.3f, 45.5f, 67.4f, 63.2f, 100.0f};
        float num = 63.2f;
        boolean IsInArray = false;
        for (float element : marks1) {
            if (num == element) {
                IsInArray = true;
                break;
            }
        }
        if (IsInArray) {
            System.out.println("Number is present in the array");
        } else {
            System.out.println("Number is not present in the array");
        }
         */
//WAP calculate the average marks from an array containing marks of all students in physics using for loop
        /*float marks3[] = {50.3f, 45.5f, 67.4f, 63.2f, 100.0f};
        float sum = 0;
        for (float element : marks3) {
            sum = sum + element;
        }
        System.out.println("The sum of average marks is " + sum / marks3.length);
         */
//WAP to add two matrices of size 2x3
        /*int[][] mat1 = {{2, 4, 5},
                        {3, 6, 9}};
        int[][] mat2 = {{3, 5, 3},
                        {5, 2, 3}};
        int[][] result = {{0, 0, 0},
                          {0, 0, 0}};
        for (int i = 0; i < mat1.length; i++) {//row number of times
            for (int j = 0; j < mat1[i].length; j++) {//column number of times
                System.out.format("Setting values for i=%d and j=%d\n", i, j);
            }
        }
        for (int i = 0; i < mat1.length; i++) {//row number of times
            for (int j = 0; j < mat1[i].length; j++) {//column number of times
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println(" ");//prints new line
        }
         */
//WAP to reverse an array
        int [] arr1= {1,2,3,45,51,67};
        /*int n = Math.floorDiv(arr.length,2);
        int temp;
        int l = arr.length;
        for (int i = 0; i < n; i++){
            //|3| |4| |temp|
            // a   b   temp
            temp = arr1[i];
            arr1[i] = arr1[l-i-1];
            arr1[l-1-i] = temp;
         */
        /*for(int i=0; i < arr.length;i++){
            System.out.print(arr1s[i] +" ");

         */

        /*for(int i=arr1.length-1; i>=0; i--) {//using for loop to print an elements in reverse order
            System.out.print(arr1[i] + " ");
        }
        for(int element:arr){//using for each loop to print numbers of an array
            System.out.print(element +" ");
        }
         */
// WAP to find maximum element in an array
        /*int max = 0;
        for(int element:arr){
            if(element>max){
                max = element;
            }
        }
        System.out.println("The maximum value of element present in the array is: " +max);
         */
//WAP to find minimum in an array
        /*int min = Integer.MAX_VALUE;
        for(int element:arr){
            if(element<min){
                min = element;
            }
        }
        System.out.println("The minimum value present in an array is: " +min);
        */
//WAP to find whether an array is sorted or not
        /*int [] arr= {1,2,3,45,51,67};
        boolean IsSorted = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                IsSorted = false;
                break;
            }
        }
        if(IsSorted) {
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }
         */
    }

}

