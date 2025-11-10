import java.util.*;

public class Ch7aArrays {
   public static void main(String[] args) {
      arrayFundamentals();

      // Random rand = new Random();
      // int[] values = //TODO: create an array to hold 5 ints
      // //TODO: assign random values 10-20 to each element in the array
      // System.out.println("values = " + values);

      // System.out.println("Count of neg = " + countNeg(values));

      // makePositive(values);
      // System.out.println("values = " + Arrays.toString(values));

      //double[] decimals = makeDecimalArray(rand);
      //System.out.println("decimals = " + Arrays.toString(decimals));

      // System.out.println("Min value = " + findMin(decimals));

      // String[] words1 = {"apple","pear"};
      // String[] words2 = {"apple","pear"};
      // String[] words3 = {"apple","orange"};
//       System.out.println(Arrays.toString(words1) + " == " + Arrays.toString(words2)
//                           + "? \t\t" + areEqual(words1, words2));
//       System.out.println(Arrays.toString(words2) + " == " + Arrays.toString(words3)
//                           + "? \t" + areEqual(words2, words3));
   }

   public static void arrayFundamentals() {
   }

   // returns a count of the negative numbers in the array
   public static int countNeg(int[] arr) {
      return 0;
   }

   // make all negative values positive
   public static void makePositive(int[] arr) {
   }

   //return an array of 10 random decimals
   public static double[] makeDecimalArray(Random r) {
      // create an array to hold 10 doubles
      // assign each element a random number 0.0 - 999.9
      // return the array
      return null;
   }

   // returns the smallest vlalue in the array
   public static double findMin(double[] arr) {
      return 0.0;
   }

   // returns true if the lists contain exactly the same items
   // returns false otherwise
   public static boolean areEqual(String[] list1, String[] list2) {
      return Arrays.equals(list1,list2);
   }      
}
