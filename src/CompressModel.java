import javax.swing.*;

public class CompressModel {
    private String messageValue;

    public void scrobbleOrDescrobble {
        String message = messageFromView;
        String cmess = "";
        int key = '(';
        int x = 0;
        char v = 0;
        for (int i = 0; i < message.length(); i++) {
            int c = message.charAt(x);
            if (cryptOrDecrypt == crypt) {
                v = (char)scrobbler(c, key, p);
            }
            else {
                v = (char)descrobbler(key, c);
            }
            cmess = cmess + v;
            x++;
            if (x > message.length()) {
                x = 0;
            }
        }
        messageValue = cmess;
    }

    private static int descrobbler(int key, int c) {
        return (c^key);
    }

    private static int scrobbler(int c, int key, int p) {
        return (c^key);
    }

    public String getMessageValue() {
        return messageValue;
    }
}
