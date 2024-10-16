package Calculator;

public class Remainder extends Cal{
    public Remainder(double firstNum, double secondNum) {
        super(firstNum, secondNum);
    }

    @Override
    public double operator() {
        return firstNum%secondNum ;
    }
}
