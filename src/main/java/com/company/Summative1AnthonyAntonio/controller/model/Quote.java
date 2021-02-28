package com.company.Summative1AnthonyAntonio.controller.model;

import java.util.Objects;

public class Quote {

    //properities
   private String quote;
   private String author;
   private  int id;

    // default constrcutor
    public Quote() { }

    //constructor
    public Quote(String quote, String author, int id){
        this.quote= quote;
        this.author=author;
        this.id=id;

    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quote quote1 = (Quote) o;
        return Objects.equals(getQuote(), quote1.getQuote()) && Objects.equals(getAuthor(), quote1.getAuthor()) && Objects.equals(getId(), quote1.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQuote(), getAuthor(), getId());
    }

}
