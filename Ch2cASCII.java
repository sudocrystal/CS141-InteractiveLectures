public class Ch2cASCII {

   public static void main(String[] args) {
      //numberTri();
      //hourglass();
   }
   
   /* This method should produce the following
      |""""""""""|       // helpful hints: 10 quotes
       \::::::::/        //      1 space,  8 colons 
        \::::::/         //      2 spaces, 6 colons
         \::::/          //      3 spaces, 4 colons
          \::/           //      4 spaces, 2 colons
           ||            //      5 spaces before ||
          /::\           //      4 spaces, 2 colons
         /::::\          //      3 spaces, 4 colons
        /::::::\         //      2 spaces, 6 colons
       /::::::::\        //      1 space,  8 colons
      |""""""""""|       //                10 quotes
   */
   public static void hourglass() {
      line();
      top();
      middle();
      bottom();
      line();
   }
   
   public static void line() {
      System.out.print("|");
      // TODO: the following two lines need editing
      for(int quote = 1; quote <= 1; quote++) {
         System.out.print("");
      }
      System.out.println("|");
   }
   
   public static void top() {
   }
   
   public static void middle() {
      // TODO: the following two lines need editing
      for(int space = 1; space <= 1; space++) {
         System.out.print("");
      }
      System.out.println("||");
   }
   
   public static void bottom() {
   }

   /* This method should produce the following
      -----1-----
      ----222----
      ---33333---
      --4444444--
      -555555555-
   */
   public static void numberTri() {
   }
}
