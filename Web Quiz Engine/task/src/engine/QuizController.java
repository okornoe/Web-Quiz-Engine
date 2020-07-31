package engine;

import org.springframework.web.bind.annotation.*;

@RestController
public class QuizController {
    QuizResults quizResults = new QuizResults();

    @GetMapping(path = "api/quiz")
    private Quiz returnJsonQuiz() {
        return new Quiz();
    }

    @PostMapping(path = "api/quiz")
    private QuizResults postQuizAnswer(@RequestParam(value = "answer") int answer){
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

