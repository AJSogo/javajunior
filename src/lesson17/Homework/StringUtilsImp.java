package lesson17.Homework;

import lesson17.Online.CustomException;
import lesson17.Online.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilsImp implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {

        if(number1 == null || number2 == null){
            throw new NullPointerException("number1 == null || number2 == null");
        }
        int numberOne= Integer.parseInt(number1);
        int numberTwo= Integer.parseInt(number2);
        if(numberTwo == 0){
            throw new ArithmeticException("numberTwo == 0");
        }

        return 0;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException, CustomException {
        if(text == null || word == null){
            throw new NullPointerException("text == null || word == null");
        }

        List<Integer> indexes = new ArrayList<>();

        int index = text.indexOf(word);
        while (index >=0){
            indexes.add(index);
            index = text.indexOf(word, index+1);
        }

       return indexes.stream().mapToInt(Integer::intValue).toArray();
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        if(text == null){
            throw new NullPointerException("text == null || word == null");
        }

        List<Double> numbers = new ArrayList<>();

        Pattern pattern = Pattern.compile("\\d+ (\\.\\d+)?");

        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            try {
                numbers.add(Double.parseDouble(matcher.group()));
            }
            catch (NumberFormatException e){
                throw  new CustomException("Error parsing number: " + e.getMessage());
            }
        }

        if(numbers.isEmpty()){
            throw new CustomException("Not found");
        }

        return numbers.stream().mapToDouble(Double:: doubleValue).toArray();
}
}
