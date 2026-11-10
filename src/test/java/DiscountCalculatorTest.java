import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DiscountCalculatorTest {

    @Test
    void shouldReturnZeroWhenAmountIsZeroOrNegative() {
        assertEquals(0, DiscountCalculator.calculateDiscount(0, false));
    }

    @Test
    void shouldApplyTwentyPercentDiscountForPremiumCustomerAbove100() {
        assertEquals(30, DiscountCalculator.calculateDiscount(150, true));
    }

    @Test
    void shouldApplyTenPercentDiscountForPremiumCustomerBelow100() {
        assertEquals(5, DiscountCalculator.calculateDiscount(50, true));
    }

    @Test
    void shouldApplyFivePercentDiscountForRegularCustomerAbove200() {
        assertEquals(12.5, DiscountCalculator.calculateDiscount(250, false));
    }

    @Test
    void shouldReturnZeroForRegularCustomerBelow200() {
        assertEquals(0, DiscountCalculator.calculateDiscount(100, false));
    }
}