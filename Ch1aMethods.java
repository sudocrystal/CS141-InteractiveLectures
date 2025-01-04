public class Ch1aMethods {
   public static void main(String[] args) {
      System.out.println("This println is executed from the main.");
      //doSomething();
      //drawCone();
      //drawBox();
   }

   // this method will help us explore print vs println
   public static void doSomething() {
      System.out.println("Hello world!");
      System.out.print("Goodbye!");
      System.out.print("Where will this line show up?");
      System.out.println("Another line \\\\\\ of output");
      System.out.println();
      System.out.println("blank \"line\" above");
   }

   // this method draws a single ascii box
   public static void drawBox() {
      System.out.println("+------+");
      System.out.println("|      |");
      System.out.println("|      |");
      System.out.println("+------+");
   }

   // this method draws a single ascii cone
   public static void drawCone() {
      System.out.println("   /\\");
      System.out.println("  /--\\");
      System.out.println(" /----\\");
      System.out.println("/------\\");
   }
}
