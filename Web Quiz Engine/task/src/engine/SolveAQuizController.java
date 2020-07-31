package engine;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class SolveAQuizController {
    QuizResults quizResults = new QuizResults();

    @PostMapping(path = "/api/quizzes/{id}/solve")
    public QuizResults solveQuiz(@PathVariable int id, @RequestParam(value = "answer") int answer) throws QuizNotFoundException{
        if (id < 0 || id > QuizDB.sizeOfQuizDB()) {
            throw new QuizNotFoundException();
        } else {
            if (answer != 2) {
                quizResults.setFeedback("Wrong answer! Please try again.");
                quizResults.setSuccess(false);
            } else {
                quizResults.setFeedback("Congratulations, you're right!");
                quizResults.setSuccess(true);
            }
        }
        return quizResults ;
    }
}
