package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "listening")
public class Listening {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "listening_name", nullable = false, length = 255)
    private String listeningName;

    @Column(name = "difficulty")
    private Integer difficulty;

    @Column(name = "script", length = 255)
    private String script;

    @OneToMany(mappedBy = "listening", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ListeningQuestion> listeningQuestions;

    // Constructors
    public Listening() {
    }

    public Listening(String listeningName, Integer difficulty, String script) {
        this.listeningName = listeningName;
        this.difficulty = difficulty;
        this.script = script;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<ListeningQuestion> getListeningQuestions() {
        return listeningQuestions;
    }

    public void setListeningQuestions(List<ListeningQuestion> listeningQuestions) {
        this.listeningQuestions = listeningQuestions;
    }
}
