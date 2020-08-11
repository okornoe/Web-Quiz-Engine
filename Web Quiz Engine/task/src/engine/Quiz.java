package engine;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;


//Do not forget to change to the database name from test name to production name

@Component
@Entity
@Table
public class Quiz {
    private int id;
    private String title;
    private String text;
    @Size(min = 2)
    private String[] options;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private int[] answer;

    public Quiz(int[] answer) {
        this.answer = answer;
    }

    public Quiz() {

    }

    public Quiz(String title, String text, String[] options, int[] answer) {
        this.title = title;
        this.text = text;
        this.options = options;
        this.answer = answer;
    }

    @Column(nullable = false)
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Column(nullable = false)
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    @Column(nullable = false)
    public String[] getOptions() {
        return options;
    }
    public void setOptions(String[] options) {
        this.options = options;
    }

    @Column(nullable = false)
    @Id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @JsonIgnore
    public void setAnswer(int[] answer) {
        this.answer = answer;
    }

    @JsonIgnore
    //@Column(nullable = true)
    public int[] getAnswer() {
        return answer;
    }

}

