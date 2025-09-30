// every java file is a class
public class Main {
// main method is the entryway to the program    
   public static void main(String []args) {
      System.out.println("Hello");
      System.out.println("Hi");
      int score;
      // declare a new variable
      score = 72;
      // INITIALIZE combines declaring + assigning
   String pokemon = "Pikachu";
      double healthPercent = 0.75;
      boolean isAlive = true;

      // use the plus sign to Concatentate (combine)strings
      String greeting = "Hello" + "world";
      System.out.println(greeting);
      // quotation marks contain STRING LITERALS
         //output difference between .print and .println
         System.out.print ("Hi");
         System.out.println("There");
         System.out.print ("!");
      // ESCAPE: use \ to include special characters
      String message = "I woke up and said, \"HELLO WORLD\"";
      System.out.println(message);
      System.out.println(4 + 3);
      System.out.println(4 - 1);
      System.out.println(6 * 7);
      System.out.println(5 / 3); //truncation
      // integer division results in TRUNCATIOn which is basicly throwing away decimal places
      System.out.println(5.0/3); //double
      
      
      //COMPOUND expressions follow PEMDAS
      double result = 2 + 3 * 2;
      System.out.println(result);
      int remain = 23 % 2;
      System.out.println(remain);
      System.out.println( 628%2);
      // watch out for plus sign
      System.out.println(3+"3");

      int max_age = 16;
      int aaniyah_age = max_age;
      // both variables above contain same value

      int x = 15;
      int y = 21;
      int z = 2;
      x = y; //now stores same value as y
      y = y * 2;
      z = 27;

      System.out.println(x);
      System.out.println(y);

      System.out.println("X is " + x );
      System.out.println("Y is " + y   );
      System.out.println("Z is " + z );
      double num1 = 3; // int would create error
      double num2 = 3.14;
      num1 = 2 * num2; //cant fit double in int
      System.out.println(num1);
      // INCREMENT add on to a current value
      int points = 0;
      points = points + 1;
      //DECREMENT decrease in existing value
      points = points - 15;
      System.out.println(points);

      // CASTING (convert data types)
      int originalValue = 5;
      double castDouble = (double) originalValue;
      System.out.println("Cast to double: " + castDouble);
      int castInt = (int) castDouble;
      System.out.println("Cast back to int: " + castInt);

      //Examples of math and casting
      System.out.println(3/4);
      System.out.println(3.0/4);
      System.out.println(3/4.0);
      System.out.println((double)3/4);
      System.out.println( (int) 3.0/4);

            int apcs = 13;
            int juniors = 40;
            double csPercent = (double) apcs/juniors;
            System.out.println(csPercent);

            //ROUNDING by casting
            double positiveNum = 25.09;
            double negativeNum = -21.80;
            int nearestPositive = (int) (positiveNum + 0.5);
            int nearestNegative = (int) (negativeNum -0.5);
            System.out.println(nearestPositive);
            System.out.println(nearestNegative);

            int runs = 0;
            // Re-assign a variable to existing value + 1
            runs = runs + 1; 
            runs += 1;
            System.out.println("Runs: " + runs);
            //even shorter shortcut for adding or subtracting one
            runs ++;
            runs --;
            System.out.print(runs);
            runs *= -10;
            runs /= 10;
            runs *= 12;
            System.out.println(runs);
         }

   }

   


