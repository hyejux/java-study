
### 모듈

여러개의 패키지를 모은 것

### 패키지 —— import 문

서로 관련 있는 클래스나, 인터페이스의 컴파일된 .class 파일들을 하나의 디렉터리에 모아 놓은 것

```
java.util.Scanner sc = new java.util.Scanner(System.in);
-----
// import 를 통해 긴 경로명 사용하지 않아도 된다.
import 패키지.클래스; // 완전경로명 선언
import 패키지.*;

Scanner sc = new Scanner(System.in);
```

### 패키지 선언 —- package 키워드

클래스 파일은 반드시 패키지에 소속되어야한다.

반드시 자바 소스 파일 첫 줄에 와야한다!

클래스의 접근지정자를 public 으로 선언해야 다른패키지에서 접근가능!

```
package 패키지명;
```

```
import UI.Tools; 
// 다른 패키지클래스에서 UI>Tools.class 를 사용하고 싶을 때
```

### 모듈 —- (.jmod)

패키지들을 담는 컨테이너 모듈파일 (.jmod)

-   모듈들은 JDK — jmods 디렉터리에 들어있다.
-   기본 모듈은 java.base 모듈 (java.base.jmod 파일에 들어있음)
-   jmod 는 zip 포맷으로 압축된 것 (jmod 프로그램으로 압축해제)

### 자바 실행 환경 java run time environment

자바 응용 프로그램이 실행되는데 필요한 제반 환경

자바 API 클래스와 자바 가상 기계 JVM 으로 이루어진다,

jlink 프로그램 - > 커스텀 JRE ⇒ 디스크사용량, 실행시간메모리가 감소함

### 자바 모듈화 목적

자바 컴포넌트들을 필요에 따라 조립하여 사용하기 위함

### JDK 패키지

JDK 는 다양한 패키지를 제공한다. ⇒ 자바 API

자바 표준 패키지는 모듈로 나뉘어 압축파일 형태로 담김

java.lang / java.util / java.io / java.awt / java.swing

