import java.util.Scanner;
class Main {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

    
     System.out.println("Please enter the year you were born.");
     int birthYear = input.nextInt();
     int sign = (birthYear%12);
    String animal = "";
    String description = "";

switch (sign) {
  case 0:
     animal = "monkey";
     description = "magnetic, witty, and intelligent";
    break;
  case 1:
    animal = "rooster";
    description = "observant and hardworking";
    break;
  case 2:
    animal = "dog";
    description = "loyal, honest, and cautious";
    break;
  case 3:
    animal = "pig";
    description = "diligent, compassionate, and generous";
    break;
  case 4:
    animal = "rat";
    description = "quick=witted, resourceful, and smart";
    break;
  case 5:
    animal = "ox";
    description = "diligent, strong, and determined.";
    break;
  case 6:
    animal = "tiger";
    description = "brave, confident, and competitive";
    break;
  case 7:
    animal = "rabbit";
    description = "gentle, quiet, and responsible";
    break;
  case 8:
   animal = "dragon";
   description = "dominant, ambitious, and angry";
    break;
  case 9:
    animal = "snake";
    description = "intelligent and wise";
    break;
  case 10:
    animal = "horse";
   description = "animated, active, and energetic";
    break;
  case 11:
    animal = "Goat";
    description = "mild-mannered, shy, and amicable";
    break;
    
}
    System.out.println("You were born in the year of the " + animal + " and your personality is " + description);

  }
}
