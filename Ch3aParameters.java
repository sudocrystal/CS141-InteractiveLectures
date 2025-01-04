public class Ch3aParameters {

   public static void main(String[] args) {
      // Giving information to a method:
      // calling a method with different arguments
      love("naps", "sunrises", "vacation");
      love("dogs", "lattes", "Netflix");
//       love("homework", 200);
  
      // Getting information from a method:
      // how to return information from a method
//       double value = 14;
//       System.out.println("Value starts out as " + value);
//       add10(value);
//       System.out.println("After method, value is " + value + "\n");

//       findC(3, 4);

      //sillyString("Shoreline");
      //sillyString("Hello World");
   }
   
   // this method prints out three items that are loved
   // What happens if the order of the parameters is changed?
   // What happens if you try to call this method without 3 arguments?
   public static void love(String fave1, String fave2, String fave3) {
      System.out.print("I love:");
      System.out.print("\t1. " + fave1);
      System.out.print("\t2. " + fave2);
      System.out.print("\t3. " + fave3);
      System.out.println();
   }
   
   // this method overloads "love" for 2 parameters
   public static void love(String fave, int num) {
      System.out.println("I love " + fave + " " + num + " times more than anything else in the world!");
      System.out.println();
   }

   // this method adds 10 to the parameter value
   public static void add10(double val) {
      val += 10;
      System.out.println("Inside method, value is " + val);
   }
   
   // uses pythagoeran's theorem to solve for c
   // Pythagoras theorem states that " In a right-angled triangle, 
   // the square of the hypotenuse side is equal to 
   // the sum of squares of the other two sides ". 
   // a^2 + b^2 = c^2 which means c = squareroot(a^2 + b^2)
   public static void findC(int a, int b) {
      System.out.println("Given, a = " + a + " and b = " + b + ":");
      
      System.out.println("       c =  \n");
   }
   
   // This method prints out information about a given String
   public static void sillyString(String str) {
      System.out.print("Given the string: ");
      System.out.println(str);
      System.out.print("First letter: ");
      System.out.println();
      System.out.print("Last letter: ");
      System.out.println();
      System.out.print("Everything but the first and last letters: ");
      System.out.println();
      System.out.print("In all caps: ");
      System.out.println();
      System.out.print("In all lowercase: ");
      System.out.println();
      System.out.print("Is " + str + " equal to \"Hello World\"? ");
      System.out.println();
      System.out.print("Index of \"d\"? ");
      System.out.println();
      System.out.println();
   }
}
