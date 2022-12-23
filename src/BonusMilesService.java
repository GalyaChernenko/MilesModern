public class BonusMilesService {
    public int calculateMiles(int incomePrice) {
        int miles;
        if (incomePrice > 20) {
            miles = incomePrice * 5 / 100;
        } else {
            miles = 0;
        }
        return miles;
    }
}
