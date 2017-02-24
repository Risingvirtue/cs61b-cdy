import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import db.Database;

public class Main {
    private static final String EXIT   = "exit";
    private static final String PROMPT = "> ";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Database db = new Database();
        System.out.print(PROMPT);

        String line = "";
        while ((line = in.readLine()) != null) {
            if (EXIT.equals(line)) {
                break;
            }

            if (!line.trim().isEmpty()) {
                String result = db.transact(line);
                if (result.length() > 0) {
<<<<<<< HEAD
                    System.out.println(db.transact(line));
=======
                    System.out.println(result);
>>>>>>> 8d9d4048c1934d071ccb7ba25aaf264d3b9fb1db
                }
            }
            System.out.print(PROMPT);
        }

        in.close();
    }
}
