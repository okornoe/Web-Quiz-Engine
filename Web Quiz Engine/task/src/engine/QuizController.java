package engine;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.Arrays;
import java.util.List;


@RestController
public class QuizController {
    QuizResults quizResults = new QuizResults();
    @Autowired
    private QuizRepository quizRepository;

    static int i;
    @PostMapping(path = "api/quizzes", consumes = "application/json", produces = "application/json")
    private Quiz createNewQuestion(@RequestBody Quiz quiz) throws EmptyField {
        if (quiz.getOptions() == null) {
            throw new EmptyField();
        }
        quiz.setId(++i);
        return quizRepository.save(quiz);
    }

    @GetMapping(path = "api/quizzes/{id}")
    public ResponseEntity<Quiz> getQuiz(@PathVariable(value = "id") int id) throws QuizNotFoundException {
           Quiz quiz = quizRepository.findById(id).orElseThrow(QuizNotFoundException::new);
           return ResponseEntity.ok().body(quiz);
        }

    @GetMapping(path = "api/quizzes")
    public List<Quiz> getQuiz() {
        return quizRepository.findAll();
    }

    @PostMapping(path = "/api/quizzes/{id}/solve")
    public QuizResults solveQuiz(@PathVariable(value = "id") int id,  @RequestBody Answer answer) throws QuizNotFoundException{
        if (quizRepository.existsById(id)) {
            if (Arrays.equals(quizRepository.findById(id).get().getAnswer(), answer.getAnswer()) ||
                    (quizRepository.findById(id).get().getAnswer() == null && answer.getAnswer().length == 0)) {
                quizResults.setFeedback("Congratulations, you are right!");
                quizResults.setSuccess(true);
            } else {
                quizResults.setFeedback("Wrong answer! Please try again.");
                quizResults.setSuccess(false);
            }
        } else {
            throw new QuizNotFoundException();
        }
        return quizResults ;
    }
}


