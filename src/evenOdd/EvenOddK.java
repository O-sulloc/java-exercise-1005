package evenOdd;

public class EvenOddK implements  Word{

    @Override
    public String getWord(int a) {
        if(a % 2 == 0){
            return "짝수";
        }else{
            return "홀수";
        }
    }
}
