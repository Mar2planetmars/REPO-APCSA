public class Main {
    public static void main(String[] args) {
    Quiz  csQuiz = new Quiz("Cs Quiz #1");
    Question q1 = new Question("What do you call a special variable that holds more than one value in Java?", "Array", "boolean", "method", "paramters",'A');
    Question q2 = new Question("What is the data type for an interger?", "String", "Array", "int", "something", 'C');
    Question q3 = new Question("What is the date type for a boolean?", "boolean", "boolean", "method", "paramters", 'B');
    csQuiz.addQuestion(q1);
    csQuiz.addQuestion(q2);
    csQuiz.addQuestion(q3);
    csQuiz.start();
 
     
    } 
 }