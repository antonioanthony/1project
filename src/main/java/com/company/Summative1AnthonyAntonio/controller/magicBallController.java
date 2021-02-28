package com.company.Summative1AnthonyAntonio.controller;

import com.company.Summative1AnthonyAntonio.controller.model.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class magicBallController {

    private List<String> answerList;


    public magicBallController() {
        answerList = new ArrayList<>();
        answerList.add("no");
        answerList.add("yes");
        answerList.add( "Maybe");
        answerList.add("Hello");
        answerList.add("goodbye");
        answerList.add("its possible");
        answerList.add("most certainly");

    }

    @RequestMapping(value = "/magic", method=RequestMethod.POST)
    @ResponseStatus(value= HttpStatus.OK)
    public Answer magicAnswer( @RequestBody Answer question){

        Random ans= new Random();
        int index= ans.nextInt(answerList.size());
        String answer= answerList.get(index);
        question.setAnswer(answer);
        question.setId(index);

        return question;
    }


}
