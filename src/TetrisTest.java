import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TetrisTest {
    @Test
    void canRotate() {
        Tetris tetrisTest = new Tetris();
        Boolean expectedResult = false;
        Boolean actualResult1 = true;
        Boolean actualResult2 = false;
        actualResult1 = tetrisTest.canRotate(Shape.Square);
        actualResult2 = tetrisTest.canRotate(Shape.IShape);
        Assertions.assertEquals(expectedResult,actualResult1);
        //Assertions.assertEquals(expectedResult,actualResult2);
    }

    @Test
    void canMove() {
        Tetris tetrisTest = new Tetris();
        Boolean expectedResult = true;
        Boolean actualResult = false;
        actualResult = tetrisTest.canMove(Shape.Square, Tetris.Dir.down);
        Assertions.assertEquals(expectedResult,actualResult);
    }
}
