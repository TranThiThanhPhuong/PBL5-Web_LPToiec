package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "vocabulary_content")
public class VocabularyContent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "vocabulary_id", nullable = false) 
    private Vocabulary vocabulary;

    @Column(name = "number", nullable = false)
    private long number;

    @Column(name = "content", nullable = false, length = 255)
    private String content;

    @Column(name = "transcribe", length = 255)
    private String transcribe;

    @Column(name = "image_url", length = 255)
    private String imageUrl;

    @Column(name = "audiomp3", length = 255)
    private String audiomp3;

    @Column(name = "meaning", length = 255)
    private String meaning;

    @Column(name = "sentence", columnDefinition = "TEXT")
    private String sentence;

    public VocabularyContent() {
    }

    public VocabularyContent(Vocabulary vocabulary, long number, String content, String transcribe, String imageUrl, String audiomp3, String meaning, String sentence) {
        this.vocabulary = vocabulary;
        this.number = number;
        this.content = content;
        this.transcribe = transcribe;
        this.imageUrl = imageUrl;
        this.audiomp3 = audiomp3;
        this.meaning = meaning;
        this.sentence = sentence;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Vocabulary getVocabulary() {
        return vocabulary;
    }

    public void setVocabulary(Vocabulary vocabulary) {
        this.vocabulary = vocabulary;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTranscribe() {
        return transcribe;
    }

    public void setTranscribe(String transcribe) {
        this.transcribe = transcribe;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getAudiomp3() {
        return audiomp3;
    }

    public void setAudiomp3(String audiomp3) {
        this.audiomp3 = audiomp3;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
}
