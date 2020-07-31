package engine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebQuizEngine {

    public static void main(String[] args) {
        QuizDB.createQuizDB();
        SpringApplication.run(WebQuizEngine.class, args);
    }

}
