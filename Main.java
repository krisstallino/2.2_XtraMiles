public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int bonusMiles = service.calculateMiles(5600, 20);
        System.out.println("You have " + bonusMiles + " bonus miles");
    }
}
