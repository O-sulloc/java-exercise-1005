package evenOdd;

public class EvenOddE implements  Word{

    @Override
    public String getWord(int a) {
        if(a % 2 == 0){
            return "Even";
        }else{
            return "Odd";
        }
    }
}
