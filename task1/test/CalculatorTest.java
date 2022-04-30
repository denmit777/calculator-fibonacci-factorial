package homework2.task1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private final static double DELTA = 0.001;

    @Test
    public void testCalculateDefaultPositive1() {
        int a = 3;
        int p = 2;
        double m1 = 3.5;
        double m2 = 5.6;
        double actual = Calculator.calculate(a, p, m1, m2);
        double expected = 29.283;
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testCalculateDefaultPositive2() {
        int a = 2;
        int p = -3;
        double m1 = 0;
        double m2 = -2;
        double actual = Calculator.calculate(a, p, m1, m2);
        double expected = -17.546;
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testCalculateDefaultPositive_IfNumeratorEqualZero() {
        int a = 0;
        int p = -3;
        double m1 = -8.4;
        double m2 = 12.2;
        double actual = Calculator.calculate(a, p, m1, m2);
        double expected = 0;
        assertEquals(expected, actual, DELTA);
    }

    @Test(expected = ArithmeticException.class)
    public void testCalculateDefaultNegative_IfSecondElemEqualZero_DivideByZero() {
        int a = 2;
        int p = 0;
        double m1 = 2;
        double m2 = 2;
        double actual = Calculator.calculate(a, p, m1, m2);
    }

    @Test(expected = ArithmeticException.class)
    public void testCalculateDefaultNegative_If3thElemPlus4thElemEqualZero_DivideByZero() {
        int a = 2;
        int p = 3;
        double m1 = -2.5;
        double m2 = 2.5;
        double actual = Calculator.calculate(a, p, m1, m2);
    }

    @Test(expected = ArithmeticException.class)
    public void testCalculateDefaultNegative_If3thAnd4thElemEqualZero_DivideByZero() {
        int a = 7;
        int p = -8;
        double m1 = 0;
        double m2 = 0;
        double actual = Calculator.calculate(a, p, m1, m2);
    }
}