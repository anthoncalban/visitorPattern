public class UnliCallTextPackage implements UnliCallOffer {
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        if (!unliCallText) {
            return telcoName + " does not offer unlimited calls and texts.";
        }

        switch (telcoName) {
            case "Globe":
                return telcoName + " offers unlimited calls and texts within its network.";
            case "Ditto":
                return telcoName + " offers unlimited calls and texts to all networks.";
            default:
                return telcoName + " has no unlimited calls/texts promo.";
        }
    }
}
