import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Total {
    
    public static void main(String[] args) throws FileNotFoundException 
    {
        Scanner console = new Scanner(System.in);

        System.out.print("Input file: ");
        String inputFileName = console.next();

        System.out.print("Boy Output file: ");
        String boyFileName = console.next();

        System.out.print("Girl Output file: ");
        String girlFileName = console.next();

        File inputFile = new File("C:\\Users\\saimo\\SP2022\\CSCIHW-2102-S2023\\HW3\\babynames.txt");
        Scanner in = new Scanner(inputFile);

        PrintWriter boyOut = new PrintWriter(boyFileName);
        PrintWriter girlOut = new PrintWriter(girlFileName);

        double totalc = 0;
        double totalf = 0;

        while (in.hasNextDouble())
        {
            String a = in.next();
            String b = in.next();
            String c = in.next();
            String d = in.next();
            String e = in.next();
            String f = in.next();
            String g = in.next();

            double c1 = Double.parseDouble(c);
            double f1 = Double.parseDouble(f);

            totalc += c1;
            totalf += f1;
        }

            boyOut.printf("%s\n", totalc);
            girlOut.printf("%s\n", totalf);

            in.close();
            boyOut.close();
            girlOut.close();
    }
}



