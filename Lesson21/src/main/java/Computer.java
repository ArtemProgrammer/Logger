import java.util.Random;

public class Computer {
    public Game.Elements makeMove() {
        Game.Elements[] elements = Game.Elements.values();
        int index = random();
        return elements[index];
    }

    private int random() {
        int min = 0;
        int max = 2;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        return i;
    }
}
