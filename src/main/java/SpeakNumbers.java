import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SpeakNumbers {
    public static void main(String[] args) throws IOException {
        SpeakNumbers s = new SpeakNumbers();
        s.printWords(new Scanner(System.in));
    }

    public void printWords(Scanner scanner) throws IOException {
        System.out.println("Enter any number between 1-999 (inclusive). To exit, press '0'\n");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();

        int length = num.length();
        int number = Integer.parseInt(num);

        if (number < 1000 && number > 0) {
            Double firstDigit = 1 * Math.pow(10, 2);
            Double firstRemain = number % firstDigit;
            Double firstDivide = number / firstDigit;

            if (firstDivide.intValue() != 0) {
                String firstWord = "";
                switch (firstDivide.intValue()) {
                    case 1:
                        firstWord = "One";
                        break;
                    case 2:
                        firstWord = "Two";
                        break;
                    case 3:
                        firstWord = "Three";
                        break;
                    case 4:
                        firstWord = "Four";
                        break;
                    case 5:
                        firstWord = "Five";
                        break;
                    case 6:
                        firstWord = "Six";
                        break;
                    case 7:
                        firstWord = "Seven";
                        break;
                    case 8:
                        firstWord = "Eight";
                        break;
                    case 9:
                        firstWord = "Nine";
                        break;
                }
                if (firstWord != "")
                    System.out.print(firstWord + " Hundred ");
            }

            Double secondDigit = 1 * Math.pow(10, 1);
            Double secondRemain = firstRemain % secondDigit;
            Double secondDivide = firstRemain / secondDigit;

            Boolean isSecondDigitOne = false;

            if (secondDivide.intValue() != 0) {
                String firstWord = "";
                switch (secondDivide.intValue()) {
                    case 1:
                        isSecondDigitOne = true;
                        break;
                    case 2:
                        firstWord = "Twenty";
                        break;
                    case 3:
                        firstWord = "Thirty";
                        break;
                    case 4:
                        firstWord = "Forty";
                        break;
                    case 5:
                        firstWord = "Fifty";
                        break;
                    case 6:
                        firstWord = "Sixty";
                        break;
                    case 7:
                        firstWord = "Seventy";
                        break;
                    case 8:
                        firstWord = "Eighty";
                        break;
                    case 9:
                        firstWord = "Ninety";
                        break;
                }
                if (firstDivide.intValue() == 0)
                    System.out.print(firstWord + " ");
                else if (firstWord != "")
                    System.out.print("And " + firstWord + " ");
            }

            Double thirdDivide = secondRemain / 1;

            if (thirdDivide.intValue() > -1) {
                String firstWord = "";
                switch (thirdDivide.intValue()) {
                    case 1:
                        if (isSecondDigitOne)
                            firstWord = "Eleven";
                        else
                            firstWord = "One";
                        break;
                    case 2:
                        if (isSecondDigitOne)
                            firstWord = "Twelve";
                        else
                            firstWord = "Two";
                        break;
                    case 3:
                        if (isSecondDigitOne)
                            firstWord = "Thirteen";
                        else
                            firstWord = "Three";
                        break;
                    case 4:
                        if (isSecondDigitOne)
                            firstWord = "Fourteen";
                        else
                            firstWord = "Four";
                        break;
                    case 5:
                        if (isSecondDigitOne)
                            firstWord = "Fifteen";
                        else
                            firstWord = "Five";
                        break;
                    case 6:
                        if (isSecondDigitOne)
                            firstWord = "Sixteen";
                        else
                            firstWord = "Six";
                        break;
                    case 7:
                        if (isSecondDigitOne)
                            firstWord = "Seventeen";
                        else
                            firstWord = "Seven";
                        break;
                    case 8:
                        if (isSecondDigitOne)
                            firstWord = "Eighteen";
                        else
                            firstWord = "Eight";
                        break;
                    case 9:
                        if (isSecondDigitOne)
                            firstWord = "Nineteen";
                        else
                            firstWord = "Nine";
                        break;
                    case 0:
                        if (isSecondDigitOne)
                            firstWord = "Ten";
                        break;
                }
                if(isSecondDigitOne && secondDivide.intValue() == 0)
                    firstWord = "And "+firstWord;
                if(firstWord != "")
                    System.out.print(firstWord+"\n");
            }
        }
        else
        {
            System.out.println("Wrong number.");
        }
    }
}
