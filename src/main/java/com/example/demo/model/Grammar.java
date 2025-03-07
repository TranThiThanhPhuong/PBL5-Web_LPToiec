package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "grammar")
public class Grammar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "grammar_name", nullable = false, length = 255)
    private String grammarName;

    @Column(name = "image_url", length = 255)
    private String imageUrl;

    @Column(name = "content_html", columnDefinition = "TEXT")
    private String contentHtml;

    @Column(name = "content_mark_down", columnDefinition = "TEXT")
    private String contentMarkDown;

    public Grammar() {}

    public Grammar(String grammarName, String imageUrl, String contentHtml, String contentMarkDown) {
        this.grammarName = grammarName;
        this.imageUrl = imageUrl;
        this.contentHtml = contentHtml;
        this.contentMarkDown = contentMarkDown;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGrammarName() {
        return grammarName;
    }

    public void setGrammarName(String grammarName) {
        this.grammarName = grammarName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getContentHtml() {
        return contentHtml;
    }

    public void setContentHtml(String contentHtml) {
        this.contentHtml = contentHtml;
    }

    public String getContentMarkDown() {
        return contentMarkDown;
    }

    public void setContentMarkDown(String contentMarkDown) {
        this.contentMarkDown = contentMarkDown;
    }
}