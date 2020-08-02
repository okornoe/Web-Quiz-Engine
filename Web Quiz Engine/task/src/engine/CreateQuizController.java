package engine;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static engine.QuizDB.addQuiz;

@RestController
public class CreateQuizController {
    static int i;
    @PostMapping(path = "api/quizzes", consumes = "application/json", produces = "application/json")
    private Quiz createNewQuestion(@RequestBody Quiz quiz){
        quiz.setId(++i);
        addQuiz(quiz);
        return quiz;
    }
}
