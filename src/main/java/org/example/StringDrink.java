package org.example;

public class StringDrink {
    String text;
    public StringDrink(String text){
        this.text = text;
    }
    public void setText(String text){
        this.text = text;
    }
    public String getText(){
        return text;
    }
    public int getSize(){
        return text.length();
    }
}

