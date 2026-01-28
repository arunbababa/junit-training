package sec2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DiscountCalculatorTest {
    private final DiscountCalculator calculator = new DiscountCalculator();

    @ParameterizedTest(name = "{index} => 金額:{0}円の割引額は{1}円")
    @CsvSource({
            "0, 0.0",
            "4999, 0.0",
            "5000, 250.0",
            "7000, 350.0",
            "9999, 499.95",
            "10000, 1000.0",
    }) @DisplayName("@CsvSourceの基本例:金額と期待割引額をセットで渡してテスト")
    void testDiscountUsingCsvSrouce(int amount, double exceptedDiscount){
        assertEquals(exceptedDiscount, calculator.caluclateDiscount(amount),  0.1);
    }
}