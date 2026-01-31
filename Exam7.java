import java.io.*;
import java.util.Scanner;

public class Exam7
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        File file = new File(fileName);

        try {
            // Write operation
            System.out.println("Writing to the file...");
            FileWriter writer = new FileWriter(file, false); // Overwrites the file
            System.out.println("Enter text to write into the file:");
            String content = scanner.nextLine();
            writer.write(content);
            writer.close();
            System.out.println("File written successfully!");

            // Append operation
            System.out.println("Appending to the file...");
            FileWriter appender = new FileWriter(file, true); // Appends to the file
            System.out.println("Enter text to append to the file:");
            String appendContent = scanner.nextLine();
            appender.write("\n" + appendContent);
            appender.close();
            System.out.println("File appended successfully!");

            // Read operation
            System.out.println("Reading from the file...");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("File content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred: " + e.getMessage());
        } 
        finally 
        {
            scanner.close();
        }
    }
}