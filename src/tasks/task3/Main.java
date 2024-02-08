package tasks.task3;

import tasks.utils.Printer;

import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] names = new String[]{
                "Bob", "Alice", "Tom", "Lucy", "Bob", "Lisa"
        };
        String nameToSearch = getData();
        int countOfSearchingName = countOfName(names, nameToSearch);
        String answer = nameInfoString(nameToSearch, countOfSearchingName);
        Printer.printText(answer);
    }

    private static String noNameString(String name){
        return new StringBuilder()
                .append("The name ")
                .append(name)
                .append(" is not in the array!")
                .toString();
    }

    private static String nameInfoString(String name, int count){
        if (count == 0) return noNameString(name);
        return new StringBuilder()
                .append("The name ")
                .append(name)
                .append(" appears in the array ")
                .append(count)
                .append(" times")
                .toString();
    }

    private static int countOfName(String[] names, String targetName){
        int count = 0;
        for (String name : names){
            if (name.equalsIgnoreCase(targetName)) count++;
        }
        return count;
    }

    private static String getData(){
        System.out.println("Enter a name to search: ");
        return scanner.next();
    }

}
