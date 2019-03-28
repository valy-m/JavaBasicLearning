package exercisesany.luhnformula;

import java.util.Arrays;

public class LuhnFormula {

    public static final String numberCard = "4539 1488 0343 6467";

    public static int[] ValidNumberCard(String number) {
        String s = number.replaceAll("\\s", "");

        //String[] s=number.split("\\s");
        int[] intArray = new int[s.length()];
        if (intArray.length < 1) {
            System.out.println("Number card input is not correct <16");
            System.exit(0);
        } else if (intArray.length > 16) {
            System.out.println("Number card input is not correct >16");
            System.exit(0);
        }

        for (int i = 0; i < s.length(); i++) {
            intArray[i] = Character.digit(s.charAt(i), 10);
        }
        return intArray;
    }

    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        String numberCard = input.nextLine();*/
        int[] numberValid = ValidNumberCard(numberCard);
        for (int i = 0; i < numberValid.length; i = i + 2) {
            if (numberValid[i] * 2 > 9) numberValid[i] = (numberValid[i] * 2 - 9);
            else numberValid[i] = numberValid[i] * 2;
        }
       /* for (int n : numberValid) {
            System.out.print(n);
        }*/

        int sum = Arrays.stream(numberValid).sum();
        /*int sum = 0;
        for (int i = 0; i < numberValid.length; i++) {
            sum += numberValid[i];
        }*/
        if (sum % 10 == 0)
            System.out.println("\nNumber card: " + numberCard + " is valid");
        else
            System.out.println("\nNumber card " + numberCard + " invalid");
    }
}