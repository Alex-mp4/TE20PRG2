import java.io.*;
import java.util.Random;

public class filerReaderMark2 {
    public static void main(String[] args) {
        int x;
        Random r = new Random();

        File fout = new File("numbers.txt");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(fout);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
        for (int i = 0 ; i < 1920*1080 ; i++) {
            x = r.nextInt(0xffffff);
            try {
                bw.write("" + x);
                bw.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }
}
