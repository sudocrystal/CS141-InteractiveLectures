/*
  This program uses real data from data.gov to populate a "database"
  of information about the regitered Pets in Seattle!

  Original Data here:
  https://catalog.data.gov/dataset/seattle-pet-licenses
*/

import java.util.*;
import java.io.*;

public class Ch8bMoreOOP {

   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(new File("Seattle_Pet_Licenses.csv"));
      Pet[] petDB = loadInput(input);
      System.out.println(Arrays.toString(petDB));
      System.out.printf("%d (out of %d) null entries found.\n\n", countNull(petDB), petDB.length);

      String lookupName = "Love";
      int count = findByName(petDB, lookupName.toLowerCase());
      System.out.printf("%s was found %d times in the database.", lookupName, count);
   }

   public static int findByName(Pet[] db, String name) {
      int count = 0;
      for(int i = 0; i < db.length; i++) {
         if(db[i] != null && db[i].getName().toLowerCase().contains(name)) {
            count++;
            System.out.println(db[i]);
         }
      }
      return count;
   }
   
   // This method counts the null elements in the array which 
   // are the result of dumping dirty data (all nulls at end)
   public static int countNull(Pet[] db) {
      int count = 0;
      for(Pet pet : db) {
         if(pet == null) {
            count++;
         }
      }
      return count;
   }

   // This method loads all the data from Seattle_Pet_licenses.csv
   // All dirty data is dumped rather than cleaned
   public static Pet[] loadInput(Scanner in) {
      String header = in.nextLine(); // dump header -- not used
      Pet[] data = new Pet[66100];
      int i = 0;

      while(in.hasNextLine()) {
         // get one row of input from the data file
         String row = in.nextLine();

         // use String.split() to separate out the data by commas
         String[] rowData = row.split(",");

         // make sure that the data is "clean" for processing
         if(rowData.length == 7 && rowData[6].length() == 5
            && !rowData[6].replace(" ","").equals("") && !Character.isLetter(rowData[1].charAt(0))) {
            //System.out.println(Arrays.toString(rowData));

            // turn the ID and zip from string to int
            int license = Integer.parseInt(rowData[1]);
            int zip = Integer.parseInt(rowData[6]);

            // create a new PetLicense object with all the data provided
            // name, species, primaryBreed, issueDate, licenseNumber, zipCode
            data[i++] = new Pet(rowData[2], rowData[3], rowData[4], rowData[0], license, zip);
         }
         else {
            //System.out.println("bad data field(s): " + Arrays.toString(rowData));
         }
      }
      return data;
   }
}
