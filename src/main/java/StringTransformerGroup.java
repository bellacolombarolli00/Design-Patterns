import org.example.StringDrink;
import org.example.StringTransformer;

import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    List<StringTransformer> list;
    public StringTransformerGroup (List<StringTransformer> list){
        this.list = list;
    }
    public void execute (StringDrink drink){
        for (StringTransformer stringTransformer : list) {
            stringTransformer.execute(drink);
        }
    }

    @Override
    public void undo(StringDrink drink) {
        for (int i = list.size(); i>0; i--){
            list.get(i).undo(drink);
        }
    }
}
