package com.matthew;
import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        you can reassign these are all primitive types
//        byte age = 30;
//        when using long even though it is over 3 billion you have to specify with a L at the end of it
//        long viewCount = 3_123_456_678L;
//        it is the same with float
//        float price = 10.99F;
//        char is a single letter and str is several
//       char letter = 'A';
//        boolean isEligible = true;
//        everything else is reference types they work with complex objects you have to allocate memory with reference types
//        reference types when reassigned are not independent of each other
//        Date now = new Date();
//        System.out.println(now);
//        Point point1 = new Point(1, 1);
//        Point point2 = point1;
//        point1.x = 2;
//       System.out.println(point2);
//      this is an old way of doing arrays.
//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;

//        System.out.println(Arrays.toString(numbers));

//        int[] numbers = {1, 2, 3, 4, 5};
//
//        System.out.println(Arrays.toString(numbers));

// for multi-dimensional Arrays in multi-dimensional Arrays you have to use deepToString to print the output otherwise
//        you get the memory location.

//        int[][] numbers = {{1, 2, 3}, {4, 5, 6}};
//        System.out.println(Arrays.deepToString(numbers));

//        to create a constant much like in ES6 we use final in front of the variable you will not be able to reassign after.
//      for constants we use all caps.
//        final float PI = 3.14F;

//        when using division, if you divide two whole numbers it will return a whole number in order to get a
//        floating number you need to put a double in parens in front of each number.

//        double result = (double)10 / (double)3;
//
//        System.out.println(result);

// for incrementing if the increment operator is applied as a post fix first the value of x will be copied
// to y then x will be incremented by 1 so x will be 2 and y will be 1 otherwise if x is pre
// incremented both will be two

//        int x = 1;
//        int y = x++;
//        System.out.println(x);
//        System.out.println(y);

//implicit casting
//        byte > short > int > long > float > double

//        if we want to use both double and int we have to explicitly cast the result if you want a whole number.

//        double x = 1.1;
//       int y = (int)x + 2;
//        System.out.println(y);

//       if you want to use a string:

//        String x = "1";
//        int y = Integer.parseInt(x) + 2;
//        System.out.println(y);

//        if you want a floating string:

//        String x = "1.1";
//        double y = Double.parseDouble(x) + 2;
//        System.out.println(y);

// the Math class:
//        Math.round() has two methods one returns a int the other a long this is how you specify the return:

//      int result = Math.round(1.1F);
//        System.out.println(result);


//        int result = (int)Math.ceil(1.1F);
//        System.out.println(result);

//        int result = (int)Math.floor(1.1F);
//        System.out.println(result);

// abstract classes: to create new class we will use getCurrencyInstance() because new NumberFormat does not work on
// abstract classes. for percents we will use getPercentInstance()

//      NumberFormat currency = NumberFormat.getCurrencyInstance();
//
//      String result = currency.format(1234567.891);
//        System.out.println(result);

//       NumberFormat percent = NumberFormat.getPercentInstance();
//
//      String result = percent.format(0.1);
//        System.out.println(result);

//        you can method chain like so:


//      String result = NumberFormat.getCurrencyInstance().format(0.1);
//        System.out.println(result);


//        how to read inputs from the user:
//        there is a scanner method when using scanner you need to specify where you want to read the inputs
//        from. to read from the terminal you use the param of System.in to stay on the same line you use print
//        instead of println

//        Scanner scanner = new Scanner(System.in);
//       System.out.print("Age: ");
//        byte age = scanner.nextByte();
//        System.out.println("You are " + age);

//        to print a string we simply use next with nothing after it.
//        if you wanted to use the first and last name you need to use nextLine()
//        to get rid of white space we use trim()

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Name: ");
//        String name = scanner.nextLine().trim();
//        System.out.println("You are " + name);

//        comparison operators in Java same as javascript.

//        if statements in Java same as javascript

//        Scanner scanner2 = new Scanner(System.in);
//        System.out.print("number: ");
//        int number = scanner2.nextInt();
//        if(number % 5 == 0 && number % 3 == 0)
//            System.out.println("FizzBuzz");
//        else if(number % 5 == 0)
//            System.out.println("Fizz");
//        else if(number % 3 == 0)
//            System.out.println("Buzz");
//        else
//            System.out.println(number);

// Loops in Java: a good usage for while loops is if you dont know how long the input from the user is

//        Scanner scanner3 = new Scanner(System.in);
//        String input = "";
//        while (!input.equals("quit")) {
//            System.out.print("Input: ");
//            input = scanner3.next().toLowerCase();
//            if(input.equals("quit"))
//                break; // break breaks the loop so quit will not be printed back continue brings control to
//            // the beginning of a statement.
//            System.out.println(input);
//        }


//        for each loops in Java

//        String[] fruits = {"mango", "orange", "apple"};
//
//        for(String fruit : fruits)
//            System.out.println(fruit);












//        Mortgage Project
//        Mortgage project revisited.
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        int principle = 0;
        int numberOfPayments = 0;
        float monthlyIntRate = 0;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Principle ($1k-$1M): ");
             principle = scanner.nextInt();
       if(principle >= 1000 && principle <= 1_000_000)
           break;
            System.out.println("Must be between $1000 and $1M");
        }

        while(true) {
            System.out.print("Annual Interest Rate: ");
            float annualInterestRate = scanner.nextFloat();
            if(annualInterestRate >= 1 && annualInterestRate <= 30) {
                monthlyIntRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        while(true) {
            System.out.print("Period (Years): ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }


                double mortgage = principle
                        * (monthlyIntRate * Math.pow(1 + monthlyIntRate, numberOfPayments))
                        / (Math.pow(1 + monthlyIntRate, numberOfPayments) - 1);

                String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
                System.out.println("Mortgage: " + mortgageFormatted);










   }
}
