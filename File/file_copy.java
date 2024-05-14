package file;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file_copy{
    public static void main(String[] args) {
        String sourceFileName = "D:\\source.txt"; 
        String destinationFileName = "D:\\destination.txt"; 

        try {
            FileReader reader = new FileReader(sourceFileName);
            FileWriter writer = new FileWriter(destinationFileName);
            
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            
            reader.close();
            writer.close();
            
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
