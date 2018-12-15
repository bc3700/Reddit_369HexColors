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
            System.out.print("Enter the red, green, and blue decimal (ex. 255,99,71): ");
            String decString = scanner.next();
            String[] decStrings = decString.split(",");
            String hexString = DecToHex(Integer.parseInt(decStrings[0]), Integer.parseInt(decStrings[1]), Integer.parseInt(decStrings[2]));
            System.out.println("The hex string is: " + hexString);
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

    public static String DecToHex(int redDec, int greenDec, int blueDec) {
        int remainder = -1;
        String hexString = "#";
        hexString += Integer.toHexString(redDec) + Integer.toHexString(greenDec)+ Integer.toHexString(blueDec);
        return hexString;
    }
}
