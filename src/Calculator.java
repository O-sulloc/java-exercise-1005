public class Calculator {
    public void plus(int first, int second) {
        System.out.println(first + second);
    }

    public void minus(int first, int second) {
        System.out.println(first - second);
    }

    public void multiple(int first, int second) {
        System.out.println(first * second);
    }

    public void divide(int first, int second) {
        double result =  (double) first / second;
        System.out.println(result);
    }
}
