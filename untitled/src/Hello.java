import java.util.Calendar;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

    }

    public static void funcTest1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x 값 입력 : ");
        String strX = scanner.nextLine();
        int x= Integer.parseInt(strX);

        System.out.printf("y 값 입력 : ");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("x + y : " + result);
        System.out.println();

        while (true) {
            System.out.printf("입력 문자열 : ");
            String data = scanner.nextLine();
            if (data.equals("q")) {
                break;
            }
            System.out.println("출력 문자열 : " + data);
            System.out.println();
        }
    }

    public static void funcTest2() {
        int x = 10;
        int y = 10;
        int z;

        x++;
        ++x;
        System.out.println("x = " + x);

        System.out.println("------------");
        y--;
        --y;
        System.out.println("y = " + y);

        System.out.println("------------");
        z = x++;
        System.out.println("z = " + z);
        System.out.println("x = " + x);

        System.out.println("------------");

        z = ++x;
        System.out.println("z = " + z);
        System.out.println("x = " + x);

        System.out.println("------------");

        z = ++x + y++;
        System.out.println("z = " + z);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public static void funcTest3() {
        byte v1 = 10;
        byte v2 = 4;
        int v3 = 5;
        long v4 = 10L;

        int result1 = v1 + v2;
        System.out.println("result1 : " + result1);

        long result2 = v1 + v2 - v4;
        System.out.println("result2 : " + result2);

        double result3 = (double) v1 / v2;
        System.out.println("result3 : " + result3);

        int result4 = v1 % v2;
        System.out.println("result4 : " + result4);
    }

    public static void funcTest4() {
        int x = 5;
        double y = 0.0;
        double z = x / y;
        // double z = x % 4;
        // 잘못된 코드

        System.out.println(z + 2);

        // 알맞은 코드
        if(Double.isInfinite(z) || Double.isNaN(z)) {
            System.out.println("값 산출 불가");
        } else {
            System.out.println(z + 2);
        }
    }

    public static void funcTest5() {
        int num1 = 10;
        int num2 = 10;
        boolean result1 = (num1 == num2);
        boolean result2 = (num1 != num2);
        boolean result3 = (num1 <= num2);

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);

        char char1 = 'A';
        char char2 = 'B';
        boolean result4 = (char1 < char2);
        System.out.println("result4 : " + result4);

        int num3 = 1;
        double num4 = 1.0;
        boolean result5 = (num3 == num4);
        System.out.println("result5 : " + result5);

        float num5 = 0.1f;
        double num6 = 0.1;
        boolean result6 = (num5 == num6);
        boolean result7 = (num5 == (float)num6);
        System.out.println("result6 : " + result6);
        System.out.println("result7 : " + result7);

        String str1 = "자바";
        String str2 = "JAVA";
        boolean result8 = (str1.equals(str2));
        boolean result9 = (!str1.equals((str2)));
        System.out.println("result8 : " + result8);
        System.out.println("result9 : " + result9);
    }

    public static void funcTest6() {
        int charCode = 'A';

        if ((65 <= charCode) & (charCode <= 90)) {
            System.out.println("대문자 이군요");
        }

        if ((97 <= charCode) && (charCode <= 122)) {
            System.out.println("소문자 이군요.");
        }

        if ((48 <= charCode) && (charCode <= 57)) {
            System.out.println("0 ~ 9 숫자 이군요");
        }

        // ----------------------------------------

        int value = 6;
        // int value = 7;

        if((value % 2 == 0) || (value % 3 == 0)) {
            System.out.println("2 또는 3의 배수이군요");
        }

        boolean result = (value % 2 == 0) || (value % 3 == 0);

        if (!result) {
            System.out.println("2 또는 3의 배수가 아니군요.");
        }
    }

    public static void funcTest7() {
        System.out.println("45 & 25 = " + (45 & 25));
        System.out.println("45 | 25 = " + (45 | 25));
        System.out.println("45 ^ 25 = " + (45 ^ 25));
        System.out.println("~45 = " + (~45));

        System.out.println("----------------------");

        byte receiveData = -120;

        // 방법 1 : 비트 논리곱 연산으로 Unsigned 정수 얻기
        int unsignedInt1 = receiveData & 255;
        System.out.println(unsignedInt1);

        // 방법2 : 자바 API를 이용해서 Unsigned 정수 얻기
        int unsignedInt2 = Byte.toUnsignedInt(receiveData);
        System.out.println(unsignedInt2);

        int test = 136;
        byte btest = (byte) test;
        System.out.println(btest);
    }

    public static void funcTest8() {
        int num1 = 1;
        int result1 = num1 << 3;
        int result2 = num1 * (int)Math.pow(2,3);
        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);

        int num2 = -8;
        int result3 = num2 >> 3;
        int result4 = num2 / (int)Math.pow(2,3);
        System.out.println("result3 : " + result3);
        System.out.println("result4 : " + result4);
    }

    public static void funcTest9() {
        int value = 772; //[00000000] [00000000] [00000011] [00000100]

        // 우측으로 3byte(24bit) 이동하고 끝 1바이트만 읽음 : [00000000]
        byte byte1 = (byte) (value >> 24);
        int int1 = byte1 & 255;
        System.out.println("첫 번째 바이트 부호 없는 값 : " + int1);

        // 우측으로 2byte(16bit) 이동하고 끝 1바이트만 읽음 : [00000000]
        byte byte2 = (byte) (value >>> 16);
        int int2 = Byte.toUnsignedInt(byte2);
        System.out.println("두 번째 바이트 부호 없는 값 : " + int2);

        // 우측으로 1byte(8bit) 이동하고 끝 1바이트만 읽음 : [00000011]
        byte byte3 = (byte) (value >>> 8);
        int int3 = byte3 & 255;
        System.out.println("세 번째 바이트 부호 없는 값 : " + int3);

        // 끝 1바이트만 읽음 : [00000100]
        byte byte4 = (byte) value;
        int int4 = Byte.toUnsignedInt(byte4);
        System.out.println("네 번째 바이트 부호 없는 값 : " + int4);
    }

    public static void funcTest10() {
        int score = 93;

        if (score >= 90) {
            System.out.println("점수가 90보다 큽니다");
            System.out.println("등급은 A 입니다");
        }

        if (score < 90)
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B 입니다"); // if 문과는 상관없는 실행문

    }

    public static void funcTest11() {
        int score = 85;

        if (score >= 90) {
            System.out.println("점수가 90보다 큽니다");
            System.out.println("등급은 A 입니다.");
        } else {
            System.out.println("점수가 90보다 작습니다");
            System.out.println("등급은 B 입니다.");
        }
    }

    public static void funcTest12() {
        int score = 75;

        if (score >= 90) {
            System.out.println("점수가 100 ~ 90 입니다");
            System.out.println("등급은 A입니다");
        } else if (score >= 80 ) {
            System.out.println("점수가 80 ~ 89 입니다.");
            System.out.println("등급은 B입니다");
        } else if (score >= 70) {
            System.out.println("점수가 70 ~ 79 입니다");
            System.out.println("등급은 C입니다");
        } else {
            System.out.println("점수가 70 미만입니다.");
            System.out.println("등급은 D입니다.");
        }
    }

    public static void funcTest13() {
        int num = (int)(Math.random() * 6) + 1;

        if (num == 1) {
            System.out.println("1번이 나왔습니다");
        } else if (num == 2) {
            System.out.println("2번이 나왔습니다");
        } else if (num == 3) {
            System.out.println("3번이 나왔습니다");
        } else if (num == 4) {
            System.out.println("4번이 나왔습니다");
        } else if (num == 5) {
            System.out.println("5번이 나왔습니다");
        } else {
            System.out.println("6번이 나왔습니다");
        }
    }

    public static void funcTest14() {
        int score = (int)(Math.random() * 20 ) + 81;
        System.out.println("점수 : " + score);

        String grade;

        if (score >= 90) {
            if (score >= 95) {
                grade = "A+";
            } else {
                grade = "A";
            }
        } else {
            if (score >= 85) {
                grade = "B+";
            } else {
                grade = "B";
            }
        }

        System.out.println("학점 : " + grade);
    }

    public static void funcTest15() {
        int num = (int)(Math.random() * 6) + 1;

        switch(num) {
            case 1:
                System.out.println("1번이 나왔습니다");
                break;
            case 2:
                System.out.println("2번이 나왔습니다");
                break;
            case 3:
                System.out.println("3번이 나왔습니다");
                break;
            case 4:
                System.out.println("4번이 나왔습니다");
                break;
            case 5:
                System.out.println("5번이 나왔습니다");
                break;
            case 6:
                System.out.println("6번이 나왔습니다");
                break;

        }
    }

    public static void funcTest16() {
        int time = (int)(Math.random() * 4) + 8;
        System.out.println("[현재 시간 : " + time + "시 ]");

        switch (time) {
            case 8:
                System.out.println("출근을 합니다");
            case 9:
                System.out.println("회의를 합니다");
            case 10:
                System.out.println("업무를 봅니다");
            default:
                System.out.println("외근을 나갑니다");
        }
    }

    public static void funcTest17() {
        char grade = 'B';

        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("우수 회원입니다");
                break;
            case 'B':
            case 'b':
                System.out.println("일반 회원입니다");
                break;
            default:
                System.out.println("손님입니다");
        }
    }
    // Java 12이후 Expressions
    public static void funcTest18() {
        char grade = 'B';

        switch (grade) {
            case 'A', 'a' -> {
                System.out.println("우수 회원입니다");
            }
            case 'B', 'b' -> {
                System.out.println("일반 회원입니다.");
            }
            default -> {
                System.out.println("손님 입니다.");
            }
        }

        switch (grade) {
            case 'A', 'a' -> System.out.println("우수 회원입니다");
            case 'B', 'b' -> System.out.println("일반 회원입니다");
            default -> System.out.println("손님입니다");
        }
    }

    public static void funcTest19() {
        String grade = "B";

        // Java 11 이전 문법
        int score1 = 0;
        switch(grade) {
            case "A":
                score1 = 100;
                break;
            case "B":
                int result = 100 - 20;
                score1 = result;
                break;
            default:
                score1 = 60;
        }
        System.out.println("score1 : " + score1);

        // Java 12부터 가능
        int score2 = switch (grade) {
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;
                // Java 13 부터 가능
                yield result;
            }
            default -> 60;
        };
        System.out.println("score2 : " + score2);
    }

    public static void funcTest20() {
        int sum = 0;
        sum += 1;
        sum += 2;
        sum += 3;
        sum += 4;
        sum += 5;
        System.out.println("1 ~ 5 까지의 합 : " + sum);

        int sum1 = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1 ~ 100 까지의 합 : " + sum1);
    }

    public static void funcTest21() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }

    public static void funcTest22() {
        int sum = 0;
        int i;

        for (i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println("1 ~" + (i - 1) + " 합 : " + sum);
    }

    public static void funcTest23() {
        // 부동소수점을 사용하지 말아야 한다
        for (float x = 0.1f; x <= 1.0f; x+= 0.1f) {
            System.out.println(x);
        }
    }

    public static void funcTest24() {
        for (int m = 2; m <= 9; m++) {
            System.out.println("*** " + m + "단 ***");
            for (int n = 1; n <= 9; n++) {
                System.out.println(m + " x " + n + " = " + (m * n));
            }
        }
    }

    public static void funcTest25() {
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
    }

    public static void funcTest26() {
        int sum = 0;

        int i = 1;
        while (i <= 100) {
            sum += i;
            i++;
        }

        System.out.println("1~" + (i-1) + " 합 : " + sum);
    }

    public static void funcTest27() {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int speed = 0;

        while(run) {
            System.out.println("----------------------_");
            System.out.println("1.증속 | 2. 감속 | 3. 중지");
            System.out.println("----------------------_");
            System.out.println("선택 : ");

            String strNum = scanner.nextLine();

            if(strNum.equals("1")) {
                speed++;
                System.out.println("현재 속도 = " + speed);
            } else if (strNum.equals("2")) {
                speed--;
                System.out.println("현재 속도 = " + speed);
            } else if (strNum.equals("3")) {
                run = false;
            }
        }

        System.out.println("프로그램 종료");
    }

    public static void funcTest28() {
        System.out.println("메시지를 입력하세요");
        System.out.println("프로그램을 종료하려면 q를 입력하세요.");

        Scanner scanner = new Scanner(System.in);
        String inputString;

        do {
            System.out.printf(">");
            inputString = scanner.nextLine();
            System.out.println(inputString);
        } while( !inputString.equals("q"));

        System.out.println();
        System.out.println("프로그램 종료");
    }

    public static void funcTest29() {
        while(true) {
            int num = (int)(Math.random() * 6) + 1;
            System.out.println(num);
            if (num == 6) {
                break;
            }
        }
        System.out.println("프로그램 종료");
    }

    public static void funcTest30() throws Exception {
        Outter:for (char upper = 'A'; upper <= 'Z'; upper++) {
        for (char lower = 'a'; lower <= 'z'; lower++) {
            System.out.println(upper + "-" + lower);
                if (lower == 'g') {
                    break Outter;
                }
            }
        }
        System.out.println("프로그램 실행 종료");
    }

    public static void funcTest31() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.printf(i + " ");
        }
    }

    public static void funcTest32() {
        int[] arr1;
        int[] arr2;
        int[] arr3;

        arr1 = new int[] {1,2,3};
        arr2 = new int[] {1,2,3};
        arr3 = arr2;

        System.out.println(arr1 == arr2);
        System.out.println(arr2 == arr3);
    }

    public static void funcTest33() {
        int[] intArray = null;
        //intArray[0] = 10; // NullPointerException

        String str = null;
        //System.out.println("총 문자 수 : " + sre.length()); // NullPointerException
    }

    public static void funcTest34() {
        String hobby = "여행";
        hobby = null;

        String kind1 = "자동차";
        String kind2 = kind1;
        kind1 = null;
        System.out.println("kind2 : " + kind2);
    }

    public static void funcTest35() {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";

        if (strVar1 == strVar2) {
            System.out.println("strVar1과 strVar2는 참조가 같음");
        } else {
            System.out.println("strVar1과 strVar2는 참조가 다름");
        }

        if(strVar1.equals(strVar2)) {
            System.out.println("strVar1과 strVar2는 문자열이 같음");
        }

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");

        if (strVar3 == strVar4) {
            System.out.println("strVar3과 strVar4는 참조가 같음");
        } else {
            System.out.println("strVar3과 strVar4는 참조가 다름");
        }

        if(strVar3.equals(strVar4)) {
            System.out.println("strVar3과 strVar4는 문자열이 같음");
        }
    }

    public static void funcTest36() {
        String hobby = "";
        if(hobby.equals("")) {
            System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
        }
    }

    public static void funcTest37() {
        String ssn = "9506241230123";
        char sex = ssn.charAt(6);
        switch(sex){
            case '1':
            case '3':
                System.out.println("남자 입니다");
                break;
            case '2':
            case '4':
                System.out.println("여자 입니다");
                break;
        }
    }

    public static void funcTest38() {
        String ssn = "9506241230123";
        int length = ssn.length();
        if (length == 13) {
            System.out.println("주민등록번호 자릿수가 맞습니다");
        } else {
            System.out.println("주민등록번호 자릿수가 틀립니다.");
        }
    }

    public static void funcTest39() {
        String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String 입니다";
        String newStr = oldStr.replace("자바", "JAVA");

        System.out.println(oldStr);
        System.out.println(newStr);
    }

    public static void funcTest40() {
        String ssn = "880815-1234567";

        String firstNum = ssn.substring(0,6);
        System.out.println(firstNum);

        String secondNum = ssn.substring(7);
        System.out.println(secondNum);
    }

    public static void funcTest41() {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println(location);
        String substring = subject.substring(location);
        System.out.println(substring);

        location = subject.indexOf("자바");
        if (location != -1) {
            System.out.println("자바와 관련된 책이군요");
        } else {
            System.out.println("자바와 관련 없는 책이군요");
        }

        boolean result = subject.contains("자바");
        if(result) {
            System.out.println("자바와 관련된 책이군요");
        } else {
            System.out.println("자바와 관련 없는 책이군요");
        }
    }

    public static void funcTest42() {
        String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";

        // 문자열 분리
        String[] tokens = board.split(",");

        // 인덱스 별로 읽기
        System.out.println("번호 : " + tokens[0]);

        System.out.println("제목 : " + tokens[1]);

        System.out.println("내용 : " + tokens[2]);

        System.out.println("성명 : " + tokens[3]);

        System.out.println();

        // for 문을 이용한 읽기
        for(int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }
    }

    public static void funcTest43() {
        //배열 변수 선언과 배열 생성
        String[] season = {"Spring", "Summer", "Fall", "Winter"};

        // 배열의 항목값 읽기
        System.out.println("season[0] : " + season[0]);
        System.out.println("season[1] : " + season[1]);
        System.out.println("season[2] : " + season[2]);
        System.out.println("season[3] : " + season[3]);

        // 인덱스 1번 항목의 값 변경
        season[1] = "여름";
        System.out.println("season[1] : " + season[1]);
        System.out.println();

        // 배열 변수 선언과 배열 생성
        int[] scores = {83, 90, 87};

        // 총합과 평균 구하기
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += scores[i];
        }
        System.out.println("총합 : " + sum);
        double avg = (double) sum / 3;
        System.out.println("평균 : " + avg);
    }

    public static void funcTest44() {
        // 배열 변수 선언
        int[] scores;

        // 배열 변수에 배열을 대입
        scores = new int[] {83, 90, 87};

        // 배열 항목의 총합을 구하고 출력
        int sum1 = 0;
        for(int i = 0; i < 3; i++) {
            sum1 += scores[i];
        }
        System.out.println("총합 : " + sum1);

        // 배열을 매개값으로 주고, printItem() 메서드 호출
        printItem(new int[] {83, 90, 87});
    }
    // printItem() 메소드 선언
    public static void printItem( int[] scores ) {
        // 매개변수가 참조하는 배열의 항목을 출력
        for(int i = 0; i < 3; i++) {
            System.out.println("score[" + i + "] :" + scores[i]);
        }
    }

    public static void funcTest45() {
        // 배열 변수 선언과 배열 생성
        int[] arr1 = new int[3];
        // 배열 항목의 초기값 출력
        for (int i = 0; i < 3; i++) {
            System.out.println("arr1[" + i + "] : " + arr1[i] + ", ");
        }

        System.out.println();
        // 배열 항목의 값 변경
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;

        // 배열 항목의 변경 값 출력
        for (int i = 0; i < 3; i++) {
            System.out.println("arr1[" + i + "] : " + arr1[i] + ", ");
        }
        System.out.println("\n");

        //  배열 변수 선언과 배열 생성
        double[] arr2 = new double[3];
        // 배열 항목의 초기값 출력
        for(int i = 0; i < 3; i++) {
            System.out.println("arr2[" + i + "] : " + arr2[i] + ", ");
        }
        System.out.println();
        // 배열 항목의 값 변경
        arr2[0] = 0.1;
        arr2[1] = 0.2;
        arr2[2] = 0.3;
        // 배열 항목의 변경 값 출력
        for (int i = 0; i < 3; i++) {
            System.out.println("arr2[" + i + "] : " + arr2[i] + ", ");
        }
        System.out.println("\n");

        // 배열 변수 선언과 배열 생성
        String[] arr3 = new String[3];
        // 배열 항목의 초기값 출력
        for(int i = 0; i < 3; i++) {
            System.out.println("arr3[" + i + "] : " + arr3[i] + ", ");
        }
        System.out.println();
        // 배열 항목의 값 변경
        arr3[0] = "1월";
        arr3[1] = "2월";
        arr3[2] = "3월";
        // 배열 항목의 변경값 출력
        for (int i = 0; i < 3; i++) {
            System.out.println("arr3[" + i + "] : " + arr3[i] + ", ");
        }
    }

    public static void funcTest46() {
        // 배열 변수 선언과 배열 대입
        int[] scores = {84, 90, 96};

        // 배열 항목의 총합 구하기
        int sum = 0;
        // length 를 사용할 경우 배열의 마지막 인덱스는 배열의 길이보다 1적기 때문 조심하자
        for(int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("총합 : " + sum);

        // 배열 항목의 평균 구하기
        double avg = (double) sum / scores.length;
        System.out.println("평균 : " + avg);
    }

    public static void funcTest47() {
        // 2차원 배열 생성
        int[][] scores = {
                {80, 90, 96},
                {76, 88}
        };

        // 배열의 길이
        System.out.println("1차원 배열 길이(반의 수) : " + scores.length);

        System.out.println("2차원 배열 길이(첫 번째 반의 학생 수) : " + scores[0].length);
        System.out.println("2차원 배열 길이(두 번째 반의 학생 수) : " + scores[1].length);

        // 첫 번째 반의 세 번째 학생의 점수 읽기
        System.out.println("scores[0][2] : " + scores[0][2]);

        // 두 번째 반의 두 번째 학생의 점수 읽기
        System.out.println("scores[1][1] : " + scores[1][1]);

        // 첫 번째 반의 평균 점수 구하기
        int class1Sum = 0;
        for(int i = 0; i < scores[0].length; i++) {
            class1Sum += scores[0][i];
        }
        double class1Avg = (double) class1Sum / scores[0].length;
        System.out.println("첫 번째 반의 평균 점수 : " + class1Avg);

        // 두 번째 반의 평균 점수 구하기
        int class2Sum = 0;
        for (int i = 0; i < scores[1].length; i++) {
            class2Sum += scores[0][i];
        }
        double class2Avg = (double)class2Sum / scores[1].length;
        System.out.println("두 번쨰 반의 평균 점수 : " + class2Avg);

        // 전체 학생의 평균 점수 구하기
        int totalStudent = 0;
        int totalSum = 0;
        for (int i = 0; i < scores.length; i++){
            totalStudent += scores[i].length;
            for (int k = 0; k < scores[i].length; k++) {
                totalSum += scores[i][k];
            }
        }
        double totalAvg = (double) totalSum / totalStudent;
        System.out.println("전체 학생의 평균 점수 : " + totalAvg);
    }

    public static void funcTest48() {
        // 각 반의 학생 수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열 생성
        int[][] mathScores = new int[2][3];
        // 배열 항목 초기값 출력
        for(int i = 0; i < mathScores.length; i++) {
            for (int k = 0; k < mathScores[i].length; k++) {
                System.out.println("mathSores[" + i + "][" + k + "] : " + mathScores[i][k]);
            }
        }

        System.out.println();
        // 배열 항목 값 변경
        mathScores[0][0] = 80;
        mathScores[0][1] = 83;
        mathScores[0][2] = 85;
        mathScores[1][0] = 86;
        mathScores[1][1] = 90;
        mathScores[1][2] = 92;
        // 전체 학생의 수학 평균 구하기
        int totalStudent = 0;
        int totalMathSum = 0;
        for (int i = 0; i < mathScores.length; i++) {
            totalStudent += mathScores[i].length;
            for (int k = 0; k < mathScores[i].length; k++){
                totalMathSum += mathScores[i][k];
            }
        }
        double totalMathAvg = (double) totalMathSum / totalStudent;
        System.out.println("전체 학생의 수학 평균 점수 : " + totalMathAvg);
        System.out.println();

        // 각 반의 학생 수가 다를 경우 점수 저장을 위한 2차원 배열 생성
        int[][] englishScores = new int[2][];
        englishScores[0] = new int[2];
        englishScores[1] = new int[3];
        // 배열 항목 초기값 출력
        for (int i = 0; i < englishScores.length; i++) {
            for (int k = 0; k < englishScores[i].length; k++) {
                System.out.println("englishScroes[" + i + "][" + k + "] :" + englishScores[i][k]);
            }
        }
        System.out.println();

        // 배열 항목값 변경
        englishScores[0][0] = 90;
        englishScores[0][1] = 91;
        englishScores[1][0] = 92;
        englishScores[1][1] = 93;
        englishScores[1][2] = 94;
        // 전체 학생의 영어 평균 구하기
        totalStudent = 0;
        int totalEnglishSum = 0;
        for (int i = 0; i < englishScores.length; i++) {
            totalStudent += englishScores[i].length;
            for (int k = 0; k < englishScores[i].length; k++) {
                totalEnglishSum += englishScores[i][k];
            }
        }
        double totalEnglishAvg = (double) totalEnglishSum / totalStudent;
        System.out.println("전체 학생의 영어 평균 점수 : " + totalEnglishAvg);
    }

    public static void funcTest49() {
        String[] strArray = new String[3];
        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String("Java");

        System.out.println(strArray[0] == strArray[1]);
        System.out.println(strArray[0] == strArray[2]);
        System.out.println(strArray[0].equals((strArray[2])));

    }

    public static void funcTest50() {
        // 길이 3 인 배열
        int[] oldIntArray = {1,2,3};

        // 길이 5인 배열을 새로 생성
        int[] newIntArray = new int[5];

        // 배열 항목 복사
        for (int i = 0; i < newIntArray.length; i++) {
            newIntArray[i] = oldIntArray[i];
        }
        // 배열 항목 출력
        for (int i = 0; i < newIntArray.length; i++) {
            System.out.print(newIntArray[i] + ", ");
        }
    }

    public static void funcTest51() {
        // 길이 3 인 배열
        String[] oldStrArray = { "java", "array", "copy"};
        // 길이 5 인 배열을 새로 생성
        String[] newStrArray =  new String[5];
        // 배열 항목 복사
        System.arraycopy(oldStrArray,0 , newStrArray, 0 , oldStrArray.length);
        // 배열 항목 출력
        for (int i = 0; i < newStrArray.length; i++){
            System.out.print(newStrArray[i] + ", ");
        }

    }

    public static void funcTest52() {
        // 배열 변수 선언과 배열 생성
        int[] scores = {95, 71, 84, 83, 93, 87};
        // 배열 항목 전체 합 구하기
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        System.out.println("점수 총합 = " + sum);
        // 배열 항목 전체 평균 구하기
        double avg = (double) sum / scores.length;
        System.out.println("점수 평균 = " + avg);
    }

    public enum Week {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THIRSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY,
    }

    public static void funcTest53() {
        // Week 열거 타입 변수 선언
        Week today = null;

        // Calendar 얻기
        Calendar cal = Calendar.getInstance();

        // 오늘의 요일 얻기 (1 ~ 7)
        int week = cal.get(Calendar.DAY_OF_WEEK);

        // 숫자를 열거 상수로 변환해서 변수에 대입
        switch (week) {
            case 1 : today = Week.SUNDAY; break;
            case 2 : today = Week.MONDAY; break;
            case 3 : today = Week.TUESDAY; break;
            case 4 : today = Week.WEDNESDAY; break;
            case 5 : today = Week.THIRSDAY; break;
            case 6 : today = Week.FRIDAY; break;
            case 7 : today = Week.SATURDAY; break;
        }

        // 열거 타입 변수를 사용
        if (today == Week.SUNDAY) {
            System.out.println("일요일 에는 축구를 합니다");
        } else  {
            System.out.println("열심히 자바를 공부합니다.");
        }

    }

    public class SportCar {

    }

    class Tire {

    }

    public static class Student {

    }

    public static void funcTest54() {
        Student s1 = new Student();
        System.out.println("s1 변수가 Student 객체를 참조합니다");

        Student s2 = new Student();
        System.out.println("s2 변수가 또 다른 Student 객체를 잠조합니다");
    }

    public static class Car {
        // 필드 선언
        String model;
        boolean start;
        int speed;
    }

    public static void funcTest55() {
        // 객체 생성
        Car myCar = new Car();

        // Car 객체의 필드값 읽기
        System.out.println("모델명 : " + myCar.model);
        System.out.println("모델명 : " + myCar.start);
        System.out.println("모델명 : " + myCar.speed);
    }

    public static class Car2 {
        // 필드 선언
            String company = "현대자동차";
            String model = "그랜저";
            String color = "검정";
            int maxSpeed = 350;
            int speed;
    }

    public static void funcTest56() {
        // Car 객체 생성
        Car2 myCar = new Car2();

        // Car 객체의 필드값 읽기
        System.out.println("제작 회사 : " + myCar.company);
        System.out.println("모델명 : " + myCar.model);
        System.out.println("색상 : " + myCar.color);
        System.out.println("최고 속도 : " + myCar.maxSpeed);
        System.out.println("현재 속도 : " + myCar.speed);
    }

    public static class Car3 {
        Car3(String model, String color, int maxSpeed) {

        }
    }

    public static void funcTest57() {
        Car3 myCar = new Car3("그랜져", "검정", 250);
    }

    public static class Korean {
        // 필드 선언
        String nation = "대한민국";
        String name;
        String ssn;

        // 생성자 선언
        public Korean(String n, String s) {
            name = n;
            ssn = s;
        }
    }

    public static void funcTest58() {
        // Korean 객체 생성
        Korean k1 = new Korean("박자바", "011244-1235678");

        // Korean 객체 데이터 읽기
        System.out.println("k1.nation : " + k1.nation);
        System.out.println("k1.name : " + k1.name);
        System.out.println("k1.ssn : " + k1.ssn);

        // 또 다른 Korean 객체 생성
        Korean k2 = new Korean("김자바", "930404-1234566");
        System.out.println("k2.nation : " + k2.nation);
        System.out.println("k2.name : " + k2.name);
        System.out.println("k2.ssn : " + k2.ssn);
    }
}


