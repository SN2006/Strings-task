package tasks.task2;

import tasks.utils.ConverterToString;
import tasks.utils.Printer;

public class Main {

    public static void main(String[] args) {
        String[] foods = new String[]{
                "orange", "plum", "tomato", "onion", "grape", "onion"
        };
        String[] interestingFoods = deleteWordFromArray(foods, "onion");
        String answer = ConverterToString.convertToString(interestingFoods);
        Printer.printText(answer);
    }

    public static String[] deleteWordFromArray(String[] array, String targetWord){
        String[] newArray = new String[array.length - countOfWord(array, targetWord)];
        int index = 0;
        for (String word : array){
            if (!targetWord.equalsIgnoreCase(word)) newArray[index++] = word;
        }
        return newArray;
    }

    private static int countOfWord(String[] words, String targetWord){
        int count = 0;
        for (String word : words){
            if (targetWord.equalsIgnoreCase(word)) count++;
        }
        return count;
    }

}
