package StreamAPI_ex;

public class StreamAPi_reduce {
    public static void main(String[] args) {

    }
}

/*

예제 1: 정수 리스트 합계 계산
java
코드 복사
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                         .reduce(0, Integer::sum); // 0 + 1 + 2 + 3 + 4 + 5

        System.out.println("합계: " + sum); // 출력: 합계: 15
    }
}
설명
초기값: 0부터 시작.
Integer::sum: 리스트의 각 요소를 순차적으로 더함.
최종적으로 15 반환.
예제 2: 곱셈 결과 계산
java
코드 복사
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int product = numbers.stream()
                             .reduce(1, (a, b) -> a * b); // 1 * 2 * 3 * 4 * 5

        System.out.println("곱셈 결과: " + product); // 출력: 곱셈 결과: 120
    }
}
설명
초기값: 1 (곱셈이므로 곱하기에 영향을 주지 않는 값).
람다 표현식 (a, b) -> a * b를 사용해 각 요소를 곱함.
예제 3: 문자열 연결
java
코드 복사
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello", "World", "Stream");

        String result = words.stream()
                             .reduce("", (a, b) -> a + " " + b); // 문자열 연결

        System.out.println("문자열 결과: " + result.trim()); // 출력: "Hello World Stream"
    }
}
설명
초기값: "" (빈 문자열).
람다식 (a, b) -> a + " " + b를 사용해 문자열을 연결.

 */