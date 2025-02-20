package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "listening_question")
public class ListeningQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "listening_id", nullable = false)
    private Listening listening;

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
    private int orderNumber;

    // Constructors
    public ListeningQuestion() {
    }

    public ListeningQuestion(Listening listening, String questionText, String correctAnswer, String answer1,
                             String answer2, String answer3, String answer4, String explanation,
                             String imageUrl, int orderNumber) {
        this.listening = listening;
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

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Listening getListening() {
        return listening;
    }

    public void setListening(Listening listening) {
        this.listening = listening;
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

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
}
