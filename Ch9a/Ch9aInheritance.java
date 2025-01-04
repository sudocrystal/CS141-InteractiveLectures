import java.util.*;

public class Ch9aInheritance {
   public static void main(String[] args) {
      Boss crystal = new Boss("Crystal");
      Employee[] staff = new Employee[3];
      
      for(int i = 0; i < staff.length; i++) {
        staff[i] = new Employee();
      }
      
      System.out.println(Arrays.toString(staff));
      
      Random rand = new Random();
      int luckyDuck = rand.nextInt(staff.length);
      crystal.promote(staff[luckyDuck]);
      
      System.out.println(Arrays.toString(staff));
   }
}
