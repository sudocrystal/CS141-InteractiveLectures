//import java.awt.Point;
import java.util.*;

public class Ch8aOOP {
   public static void main(String[] args) {
      Point one = new Point(1, 3);
      Point two = new Point(2, 8);
      
      System.out.println("one = " + one + ", two = " + two);
      
      System.out.println("one = " + one + ", two = " + two);
   }
   
   public static void pointsAreObjects(Point first, Point second) {
      System.out.println("\tSTART: first = " + first + ", second = " + second);
      
      System.out.println("\t  END: first = " + first + ", second = " + second);
   }
}
