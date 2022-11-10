package org.example;

public class StringBar extends Bar {
    boolean isHappyHour;
    public StringBar() {
        super();
        isHappyHour = false;
    }
    @Override
    public boolean isHappyHour() {
        return isHappyHour;
    }

    @Override
    public void startHappyHour() {
        isHappyHour = true;
    }

    @Override
    public void endHappyHour() {
        isHappyHour = false;
    }
}
