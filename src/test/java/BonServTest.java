import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonServTest {
    @Test

    public void PodschetBonus() {
        BonServ bonServ = new BonServ();
        int expect = 3;
        int actual = bonServ.bonus(100, true);
        Assertions.assertEquals(expect, actual);
    }
}
