import java.util.HashMap;

public class TelcoAllowance implements UsagePromo {
    private HashMap<String, String> offers;

    public TelcoAllowance() {
        offers = new HashMap<>();
        offers.put("Smart", "Smart offers 15 GB for ₱500");
        offers.put("Globe", "Globe offers 10 GB for ₱450");
        offers.put("Ditto", "Ditto offers 8 GB for ₱400");
    }

    @Override
    public String showAllowance(String telcoName, double money) {
        return offers.getOrDefault(telcoName, telcoName + " has no promo available.");
    }
}
