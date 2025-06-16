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



}
