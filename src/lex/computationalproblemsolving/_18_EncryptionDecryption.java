package lex.computationalproblemsolving;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _18_EncryptionDecryption {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        List<String> details = Arrays.stream(inputString.split(",")).collect(Collectors.toList());
        Integer firstDigit = Integer.parseInt(String.valueOf(details.get(1).charAt(0)));
        Integer secondDigit = Integer.parseInt(String.valueOf(details.get(1).charAt(1)));
        Integer thirdDigit = Integer.parseInt(String.valueOf(details.get(1).charAt(2)));
        String encryptedData = encrypt(details.get(0), firstDigit, secondDigit, thirdDigit);
        System.out.println("Encrypted String of " + details.get(0) + " is : " + encryptedData);
        System.out.println("Decrypted String of " + encryptedData + " is : " + decrypt(encryptedData, firstDigit, secondDigit, thirdDigit));
        in.close();
    }

    private static String encrypt(String s, Integer firstDigit, Integer secondDigit, Integer thirdDigit) {
        String dataChar = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i)))
                dataChar += (char) (s.charAt(i) - firstDigit);
            else if (Character.isLowerCase(s.charAt(i)))
                dataChar += (char) (s.charAt(i) - secondDigit);
            else if (Character.isDigit(s.charAt(i)))
                dataChar += (char) (s.charAt(i) - thirdDigit);
            else
                dataChar += s.charAt(i);
        }
        return dataChar;
    }

    private static String decrypt(String s, Integer firstDigit, Integer secondDigit, Integer thirdDigit) {
        char dataChar = '\0';
        StringBuilder decrData = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            dataChar = s.charAt(i);
            if (Character.isUpperCase(dataChar + firstDigit))
                dataChar = (char) (dataChar + firstDigit);
            else if (Character.isLowerCase(dataChar + secondDigit))
                dataChar = (char) (dataChar + secondDigit);
            else if (Character.isDigit(dataChar + thirdDigit))
                dataChar = (char) (dataChar + thirdDigit);
            decrData.append(dataChar);
        }
        return decrData.toString();
    }

}
