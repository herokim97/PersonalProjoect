계산기 입니다.

**Main : APP.java**
사칙 연산을 수행하는 프로그램입니다.

요구사항
1) 양의 정수 입력 받기(Scanner)
2) 사칙연산 기호 입력 받기(Scanner)
3) 연산 값 출력하기(println)
4) exit 입력 시, 종료.(while)
5) App.class Main에서 Cal 클래스 활용(객체)
6) App.class Main에서 간접 접근을 통해 데이터 가져오기(Getter/Setter)
7) 연산 결과 값 저장 후, 삭제 메서드 구현(Queue.poll)

String으로 연산자를 입력 받아, 연산자 마다 Operator를 호출하여 결과값을 return 합니다.

각 매개변수들은 간접 접근을 위해 Setter 설정을 하였으며, Getter 실습을 위해 연산 결과인 'result' 값을 getter로 리턴하였습니다.

알고리즘
1. App.java에서 연산자, 피연산자 2개를 입력 받는다(firstNum, secondNum)
2. 입력 받은 변수들을 매개변수로 하여, Cal.Class로 전달 합니다.
3. Cal.class를 호출하여, 연산자에 따라 Operator를 호출 합니다.
4. Operator에서 연산된 결과 값을 getResult() 메서드를 통해 반환 하고, Queue에 추가합니다.
5. Cal.class에서 Queue 삭제 메서드를 구현하여, 연산자 입력 단계에서 popValue 문자열을 입력 시, Queue에 있는 데이터를 꺼냅니다.
6. 연산자 입력 단계에서 ('/' && secondNum = 0)  일 경우 잘못된 입력이라고 예외처리 하였습니다.
7. 연산자 입력 단계 'exit'입력 시 계산기가 종료 됩니다.

이번 프로젝트를 진행하며, 객체에 대해서 자세하게 알게 되었습니다.
실행 객체, 계산기 객체, 연산 객체, 이처럼 각각의 기능들을 수행하는 객체들을 학습하며 기본 베이스를 쌓을 수 있습니다.
