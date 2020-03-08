import java.util.Random;

/**
 * Class RandomNumbers.
 * Generates 10 random numbers between 1-99, outputs min and max.
 * @author  BenHilderman
 * @version 1.0
 * @since 2020-03-05 
 */

public class RandomNumbers {

  // Variables
  static int min = 100;
  static int max = 0;

  /**
   * Random numbers generator.
   */

  public static void main(String[] args) {
    // Output 10 random ints
    int[] arrayRandom = new int [10];

    for (int x = 0; x < arrayRandom.length; x++) {
      // Random int array between 1-100
      Random randomNumber = new Random();
      arrayRandom[x] = randomNumber.nextInt(100) + 1;

    }

    for (int i = 0; i < arrayRandom.length; i++) {

      System.out.println(arrayRandom[i]);

      // If int is smaller than min, replace it.
      if (arrayRandom[i] < min) {
        min = arrayRandom[i];

      }

      // If int is bigger than max, replace it.
      if (arrayRandom[i] > max) {
        max = arrayRandom[i];

      }

    }
    // Ouput min of random generator
    System.out.println("Min: " + min);

    // Ouput max of random generator
    System.out.println("Max: " + max);
    
  }

}