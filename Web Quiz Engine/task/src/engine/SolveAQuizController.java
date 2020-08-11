package engine;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
public class SolveAQuizController {
    /*QuizResults quizResults = new QuizResults();
    public SolveAQuizController(){
    }

    @PostMapping(path = "/api/quizzes/{id}/solve")
    public QuizResults solveQuiz(@PathVariable int id,  @RequestBody Answer answer) throws QuizNotFoundException, JsonProcessingException {
        if (id < 0 || id > QuizDB.sizeOfQuizDB()) {
            throw new QuizNotFoundException();
        } else {
            // work on comparing the content of the array rather than the objects overriding the equals method.
            if (Arrays.equals(QuizDB.getAQuizByIndex(id).getAnswer(), answer.getAnswer()) ||
                    (QuizDB.getAQuizByIndex(id).getAnswer() == null && answer.getAnswer().length == 0)) {
                quizResults.setFeedback("Congratulations, you are right!");
                quizResults.setSuccess(true);
            } else {
                quizResults.setFeedback("Wrong answer! Please try again.");
                quizResults.setSuccess(false);
            }
        }
        return quizResults ;
    }*/
}
