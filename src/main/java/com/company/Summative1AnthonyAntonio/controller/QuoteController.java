package com.company.Summative1AnthonyAntonio.controller;

import com.company.Summative1AnthonyAntonio.controller.model.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class QuoteController {
    private List<Quote> quoteList;
    private static int idCounter=1;

    public QuoteController(){

        quoteList= new ArrayList<>();

        quoteList.add(new Quote("The cost of liberty is less than the price of repression.","W.E.B Du Bois",idCounter++  ));
        quoteList.add(new Quote("Never be limited by other people's limited imaginations.","Dr. Mae",idCounter++));
        quoteList.add(new Quote("Whatever we believe about ourselves and our ability comes true for us","Susan L.Taylor",idCounter++));
        quoteList.add(new Quote("If there is no struggle, there is no progress.","Fredrick Douglas",idCounter++));
        quoteList.add(new Quote("The time is always right to do what is right.","Dr.MLK",idCounter++));
        quoteList.add(new Quote("Have a vision. Be demanding","Colin Power",idCounter++));
        quoteList.add(new Quote("Freedom is never given; it is won","A. Philip Randoplh,", idCounter++));
        quoteList.add(new Quote("Truth is powerful and it prevails","Sojournal",idCounter++));
        quoteList.add(new Quote("I don't want a Black History.","Morgan Freeman",idCounter++));
        quoteList.add(new Quote("if you judge people,you have no time to love them.","Mother Thersa,", idCounter++));

    }


    @RequestMapping(value = "/quotes", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Quote getRandomQuote(){

        Random random=new Random();
        int index= random.nextInt(9);
        return quoteList.get(index);



    }






}
