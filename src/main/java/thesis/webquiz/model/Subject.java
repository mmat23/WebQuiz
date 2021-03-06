package thesis.webquiz.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "subject")
public class Subject extends BaseModel {

    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "quiz_subject",
        joinColumns = @JoinColumn(name = "subject_id"),
        inverseJoinColumns = @JoinColumn(name = "quiz_id"))
    private List<Quiz> quizzes = new ArrayList<Quiz>();
}