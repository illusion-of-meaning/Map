package com.asherbakov.phoneBook;

public enum TestFioData {
    fio1("Мазуров Михаил"),
    fio2("Мазуров Виталий"),
    fio3("Шарапов Олег"),
    fio4("Фролов Даниил"),
    fio5("Орлов Виталий"),
    fio6("Михайлин Антон"),
    fio7("Навак Денис"),
    fio8("Стрельцов Илья"),
    fio9("Устинов Михаил"),
    fio10("Гладышев Максим"),
    fio11("Синяговский Павел"),
    fio12("Шаталов Михаил"),
    fio13("Бухицин Юрий"),
    fio14("Строгов Денис"),
    fio15("Лагутин Назар"),
    fio16("Данилов Антон"),
    fio17("Осипов Валерий"),
    fio18("Данин Олег"),
    fio19("Шершнев Виталий"),
    fio20("Хорватов Максим");

    private String fio;
    TestFioData(String str) {
        fio = str;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }
}
