import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Player {
    private static final Logger loggerInfo = LoggerFactory.getLogger("logger.info");
    public Game.Elements makeMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rock, paper or scissors?");
        System.out.println("Enter 'R', 'P' or 'S'.");
        String playerInput = scanner.nextLine();
        if (playerInput.equals("R") || playerInput.equals("P") || playerInput.equals("S")
                || playerInput.equals("r")|| playerInput.equals("p") || playerInput.equals("s")) {
            switch (playerInput.toUpperCase()) {
                case "R" : return Game.Elements.ROCK;
                case "P" : return Game.Elements.PAPER;
                case "S" : return Game.Elements.SCISSORS;
            }
        }
        loggerInfo.info("User entered incorrect value");
        return makeMove();
    }
}
