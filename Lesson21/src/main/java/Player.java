import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Player {
    private static String[] args;
    private static final Logger loggerInfo = LoggerFactory.getLogger("logger.info");
    public Game.Elements makeMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Localization.getResourceBundle(args).getString("elements"));
        System.out.println(Localization.getResourceBundle(args).getString("enterMove"));
        String playerInput = scanner.nextLine();
        if (playerInput.equals("К") || playerInput.equals("П") || playerInput.equals("Б") ||
                playerInput.equals("R") || playerInput.equals("F") || playerInput.equals("P") || playerInput.equals("S")
                || playerInput.equals("r")|| playerInput.equals("p") || playerInput.equals("s") || playerInput.equals("f")
        || playerInput.equals("к") || playerInput.equals("п") || playerInput.equals("б")) {
            switch (playerInput.toUpperCase()) {
                case "R" : return Game.Elements.ROCK;
                case "F" : return Game.Elements.ROCK;
                case "P" : return Game.Elements.PAPER;
                case "S" : return Game.Elements.SCISSORS;
                case "К" : return Game.Elements.ROCK;
                case "Б" : return Game.Elements.PAPER;
                case "Н" : return Game.Elements.SCISSORS;
            }
        }
        loggerInfo.info("User entered incorrect value");
        return makeMove();
    }

    public static void setArgs(String[] arg) {
        args = arg;
    }
}
