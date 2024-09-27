package org.example.springaiintro.services;


import org.example.springaiintro.model.Answer;
import org.example.springaiintro.model.GetCapitalRequest;
import org.example.springaiintro.model.Question;

public interface OpenAIService {


    String getAnswer(String question);

    Answer getAnswer(Question question);

    Answer getCapital(GetCapitalRequest getCapitalRequest);

    Answer getCapitalWithInfo(GetCapitalRequest getCapitalRequest);
}


