public class Hello {
    // 1) 재귀를 이용한 팩토리얼 구현
    public static long factorial(int n) {
        if (n <= 1) {
            return 1L;      // 0! = 1, 1! = 1
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        // 2) 1부터 10까지 팩토리얼 출력
        for (int i = 1; i <= 10; i++) {
            long result = factorial(i);
            System.out.printf("%2d! = %d%n", i, result);
        }
    }
}
