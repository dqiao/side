import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LightBulbs{

  public static void main(String[] args){
    int numLightBulbs = 0;
    int numIteration = 0;
    List<Integer> iterationPattern;
    Scanner kbd = new Scanner(System.in);

    //Prompt the user for the # of light bulbs
    System.out.println("Please enter the # of lightbulbs (0-20): ");
    numLightBulbs = kbd.nextInt();
    iterationPattern = new ArrayList<Integer>(numLightBulbs);

    //Prompt the user for the # of light bulb iterations
    System.out.println("Please enter the # of lightbulbs to iterate thru: ");
    numIteration = kbd.nextInt();

    while(numLightBulbs >= 21){
      System.out.println("Please enter a valid # of lightbulbs (0-20): ");
      numLightBulbs = kbd.nextInt();
      iterationPattern = new ArrayList<Integer>(numLightBulbs);
    }
    while(numIteration > numLightBulbs){
      System.out.println("Please enter a valid # of lightbulbs to iterate thru: ");
      numIteration = kbd.nextInt();
    }

    for(int i = 1; i < iterationPattern.size()+1; i++){
      int iterationPlace = i + numIteration;
      boolean iterationVal = false;

      if(i == iterationPlace){
        iterationVal = true;
        iterationPattern.put(i, iterationVal);
      }
      else{
        iterationPattern.put(i, iterationVal);
      }

    }

    //Display the result here
    System.out.println("Results below: ");
  }
}
