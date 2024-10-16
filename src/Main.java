import Calculator.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double firstNumber;
        double secondNumber;
        double result = 0;

        //class, nonClass 선택
        String choice;

        //클래스 사용 유무 선택
        System.out.println("Class, NonClass choice >> ");
        while (true) {
            choice = sc.nextLine();
            if (choice.equals("Class") || choice.equals("NonClass")) {
                break;
            } else {
                System.out.println("not collect input, retry >> ");
            }

        }


        //클래스 없이 구현
        if (choice.equals("NonClass")) {

            while (true) {

                System.out.println("put in the operator or exit >> ");
                String oper = sc.nextLine();
                if (oper.equals("+") || oper.equals("-") || oper.equals("*") || oper.equals("/") || oper.equals("%")) {
                    System.out.println("put in the firstNumber >> ");
                    firstNumber = sc.nextDouble();
                    System.out.println("put in the secondNumber >> ");
                    secondNumber = sc.nextDouble();
                    sc.nextLine();

                    switch (oper) {
                        case "+":
                            result = firstNumber + secondNumber;
                            break;

                        case "-":
                            result = firstNumber - secondNumber;
                            break;

                        case "*":
                            result = firstNumber * secondNumber;
                            break;

                        case "/":
                            result = firstNumber / secondNumber;
                            break;

                        case "%":
                            result = firstNumber % secondNumber;
                            break;


                    }

                    //결과 출력
                    System.out.println(firstNumber + " " + secondNumber + " = " + result);


                } else if (oper.equals("exit")) {
                    break;
                } else {
                    System.out.println("not collect operator, retry >> ");
                }


            }


        }

        //클래스로 구현
        else if(choice.equals("Class")) {

            while (true) {

                System.out.println("input operator >> ");
                String oper = sc.nextLine();

                //종료 확인 조건문
                if (oper.equals("exit")) {
                    break;
                }
                System.out.println("input firstNumber >> ");
                firstNumber = sc.nextDouble();
                System.out.println("input secondNumber >> ");
                secondNumber = sc.nextDouble();
                sc.nextLine();

                Cal cal = null;

                switch (oper) {
                    case "+":
                        cal = new AddOper(firstNumber, secondNumber);
                        System.out.println(firstNumber + " + " + secondNumber + " = " + cal.operator());
                        break;
                    case "-":
                        cal = new SubstractOper(firstNumber, secondNumber);
                        System.out.println(firstNumber + " - " + secondNumber + " = " + cal.operator());
                        break;
                    case "*":
                        cal = new MultiplyOper(firstNumber, secondNumber);
                        System.out.println(firstNumber + " * " + secondNumber + " = " + cal.operator());
                        break;

                    case "/":
                        cal = new DiviOper(firstNumber, secondNumber);
                        System.out.println(firstNumber + " / " + secondNumber + " = " + cal.operator());
                        break;
                    case "%":
                        cal = new Remainder(firstNumber, secondNumber);
                        System.out.println(firstNumber + " % " + secondNumber + " = " + cal.operator());
                        break;
                    default:
                        System.out.println("Invalid operation.");
                        return;

                }


            }


        }

        else {
            System.out.println("not collect input, retry >> ");
        }
    }
}