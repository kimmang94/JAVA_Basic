public class Hello {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 9, 4};

        // 1) 배열의 첫 번째 원소로 초기화
        int min = numbers[0];
        int max = numbers[0];

        // 2) 두 번째 원소부터 끝까지 순회하며
        for (int i = 1; i < numbers.length; i++) {
            int number = numbers[i];

            // 최소 비교는 독립적으로
            if (number < min) {
                min = number;
            }
            // 최대 비교도 독립적으로
            if (number > max) {
                max = number;
            }
        }

        System.out.println("최솟값: " + min);
        System.out.println("최댓값: " + max);
    }
}
