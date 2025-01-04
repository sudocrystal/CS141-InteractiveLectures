import java.util.*;

public class Ch7bMoreArrays {
   public static void main(String[] args) {
      int a = -64;
      int b = 42;
      System.out.printf("a = %d, b = %d \n", a, b);
      swap(a, b);
      System.out.printf("a = %d, b = %d \n\n", a, b);
      
//       int[] numbers = {1, -20, 3, -4, 10, 7, 3};
//       swap(numbers[0], numbers[1]);
//       System.out.println(Arrays.toString(numbers));
      
//       swap(numbers, 0, 1);
//       System.out.println(Arrays.toString(numbers));

//       arrayMystery(numbers);
//       System.out.println(Arrays.toString(numbers));
      
//       String[] words = {"hello", "hi", "hola", "jambo"};
//       rotateLeft(words);
//       System.out.println(Arrays.toString(words));

//       int[] times = {2, 3, 1, 2};
//       repeatTimes(words, times);
//       System.out.println(Arrays.toString(words));     

//       letterFrequency("abcdefgaaa");
//       letterFrequency(" AB##xzZ45");

//       double[] stuff = {0.3, 0.4, 0.125}; 
//       reverse(stuff);
//       System.out.println(Arrays.toString(stuff));
   }
   
   // this method will swap the values of x and y 
   // in this method ONLY bc primitive types are passed by value
   public static void swap(int x, int y) {
      x = y;
      y = x;
      System.out.printf("x = %d, y = %d \n", x, y);
   }
   
   // this method will swap the values of arr[index1] and arr[index2] 
   // permanently because arrays are passed by reference
   public static void swap(int[] arr, int index1, int index2) {
   }
   
   // trace through this, what is the result at the end?
   public static void arrayMystery(int[] a) {
      for (int i = 1; i < a.length - 1; i++) {
         if (a[i] > a[i + 1]) {
            a[i] = a[i + 1] + a[i - 1];
         }
         if(a[i] < 4) {
            a[i] *= 2;
         }
      }
   } 
   
   // this method should rotate all values in an array left by one
   // the first value should rotate to the end of the array
   // {"a", "b", "c"}
   // should become
   // {"b", "c", "a"}
   public static void rotateLeft(String[] a) {
   } 
   
   // this method should alter each element in the words array
   // to repeat the number of times that appears in the times array
   // if we pass {"a", "b"}, {2, 4} 
   // ==> words should become {"aa", "bbbb"}
   public static void repeatTimes(String[] words, int[] times) {
   } 
   
   // this method should count the frequency of each letter in phrase
   // output should be:
   // a occurs 4 times
   // b occurs 1 times ...
   public static void letterFrequency(String phrase) {
   }

   // Added Fun:
   // should reverse an array of double
   // {0.3, 0.4, 0.125} ==> {0.125, 0.4, 0.3}
   public static void reverse(double[] arr) {
   }
}
