package engine;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.*;
@RestController
public class SolveAQuizController {
    QuizResults quizResults = new QuizResults();
    Quiz quiz = new Quiz();
    public SolveAQuizController(){
    }

    @PostMapping(path = "/api/quizzes/{id}/solve")
    public QuizResults solveQuiz(@PathVariable int id, @RequestParam(value = "answer") int answer) throws QuizNotFoundException, JsonProcessingException {
        if (id < 0 || id > QuizDB.sizeOfQuizDB()) {
            throw new QuizNotFoundException();
        } else {
            //get the returned json from and retrieve the answer and do the comparism here
            if (QuizDB.getAQuiz(id).getAnswer() != answer) {
                quizResults.setFeedback(" Wrong answer! Please try again.");
                quizResults.setSuccess(false);
            } else {
                quizResults.setFeedback("Congratulations, you're right!");
                quizResults.setSuccess(true);
            }
        }
        return quizResults ;
    }
}
