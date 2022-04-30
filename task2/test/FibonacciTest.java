package homework2.task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    private Fibonacci fib = new Fibonacci();

    @Test
    public void testProcessWhilePositive() {
        int number = 10;
        int[] actual = fib.processWhile(number);
        int[] expected = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testProcessWhilePositive_IfNumberEqualOne() {
        int number = 1;
        int[] actual = fib.processWhile(number);
        int[] expected = new int[]{0};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testProcessWhilePositive_IfNumberEqualTwo() {
        int number = 2;
        int[] actual = fib.processWhile(number);
        int[] expected = new int[]{0, 1};
        assertArrayEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProcessWhileNegative_IfNumberLessOne() {
        int number = -1;
        int[] actual = fib.processWhile(number);
    }

    @Test
    public void testProcessDoWhilePositive() {
        int number = 7;
        int[] actual = fib.processDoWhile(number);
        int[] expected = new int[]{0, 1, 1, 2, 3, 5, 8};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testProcessDoWhilePositive_IfNumberEqualOne() {
        int number = 1;
        int[] actual = fib.processDoWhile(number);
        int[] expected = new int[]{0};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testProcessDoWhilePositive_IfNumberEqualTwo() {
        int number = 2;
        int[] actual = fib.processDoWhile(number);
        int[] expected = new int[]{0, 1};
        assertArrayEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProcessDoWhileNegative_IfNumberLessOne() {
        int number = 0;
        int[] actual = fib.processDoWhile(number);
    }

    @Test
    public void testProcessForPositive() {
        int number = 7;
        int[] actual = fib.processFor(number);
        int[] expected = new int[]{0, 1, 1, 2, 3, 5, 8};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testProcessForPositive_IfNumberEqualOne() {
        int number = 1;
        int[] actual = fib.processFor(number);
        int[] expected = new int[]{0};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testProcessForPositive_IfNumberEqualTwo() {
        int number = 2;
        int[] actual = fib.processFor(number);
        int[] expected = new int[]{0, 1};
        assertArrayEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProcessForNegative_IfNumberLessOne() {
        int number = -2;
        int[] actual = fib.processFor(number);
    }
}