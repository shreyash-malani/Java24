public class Exam1 
{

    public static void main(String[] args) 
    {
        if (args.length != 3) 
        {
            System.out.println("Please provide the year, month, and day in the format: year month day");
            return;
        }

        try 
        {
            int year = Integer.parseInt(args[0]);
            int month = Integer.parseInt(args[1]);
            int day = Integer.parseInt(args[2]);

            // Adjust month and year for Zeller's algorithm
            if (month < 3) 
            {
                month += 12;
                year -= 1;
            }

            // Zeller's Congruence algorithm
            int k = year % 100;
            int j = year / 100;

            // Day of the week (0 = Saturday, 1 = Sunday, 2 = Monday, ..., 6 = Friday)
            int h = (day + (13 * (month + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;

            // Map the result to day names
            String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
            
            // Print the result
            System.out.println("The day of the week for " + args[0] + "-" + args[1] + "-" + args[2] + " is: " + days[h]);
        }
        catch (Exception e) 
        {
            System.out.println("Invalid input. Please provide valid year, month, and day.");
        }
    }
}