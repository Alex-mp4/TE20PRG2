/*import java.io.*;
import java.util.ArrayList;

public class fileReader {
    public static void main(String[] args) {
        String file = "file.txt";

        BufferedReader inFile = openTextFileForReading(file);
        ArrayList<String> fileContent = readAllText(inFile);
        DataOutputStream outfile = openBinaryFileForWriting(file);
        writeTextAsBinary(fileContent, outfile);

    }

    private static void writeTextAsBinary(ArrayList<String> fileContent, DataOutputStream outfile) {
        for (int i = 0; i < fileContent.size; i++) {

        }
    }

    private static DataOutputStream openBinaryFileForWriting(String file) {
        DataOutputStream outFile;
        try {
            outFile = new DataOutputStream(new FileOutputStream(file));
        }
        catch (FileNotFoundException e) {
            System.out.println("Unable to open file");
            outFile = new DataOutputStream(new OutputStream(System.out));
        }
    }

    private static ArrayList<String> readAllText(BufferedReader inFile) {
        ArrayList<String> text = new ArrayList<>();
        String line = null;
        try {
            line = inFile.readLine();
            while (line != null) {
                text.add(line);
                line = inFile.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static BufferedReader openTextFileForReading(String file) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(file));
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return in;
    }
}*/
