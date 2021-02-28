package com.company.Summative1AnthonyAntonio.controller;



import com.company.Summative1AnthonyAntonio.controller.model.Quote;
import com.company.Summative1AnthonyAntonio.controller.model.Word;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.lang.instrument.ClassDefinition;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class WordController {

private List<Word> wordList;
private static int idCounter=1;

public WordController(){

    wordList=new ArrayList<>();

    wordList.add(new Word("Bandwidth.","is the max rate of data transfer across a network",idCounter++));
    wordList.add(new Word("Firewall","is a network security system taht mointors and controls incoming and outging network",idCounter));
    wordList.add(new Word("HTTPS","is used to for secure communication over a computer network",idCounter++));
    wordList.add(new Word("Phishing","is the fraudulent attempt to obtain sensitive information through email",idCounter++));
    wordList.add(new Word("Spam","is the use of messaging systems to send an unsolicited message",idCounter++));
    wordList.add(new Word("Malware","is any software intentionally desgined to cause damage to system",idCounter++));
    wordList.add(new Word("Worm","is a malicious, self-replicating program that can spread throughtout a network",idCounter++));
    wordList.add(new Word("Spoofing","imitate while exaggerating its characteristic features for comic effect",idCounter++));
    wordList.add(new Word("Java","is a class-based, object-oriented progrmaing language that is desinged to have as few implemntation dependecies as possible",idCounter++));
    wordList.add(new Word("Deep equality","When two objects share the same vaule for all of their properties",idCounter++));
}

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Word getRandomQuote(){

        Random random=new Random();
        int index= random.nextInt(9);
        return wordList.get(index);

    }










}
