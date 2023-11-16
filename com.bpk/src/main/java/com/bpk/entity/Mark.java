package com.bpk.entity;

import javax.persistence.*;

@Entity
@Table(name = "Marks")
public class Mark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long markID;

    @ManyToOne
    @JoinColumn(name = "studentID", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "subjectID", nullable = false)
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "gradeID", nullable = false)
    private Grade grade;

    private int marksObtained;

    // Constructors, getters, setters, and other methods
}

