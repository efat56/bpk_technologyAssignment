package com.bpk.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Grades")
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gradeID;

    private String gradeName;

    @OneToMany(mappedBy = "grade")
    private List<Mark> marks;

    // Constructors, getters, setters, and other methods
}

