public class DigitsSum {
    private int sum;

//ładny sposób z internetu
//    public int sumDigits(int number) {
//        while (number > 0) {
//            sum+=number % 10;
//            number = number / 10;
//        }
//
//        return sum;
//    }

//trochę brzydziej, ale po mojemu :)

    public int sumDigits(int number) {
        String strNumber = String.valueOf(number);
        for (int i = 0; i < strNumber.length(); i++) {
            sum += Character.getNumericValue(strNumber.charAt(i));
        }

        return sum;
    }
}
