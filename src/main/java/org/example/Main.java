package org.example;


import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("Racecar"));
    }

    public static boolean checkForPalindrome(String text) {
        String cleanText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        List<Character> charList = new LinkedList<>();

        for (char c: cleanText.toCharArray()) {
            charList.add(c);
        }

        for(int i = 0; i < charList.size() / 2; i++) {
                if (charList.get(i).equals(charList.get(charList.size() - 1 - i))) {
                    continue;
                } else {
                    return false;
                }
        }
        return true;
    }

    public static String convertDecimalToBinary(int num) {
        LinkedList<Integer> binaryList = new LinkedList<>();

        while (num > 0 ) {
            int remainNum = num % 2;
            binaryList.addFirst(remainNum);
            num = num / 2;
        }

        StringBuilder binaryString = new StringBuilder();
        for(int digit: binaryList) {
            binaryString.append(digit);
        }
        return binaryString.toString();
    }
}