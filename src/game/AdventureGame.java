package game;

import java.util.Scanner;

public class AdventureGame {
    private Scanner scanner;
    private String moving;
    private  String smallEnemy;
    private String largeEnemy;
    private int movement = (int) (Math.random() * 40 + 1);
    static int smallEnemyHealth = 2;
    static int largeEnemyHealth = 4;
    static int healthStim = 0;
    static int yourHealth = 5;
    static int healthstimAmount = 3;
    static int stimPackAfterEnemy = 1;
    static int ourDamageSmallEnemy, ourDamageLargeEnemy,
            largeEnemyDamage, smallEnemyDamage = (int) (Math.random() * 50 + 1);

    //    variables

public AdventureGame() {
    this.scanner = new Scanner(System.in);

}

// end of main variables



//  main method:


    public  void mainAdventureGame() {
        System.out.println("the controls are forward, left, right, back, hit to attack, stim for health, \n" +
                "status for how much health and stim packs you have, and block to block");
        System.out.print("What direction do you want to go? \n");
        moving = scanner.next();
        do {
                forwardAdventureGame();
            if(yourHealth < 1)
            System.out.println("confirm: with yes/no");
            moving = scanner.next();
//            leftAdventureGame();
//            rightAdventureGame();
//            backAdventureGame();
        }while(!moving.equals("run") && !moving.equals("no"));

    }

   private boolean smallDamage = smallEnemyDamage > 1 && smallEnemyDamage < 50;
//   private boolean ourSmallDamage = ourDamageSmallEnemy > 5 && ourDamageSmallEnemy <= 50;

    public void hitSmallEnemyOnForward() {
        do {
                System.out.println("You have encountered a small enemy ATTACK! \n");
                smallEnemy = scanner.next();
            if (smallDamage)
                yourHealth -= 1;
                System.out.println("You've been hit and your health is at " + yourHealth + "\n");
            if(yourHealth < 1) {
                System.out.println("You've been defeated!\n");
                System.out.println("Would you like to continue? \n");
                smallEnemy = scanner.next();
            }
//       else if(ourSmallDamage)
//        smallEnemyHealth -= 2;
//        System.out.println("You defeated the enemy!");
        } while(smallEnemy.equals("hit") || !smallEnemy.equals("no"));


    }

//  moving forward method:

    private boolean forwardSmallEnemy = movement < 40 && movement > 1;
//    private boolean forwardLargeEnemy = movement < 10 && movement > 1;

    public void forwardAdventureGame() {
        do {
            if (forwardSmallEnemy)
                hitSmallEnemyOnForward();
//          else if (forwardLargeEnemy)
//                System.out.println("You have encountered a large enemy! ATTACK!\n");
            else
                System.out.println("Lets keep going where do we go from here? \n");
            moving = scanner.next();
        } while(moving.equals("forward"));
    }






//   moving left method:

//    private boolean leftSmallEnemy = movement < 40 && movement > 30;
//    private boolean leftLargeEnemy = movement < 30 && movement > 20;
//
//    public void leftAdventureGame() {
//        do {
//            if (leftSmallEnemy)
//                System.out.println("you have encountered a small enemy! attack!\n");
//            else if (leftLargeEnemy)
//                System.out.println("You have encountered a large enemy! attack!\n");
//            else
//                System.out.println("Lets keep going where do we go from here? \n");
//            moving = scanner.next();
//        }while(moving.equals("left"));
//    }



//   moving right method:

//    private boolean rightSmallEnemy = movement < 20 && movement > 10;
//    private boolean rightLargeEnemy = movement < 40 && movement > 30;
//
//    public void rightAdventureGame() {
//        do {
//            if (rightSmallEnemy)
//                System.out.println("you have encountered a small enemy! attack!\n");
//            else if (rightLargeEnemy)
//                System.out.println("You have encountered a large enemy! attack!\n");
//            else
//                System.out.println("Lets keep going where do we go from here? \n");
//            moving = scanner.next();
//        }while(moving.equals("right"));
//    }
//
//
////        moving back method:
//
//    private boolean backSmallEnemy = movement < 10 && movement > 1;
//    private boolean backLargeEnemy = movement < 30 && movement > 20;
//
//    public void backAdventureGame() {
//        do {
//            if (backSmallEnemy)
//                System.out.println("you have encountered a small enemy! attack!\n");
//            else if (backLargeEnemy)
//                System.out.println("You have encountered a large enemy! attack!\n");
//            else
//                System.out.println("Lets keep going where do we go from here? \n");
//            moving = scanner.next();
//        }while(moving.equals("back"));
//    }
//
//
//
}