package com.example.testfileupload.model;

import javax.persistence.*;

@Entity
public class UserQuestionAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "question_id")
    private Question question;

    @OneToOne(cascade = CascadeType.PERSIST, orphanRemoval = true)
    @JoinColumn(name = "question_answer_id")
    private QuestionAnswer questionAnswer;

}
