package com.lessons;

public class Days {

    private DaysList dayOne;
    public Days(DaysList dayOne) {
        this.dayOne = dayOne;
    }

    @Override
    public String toString() {
        return "Days{" +
                "dayOne=" + dayOne +
                '}';
    }
}
