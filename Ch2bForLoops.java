public class Ch2bForLoops {
   public static void main(String[] args) {
      dotBox();
      dotNumBox();
      dollarFigure();
      dollarFigure2();
   }

   /*
      This method creates a box made out of periods (5 x 4)
      ....
      ....
      ....
      ....
      ....
      How do we make this dot-box longer? wider?
      How could we print the line number at the front of each row?
   */
   public static void dotBox() {
      for(int line = 1; line <= 5; line++) {
         for(int dot = 1; dot <= 4; dot++) {
            System.out.print(".");
         }
         System.out.println();
      }
   }

   // This method shows how to systematically produce repetitive ASCII art
   /*
   .......1
   ......2
   .....3
   ....4
   ...5
   ..6
   .7
   8
   */
   public static void dotNumBox() {
   }

   // This is Exercise 2.22 which produces:
   /* (size is 7)
      $$$$$$$**************$$$$$$$
      **$$$$$$************$$$$$$**
      ****$$$$$**********$$$$$****
      ******$$$$********$$$$******
      ********$$$******$$$********
      **********$$****$$**********
      ************$**$************
   */
   public static void dollarFigure() {
   }

   // This is Exercise 2.23 which is a scalable version of Ex 2.22:
   /* (size is 3)
      $$$******$$$
      **$$****$$**
      ****$**$****
   */
   public static void dollarFigure2() {
   }
}
