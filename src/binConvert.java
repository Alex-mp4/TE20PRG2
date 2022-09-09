import java.io.*;
import java.util.Scanner;

public class binConvert {
    public static void main(String[] args) {
        String filnamn = "numbers.txt";
        /*Scanner scanner = null;
        try {
            scanner = new Scanner(new File(filnamn));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int[] numb = new int [2073600];
        int i = 0;

        while(scanner.hasNextInt()) {
            numb[i++]
        }*/

        File fout = new File("numbersBin.txt");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(fout);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        FileWriter fw = null;
        try {
            fw = new FileWriter(filnamn);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter utFil = new PrintWriter(bw);
        for (int i = 0 ; i < 1920*1080 ; i++) {
            try {
                BufferedReader fr = new BufferedReader(new FileReader(filnamn));
                String s = fr.readLine();
                s = Integer.toBinaryString(Integer.parseInt(s));
                //System.out.println(s);
                bw = new BufferedWriter(new OutputStreamWriter(fos));
                for (int o = 0 ; o < 1920*1080 ; o++) {
                    try {
                        bw.write("" + s);
                        bw.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
            }
        } catch (IOException e) {
                e.printStackTrace();
            }

        }
}}
