package Calculator;

import java.util.*;

public class Cal {

    private int firstNum;
    private int secondNum;
    private String operatorSymbol;
    private double result;

    private final Queue<String> queue2; //필드

    // 기본 생성자
    public Cal(Queue<String> queue) {
        this.queue2 = queue; //클래스의 필드를 표기할 때 this. 을 사용한다.
    }

    // Getter와 Setter
    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) { //필드를 초기화 하는 메서드
        this.firstNum = firstNum;
    }

    public void setResult(double result) {
        this.result = result;
    }

//    public void setQueue2(Queue<String> queue) {
//        this.queue2 = queue;
//    }

    public int getSecondNum() {
        return secondNum;
    }

    //setter 선언 시, 변경 해도 괜찮은 값인지 판단 후 선언.
    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public void setOperatorSymbol(String operatorSymbol) {
        this.operatorSymbol = operatorSymbol;
    }

    public String getOperatorSymbol() {
        return operatorSymbol;
    }

//    public void setQueue(Queue<String> queue) {
//        this.queue = queue;
//    }

    public String removeResult() {
        return queue2.poll();
    }

    //10.16 result getter 예제
    public double getResult() {
        return result;
    }


    public void calulator() {
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


    }
}





