package homework2.task1;

public class Calculator {

    public static void main(String args[]) {
        int a = Integer.parseInt(args[0]);
        int p = Integer.parseInt(args[1]);
        double m1 = Double.parseDouble(args[2]);
        double m2 = Double.parseDouble(args[3]);
        System.out.println(calculate(a, p, m1, m2));
    }

    /**
     * returns a formula calculation result.
     *
     * @param a  variable of integer type.
     * @param p  variable of integer type.
     * @param m1 variable of double type.
     * @param m2 variable of double type.
     * @return variable of double type - the resul of a formula calculation.
     * @throws ArithmeticException if divider equal zero.
     */

    public static double calculate(int a, int p, double m1, double m2) {
        if (isZeroDenominator(p, m1, m2)) {
            throw new ArithmeticException("Can't divide by Zero!");
        }
        return 4 * Math.pow(Math.PI, 2) * (Math.pow(a, 3) / (Math.pow(p, 2) * (m1 + m2)));
    }

    /**
     * returns a boolean expression where the denominator is 0.
     *
     * @param p  variable of integer type.
     * @param m1 variable of double type.
     * @param m2 variable of double type.
     * @return false if no one of conditions of expression is true.
     */

    private static boolean isZeroDenominator(int p, double m1, double m2) {
        return p == 0 || (m1 == -m2);
    }
}
