import java.util.Scanner;

public class HexColorToDecimal
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("HexToDec or DecToHex (enter one)? ");
        String userDecision = scanner.next();

        if(userDecision.equals("HexToDec")) {
            String userInput = getUserInput(scanner);
            HexNumber hexNumber = new HexNumber(userInput);
            System.out.println();
            System.out.println("The decimal value of " + userInput + " is: \n" +
                    "Red: " + hexNumber.getRedDecimal() + "\n" +
                    "Green: " + hexNumber.getGreenDecimal() + "\n" +
                    "Blue: " + hexNumber.getBlueDecimal());
        }
        else if(userDecision.equals("DecToHex")) {

        }
        else {
            System.out.println("Invalid user input, closing program");
        }
    }

    public static String getUserInput(Scanner scanner)
    {
        String userInput;
        while(true)
        {
            System.out.print("Enter in a hex number (ex: '#7FFFD4'): ");
            userInput = scanner.next();
            if(userInput.length() == 7)
            {
                break;
            }
            else
            {
                System.out.println("The entered hex number is not the correct length.");
            }
        }
        scanner.close();
        return userInput;
    }



}
