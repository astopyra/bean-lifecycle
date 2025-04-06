package com.kodilla.bean_lifecycle;

import java.util.Random;

public class Student {
    private String indexNumber;

    public Student(int z) {
        this.indexNumber = generateRandomString(z);
    }

    private String generateRandomString(int stringLength) {
        int leftLimit = 33; // sign '!'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();

        return random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(stringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
