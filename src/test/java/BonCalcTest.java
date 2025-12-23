import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonCalcTest {
   @Test
   public void greatBonus(){
       Raschet raschet = new Raschet();
           int expected = 50;
           int actual = raschet.bonus1(5000, false);
           Assertions.assertEquals(expected,actual);
       }

   }
