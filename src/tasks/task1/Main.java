package tasks.task1;

import tasks.utils.ConverterToString;
import tasks.utils.Printer;

public class Main {

    public static void main(String[] args) {
        String[] foodsWithMistakes = new String[]{
                "brange", "plum", "tomato", "onibn", "grape"
        };
        String[] foodsWithoutMistakes = correctMistake(foodsWithMistakes);
        String answer = ConverterToString.convertToString(foodsWithoutMistakes);
        Printer.printText(answer);
    }

    private static String[] correctMistake(String[] foodsWithMistakes) {
        String[] foodsWithoutMistakes = new String[foodsWithMistakes.length];
        for (int i = 0; i < foodsWithMistakes.length; i++){
            foodsWithoutMistakes[i] = foodsWithMistakes[i].replaceAll("b", "o");
        }
        return foodsWithoutMistakes;
    }


}
