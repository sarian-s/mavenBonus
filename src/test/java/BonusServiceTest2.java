import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BonusServiceTest2 {

    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService2 service = new BonusService2();

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
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService2 service = new BonusService2();

        // подготавливаем данные:
        //int amount = 1_000_000;
        //boolean registered = true;
        int expected = 500;

        // вызываем целевой метод:
        int actual = service.calculate(1_000_0000, true);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}
