import javax.swing.*;

public class XORcrypt {
    public static void main(String[] args) {
        String message = JOptionPane.showInputDialog("yo");
        int p = Integer.parseInt(JOptionPane.showInputDialog("Crypt = 1\nDecrypt = 0"));
        String cmess = "";
        int key = '(';
        int x = 0;
        for (int i = 0; i < message.length(); i++) {
            int c = message.charAt(x);
            char v = (char)scrobbler(c, key, p);
            cmess = cmess + v;
            x++;
            if (x > message.length()) {
                x = 0;
            }
        }
        System.out.println(cmess);
    }

    private static int scrobbler(int c, int key, int p) {
        //if (p == 1) {
            int crypt = (c^key);
            return crypt;
        //}
        /*else {
            int decrypt = (crypt^key);
            return decrypt;
        }*/


    }
}
