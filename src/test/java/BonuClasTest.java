import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonuClasTest {
    @Test
    public void bonus1(){
        Raschet raschet = new Raschet();
        int expected = 1;
        int actual = raschet.bonus1(100, false);
        Assertions.assertEquals(expected, actual);
    }
}
