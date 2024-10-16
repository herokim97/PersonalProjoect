package Calculator;

public class SubstractOper extends Cal{
    public SubstractOper(double firstNum, double secondNum) {
        super(firstNum, secondNum);
    }

    @Override
    public double operator() {
        return firstNum - secondNum;
    }
}
