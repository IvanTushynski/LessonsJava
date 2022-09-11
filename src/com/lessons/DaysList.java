package com.lessons;

public enum DaysList {

    SUNDAY ("Воскресенье"),
    MONDAY ("Понедельник"),
    TUESDAY ("Вторник"),
    WEDNESDAY ("Среда"),
    THURSDAY ("Четверг"),
    FRIDAY ("Пятница"),
    SATURDAY ("Суббота");


    private String opisanie;

    DaysList(String opisanie) {
        this.opisanie = opisanie;
    }

    public String getOpisanie() {
        return opisanie;
    }

    @Override
    public String toString() {
        return "DaysList{" +
                "opisanie='" + opisanie + '\'' +
                '}';
    }
}
