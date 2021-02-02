/*
Lab 4
Partners: Jamie Schaffer and
Date: turn in date
*/

import java.util.Random;

class Main {
  public static void main(String[] args) {
    Random r = new Random();
    int randomNum = r.nextInt(50)+1;
    System.out.println("The Random number is: " + randomNum);

    int originalRandomNum = randomNum;

     while (randomNum >= 0) {System.out.println(randomNum); randomNum--;} 
    
    if (originalRandomNum <= 5) {
      System.out.println("Ahoy mateys!");
    }
    else if (originalRandomNum > 25 && originalRandomNum < 42) {
      System.out.println("Cannonball!");
    }
    else {System.out.println("Blast off!");}
  }
}