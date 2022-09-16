import java.io.*;


public class binConvert {
    public static void main(String[] args) {
        int x;
        DataOutputStream s;
        try {
            s = new DataOutputStream(new BufferedOutputStream((new FileOutputStream("numbersBin.txt"))));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String filnamn = "numbers.txt";

        String output;
        BufferedReader fr;

        try {
            fr = new BufferedReader(new FileReader(filnamn));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0 ; i < 1920*1080 ; i++) {
            try {
                output = fr.readLine();
                if (output == null) {
                    break;
                }
                else {
                    x = Integer.parseInt(output);
                    s.writeInt(x);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}}
