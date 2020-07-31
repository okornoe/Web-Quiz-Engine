package engine;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static engine.QuizDB.*;

@RestController
public class GetQuizController {

    public GetQuizController() {
    }

    @GetMapping(path = "api/quizzes/{id}")
    public Quiz getQuiz(@PathVariable int id) {
        return getAQuiz(id);
    }
}
