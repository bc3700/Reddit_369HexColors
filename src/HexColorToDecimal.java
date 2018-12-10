import java.util.Scanner;

public class HexColorToDecimal
{
    public static void main(String args[])
    {
        String userInput = getUserInput();
        HexNumber hexNumber = new HexNumber(userInput);
        System.out.println("The decimal value of " + userInput + " is: \n" +
            "Red: " + hexNumber.getRedDecimal() + "\n" +
            "Green: " + hexNumber.getGreenDecimal() + "\n" +
            "Blue: " + hexNumber.getBlueDecimal());
    }

    public static String getUserInput()
    {
        String userInput;
        Scanner scanner = new Scanner(System.in);
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
