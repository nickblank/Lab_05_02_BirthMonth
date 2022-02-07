public class Main
{

    public static void main(String[] args)
    {
	    int birthMon = 0;
        String wrong = "N";

        if(birthMon >= 1 && birthMon <= 12)
        {
            System.out.println("Your birth month is " + birthMon);
        }
        else
        {
            System.out.println("You entered the incorrect birth month:" + wrong);
        }

    }
}
