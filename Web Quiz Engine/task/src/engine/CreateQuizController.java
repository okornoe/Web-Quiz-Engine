package engine;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static engine.QuizDB.addQuiz;
import static engine.QuizDB.sizeOfQuizDB;


@RestController
public class CreateQuizController {

    @PostMapping(path = "api/quizzes", consumes = "application/json")
    private String createNewQuestion(@RequestBody Quiz quiz){
        addQuiz(quiz);
        return "posted" + sizeOfQuizDB();
    }
}
