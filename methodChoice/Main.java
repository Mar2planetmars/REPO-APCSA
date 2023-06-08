import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

//asks user which program they want to try
     System.out.println("");
    System.out.println("Which program would you like to test?");
    System.out.println("");
    System.out.println("a: let's you know if your byte is even or odd and what it is in decimal form ");
    System.out.println("");
    System.out.println("b: outputs your input in captial or lowecase letters depending on your boolean");
    System.out.println("");
       System.out.println("c: tells you where the first vowel of your input is");
     System.out.println("");
      System.out.println("d: tells you the slope of your line");
    

//stores which program they want to try
    String userChoice = input.nextLine();

//calls method they want to try
    if ((userChoice).equals("a")) {
     System.out.println("Enter a byte(8 digits of 0's and 1's");
     String givenValue = input.nextLine();
     evenOrOdd(givenValue);  
    }

    if ((userChoice).equals("b")) {
     System.out.println("Enter a string");
     String userString = input.nextLine();
     System.out.println("Enter boolean(type false or true)");
     boolean userBoolean = input.nextBoolean();
     upOrLow(userString, userBoolean);

    }

    if ((userChoice).equals("c")) {
      System.out.println("Enter a string");
      String theString = input.nextLine();
      vowel(theString);

      }

     if ((userChoice).equals("d")) {
       System.out.println("Type your x1 coordinate");
       int x1 = input.nextInt();
       System.out.println("Type your y1 coordinate");
       int y1 = input.nextInt();

       System.out.println("Type your x2 coordinate");
       int x2 = input.nextInt();
       System.out.println("Type your y2 coordinate");
       int y2 = input.nextInt();
       slope(x1, y1, x2, y2);

      }
    
    

  


    
    }

   ///program a 
   public static void evenOrOdd(String theValue) {
   String passedValue = theValue;
     
     String index0 = passedValue.substring(0,1);
     String index1 = passedValue.substring(1,2);
     String index2 = passedValue.substring(2,3);
     String index3 = passedValue.substring(3,4);
     String index4 = passedValue.substring(4,5);
     String index5 = passedValue.substring(5,6);
     String index6 = passedValue.substring(6,7);
     String index7 = passedValue.substring(7,8);  

  
     int num0 = 0;
       if ((index0).equals("1")) {
         num0 += 128;
      } else {
         num0 += 0;
        }

      int num1 = 0;
       if ((index1).equals("1")) {
         num1 += 64;
      } else {
         num1 += 0;
        }

      int num2 = 0;
       if ((index2).equals("1")) {
         num2 += 32;
      } else {
         num2 += 0;
        }

      int num3 = 0;
       if ((index3).equals("1")) {
         num3 += 16;
      } else {
         num3 += 0;
        }
     
      int num4 = 0;
       if ((index4).equals("1")) {
         num4 += 8;
      } else {
         num4 += 0;
        }
     
      int num5 = 0;
       if ((index5).equals("1")) {
         num5 += 4;
      } else {
         num5 += 0;
        }

      int num6 = 0;
       if ((index6).equals("1")) {
         num6 += 2;
      } else {
         num6 += 0;
        }

      int num7 = 0;
       if ((index7).equals("1")) {
         num7 += 1;
      } else {
         num7 += 0;
        }
 
    int finalNum = num0 + num1 + num2 + num3 + num4 + num5+ num6 + num7;
     
     if (finalNum % 2 == 0) {
       System.out.print("This byte is equal to decimal number " + finalNum + " final num and is ");
      System.out.print("even");
        } else {
       System.out.print("This byte is equal to decimal number " + finalNum + " final num and is ");
      System.out.println("odd");
        }
    }

///program b
   public static void upOrLow(String inputString, boolean inputBoolean) {
   if (inputBoolean == true) {
    System.out.println(inputString.toUpperCase());
   } else {
     System.out.println(inputString.toLowerCase());
   }
  }

///program c
  public static void vowel(String inString) {
  
    
  int vowelA = inString.indexOf("a"); 
  int vowelE = inString.indexOf("e");
  int vowelI = inString.indexOf("i");
  int vowelO = inString.indexOf("o");
  int vowelU = inString.indexOf("u");

    
   if (vowelA == -1) {
    vowelA = Integer.MAX_VALUE;
   } 

  if (vowelE == -1) {
    vowelE = Integer.MAX_VALUE;
    }

    
  if (vowelI == -1) {
    vowelI = Integer.MAX_VALUE;
    }

  
  if (vowelO == -1) {
   vowelO = Integer.MAX_VALUE;
    }

  
  if (vowelU == -1) {
    vowelU = Integer.MAX_VALUE;
    }

  int run1 = (Math.min(vowelA, vowelE));
  int run2 = (Math.min(run1, vowelI));
  int run3 = (Math.min(run2, vowelO));
  int run4 = (Math.min(run3, vowelU));

  int runResult = run4;
  System.out.println("The first vowel of this string is at index " + runResult);

  }
  
  ///program d
   public static void slope(int cox1, int coy1, int cox2, int coy2) {
   int top = coy2 - coy1;
   int bottom = cox2 - cox1;

   System.out.println("The slope of this line is " + top + " / " + bottom); 
}
    
  
}
