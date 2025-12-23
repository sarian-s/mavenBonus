import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonServ1Test {
    BonServ1 bonServ1 = new BonServ1();
    BonServ bonServ = new BonServ();

    @Test

    public void bonus(){

        int percent =30;
        int actual = bonServ.bonus (1000, true);
        Assertions.assertEquals(percent ,actual);
    }

    @Test
    public void bonus2(){

        int percent =9;
        int actual = bonServ1. bonusServiceTernarn (300, true);
        Assertions.assertEquals(percent ,actual);
    }

    @Test
    public void bonus1(){

        int percent =3;
        int actual = bonServ1.bonusService (300, false);
        Assertions.assertEquals(percent ,actual);
    }

    @Test
    public void percent(){
        int percent = 1;
        int actual = bonServ1. bonusServicePercent (false);
        Assertions.assertEquals(percent ,actual);
    }

}