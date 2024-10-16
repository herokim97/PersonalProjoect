package Calculator;

public  class Cal {

    double firstNum;
    double secondNum;

    // 기본 생성자
    public Cal() {}

    // 매개변수가 있는 생성자
    public Cal(double firstNum, double secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    // 추상 메서드: 자식 클래스에서 구현 필요
    public double operator(){

    }
}