package org.example;

import static java.lang.Character.*;

public class StringCaseChanger implements StringTransformer{

    @Override
    public void execute(StringDrink drink) {
        String nText = "";
        String text = drink.getText();
        for(int i = 0; i<text.length(); i++) {
            if(isLowerCase(text.charAt(i))){
                nText = nText + toUpperCase(text.charAt(i));
            }else{
                nText = nText + toLowerCase(text.charAt(i));
            }
        }
        drink.setText(nText);
    }
}
