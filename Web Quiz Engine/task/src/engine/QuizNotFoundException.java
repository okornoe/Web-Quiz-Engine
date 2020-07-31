package engine;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Quiz Not Found")
public class QuizNotFoundException extends RuntimeException{
}
