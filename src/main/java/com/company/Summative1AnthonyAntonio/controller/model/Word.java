package com.company.Summative1AnthonyAntonio.controller.model;

import java.util.Objects;

public class Word {
    //properities

    private String word;
    private String definition;
    private int id;

    //default constructor
    public Word(){ }

    //constructor
    public Word(String word, String definition, int id){
        this.word=word;
        this.definition=definition;
        this.id=id;
    }
    //getters and setters

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word1 = (Word) o;
        return getId() == word1.getId() && Objects.equals(getWord(), word1.getWord()) && Objects.equals(getDefinition(), word1.getDefinition());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWord(), getDefinition(), getId());
    }
}
