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
        String nText = text.replace(before, after);

        drink.setText(nText);
    }
}
