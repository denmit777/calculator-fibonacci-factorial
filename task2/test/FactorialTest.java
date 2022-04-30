package homework2.task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    private Factorial fact = new Factorial();

    @Test
    public void testProcessWhilePositive() {
        int number = 7;
        int[] actual = fact.processWhile(number);
        int[] expected = new int[]{5040};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testProcessWhilePositive_IfNumberEqualOne() {
        int number = 1;
        int[] actual = fact.processWhile(number);
        int[] expected = new int[]{1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testProcessWhilePositive_IfNumberEqualTwo() {
        int number = 2;
        int[] actual = fact.processWhile(number);
        int[] expected = new int[]{2};
        assertArrayEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProcessWhileNegative_IfNumberLessOne() {
        int number = -1;
        int[] actual = fact.processWhile(number);
    }

    @Test
    public void testProcessDoWhilePositive() {
        int number = 9;
        int[] actual = fact.processDoWhile(number);
        int[] expected = new int[]{362880};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testProcessDoWhilePositive_IfNumberEqualOne() {
        int number = 1;
        int[] actual = fact.processDoWhile(number);
        int[] expected = new int[]{1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testProcessDoWhilePositive_IfNumberEqualTwo() {
        int number = 2;
        int[] actual = fact.processDoWhile(number);
        int[] expected = new int[]{2};
        assertArrayEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProcessDoWhileNegative_IfNumberLessOne() {
        int number = -1;
        int[] actual = fact.processDoWhile(number);
    }

    @Test
    public void testProcessForPositive() {
        int number = 8;
        int[] actual = fact.processFor(number);
        int[] expected = new int[]{40320};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testProcessForPositive_IfNumberEqualOne() {
        int number = 1;
        int[] actual = fact.processFor(number);
        int[] expected = new int[]{1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testProcessForPositive_IfNumberEqualTwo() {
        int number = 2;
        int[] actual = fact.processFor(number);
        int[] expected = new int[]{2};
        assertArrayEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProcessForNegative_IfNumberLessOne() {
        int number = -3;
        int[] actual = fact.processFor(number);
    }
}