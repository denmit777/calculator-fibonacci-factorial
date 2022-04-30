package homework2.task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerTest {

    private Manager manager = new Manager();

    @Test
    public void testFindFibonacciOrFactorialPositive_FibonacciWhile() {
        int algorithm = 1;
        int loopType = 1;
        int number = 10;
        int[] actual = manager.findFibonacciOrFactorial(algorithm, loopType, number);
        int[] expected = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindFibonacciOrFactorialPositive_FibonacciDoWhile() {
        int algorithm = 1;
        int loopType = 2;
        int number = 1;
        int[] actual = manager.findFibonacciOrFactorial(algorithm, loopType, number);
        int[] expected = new int[]{0};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindFibonacciOrFactorialPositive_FibonacciFor() {
        int algorithm = 1;
        int loopType = 3;
        int number = 3;
        int[] actual = manager.findFibonacciOrFactorial(algorithm, loopType, number);
        int[] expected = new int[]{0, 1, 1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindFibonacciOrFactorialPositive_FactorialWhile() {
        int algorithm = 2;
        int loopType = 1;
        int number = 5;
        int[] actual = manager.findFibonacciOrFactorial(algorithm, loopType, number);
        int[] expected = new int[]{120};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindFibonacciOrFactorialPositive_FactorialDoWhile() {
        int algorithm = 2;
        int loopType = 2;
        int number = 1;
        int[] actual = manager.findFibonacciOrFactorial(algorithm, loopType, number);
        int[] expected = new int[]{1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindFibonacciOrFactorialPositive_FactorialFor() {
        int algorithm = 2;
        int loopType = 3;
        int number = 10;
        int[] actual = manager.findFibonacciOrFactorial(algorithm, loopType, number);
        int[] expected = new int[]{3628800};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindFibonacciOrFactorialNegative_WrongAlgorithmNumber() {
        int algorithm = 4;
        int loopType = 2;
        int number = 10;
        int[] actual = manager.findFibonacciOrFactorial(algorithm, loopType, number);
        assertNull(actual);
    }

    @Test
    public void testFindFibonacciOrFactorialNegative_WrongloopTypeNumber() {
        int algorithm = 4;
        int loopType = -2;
        int number = 10;
        int[] actual = manager.findFibonacciOrFactorial(algorithm, loopType, number);
        assertNull(actual);
    }
}