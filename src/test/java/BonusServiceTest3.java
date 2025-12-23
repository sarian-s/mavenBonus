import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BonusServiceTest3 {

   private static BonusService3 service;
    @BeforeAll
    static void setUp() {
        service = new BonusService3();
    }



    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
       // BonusService2 service = new BonusService2();

        // подготавливаем данные:
        int amount = 1000;
        boolean registered = true;
        int expected = 30;

        // вызываем целевой метод:
        int actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForUnderRegisteredAndUnderLimit() {
       // BonusService2 service = new BonusService2();

        // подготавливаем данные:
        int amount = 1000;
        boolean registered = false;
        int expected = 10;

        // вызываем целевой метод:
        int actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        //BonusService2 service = new BonusService2();

        // подготавливаем данные:
        //int amount = 1_000_000;
        //boolean registered = true;
        int expected = 500;

        // вызываем целевой метод:
        int actual = service.calculate(1_000_0000, true);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateUndRegisteredAndOverLimit() {
        //BonusService2 service = new BonusService2();

        // подготавливаем данные:
        //int amount = 1_000_000;
        //boolean registered = true;
        int expected = 500;

        // вызываем целевой метод:
        int actual = service.calculate(1_000_0000, false);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}
