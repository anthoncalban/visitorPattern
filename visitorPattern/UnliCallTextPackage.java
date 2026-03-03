import java.util.HashMap;

public class UnliCallTextPackage implements UniCallsTextOffer {
    private HashMap<String, String> unliOffers;

    public UnliCallTextPackage() {
        unliOffers = new HashMap<>();
        unliOffers.put("Globe", "Globe offers unlimited calls and texts within its network.");
        unliOffers.put("Ditto", "Ditto offers unlimited calls and texts to all networks.");
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        if (!unliCallText) {
            return telcoName + " does not offer unlimited calls and texts.";
        }
        return unliOffers.getOrDefault(telcoName, telcoName + " has no unlimited calls/texts promo.");
    }
}
