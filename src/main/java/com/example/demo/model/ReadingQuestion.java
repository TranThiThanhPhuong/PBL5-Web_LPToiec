package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "reading_question")
public class ReadingQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "reading_id", nullable = false)
    private Reading reading;

    @Column(name = "question_text", nullable = false, length = 255)
    private String questionText;

    @Column(name = "correct_answer", nullable = false, length = 1)
    private String correctAnswer;

    @Column(name = "answer_1", length = 255)
    private String answer1;

    @Column(name = "answer_2", length = 255)
    private String answer2;

    @Column(name = "answer_3", length = 255)
    private String answer3;

    @Column(name = "answer_4", length = 255)
    private String answer4;

    @Column(name = "explanation", length = 255)
    private String explanation;

    @Column(name = "image_url", length = 255)
    private String imageUrl;

    @Column(name = "order_number")
    private long orderNumber;

    public ReadingQuestion() {
    }

    public ReadingQuestion(Reading reading, String questionText, String correctAnswer,
                           String answer1, String answer2, String answer3, String answer4,
                           String explanation, String imageUrl, long orderNumber) {
        this.reading = reading;
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.explanation = explanation;
        this.imageUrl = imageUrl;
        this.orderNumber = orderNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Reading getReading() {
        return reading;
    }

    public void setReading(Reading reading) {
        this.reading = reading;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(long orderNumber) {
        this.orderNumber = orderNumber;
    }
}
