package Calculator;

public class MultiplyOper extends Cal{
    public MultiplyOper(double firstNum, double secondNum) {
        super(firstNum, secondNum);
    }

    @Override
    public double operator(){
        return firstNum*secondNum;
    }

}
