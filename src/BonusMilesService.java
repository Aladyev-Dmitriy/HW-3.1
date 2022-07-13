public class BonusMilesService {

    public int calculate(int price) {
        int result;
        int valueMile = 20;
        result = price / valueMile;
        return result;
    }

}
