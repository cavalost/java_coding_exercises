package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return firstName.substring(0,1).toUpperCase() + '.' + lastName.substring(0,1).toUpperCase();
    }

    public double addVat(double originalPrice, double vatRate) {
        return (double)Math.round((originalPrice * (1 + vatRate/100)) * 100d) / 100d;
    }

    public String reverse(String sentence) {
        String arrSentence[] = sentence.split("");
        String result = "";
        for (int i = arrSentence.length - 1; i >= 0; i--) {
            result += arrSentence[i];
        }
        return result;

    }

    public int countLinuxUsers(List<User> users) {
        int counter = 0;
        for (User user: users) {
            if (user.getType().equals("Linux")) {
                counter++;
            }
        }
        return counter;
    }
}
