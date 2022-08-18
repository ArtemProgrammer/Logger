import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Game.setArgs(args);
        Player.setArgs(args);
        Game.start();
    }
}
