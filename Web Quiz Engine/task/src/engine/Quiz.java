package engine;

import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

class QuizResults {
    private boolean success;
    private String feedback;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}


public class Quiz {
    private String title;
    private String text;
    private String[] options;
    private boolean success;
    private String feedback;
    //private List<Quiz> quizList;

    public Quiz() {
        title = "The Java Logo";
        text = "What is depicted on the Java Logo?";
        options = new String[]{"Robot", "The Tea leaf", "Cup of coffee", "Bug"};
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

/*    public List<Quiz> getQuizList() {
        return quizList;
    }

    public void addQuiz(Quiz quiz) {
        this.quizList.add(quiz);
    }

    public List<Quiz> setQuizList() {
        return quizList;
    }*/
}

