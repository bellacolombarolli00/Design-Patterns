package org.example;

public class StringInverter implements  StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        String text = drink.getText();
        String newText = "";
        for(int i = 0; i<text.length(); i++) {
            char c = text.charAt(i);
            newText = c+newText;
        }
        drink.setText(newText);
    }
}
