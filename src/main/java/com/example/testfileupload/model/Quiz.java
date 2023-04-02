package com.example.testfileupload.model;

import javax.persistence.*;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private float maxMarks;

    private Date dateCreated;


    @OneToMany(mappedBy = "quiz", orphanRemoval = true)
    private Set<Question> questions = new LinkedHashSet<>();

}
