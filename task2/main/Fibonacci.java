package homework2.task2;

class Fibonacci {

    /**
     * returns a first n Fibonacci numbers.Solved with while statement. Fibonacci numbers start at zero: 0 1 1 2 3 5 ...
     * Each subsequent element, starting from the second, is equal to the sum of the previous two.
     *
     * @param n an integer for which you want to find the sequence (from 0 till n including n).
     * @return {0, 1} if n == 2.
     * @throws IllegalArgumentException if n < 1.
     */

    public int[] processWhile(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Wrong number");
        } else {
            if (n == 1) {
                return new int[]{0};
            }
            if (n == 2) {
                return new int[]{0, 1};
            } else {
                int i = 2;
                int[] arr = new int[n];
                arr[0] = 0;
                arr[1] = 1;
                while (i < arr.length) {
                    arr[i] = arr[i - 1] + arr[i - 2];
                    i++;
                }
                return arr;
            }
        }
    }

    /**
     * returns a first n Fibonacci numbers.Solved with do-while statement. Fibonacci numbers start at zero: 0 1 1 2 3 5 ...
     * Each subsequent element, starting from the second, is equal to the sum of the previous two.
     *
     * @param n an integer for which you want to find the sequence (from 0 till n including n).
     * @return {0, 1} if n == 2.
     * @throws IllegalArgumentException if n < 1.
     */

    public int[] processDoWhile(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Wrong number");
        } else {
            if (n == 1) {
                return new int[]{0};
            }
            if (n == 2) {
                return new int[]{0, 1};
            } else {
                int i = 2;
                int[] arr = new int[n];
                arr[0] = 0;
                arr[1] = 1;
                do {
                    arr[i] = arr[i - 1] + arr[i - 2];
                    i++;
                }
                while (i < n);
                return arr;
            }
        }
    }

    /**
     * returns a first n Fibonacci numbers.Solved with for statement. Fibonacci numbers start at zero: 0 1 1 2 3 5 ...
     * Each subsequent element, starting from the second, is equal to the sum of the previous two.
     *
     * @param n an integer for which you want to find the sequence (from 0 till n including n).
     * @return {0, 1} if n == 2.
     * @throws IllegalArgumentException if n < 1.
     */

    public int[] processFor(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Wrong number");
        } else {
            if (n == 1) {
                return new int[]{0};
            }
            if (n == 2) {
                return new int[]{0, 1};
            } else {
                int[] arr = new int[n];
                arr[0] = 0;
                arr[1] = 1;
                for (int i = 2; i < arr.length; i++) {
                    arr[i] = arr[i - 1] + arr[i - 2];
                }
                return arr;
            }
        }
    }
}
