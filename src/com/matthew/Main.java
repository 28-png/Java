package com.matthew;
import java.awt.*;
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
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
    }
}
