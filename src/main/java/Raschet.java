public class Raschet {
    int percent(int amount, boolean isRegistered) {
        int percent;
        if (isRegistered) {
            percent = 3;
        } else {
            percent = 1;
        }
        int bonus = amount * percent / 100;
        if (bonus > 500) {
            bonus = 500;
        }
        return percent;

    }

    int bonus1(int amount, boolean isRegistered) {
        int percent1 = isRegistered ? 3 : 1;

        int bonus1 = amount * percent1 / 100;
        if (bonus1 > 500) {
            bonus1 = 500;
        }
        return bonus1;
    }

}
