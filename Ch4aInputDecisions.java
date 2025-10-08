import java.util.Scanner;

public class Ch4aInputDecisions {
   public static void main(String[] args) {
      repeatWord();

//       // creates a Scanner object called console for User Input
//       Scanner console = new Scanner(System.in);
//       learningUserInput(console);

//       repeatWord(console);
      
//       learningIfStatements();

//       double finalPoints = calcGrade(console);
//       System.out.println("Expected Total Points: " + finalPoints);

//       double finalGpa = calcGPA(finalPoints);
//       System.out.println("Expected GPA: " + finalGpa);
   }

   // takes a word and a number 
   // prints the word to the screen that number of times
   /* repeat("balloon", 3) should produce: 
      balloon
      balloon
      balloon
   */
   // extension: what if "returns"?
   public static void repeatWord() {
   }

   // This method shows how to do user input in Java
   public static void learningUserInput(Scanner console) {
   }
   
   // prompts for a word and a number
   // prints the word to the screen, one letter per line, all caps
   /* repeatWord(console) where the user types in "try" and 3 should produce: 
      TTT
      RRR
      YYY
   */
   public static void repeatWord(Scanner console) {
   }

   // This method shows how to write if-statements in Java
   public static void learningIfStatements() {
   }
   
   // prompts for total points earned in the following 3 categories:
   // Practice, Programs, Exams
   // returns all points added together
   // TODO: calcGrade METHOD
   
   // takes a points as a parameter 
   // returns the calculated gpa, according to the following:
   //    >= 95 points is a 4.0
   //    < 95 and >= 94 is a 3.9
   //    else return 2.0 for this example 
   // TODO: calcGPA METHOD
}
