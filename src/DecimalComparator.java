public class DecimalComparator
{
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2)
    {
        num1 = num1 * 1000;     //moves the decimal place to the right 3 digits
        num2 = num2 * 1000;

        int newNum1 = (int) num1;   //casts num1 to int to truncate beyond decimal
        int newNum2 = (int) num2;

        if(newNum1 == newNum2)      //checks new values
        {
            System.out.println("true");
            return true;
        }
        else
        {
            System.out.println("false");
            return false;
        }

    }
}
