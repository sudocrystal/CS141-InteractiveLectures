import java.util.*;
import java.io.*;

public class Ch10bGroceryList {
   
   public static void main(String[] args) throws FileNotFoundException {
      Scanner in = new Scanner(new File("list.txt"));
      Scanner console = new Scanner(System.in);
      
      System.out.println("=== WELCOME TO THE SHOPPING LIST PROGRAM ===\n");
      ArrayList<Item> gList = loadInput(in);
      int choice;
      do {
         printList(gList);
         choice = listChoices(console);
         if(choice == 1)       { count(gList); }
         else if (choice == 2) { add(gList, console); }
         else if (choice == 3) { remove(gList, console); }
         else if (choice == 4) { search(gList, console); }
      } while(choice != 5);
      writeFile(gList);
   }
   
   // create a new ArrayList of Items
   // read all the tokens in list.txt (guaranteed to come in pairs)
   // create a new Item for each pair, 
   // and then add that Item to the list
   public static ArrayList<Item> loadInput(Scanner in) {
      ArrayList<Item> items = new ArrayList<Item>();
      // while(in.hasNext()) {
      //   String name = in.next();
      //   int quantity = in.nextInt();
      //   items.add(new Item(name,quantity));
      // }
      return items;
   }
   
   // print the list according to the specification in the notes
   public static void printList(ArrayList<Item> list) {
      if(list.size() > 0) {
         System.out.println("Your list currently contains: ");
         System.out.println("TODO: COMPLETE THIS TO PRINT ITEMS")
      }
      else {
         System.out.println("Your list is currently empty.");
      }
   }

   // print a statement identifying how many items and total quantity
   // e.g. "There are 8 groups of items on your list for a total of 37 individual items."
   public static void count(ArrayList<Item> list) {
   }
   
   // add an item (name and quantity) to the list
   public static void add(ArrayList<Item> list, Scanner console) {
   }
   
   // allow the user to specify an item by name
   // and remove it from the list
   // do nothing if it's not on the list
   public static void remove(ArrayList<Item> list, Scanner console) {
   }

   // search for an item in the list by name
   // if it appears, say how many need to be purchased
   // if it does not appear, indicate that it isn't on the list
   public static void search(ArrayList<Item> list, Scanner console) {
   }

   // added fun: overwrite list.txt to remember the new list
   public static void writeFile(ArrayList<Item> list) throws FileNotFoundException {
   }

   // this method shows the users the menu options and returns their choice
   public static int listChoices(Scanner console) {
      System.out.println("\n1. Item count");
      System.out.println("2. Add");
      System.out.println("3. Remove");
      System.out.println("4. Search");
      System.out.println("5. Quit");
      System.out.print("\nWhat would you like to do? > ");
      return console.nextInt();
   }
}
