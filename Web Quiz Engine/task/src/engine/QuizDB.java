package engine;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class QuizDB {
    private static List<Quiz> quizDB;


    public static void  createQuizDB() {
        quizDB = new ArrayList<>();
    }

    public static List<Quiz> getAllQuiz() {
        return quizDB;
    }

    public static Quiz getAQuizByIndex(int index) {
        return quizDB.get(index - 1);
    }

    public static void addQuiz(Quiz quiz) {
        quizDB.add(quiz);
    }

    public static int sizeOfQuizDB() {
        return quizDB.size();
    }
}
