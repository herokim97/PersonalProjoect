package Calculator;

public  class Cal {

    double firstNum;
    double secondNum;

    // 기본 생성자
    public Cal() {}

    // 메서드
    // 덧셈
    public double addOperator(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;

        AddOper addOper = new AddOper();
        return addOper.appOper(firstNum, secondNum);
    }

    public double subtractOperator(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;

        SubstractOper substractOper = new SubstractOper();
        return substractOper.subStractOper(firstNum, secondNum);
    }

    public double multiplyOperator(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        MultiplyOper multiplyOper = new MultiplyOper();
        return multiplyOper.multiplyOper(firstNum, secondNum);
    }

    public double divideOperator(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        DiviOper diviOper = new DiviOper();
        return diviOper.diviOper(firstNum, secondNum);
    }

    public double remainderOperator(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        Remainder  remainder = new Remainder();
        return remainder.remainderOper(firstNum, secondNum);
    }



}