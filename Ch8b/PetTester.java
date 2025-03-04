import java.util.*;

public class PetTester {
   public static void main(String[] args) { 
      Pet p = new Pet("Red", "Bird", "Parrot", "");
      System.out.println("AT CREATION = " + p);

      System.out.println("Change name");
      System.out.println("Access name only = ");
      
      System.out.println("AFTER CHANGES = " + p);
      
      //Pet[] pets = new Pet[5];
      //System.out.println(Arrays.toString(pets));
   }
}