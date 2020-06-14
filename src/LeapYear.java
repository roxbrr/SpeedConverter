public class LeapYear
{
    public static boolean isLeapYear(int year)
    {
        if(year < 0 || year > 9999)
        {
            System.out.println("false");
            return false;
        }
        else if(year % 4 == 0 &&
                year % 100 == 0 &&
                year % 400 == 0)
        {
            System.out.println("true");
            return true;
        }
        else if(year % 4 ==0 &&
                year % 100 == 0 &&
                year % 400 != 0)
        {
            System.out.println("false");
            return false;
        }
        else
        {
            System.out.println("false");
            return false;
        }
    }
}
