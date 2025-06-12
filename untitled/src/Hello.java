public class Hello {
    public static void main(String[] args) {
        // 자바 언어 기초
        System.out.println("Hello World");

        // 변수와 타입

        // 1. 변수 value 선언
        int value;

        value = 2; // 초기화 해주지 않으면 컴파일 에러 발생

        // 연산 결과를 변수 result 의 초기값으로 대입
        int result = value + 10;

        int x = 3;
        int y = 5;
        System.out.println("x : " + x + ", y :" + y);

        int temp = x;
        x = y;
        y = temp;
        System.out.println("x : " + x + ", y :" + y);

        int var1 = 0b1011; // 2진수
        int var2 = 0206; // 8진수
        int var3 = 365; // 10진수
        int var4 = 0xB3; // 16진수

        System.out.println("var1 : " + var1);
        System.out.println("var2 : " + var2);
        System.out.println("var3 : " + var3);
        System.out.println("var4 : " + var4);

        // 정수 타입
        byte byte1 = 1;
        short short1 = 102;
        char char5 = 2;
        int int1 = 125;
        long long1 = 123123L;

        System.out.println("byte1 : " + byte1);
        System.out.println("short1 : " + short1);
        System.out.println("char5 : " + char5);
        System.out.println("int1 : " + int1);
        System.out.println("long1 : " + long1);

        // 문자 타입
        char char1 = 'A';
        char char2 = '가';

        char c = 65; // 10진수 65와 매핑되는 문자 'A'
        char d = 0x0041; // 16진수 0x0041과 매핑되는 문자 : 'A'
        System.out.println("c : " + c);
        System.out.println("d : " + d);

        char c1 = 'A'; // 문자 저장
        char c2 = 65; // 유니코드 직접 저장

        char c3 = '가'; // 문자 저장
        char c4 = 44032; // 유니코드 직접 저장

        System.out.println("c1 : " + c1);
        System.out.println("c2 " + c2);
        System.out.println("c3 : " + c3);
        System.out.println("c4 : " + c4);

        // 실수 타입
        float float1 = 3.14f;
        double double1 = 2.314124;

        System.out.println("float1 : " + float1);
        System.out.println("double1 : " + double1);

        // 10진수 리터럴
        double x1 = 0.25;
        double y1 = -3.14;

        System.out.println("x1 : " + x1);
        System.out.println("y1 : " + y1);

        // e또는 E가 포함된 10의 거듭제곱 리터럴
        double x2 = 5e2;
        double y2 = 0.12E-2;

        System.out.println("x2 : " + x2);
        System.out.println("y2 : " + y2);

        // 정밀도 확인
        float floatVar1 = 0.1234567890123456789f;
        double doubleVar1 = 0.1234567890123456789;

        System.out.println("floatVar1 : " + floatVar1);
        System.out.println("doubleVar1 : " + doubleVar1);

        // 10 의 거듭제곱 리터럴
        double double3 = 3e6;
        float float4 = 3e6F;
        double double4 = 2e-3;

        System.out.println("doble3 : " + double3);
        System.out.println("float4 : " + float4);
        System.out.println("double4 : " + double4);

        // 논리 타입
        boolean isStop = true;
        boolean isGo = false;

        boolean isResult = (x == 20);
        System.out.println("isResult : " + isResult);

        isResult = (x != 20);
        System.out.println("isResult : " + isResult);

        isResult = (x > 20);
        System.out.println("isResult : " + isResult);

        isResult = ( 0 < x && x < 20);
        System.out.println("isResult : " + isResult);

        isResult = ( x < 0 || x > 200);
        System.out.println("isResult : " + isResult);

        boolean stop = true;

        if (stop) {
            System.out.println("중단 합니다.");
        } else {
            System.out.println("시작 합니다");
        }

        int int10 = 10;
        boolean result1 = (x == 20);
        boolean result2 = (x != 20);
        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);

        // 문자열 타입
        String string1 = "A";
        String string2 = "홍길동";
    }
}