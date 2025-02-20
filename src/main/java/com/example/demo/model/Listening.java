package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "listening")
public class Listening {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "listening_name", nullable = false, length = 255)
    private String listeningName;

    @Column(name = "difficulty")
    private long difficulty;

    @Column(name = "script", length = 255)
    private String script;

    @OneToMany(mappedBy = "listening", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ListeningQuestion> listeningQuestions;

    // Constructors
    public Listening() {
    }

    public Listening(String listeningName, long difficulty, String script) {
        this.listeningName = listeningName;
        this.difficulty = difficulty;
        this.script = script;
    }

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getListeningName() {
        return listeningName;
    }

    public void setListeningName(String listeningName) {
        this.listeningName = listeningName;
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

    public List<ListeningQuestion> getListeningQuestions() {
        return listeningQuestions;
    }

    public void setListeningQuestions(List<ListeningQuestion> listeningQuestions) {
        this.listeningQuestions = listeningQuestions;
    }
}
