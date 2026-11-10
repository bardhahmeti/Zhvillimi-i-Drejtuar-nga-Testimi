public class DiscountCalculator {

    private static final double PREMIUM_HIGH_DISCOUNT = 0.20;
    private static final double PREMIUM_LOW_DISCOUNT = 0.10;
    private static final double REGULAR_DISCOUNT = 0.05;

    public static double calculateDiscount(double amount, boolean premium) {

        if (amount <= 0) {
            return 0;
        }

        if (premium) {
            return amount >= 100
                    ? amount * PREMIUM_HIGH_DISCOUNT
                    : amount * PREMIUM_LOW_DISCOUNT;
        }

        return amount >= 200
                ? amount * REGULAR_DISCOUNT
                : 0;
    }
}