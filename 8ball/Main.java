import java.util.Scanner;
class Main {
  public static void main(String[] args) {
     
    Scanner input = new Scanner(System.in);


  String [] messages = {"It is certain.", "It is decidedly so.", "Without a doubt.", " Yes definitely.", "You may rely on it.", "As I see it, yes.","Most likely.", "Outlook good.", "Yes.", "Signs point to yes.", "Reply hazy, try again.", "Ask again later.", "Better not tell you now.","Cannot predict now.", "Concentrate and ask again.", "Don't count on it.", " My reply is no.", "My sources say no.", "Outlook not so good.", "Very doubtful"};


 System.out.println("Enter your question?");
 String question = input.nextLine();   
    
 System.out.println(messages[(int)(Math.random()*20)]);


    
  }

}



  
