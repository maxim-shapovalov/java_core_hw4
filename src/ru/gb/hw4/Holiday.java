package ru.gb.hw4;

public enum Holiday {
    New_Year("C ����� �����, "), March_8("� 8 �����, "),February_23("� ���� ��������� ���������, ");

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
