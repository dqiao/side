/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package side;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author deana
 */
public class LightBulbs {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numLightBulbs;
        int numIteration;
        List<Integer> iterationPatternPlace;
        Map<Integer, Boolean> iterationPattern = new HashMap<>();
        Scanner kbd = new Scanner(System.in);

        //Prompt the user for the # of light bulbs
        System.out.println("Please enter the # of lightbulbs (0-20): ");
        numLightBulbs = kbd.nextInt();
        iterationPatternPlace = new ArrayList<>(numLightBulbs);

        //Prompt the user for the # of light bulb iterations
        System.out.println("Please enter the # of lightbulbs to iterate thru: ");
        numIteration = kbd.nextInt();

        while (numLightBulbs >= 21) {
            System.out.println("Please enter a valid # of lightbulbs (0-20): ");
            numLightBulbs = kbd.nextInt();
            iterationPatternPlace = new ArrayList<>(numLightBulbs);
        }
        while (numIteration > numLightBulbs) {
            System.out.println("Please enter a valid # of lightbulbs to iterate thru: ");
            numIteration = kbd.nextInt();
        }

        for (int i = 1; i < iterationPatternPlace.size() + 1; i++) {
            int iterationPlace = i + numIteration;
            boolean iterationVal = false;

            if (i == iterationPlace) {
                iterationVal = true;
                iterationPattern.put(i, iterationVal);
            } else {
                iterationPattern.put(i, iterationVal);
            }

        }

        //Display the result here -- unable to display the results
        //The declaration for loop is wrong to begin with
        System.out.println("Results below: ");
        for(Map.Entry<Integer, Boolean> entry : iterationPattern.entrySet()){
            System.out.println("Test A");
            int key = entry.getKey();
            boolean value = entry.getValue();
            System.out.println("key " + key + " : " + "value" + value);
        }
    }


}
