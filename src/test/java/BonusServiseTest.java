
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

        public class BonusServiseTest {
            private static BonusService service;

            @BeforeAll
            static void setUp() {
                service = new BonusService();
            }

            @Test
            void shouldCalculateForRegisteredAndUnderLimit() {
                // подготавливаем данные:
                int expected = 30;

                // вызываем целевой метод:
                int actual = service.calculate(1000, true);

                // производим проверку (сравниваем ожидаемый и фактический):
                Assertions.assertEquals(expected, actual);
            }




        @Test
        void shouldCalculateForRegisteredAndUnderLimit1() {

            // подготавливаем данные:
            int expected = 30;

            // вызываем целевой метод:
            int actual = service.calculate(1000, true);

            // производим проверку (сравниваем ожидаемый и фактический):
            Assertions.assertEquals(expected, actual);
        }

        @Test
        void shouldCalculateForRegisteredAndOverLimit() {

            // подготавливаем данные:
            int amount = 1_000_000;
            boolean registered = true;
            int expected = 500;

            // вызываем целевой метод:
            int actual = service.calculate(amount, registered);

            // производим проверку (сравниваем ожидаемый и фактический):
            Assertions.assertEquals(expected, actual);
        }
    }
