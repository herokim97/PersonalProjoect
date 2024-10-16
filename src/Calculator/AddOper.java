package Calculator;

public class AddOper extends Cal {
   public AddOper(double firstNum, double secondNum){
       super(firstNum, secondNum);
   }

   @Override
    public double operator() {
       return firstNum + secondNum;
   }
}
