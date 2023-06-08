import java.util.ArrayList;
public class Quiz {
    private String quizName;
    private int numberOfQuestions;
    private ArrayList<Question> questions;
    
    //ctrl shift p
    public Quiz(String quizName) {
        this.quizName = quizName;
        this.questions = new ArrayList<Question>();
    }

    
    public void start(){
        System.out.println("Let's take the " + this.quizName);
        int count = 0;
        int score = 0;
        while (count < this.getNumberOfQuestions()){
            questions.get(count).showQuestion();
            char answer = InputHelper.getChar("Type letter for your answer.");
            if (answer == questions.get(count).getAnswer()){
                score++;
            }
            count++;
        }
        System.out.println("You scored " + score + " out of " + this.getNumberOfQuestions());
    }
    

    public  void addQuestion(Question q){
        questions.add(q);

    }
   

    public String getQuizName() {
        return this.quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public int getNumberOfQuestions() {
        return questions.size();
    }

   public void displayQuestions(){
    for (Question q: questions){
       System.out.println(q);
    }
   }
   
    @Override
    public String toString() {
        return this.quizName;
   


}

}
