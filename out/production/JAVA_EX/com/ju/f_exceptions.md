
# Java 예외 처리

자바에서는 프로그램 실행 중 발생할 수 있는 다양한 오류나 예외 상황을 처리할 수 있는 `예외 처리(Exception Handling)` 메커니즘을 제공합니다.
예외는 프로그램이 예상하지 못한 상황에서 발생하는 문제로, 예외 처리 구문을 사용하여 오류를 우아하게 처리할 수 있습니다.

## 예외 종류

1. **Checked Exception (검사 예외)**:
    - 컴파일 시점에서 처리되지 않은 예외.
    - 반드시 `try-catch` 블록으로 처리하거나 메소드 선언부에서 `throws` 키워드를 사용해 예외를 던져야 합니다.
    - 예시: `IOException`, `SQLException`, `FileNotFoundException` 등.

2. **Unchecked Exception (비검사 예외)**:
    - 런타임 시점에서 발생하는 예외로, 컴파일 시점에서 처리하지 않아도 됩니다.
    - `RuntimeException` 클래스를 상속한 예외들입니다.
    - 예시: `NullPointerException`, `ArrayIndexOutOfBoundsException`, `ArithmeticException` 등.

3. **Error**:
    - 주로 JVM의 내부적인 문제로 발생하는 심각한 오류입니다.
    - 프로그램에서 예외 처리로 다루지 않으며, 시스템의 오류나 메모리 부족 등 발생합니다.
    - 예시: `OutOfMemoryError`, `StackOverflowError` 등.

## 예외 처리 구문

### 1. try-catch 구문

`try-catch` 구문은 예외가 발생할 가능성이 있는 코드를 `try` 블록에 넣고, 예외가 발생했을 때 어떻게 처리할지 `catch` 블록에서 정의하는 방식입니다.

```java
try {
    // 예외가 발생할 가능성이 있는 코드
    int result = 10 / 0;  // ArithmeticException 발생
} catch (ArithmeticException e) {
    // 예외 발생 시 처리하는 코드
    System.out.println("0으로 나눌 수 없습니다!");
}
```

### 2. try-catch-finally 구문

`finally` 블록은 예외가 발생하더라도 무조건 실행되는 블록으로, 리소스 해제나 종료 작업을 처리하는 데 사용됩니다.

```java
try {
    // 예외가 발생할 가능성이 있는 코드
    FileReader file = new FileReader("file.txt");
} catch (IOException e) {
    // 예외 발생 시 처리하는 코드
    System.out.println("파일을 열 수 없습니다!");
} finally {
    // 항상 실행되는 코드
    System.out.println("리소스 정리 코드 실행");
}
```

### 3. throws 키워드

`throws`는 메소드에서 예외를 직접 처리하지 않고, 해당 메소드 호출자에게 예외 처리를 위임하는 역할을 합니다.

```java
public void readFile(String fileName) throws IOException {
    FileReader file = new FileReader(fileName);
    // 예외가 발생할 수 있는 코드
}
```

### 4. 예외 클래스 상속 관계

자바에서 모든 예외는 `Throwable` 클래스를 상속받습니다.
- `Error` 클래스는 `Throwable`을 상속받고 시스템 오류를 나타냅니다.
- `Exception` 클래스는 `Throwable`을 상속받고, 프로그램 실행 중 발생하는 예외들을 처리합니다.

    - **RuntimeException**: 컴파일 시 반드시 처리하지 않아도 되는 예외들
    - **IOException, SQLException** 등: 컴파일 시 예외 처리해야 하는 예외들

```java
Throwable
  ├── Error
  └── Exception
      ├── RuntimeException
      └── IOException
```

## 예외 처리 심화

### 1. 여러 예외 처리

`try-catch` 구문에서 여러 개의 예외를 한 번에 처리하려면, `catch` 구문을 여러 번 작성하거나, 다중 예외 처리 문법을 사용할 수 있습니다.

```java
try {
    int[] arr = new int[3];
    arr[5] = 10;  // ArrayIndexOutOfBoundsException 발생
} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
    // 두 가지 예외를 한 번에 처리
    System.out.println("예외 발생: " + e.getMessage());
}
```

### 2. 사용자 정의 예외 (Custom Exception)

자바에서는 `Exception` 클래스를 상속받아 사용자 정의 예외를 만들 수 있습니다. 이때 필요한 생성자와 메시지를 추가할 수 있습니다.

```java
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new CustomException("사용자 정의 예외 발생!");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

### 3. 예외 전환 (Exception Chaining)

새로운 예외를 던질 때 원래 예외를 포함시켜서 던지는 방법입니다. `Throwable.initCause()` 메소드를 사용하여 예외 체이닝을 할 수 있습니다.

```java
try {
    try {
        throw new ArithmeticException("산술 예외");
    } catch (ArithmeticException e) {
        throw new Exception("새로운 예외", e);
    }
} catch (Exception e) {
    System.out.println("발생한 예외: " + e.getMessage());
    System.out.println("원인 예외: " + e.getCause());
}
```

## 예외 처리의 Best Practice

1. **필요한 예외만 처리**: 모든 예외를 처리하는 것은 비효율적입니다. 꼭 필요한 예외만 처리하고 나머지는 상위 메소드로 위임합니다.
2. **자원 관리는 `finally` 또는 `try-with-resources`**: 자원 해제는 반드시 `finally` 블록이나 `try-with-resources` 구문을 통해 처리해야 합니다.
3. **구체적인 예외 처리**: `Exception` 보다는 `IOException`, `SQLException` 등 구체적인 예외를 처리하는 것이 좋습니다.
4. **문제의 원인을 알 수 있도록 예외 메시지 출력**: 예외 메시지를 통해 문제의 원인을 정확히 파악할 수 있도록 합니다.

## 결론

자바의 예외 처리 메커니즘은 프로그램의 안정성을 높이고, 예상치 못한 상황에서 유연하게 대응할 수 있도록 도와줍니다. 예외를 적절히 처리하는 것은 강력한 애플리케이션을 개발하는 데 필수적인 요소입니다.
