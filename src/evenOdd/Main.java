package evenOdd;

public class Main {
    public static void main(String[] args) {

        Judge judge = new Judge(new EvenOddE());
        judge.result(4, 9);

        judge = new Judge(new EvenOddK());
        judge.result(4,6);
    }
}