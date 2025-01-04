import java.util.Scanner;

public class Ch5aFencepostAndWhile {

   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);

      fencepost(10);
      whileAndDoWhile(console);   
//       System.out.println("firstDigit(1234) = " + firstDigit(1234) );
//       System.out.println("firstDigit(-910) = " + firstDigit(-910) );
//       showTwos(18);
//       showTwos(120);
   }

   // This method demonstrates fencepost problems
   public static void fencepost(int n) {
      for(int i = 1; i <= n; i++) {
         System.out.print(i);
      }
      System.out.println();
   }

   // This method demonstrates while and do while loops
   public static void whileAndDoWhile(Scanner console) {
   }

   // returns the first digit of a number
   // e.g. firstDigit(1234) --> 1
   // e.g. firstDigit(-910) --> 9
   public static int firstDigit(int num) {
      return 0;
   }

   // prints a summary of the factors of two for a given number
   // logic is: divide number by 2 until you reach an odd number
   // e.g. showTwos(18) --> prints "18 = 2 * 9"
   // e.g showTwos(120) --> prints "120 = 2 * 2 * 2 * 15"
   // What if returns?
   public static void showTwos(int num) {
   }
}
