package org.example;

import static java.lang.Character.*;

public class StringCaseChanger implements StringTransformer{

    @Override
    public void execute(StringDrink drink) {
        StringBuilder nText = new StringBuilder();
        String text = drink.getText();
        for(int i = 0; i<text.length(); i++) {
            if(isLowerCase(text.charAt(i))){
                nText.append(toUpperCase(text.charAt(i)));
            }else{
                nText.append(toLowerCase(text.charAt(i)));
            }
        }
        drink.setText(nText.toString());
    }

    @Override
    public void undo(StringDrink drink) {
        StringBuilder nText = new StringBuilder();
        String text = drink.getText();
        for(int i = 0; i<text.length(); i++) {
            if(isLowerCase(text.charAt(i))){
                nText.append(toUpperCase(text.charAt(i)));
            }else{
                nText.append(toLowerCase(text.charAt(i)));
            }
        }
        drink.setText(nText.toString());
    }
}
