import javax.swing.*;
import java.util.Scanner;

public class kuratorAI {
    public static void main(String[] args) {
        int min = 0;
        int max = 7;
        String user = null;
        String userSave = "";
        Scanner myObj = new Scanner(System.in);
        int amountOfAnswers = (int) (Math.random() * (max - min + 1) + min);
        String[] svar = {"That's craaazy", "Cool story", "You'll feel better soon", "Okie-dokie",
                "I didn't ask but ok", "Wow", "No way that happened", "Alright"};
        System.out.println("What do you want to talk about?");
        for (int i = 0; i < amountOfAnswers; i++) {
            user = myObj.nextLine();
            userSave += ("\n" + user);
            int rand = (int) (Math.random() * (max - min + 1) + min);
            if (svar[rand].equals(" ")) {
                System.out.println(userSave);
                System.exit(0);
            }
            System.out.println(svar[rand]);
            svar[rand] = " ";
        }
        System.out.println(userSave);
    }
}
