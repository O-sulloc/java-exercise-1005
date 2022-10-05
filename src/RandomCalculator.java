public class RandomCalculator {

    private int b = (int) (Math.random() * 10);

    public void plus(int a) {
        System.out.println(a + b);
    }

    public void minus(int a) {
        System.out.println(a - b);
    }

    public void multiple(int a) {
        System.out.println(a * b);
    }

    public void divide(int a) {

        if (b == 0) {
            System.out.println("랜덤하게 생성된 숫자가 0입니다.");
        } else {
            System.out.println(a / b);
        }
    }
}