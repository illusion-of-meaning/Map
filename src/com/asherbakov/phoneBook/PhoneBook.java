package com.asherbakov.phoneBook;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {
    private static Map<String, String> phoneBook = new HashMap<>();

    public void addPhoneNumber(String person, String number) {
        if (person != null && !person.isBlank() &&
                number != null && !number.isBlank() && numberIsValid(number)) {
            if (phoneBook.containsKey(person)) {
                phoneBook.replace(person, number);
            } else {
                phoneBook.put(person, number);
            }
        } else {
            throw new IllegalArgumentException("Не указаны, либо, не верно указаны данные.");
        }
    }

    public void printPhoneBook() {
        for (Map.Entry entry : phoneBook.entrySet()) {
            System.out.printf("%20s | %12s\n", entry.getKey(), entry.getValue());
        }
    }

    private boolean numberIsValid(String number) {
        Pattern pattern = Pattern.compile("\\+?\\d{11}");
        Matcher matcher = pattern.matcher(number);
        return matcher.find();
    }
}
