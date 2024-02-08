package tasks.utils;

public class ConverterToString {

    public static String convertToString(String[] strings) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        for (String string : strings){
            stringBuilder
                    .append(count++)
                    .append(") ")
                    .append(string)
                    .append("\n");
        }
        return stringBuilder.toString();
    }

}
