package engine;

import org.springframework.web.bind.annotation.*;

@RestController
public class QuizController {

    @GetMapping(path = "api/quiz")
    private Quiz returnJsonQuiz() {
        return new Quiz();
    }


/*@PostMapping(path = "api/quiz/{answer}")
    private String*/


}

