package Calculator;

public class DiviOper extends Cal{

    public DiviOper(double firstNum, double secondNum) {
        super(firstNum, secondNum);
    }


    @Override
    public double operator(){
        return firstNum/secondNum;
    }
}
