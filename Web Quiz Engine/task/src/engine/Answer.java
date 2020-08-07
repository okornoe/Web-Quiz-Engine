package engine;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

@Component
public class Answer {
    private int[] answer;

    public Answer() {
    }

    public int[] getAnswer() {
        return answer;
    }

    public void setAnswer(int[] answer) {
        this.answer = answer;
    }
}
