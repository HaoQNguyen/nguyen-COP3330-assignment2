package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff() {

        PaymentCalculator testCalc = new PaymentCalculator();
        testCalc.setB(5000);
        testCalc.setAPR(12);
        testCalc.setP(100);

        assertEquals(70, testCalc.calculateMonthsUntilPaidOff());

    }
}