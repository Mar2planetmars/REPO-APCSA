import java.util.Scanner;
class Main {

  // indexOf, compareTo, and substring.
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Hello, tell me what you want to talk about today?");
    String keyWord1 = scan.nextLine();
    
   //   if(!keyWord1.equals("careers")|| !keyWord1.equals("future")|| !keyWord1.equals("careers") || !keyWord1.equals("future") || !keyWord1.equals("science")|| !keyWord1.equals("technology") || !keyWord1.equals("hate")|| !keyWord1.equals("dislike") || !keyWord1.equals("food") || !keyWord1.equals("cooking") || !keyWord1.equals("music") || !keyWord1.equals("songs")){
   //    System.out.println("Tell me more!"); 
   // } 
    
    if(keyWord1.equals("music") || keyWord1.equals("songs")){
      System.out.println("What is your favorite music genre?"); 
      String holder1 = scan.nextLine();
      System.out.println("What is the last song you listened to?");
      String holder2 = scan.nextLine();
      
    }

     if(keyWord1.equals("food") || keyWord1.equals("cooking")){
      System.out.println("What did you eat today?");
      String holder3 = scan.nextLine();
      System.out.println("Sounds delicious. What are you craving now?");
      String holder4 = scan.nextLine(); 
      System.out.println("tell me more."); 
       String holder5 = scan.nextLine(); 
     }


    if(keyWord1.equals("")){
      System.out.println("Say something please:/"); 
    } 

     if(keyWord1.equals("hate")|| keyWord1.equals("dislike")){
      System.out.println("Let’s be more positive! What do do you love?");
      String holder6 = scan.nextLine(); 
      System.out.println("tell me more.");
      String holder7 = scan.nextLine(); 
    } 

    if(keyWord1.equals("science")|| keyWord1.equals("technology")){
      System.out.println("What is your favorite invention?"); 
      String holder8 = scan.nextLine(); 
      System.out.println("that's also mines!"); 
    } 

     if(keyWord1.equals("careers")|| keyWord1.equals("future")){
      System.out.println("What is your dream career?"); 
      String holder9 = scan.nextLine(); 
      System.out.println("WOWW!! I want to be a Chef!"); 
    } 

    System.out.println("Let's talk about something else!"); 
    System.out.println("What is your favorite color?"); 
    String holder10 = scan.nextLine();
    System.out.println("OOOO I love that color!"); 
    System.out.println("Thanks for this convo! Talk to you soon:O"); 
  }

 
  
}