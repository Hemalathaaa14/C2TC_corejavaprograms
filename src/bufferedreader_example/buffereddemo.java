package bufferedreader_example;
import java.io.*;   // Importing for BufferedReader, InputStreamReader, IOException

public class buffereddemo {

    public static void main(String[] args) throws IOException {
        
        // Creating BufferedReader object to read input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Input Name
        System.out.println("Enter the name:");
        String name = br.readLine();

        // Input Age
        System.out.println("Enter the age:");
        int age = Integer.parseInt(br.readLine());

        // Input Salary
        System.out.println("Enter the salary:");
        double salary = Double.parseDouble(br.readLine());

        // Printing values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
