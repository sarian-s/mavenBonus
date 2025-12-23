public class BonServ {
    public int bonus(int amount, boolean isRegist){
        int percent;
        if(isRegist){
            percent = 3;
        } else {
            percent = 1;
        }
        int bonus = amount * percent / 100;
        return bonus;
    }
}
