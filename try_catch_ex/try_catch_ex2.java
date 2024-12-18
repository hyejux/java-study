package try_catch_ex;

import java.util.Scanner;


// 사용자 정의 예외 클래스: InvalidAgeException
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message); // 부모 생성자 호출
    }
}

public class try_catch_ex2 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();

        try {
            validateAge(age);
            System.out.println("입력한 나이는: " + age);
        } catch (InvalidAgeException e) {
            System.out.println("오류: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("프로그램 종료.");
        }

    }


    // 나이 유효성 검사 메서드
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("잘못된 나이입니다. 0과 150 사이의 값을 입력하세요.");
        }
    }

}
