import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RaschetTest {

    @Test
    public void bonus() {
        Raschet raschet = new Raschet();
        int expected = 10;
        int actual = raschet.bonus1(1000, false);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void percent() {
        Raschet raschet = new Raschet();
        int expected = 1;
        int actual = raschet.percent(1000, false);
        Assertions.assertEquals(expected, actual);
    }

}
