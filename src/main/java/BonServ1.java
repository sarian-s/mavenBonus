public class BonServ1 {
    public int bonusServiceTernarn(int amount, boolean isRegistered ){
        int percent = isRegistered ? 3: 1;
        int bonus = amount * percent / 100;
        if (bonus > 500) {
            bonus = 500;
        }
        return bonus;
    }

    public int bonusService(int amount, boolean isRegistered ){
        int percent;
        if (isRegistered){percent = 3;
        } else {
            percent = 1;
        }
        int bonus = amount * percent / 100;
        if (bonus > 500) {
            bonus = 500;
        }
        return bonus;
    }

    public int bonusServicePercent(boolean isRegistered ){
        int percent = isRegistered ? 3: 1;
        return percent;
    }


}
