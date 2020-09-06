package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return Character.toUpperCase(firstName.charAt(0)) + "." + Character.toUpperCase(lastName.charAt(0));
    }

    public double addVat(double originalPrice, double vatRate) {
        double vat = (originalPrice + (originalPrice * vatRate / 100));
        if(Math.abs(vat-Math.floor(vat)) < 0.001){
            int truncatedNumberInt = (int)vat;
            return truncatedNumberInt;
        } else {
            vat = Math.floor(vat * 100) / 100;
            return vat;
        }
    }

    public String reverse(String sentence) {
        return new StringBuilder(sentence).reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {
        int count = 0;
        for(User user : users) {
            if (user.getType() == "Linux") {
                count++;
            }
        }
        return count;
    }
}
