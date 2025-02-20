package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "listening")
public class Listening {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "part_id", nullable = false)
    private Part part;

    @Column(name = "listening_name", nullable = false, length = 255)
    private String listeningName;

    @Column(name = "difficulty")
    private Integer difficulty;

    @Column(name = "script", length = 255)
    private String script;

    public Listening() {
    }

    public Listening(Part part, String listeningName, Integer difficulty, String script) {
        this.part = part;
        this.listeningName = listeningName;
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

    public String getListeningName() {
        return listeningName;
    }

    public void setListeningName(String listeningName) {
        this.listeningName = listeningName;
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
