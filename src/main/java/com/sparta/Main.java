package com.sparta;

public class Main {
    public static void main(String[] args) {
        String[] words = {"The", "cat", "in", "the", "hat"};
        String phrase = "The cat in the hat";
        System.out.println(countWords(words, 't'));
        System.out.println(countWordsInSting(phrase, 't'));
    }

    public static int countWords(String[] stringsArr, char letter) {
        int wordsBeginningWithLetter = 0;
        for(int i = 0; i < stringsArr.length; i++) {
            if (stringsArr[i].toLowerCase().charAt(0) == letter) {
                wordsBeginningWithLetter++;
            }
        }
        return wordsBeginningWithLetter;
    }

    public static int countWordsInSting(String phrase, char letter) {
        String[] phraseArr = phrase.split(" ");
        int wordsBeginningWithLetter = 0;
        for(int i = 0; i < phraseArr.length; i++) {
            if (phraseArr[i].toLowerCase().charAt(0) == letter) {
                wordsBeginningWithLetter++;
            }
        }
        return wordsBeginningWithLetter;
    }
}