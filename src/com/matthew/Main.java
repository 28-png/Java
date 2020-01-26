package com.matthew;
import java.awt.*;
import java.util.Arrays;
import java.util.Date;
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
        String x = "1.1";
        double y = Double.parseDouble(x) + 2;
        System.out.println(y);





















   }
}
