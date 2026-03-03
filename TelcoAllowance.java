public class TelcoAllowance implements UsagePromo {
    @Override
    public String showAllowance(String telcoName, double money) {
        switch (telcoName) {
            case "Smart":
                return telcoName + " offers 15 GB for ₱" + money;
            case "Globe":
                return telcoName + " offers 10 GB for ₱" + money;
            case "Ditto":
                return telcoName + " offers 8 GB for ₱" + money;
            default:
                return telcoName + " has no promo available.";
        }
    }
}
