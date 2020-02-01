package game;

import java.util.Scanner;

public class AdventureGame {

    //    variables

    static Scanner scanner = new Scanner(System.in);

    static String moving, smallEnemy, largeEnemy;

    static int smallEnemyHealth = 2;

    static int largeEnemyHealth = 4;

    static int yourHealth = 5;

    static int healthStim = 0;

    static int healthstimAmount = 3;

    static int stimPackAfterEnemy = 1;

    static int movement = (int) (Math.random() * 40 + 1);

    static int ourDamageSmallEnemy, ourDamageLargeEnemy,
            largeEnemyDamage, smallEnemyDamage = (int) (Math.random() * 50 + 1);

// end of main variables



//  main method:


    public static void mainAdventureGame() {
        System.out.println("the controls are forward, left, right, back, hit to attack, stim for health, \n" +
                "status for how much health and stim packs you have, and block to block");
        System.out.print("What direction do you want to go? \n");
        moving = scanner.next();
        do {
            forwardAdventureGame();
            leftAdventureGame();
            rightAdventureGame();
            backAdventureGame();
        }while(!moving.equals("run"));




    }

//  moving forward method:

    static boolean forwardSmallEnemy = movement < 20 && movement > 10;
    static boolean forwardLargeEnemy = movement < 10 && movement > 1;

    public static void forwardAdventureGame() {
        do {
            if (forwardSmallEnemy)
                System.out.println("you have encountered a small enemy! attack!\n");
            else if (forwardLargeEnemy)
                System.out.println("You have encountered a large enemy! attack!\n");
            else
                System.out.println("Lets keep going where do we go from here? \n");
            moving = scanner.next();
        } while(moving.equals("forward"));
    }

//

    public static void hitSmallEnemyOnForward() {

    }



//   moving left method:

    static boolean leftSmallEnemy = movement < 40 && movement > 30;
    static boolean leftLargeEnemy = movement < 30 && movement > 20;

    public static void leftAdventureGame() {
        do {
            if (leftSmallEnemy)
                System.out.println("you have encountered a small enemy! attack!\n");
            else if (leftLargeEnemy)
                System.out.println("You have encountered a large enemy! attack!\n");
            else
                System.out.println("Lets keep going where do we go from here? \n");
            moving = scanner.next();
        }while(moving.equals("left"));
    }



//   moving right method:

    static boolean rightSmallEnemy = movement < 20 && movement > 10;
    static boolean rightLargeEnemy = movement < 40 && movement > 30;

    public static void rightAdventureGame() {
        do {
            if (rightSmallEnemy)
                System.out.println("you have encountered a small enemy! attack!\n");
            else if (rightLargeEnemy)
                System.out.println("You have encountered a large enemy! attack!\n");
            else
                System.out.println("Lets keep going where do we go from here? \n");
            moving = scanner.next();
        }while(moving.equals("right"));
    }


//        moving back method:

    static boolean backSmallEnemy = movement < 10 && movement > 1;
    static boolean backLargeEnemy = movement < 30 && movement > 20;

    public static void backAdventureGame() {
        do {
            if (backSmallEnemy)
                System.out.println("you have encountered a small enemy! attack!\n");
            else if (backLargeEnemy)
                System.out.println("You have encountered a large enemy! attack!\n");
            else
                System.out.println("Lets keep going where do we go from here? \n");
            moving = scanner.next();
        }while(moving.equals("back"));
    }



}