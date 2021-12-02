import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScoreboarTest {
    public Scoreboard scoreBoard;

    @Test
    void reset() {
        scoreBoard = new Scoreboard();
        scoreBoard.reset();
        Assertions.assertEquals(0, Boolean.compare(scoreBoard.gameOver,false));
    }

    @Test
    void addLines() {
        scoreBoard = new Scoreboard();
        int expectedResult = 20;
        int actualResult = 0;
        scoreBoard.addLines(2);
        actualResult = scoreBoard.score;
        Assertions.assertEquals(expectedResult,actualResult);
    }
}
