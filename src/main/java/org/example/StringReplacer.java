package org.example;
import java.lang.*;

public class StringReplacer implements StringTransformer {
    Character before;
    Character after;
    public StringReplacer(Character before, Character after){
        this.before = before;
        this.after = after;
    }
    @Override
    public void execute(StringDrink drink) {
        String text = drink.getText();
        String nText = "";
        for (int i = 0; i<text.length(); i++){
            if(text.charAt(i)==before){
                nText = nText + after;
            }else{
                nText = nText + text.charAt(i);
            }
        }
        drink.setText(nText);
    }
}
