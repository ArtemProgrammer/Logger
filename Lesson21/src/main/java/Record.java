import java.io.FileOutputStream;
import java.io.IOException;

public class Record {
    private static final String fileName = "log.txt";
    private static final String playerName = "Name = ";
    private static final String countGamesText = "Quantity game = ";
    private static final String playerScoreText = "Player score = ";
    private static final String computerScoreText = "Computer score = ";
    private static final String resultText = "Result is: ";
    private static final String blink = "\n";


    public static void record(String name, String countGames, String playerScore, String computerScore) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(fileName, true);
        String result = name + " played " + countGames + " games. Win: " + playerScore + ". Lose: " + computerScore;
        outputStream.write(playerName.getBytes());
        outputStream.write(name.getBytes());
        outputStream.write(blink.getBytes());
        outputStream.write(countGamesText.getBytes());
        outputStream.write(countGames.getBytes());
        outputStream.write(blink.getBytes());
        outputStream.write(playerScoreText.getBytes());
        outputStream.write(playerScore.getBytes());
        outputStream.write(blink.getBytes());
        outputStream.write(computerScoreText.getBytes());
        outputStream.write(computerScore.getBytes());
        outputStream.write(blink.getBytes());
        outputStream.write(resultText.getBytes());
        outputStream.write(result.getBytes());
        outputStream.write(blink.getBytes());
        outputStream.write(blink.getBytes());
        outputStream.flush();
        outputStream.close();
    }
}
