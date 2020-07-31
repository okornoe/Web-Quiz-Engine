package engine;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SolveAQuizController {
    QuizResults quizResults = new QuizResults();

    @PostMapping(path = "/api/quizzes/{id}/solve")
    public QuizResults solveQuiz(@PathVariable int id, @RequestParam(value = "answer") int answer) {
        if (answer != 2) {
            quizResults.setFeedback("Wrong answer! Please try again.");
            quizResults.setSuccess(false);
        } else {
            quizResults.setFeedback("Congratulations, you're right!");
            quizResults.setSuccess(true);
        }
        return quizResults ;
    }
}
