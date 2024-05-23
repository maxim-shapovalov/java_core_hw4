package ru.gb.hw4;

public enum Holiday {
    New_Year("C Новым Годом, "), March_8("С 8 марта, "),February_23("С днем защитника отечества, ");

    private final String title;

    Holiday(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        System.out.println(title);
        return null;
    }
}
