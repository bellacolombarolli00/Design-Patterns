package org.example;

import java.util.List;

public interface StringTransformer {
    void execute(StringDrink drink);
    void undo(StringDrink drink);
}
