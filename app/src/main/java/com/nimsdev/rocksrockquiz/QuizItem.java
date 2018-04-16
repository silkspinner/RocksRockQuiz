package com.nimsdev.rocksrockquiz;

import java.net.URL;

/**
 * Created by jugld on 4/11/2018.
 *     data entity for each quiz question
 */

public class QuizItem {

    public String question; // text for question
    public String response; // text for explaination response
    public Boolean answer; // Boolean, correct answer
    public int image; // drawable image resource for question
    public String attribution; // text for image attribution
    public String title; // title for image
    public String attribLink; // link for attribution
    public Boolean dark; // Boolean for color of background
    public Boolean used; // Use during question selection

    QuizItem(String question, String response, Boolean answer,
             int image, String title, String attribution, String attribLink, Boolean dark) {
        this.question = question;
        this.response = response;
        this.answer = answer;
        this.image = image;
        this.title = title;
        this.attribution = attribution;
        this.attribLink = attribLink;
        this.dark = dark;
        this.used = false;
    }
}

