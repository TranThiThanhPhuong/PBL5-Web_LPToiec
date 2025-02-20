package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "reading")
public class Reading {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "part_id", nullable = false)
    private Part part;

    @Column(name = "reading_name", nullable = false, length = 255)
    private String readingName;

    @Column(name = "difficulty")
    private long difficulty;

    @Column(name = "script", length = 255)
    private String script;

    @OneToMany(mappedBy = "reading", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ReadingQuestion> readingQuestions;

    public Reading() {
    }

    public Reading(Part part, String readingName, long difficulty, String script) {
        this.part = part;
        this.readingName = readingName;
        this.difficulty = difficulty;
        this.script = script;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }

    public String getReadingName() {
        return readingName;
    }

    public void setReadingName(String readingName) {
        this.readingName = readingName;
    }

    public long getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(long difficulty) {
        this.difficulty = difficulty;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public List<ReadingQuestion> getReadingQuestions() {
        return readingQuestions;
    }

    public void setReadingQuestions(List<ReadingQuestion> readingQuestions) {
        this.readingQuestions = readingQuestions;
    }
}
