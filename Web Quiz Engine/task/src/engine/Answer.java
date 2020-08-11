package engine;

import org.springframework.stereotype.Component;

import javax.validation.constraints.Null;

@Component
public class Answer {
    //@Null
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
