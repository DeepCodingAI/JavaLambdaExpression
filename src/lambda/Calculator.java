package lambda;

public class Calculator implements Count {

    @Override
    public int addition(int a, int b){
        int total = a + b;
        return total;
    }
}
