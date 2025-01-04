import java.util.*;

public class Tester {
   public static void main(String[] args) {
      Employee em = new Employee();
      System.out.println("\n\nDefault Employee = " + em);
      printInfo(em);
      
//       Employee ricco = new Employee("Ricco");
//       System.out.println("\n\nEmployee ricco = " + ricco);
//       printInfo(ricco);
   }
   
   private static void printInfo(Employee person) {
      System.out.println("ID: " + person.getID());
      System.out.println("Name: " + person.getName());
      person.showHours();
      person.showSalary();
      person.showVacation();
      person.applyForVacation();
   }
}
