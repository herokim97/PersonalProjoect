package Calculator;

public class Cal {

    private int firstNum;
    private int secondNum;
    private String operatorSymbol;
    private double result;

    // 기본 생성자
    public Cal() {
    }

    // Getter와 Setter


    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public void setOperatorSymbol(String operatorSymbol) {
        this.operatorSymbol = operatorSymbol;
    }

    public String getOperatorSymbol() {
        return operatorSymbol;
    }


    public double calulator() {
        switch (this.operatorSymbol) {
            case "+":
                AddOperator addOperator = new AddOperator();
                result = addOperator.operator(firstNum, secondNum);
                break;
            case "-":
                SubstractOperator substractOperator = new SubstractOperator();
                result = substractOperator.operator(firstNum, secondNum);
                break;
            case "*":
                MultiplyOperator multiplyOperator = new MultiplyOperator();
                result = multiplyOperator.operator(firstNum, secondNum);
                break;
            case "/":
                DiviOperator diviOperator = new DiviOperator();
                result = diviOperator.operator(firstNum, secondNum);
                break;
            case "%":
                RemainderOperator remainderOperator = new RemainderOperator();
                result = remainderOperator.operator(firstNum, secondNum);
                break;
            default:
                System.out.println("Invalid operation.");
                break;

        }
        return result;

    }
}





