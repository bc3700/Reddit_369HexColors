public class HexNumber
{
    private String hexString;
    private String redHex;
    private String greenHex;
    private String blueHex;

    private int redDecimal;
    private int greenDecimal;
    private int blueDecimal;


    public HexNumber(String hexString)
    {
        this.hexString = hexString;
        this.redHex = hexString.substring(1,3);
        this.greenHex = hexString.substring(3,5);
        this.blueHex = hexString.substring(5,7);

        this.redDecimal = convertHexToDecimal(redHex);
        this.greenDecimal = convertHexToDecimal(greenHex);
        this.blueDecimal = convertHexToDecimal(blueHex);
    }

    public int convertHexToDecimal(String hexValue)
    {
        int decimal;
        if(checkIfDigit(hexValue.substring(0, 1)))
        {
            decimal = Integer.parseInt(hexValue.substring(0, 1)) * 16;
            if(checkIfDigit(hexValue.substring(1)))
            {
                decimal += Integer.parseInt(hexValue.substring(1)) * 1;
            }
            else
            {
                int value = hexValue.charAt(1) - 55; //Converts from ASCII number to number needed for conversion
                decimal += value * 1;
            }
        }
        else
        {
            int value = hexValue.charAt(0) - 55;
            decimal = value * 16; //Converts from ASCII number to number needed for conversion
            if(checkIfDigit(hexValue.substring(1)))
            {
                decimal += Integer.parseInt(hexValue.substring(1)) * 1;
            }
            else
            {
                value = hexValue.charAt(1) - 55;
                decimal += value * 1;
            }
        }
        return decimal;
    }

    private boolean checkIfDigit(String c)
    {
        try {
            Integer.parseInt(c);
            return true;
        }
        catch(NumberFormatException e) {
            return false;
        }

    }

    public int getRedDecimal() {return redDecimal;}
    public int getGreenDecimal() {return greenDecimal;}
    public int getBlueDecimal()  {return blueDecimal;}
}
