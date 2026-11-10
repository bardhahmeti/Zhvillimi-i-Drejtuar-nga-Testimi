public class DiscountCalculator {

    public static double calculateDiscount(double amount, boolean premium){
         if (amount <= 0) {
            return 0;
        }

        if (premium && amount >= 100) {
            return amount * 0.20;
        }

        if (premium) {
            return amount * 0.10;
        }

        if (!premium && amount >= 200) {
            return amount * 0.05;
        }
        return 0;
    }
}