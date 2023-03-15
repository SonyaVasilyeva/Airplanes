public class BonusMilesService {

    public int calculate (int price) {
        int oneMileCost = 20;
        int miles = price / oneMileCost;

        return miles;
    }
}
