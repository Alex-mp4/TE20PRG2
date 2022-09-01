import javax.swing.*;

public class XORcrypt {
    public static void main(String[] args) {
        String message = JOptionPane.showInputDialog("yo");
        String cmess = "";
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            char v = scrobbler(c);
            cmess = cmess + v;
        }
        System.out.println(cmess);
    }

    private static char scrobbler(char c) {
        char key = '(';
        char crypt = (char)(c^key);
        System.out.println(crypt);
        return crypt;
        //System.out.println((char)(crypt^key));
        //System.out.println(Integer.toBinaryString(key));
    }
}
