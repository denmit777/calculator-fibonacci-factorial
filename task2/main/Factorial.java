package homework2.task2;

class Factorial {

    /**
     * returns a factorial of a number. Solved with while statement.
     * Factorial is a mathematical function applied to non-negative integers,
     * equal to the product of all natural numbers from 1 to the number for which it is calculated.
     *
     * @param n an integer for which you want to find the factorial (from 1 till n including n).
     * @return 2 if n == 2.
     * @throws IllegalArgumentException if n < 1.
     */

    public int[] processWhile(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Wrong number");
        }
        int i = 1;
        int fact = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }
        return new int[]{fact};
    }

    /**
     * returns a factorial of a number. Solved with do-while statement.
     * Factorial is a mathematical function applied to non-negative integers,
     * equal to the product of all natural numbers from 1 to the number for which it is calculated.
     *
     * @param n an integer for which you want to find the factorial (from 1 till n including n).
     * @return 2 if n == 2.
     * @throws IllegalArgumentException if n < 1.
     */

    public int[] processDoWhile(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Wrong number");
        }
        int i = 1;
        int fact = 1;
        do {
            fact *= i;
            i++;
        } while (i <= n);
        return new int[]{fact};
    }

    /**
     * returns a factorial of a number. Solved with for statement.
     * Factorial is a mathematical function applied to non-negative integers,
     * equal to the product of all natural numbers from 1 to the number for which it is calculated
     *
     * @param n an integer for which you want to find the factorial (from 1 till n including n).
     * @return 2 if n == 2.
     * @throws IllegalArgumentException if n < 1.
     */

    public int[] processFor(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Wrong number");
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return new int[]{fact};
    }
}
