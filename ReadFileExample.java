import java.io.*;

public class ReadFileExample {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("example.txt"));
            String firstLine = br.readLine();
            System.out.println("First line: " + firstLine);
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred.");
        }
    }
}
