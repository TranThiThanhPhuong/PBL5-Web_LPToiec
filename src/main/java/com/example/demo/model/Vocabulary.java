package com.example.demo.model;

import javax.persistence.*;

import java.util.List;

@Entity
@Table(name = "vocabulary")
public class Vocabulary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "vocabulary_name", nullable = false, length = 255)
    private String vocabularyName;

    @Column(name = "image_url", length = 255)
    private String imageUrl;
    
    @OneToMany(mappedBy = "vocabulary", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<VocabularyContent> vocabularyContents;
    
    public List<VocabularyContent> getVocabularyContents() {
        return vocabularyContents;
    }

    public void setVocabularyContents(List<VocabularyContent> vocabularyContents) {
        this.vocabularyContents = vocabularyContents;
    }
    
    public Vocabulary() {
    }

    public Vocabulary(String vocabularyName, String imageUrl) {
        this.vocabularyName = vocabularyName;
        this.imageUrl = imageUrl;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVocabularyName() {
        return vocabularyName;
    }

    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
