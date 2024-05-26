package com.Lesson_2;

public class Park_Illuzion {
    public static void main(String[] args) {
        Park park = new Park("Парк Иллюзион");

        park.addAttraction("Американские горки", "10:00", "18:00", 20.0);
        park.addAttraction("Колесо обозрения", "11:00", "19:00", 15.0);
        park.addAttraction("Дом с привидениями", "12:00", "20:00", 10.0);

        park.displayAttractions();
    }
}
