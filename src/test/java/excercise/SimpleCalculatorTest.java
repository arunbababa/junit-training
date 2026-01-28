package excercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    // setup instance for the tests
    SimpleCalculator calculator = new SimpleCalculator();

    @Nested
    @DisplayName("正常系の動作を確認するためのテストメソッド群")
    class NormalTests {
        @Test
        @DisplayName("addメソッドの足し算が正常動作することをテストする")
        void normalAddTest() {
            int result = calculator.add(3, 5);
            assertEquals(8, result);
        }

        @Test
        @DisplayName("subtractメソッドの引き算が正常動作することをテストする")
        void normalSubtractTest() {
            int result = calculator.subtract(10, 4);
            assertEquals(6, result);
        }

        @Test
        @DisplayName("multiplyメソッドの掛け算が正常動作することをテストする")
        void normalMultiplyTest() {
            int result = calculator.multiply(4, 6);
            assertEquals(24, result);
        }

        @Test
        @DisplayName("divideメソッドの割り算が正常動作することをテストする")
        void normalDivideTest() {
            int result = calculator.divide(20, 5);
            assertEquals(4, result);
        }
    }

    @Nested
    @DisplayName("異常系の動作を確認するためのテストメソッド群")
    class AbnormalTests {
        @Test
        @DisplayName("divideメソッドの割り算がゼロ除算でArithmeticExceptionがスローされることをテストする")
        void testDivideByZeroThrowsArithmeticException() {
            assertThrows(ArithmeticException.class, () -> calculator.divide(0, 0));
        }
    }

    @Test
    @DisplayName("処理時間テスト:longprocessは100ms以内に完了する")
    void testLongProcessingCompletesInTime(){
        assertTimeout(Duration.ofMillis(100), () -> calculator.longProcess());
    }
}