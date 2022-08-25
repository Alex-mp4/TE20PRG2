import javax.swing.*;

public class greetings {
    public static void main(String[] args) {
        String greet = JOptionPane.showInputDialog("Greetings");
        String alli = "Alligator!";
        if(greet.equals("Later!")){
            System.out.println(alli);
        }
        else {
            StringBuilder answ = new StringBuilder("h");
            int i = 0;
            for (char c : greet.toCharArray()) {
                if (c == 'e') {
                    i += 1;
                }
            }
            for (int o = 0; o < i; o++) {
                answ.append('e');
                answ.append('e');
            }
            answ.append('y');
            System.out.println(answ);
        }
    }
}
