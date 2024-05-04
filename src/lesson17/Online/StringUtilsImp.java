package lesson17.Online;

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
    public int[] findWord(String text, String word) throws NullPointerException {

        return new int[0];
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        return new double[0];
    }
}
