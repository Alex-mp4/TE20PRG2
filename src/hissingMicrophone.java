import javax.swing.*;

public class hissingMicrophone {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("A word");
        int i = 0;
        for (char c: s.toCharArray()){
            i++;
        }
        for (int o = 0; o < i; o++){
            if (s.charAt(o) == 's'){
                int p = o+1;
                if (s.charAt(p) == 's'){
                    System.out.println("Hissing");
                }
                else {
                    System.out.println("No hissing");
                }
            }
            else {
                System.out.println("No hissing");
                break;
            }
        }
    }
}
