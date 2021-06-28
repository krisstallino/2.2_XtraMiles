public class BonusMilesService {
    public int calculateMiles (int ticketCost, int bonusMile) {
        int result;
        result = (ticketCost) / (bonusMile);
        return result;
    }
}
