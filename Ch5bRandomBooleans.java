import java.util.Random;

public class Ch5bRandomBooleans {

   public static void main(String[] args) {
      Random r = new Random();
      int x = makeRandNum(r);
      System.out.println("The number generated was " + x);

//       System.out.println("isEven? " + isEven(x) );

//       boolean factor = isFactor(5, x);
//       System.out.println("is 5 a factor of x? " + factor);

//       System.out.println("allSmallDigits? " + allSmallDigits(x) );

//       System.out.println("isReverse? " + isReverse("hello", "olleh") );
   }
   
   // returns a random integer between 1 and 100
   // What if we want a random 4 digit number?
   public static int makeRandNum(Random randGen) {
      return 0;
   }

   // returns true is num is even, false if it's odd
   // e.g. isEven(10) --> true
   // e.g. isEven(-1) --> false
   public static boolean isEven(int num) {
      return false;
   }
   
   // returns true if x is a factor of y (x divides evenly int y)
   // e.g. 3 is a factor of 9
   //      5 is NOT a factor of 9
   // Question: is x here the same as the x in the main?
   // Question: what if x is zero?
   public static boolean isFactor(int x, int y) {
      return false;
   }

   // returns true if all digits are smaller than 5
   // e.g. allSmallDigits(1233) --> true
   // e.g. allSmallDigits(4107) --> false
   // e.g. allSmallDigits(8110) --> false
   public static boolean allSmallDigits(int x) {
      return false;
   }

   // returns true if the strings are reverse of each other
   // e.g. isReverse("hello", "olleh") --> true
   // e.g. isReverse("time", "fine") --> false
   public static boolean isReverse(String s1, String s2) {
      return false;
   }
}
