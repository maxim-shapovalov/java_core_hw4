package ru.gb.hw4;

public enum Gender {
    Male("Мужчина"), Female("Женщина");

    private String title;

    Gender(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "title='" + title + '\'' +
                '}';
    }
}
