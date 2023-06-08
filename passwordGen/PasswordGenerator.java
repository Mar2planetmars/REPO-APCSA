public class PasswordGenerator {
  public void start() {
    generateRandomPassword();  
  }

  public void generateRandomPassword() {
     // return a password of at least 10 characters which includes at least 1 uppercase, 1 symbol and the rest as lower case characters.
    System.out.println("Generating password...");
    System.out.println("");

String [] letters = {"a", "b", "c","d", "e", "f","g","h","i", "j", "k", "l", "m", "n", "o", "p","q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

String [] symbols = {"!", "@", "#","$", "%", "&","*","(", ")", "+", "<", ">", "?", "{", "}","[", "]", "_", "~", "^", ":", ";", "=", "/",};

String upLetter = letters[(int)(Math.random()*26)];
    
System.out.println(upLetter.toUpperCase() + letters[(int)(Math.random()*26)] + letters[(int)(Math.random()*26)] + symbols[(int)(Math.random()*24)] + letters[(int)(Math.random()*26)] + letters[(int)(Math.random()*26)] + letters[(int)(Math.random()*26)] + symbols[(int)(Math.random()*24)] + letters[(int)(Math.random()*26)] + symbols[(int)(Math.random()*24)]);

    
  }


}










