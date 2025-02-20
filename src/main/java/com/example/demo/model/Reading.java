package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "reading")
public class Reading {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "part_id", nullable = false)
    private Part part;

    @Column(name = "reading_name", nullable = false, length = 255)
    private String readingName;

    @Column(name = "difficulty")
    private Integer difficulty;

    @Column(name = "script", length = 255)
    private String script;

    public Reading() {
    }

    public Reading(Part part, String readingName, Integer difficulty, String script) {
        this.part = part;
        this.readingName = readingName;
        this.difficulty = difficulty;
        this.script = script;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }
}
