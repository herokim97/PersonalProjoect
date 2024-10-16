import Calculator.*;

import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        double result = 0;

        //class, nonClass 선택
        String choice;
        String oper;

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
                oper = sc.nextLine();
                if (oper.equals("+") || oper.equals("-") || oper.equals("*") || oper.equals("/") || oper.equals("%")) {
                    System.out.println("put in the firstNumber >> ");
                    firstNumber = sc.nextInt();
                    System.out.println("put in the secondNumber >> ");
                    secondNumber = sc.nextInt();
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
        else if (choice.equals("Class")) {

            while (true) {

                System.out.println("input operator or exit>> ");
                oper = sc.nextLine();

                //종료 확인 조건문
                if (oper.equals("exit")) {
                    break;
                }
                System.out.println("input firstNumber >> ");
                firstNumber = sc.nextInt();
                System.out.println("input secondNumber >> ");
                secondNumber = sc.nextInt();
                sc.nextLine();

                Cal cal = new Cal();

                switch (oper) {
                    case "+":
                        result = cal.addOperator((int) firstNumber,secondNumber);
                        System.out.println(firstNumber + " + " + secondNumber + " = " + result);
                        break;
                    case "-":
                        result = cal.subtractOperator((int) firstNumber,secondNumber);
                        System.out.println(firstNumber + " - " + secondNumber + " = " + result);
                        break;
                    case "*":
                        result = cal.multiplyOperator((int) firstNumber,secondNumber);
                        System.out.println(firstNumber + " * " + secondNumber + " = " + result);
                        break;

                    case "/":
                        result = cal.divideOperator((int) firstNumber,secondNumber);
                        System.out.println(firstNumber + " / " + secondNumber + " = " + result);
                        break;
                    case "%":
                        result = cal.remainderOperator((int) firstNumber,secondNumber);
                        System.out.println(firstNumber + " % " + secondNumber + " = " + result);
                        break;
                    default:
                        System.out.println("Invalid operation.");
                        return;

                }


            }


        } else {
            System.out.println("not collect input, retry >> ");
        }
    }
}