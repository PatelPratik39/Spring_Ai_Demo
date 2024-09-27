package org.example.springaiintro.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OpenAIServiceImplTest {

    @Autowired
    OpenAIService openAIService;

    @Test
    void getAnswer() {
//        String answer = openAIService.getAnswer("Write a python script to output numbers from 1 to 100");
        String answer = openAIService.getAnswer("Write the game snake in python");
        assertNotNull(answer, "Answer should not be null");
        System.out.println("Got the Answer :" + answer);
        System.out.println(answer);
    }
}