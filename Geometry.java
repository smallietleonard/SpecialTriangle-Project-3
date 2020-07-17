import java.util.*;



public class Geometry {


  public static void main(String[] args) {
    angle thirty = new angle();
    thirty.sine = .5;
    thirty.cosine = Math.sqrt(3)/2;


    Scanner user_input = new Scanner(System.in);

    System.out.println("\n");

    System.out.println("Here is a database for the trigonometric functions of a very common right triangle.. one whose angles are 30, 60, and 90 degrees.");

    System.out.println("\n");

    
    int answer;
    do {
    System.out.println("\n");
    System.out.println("Which trig function would you like to see?");     
    System.out.println("\n");
        
        String trigChoice = user_input.nextLine();
        
        switch (trigChoice) {
          case "sine":
          System.out.println("\nThe sine of a thirty degree angle is: " + thirty.sine);
          break;
          case "cosine":
          System.out.println("\nThe cosine of a thirty degree angle is: " + thirty.cosine);
          break;
          case "tangent":
          System.out.println("\nThe tangent of a thirty degree angle is: " + thirty.calculateTangent());
          break;
          case "cosecant":
          System.out.println("\nThe cosecant of a thirty degree angle is: " + thirty.calculateSecant());
          break;
          case "secant":
          System.out.println("\nThe secant of a thirty degree angle is: " + thirty.calculateSecant());
          break;
          case "cotangent":
          System.out.println("\nThe cotangent of a thirty degree angle is: " + thirty.calculateCotangent());
          break;
        }
          System.out.println("\nAnother trig function? 1 is yes, 2 is no\n");
          
          answer = user_input.nextInt();
          user_input.nextLine();

          } while (answer < 2);
        //////// End of trig functions code
      
      System.out.println("\n");
      System.out.println("Now that you know a little bit about the trig functions of this particular triangle, let me help you solve for the missing side lenths of one. \nYou need only one side length in order to find the rest but, leave that to me!");

      System.out.println("\n");

      int answerTwo;
      do {
      System.out.println ("In relation to the 30 degree angle, is your side the:\n \nOpposite? Press 1 \nAdjacent? Press 2 \nHypotenuse? Press 3");

      System.out.println("\n");

      double side = user_input.nextDouble();

      if (side == 1) {
        System.out.println("\nHow long is it?");
        double oppositeLength = user_input.nextDouble();
        System.out.println("\nThe length of the Hypotenuse is: " + thirty.sOHForHypotenuse(oppositeLength));
        System.out.println("\nThe length of the adjacent side is: " + Math.sqrt((thirty.sOHForHypotenuse(oppositeLength)*thirty.sOHForHypotenuse(oppositeLength))-(oppositeLength*oppositeLength)));
      }
      else if (side == 2) {
        System.out.println("\nHow long is it?");
        double adjacentLength = user_input.nextDouble();
        System.out.println("\nThe length of the Hypotenuse is: " + thirty.cAHForHypotenuse(adjacentLength));
        System.out.println("\nThe length of the opposite side is: " + Math.sqrt((thirty.cAHForHypotenuse(adjacentLength)*thirty.cAHForHypotenuse(adjacentLength))-(adjacentLength*adjacentLength)));
      }
      else {
        System.out.println("\nHow long is it?");
        double hypotenuseLength = user_input.nextDouble();
        System.out.println("\nThe length of the opposite side is: " + hypotenuseLength/2);
        System.out.println("\nThe length of the adjacent side is: " + thirty.cAHForAdjacent(hypotenuseLength));
        
      }

      System.out.println("\n");

      System.out.println("Would you like to solve for another triangles side lengths? Select 1 for yes or 2 for no\n");

      answerTwo = user_input.nextInt();
      user_input.nextLine();

      } while (answerTwo < 2); //second do while ending curly
    
      System.out.println("\nWell that was fun! See you next time!");

    } ///main string curly brace

  }/// public class curly brace

///////////////angle class

class angle {
  static double sine;
  static double cosine;
//////////////////////////////////// Trig Functions
    double calculateTangent() {
    
    double tangent;

    tangent = sine / cosine;

    return tangent;

  }

  double calculateCotangent() {

    double cotangent;

    cotangent = 1/this.calculateTangent();

    return cotangent;
  }

  static double calculateSecant() {

    double secant;

    secant = 1/cosine;

    return secant;
  }

  static double calculateCosecant() {

    double cosecant;

    cosecant = 1/sine;

    return cosecant;
  }
/////////////////////////// Begin Side Length Stuff

////////////////////////// Sine Stuff
  static double sOHForOpposite(double h) {

    double oppositeLengthWithSine;

    oppositeLengthWithSine = h*.5;

    return oppositeLengthWithSine;    
  }

  static double sOHForHypotenuse(double o) {

    double hypotenuseLengthWithSine;

    hypotenuseLengthWithSine = 2*o;

    return hypotenuseLengthWithSine;
  }
//////////////////////////// Cosine stuff
  static double cAHForAdjacent(double h) {

    double adjacentLengthWithCosine;

    adjacentLengthWithCosine = (Math.sqrt(3)*h)/2;

    return adjacentLengthWithCosine;
  }

  static double cAHForHypotenuse(double a) {

    double hypotenuseLengthWithCosine;

    hypotenuseLengthWithCosine = (2*a)/Math.sqrt(3);

    return hypotenuseLengthWithCosine;
  }


}
