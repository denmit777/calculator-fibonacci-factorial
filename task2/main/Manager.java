package homework2.task2;

public class Manager {

    Fibonacci fib = new Fibonacci();
    Factorial fact = new Factorial();

    private static final int FIBONACCI_ALGORITHM = 1;
    private static final int FACTORIAL_ALGORITHM = 2;
    private static final int PROCESS_WHILE = 1;
    private static final int PROCESS_DO_WHILE = 2;
    private static final int PROCESS_FOR = 3;

    /**
     * returns a sequence of Fibonacci numbers or factorial depending on the arguments passed.
     *
     * @param algorithm the type of algorythm (1 - calculating a series of Fibonacci numbers, 2 - calculating a factorial).
     * @param loopType  the type of loops to use (1 - while, 2 - do-while, 3 - for).
     * @param n         parameter passed to the algorithm.
     * @return null if the parameters are incorrect.
     */

    public int[] findFibonacciOrFactorial(int algorithm, int loopType, int n) {
        switch (algorithm) {
            case FIBONACCI_ALGORITHM:
                switch (loopType) {
                    case PROCESS_WHILE:
                        return fib.processWhile(n);
                    case PROCESS_DO_WHILE:
                        return fib.processDoWhile(n);
                    case PROCESS_FOR:
                        return fib.processFor(n);
                }
                break;
            case FACTORIAL_ALGORITHM:
                switch (loopType) {
                    case PROCESS_WHILE:
                        return fact.processWhile(n);
                    case PROCESS_DO_WHILE:
                        return fact.processDoWhile(n);
                    case PROCESS_FOR:
                        return fact.processFor(n);
                }
        }
        return null;
    }
}
