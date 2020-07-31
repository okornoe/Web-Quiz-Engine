package engine;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GetQuizController {
    private List<Quiz> mQuiz = new ArrayList();

    public GetQuizController() {

    }

    @GetMapping(path = "api/quizzes/{id}")
    public Quiz getQuiz(@PathVariable int id) {
        return mQuiz.get(id -1);
    }

    @PostMapping(path = "api/quizzes", consumes = "application/json")
    private String createNewQuestion(@RequestBody Quiz quiz){
        mQuiz.add(quiz);
        return "posted" + mQuiz.size();
    }
}
