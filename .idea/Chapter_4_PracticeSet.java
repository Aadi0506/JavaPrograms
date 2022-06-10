package com.company;
import java.util.Scanner;

public class Chapter_4_PracticeSet {
    public static void main(String[] args) {
        //problem 1
        /*int a = 11;
        if(a == 11){
            System.out.println("I am 11");
        }
        else {
            System.out.println("I am not 11");
        }
         */
        // problem 2
       /* byte S1 , S2 , S3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for Physics\t :");
        S1 = sc.nextByte();
        if(S1>100){
            System.out.println("Marks should not exceed 100.");
        }
        else{
            System.out.println("Continue entering marks");
        };

        System.out.println("Enter marks for Chemistry\t :");
        S2 = sc.nextByte();
        if(S2>100){
            System.out.println("Marks should not exceed 100.");
        }
        else{
            System.out.println("Continue entering marks");
        }

        System.out.println("Enter marks for Mathematics\t :");
        S3 = sc.nextByte();
        if(S3>100){
            System.out.println("Marks should not exceed 100.");
        }
        else{
            System.out.println("Continue entering marks");
        }

        float avg = (S1+S2+S3)/3.0f;

        System.out.println("Your subjects percentage is:" +avg);
        if(avg>40 && S1>=33 && S2>=33 && S3>=33){
            System.out.println("Congratulations you have been promoted!");
        }
        else{
            System.out.println("Sorry, you have not been promoted, please try next time.");
        }
        */
        //Problem 3 Calculate income tax paid by an employee to the government as per the stats mentioned
        // 2.5L-5L tax 5%, 5-10L tax 20%, above 10L tax 30%

        /*float tax = 0;
        System.out.println("Enter employee income in lakhs per annum:");
        Scanner sc = new Scanner(System.in);
        float income = sc.nextFloat();
        if(income<2.5f)
        {
            tax = tax + 0;
        }
        else if (income>2.5f && income <=5.0f)
        {
            tax = tax * 0.05f * (income - 2.5f);
        }
        else if (income > 5.0f && income <10.0f)
        {
            tax = tax * 0.2f * (income - 5f);
            tax = tax * 0.05f * (5.0f - 2.5f);
        }
        else if (income >=10.0f)
        {
            tax = tax * 0.2f * (income - 5f);
            tax = tax * 0.05f * (5.0f - 2.5f);
            tax = tax * 0.3f * (income - 10.0f);
        }
        System.out.println("Total tax paid by an employee is:" +tax);
         */
        //Problem 4 :  WAP to find day of the week given the number 1 for Monday, 2 for Tuesday and so on......
        /*System.out.println("Enter your number:");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch(day){
            case 1 :
                System.out.println("Day is Sunday!");
                break;
            case 2 :
                System.out.println("Day is Monday");
                break;
            case 3 :
                System.out.println("Day is Tuesday");
                break;
            case 4:
                System.out.println("Day is Wednesday");
                break;
            case 5:
                System.out.println("Day is Thursday");
                break;
            case 6 :
                System.out.println("Day is Friday");
                break;
            case 7 :
                System.out.println("Day is Saturday");
                break;
        }
         */
    //Problem 5 WAP to find whether a year entered by user is a leap year or not
       /* System.out.println("Enter your year to be checked:");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        switch(year){

        }
        */
//WAP to find if website is .com = commercial,.org = organisation or .in = Indian
        /* System.out.println("Enter you input:");
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".com"))
        {
            System.out.println("Enter website is commercial");
        }
        else if (website.endsWith(".org"))
        {
            System.out.println("Entered website in organisational");
        }
        else if (website.endsWith(".in"))
        {
            System.out.println("Entered website in Indian");
        }
         */

    }
}
