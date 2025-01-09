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

### 패키지 선언 —- packge 키워드

클래스 파일은 반드시 패키지에 소속되어야한다.

반드시 자바 소스 파일 첫 줄에 와야한다!

클래스의 접근지정자를 public 으로 선언해야 다른패키지에서 접근가능!

```
pakage 패키지명;
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

### 자바 실행 환경 java run time enviroment

자바 응용 프로그램이 실행되는데 필요한 제반 환경

자바 API 클래스와 자바 가상 기계 JVM 으로 이루어진다,

jlink 프로그램 - > 커스텀 JRE ⇒ 디스크사용량, 실행시간메모리가 감소함

### 자바 모듈화 목적

자바 컴포넌트들을 필요에 따라 조립하여 사용하기 위함

### JDK 패키지

JDK 는 다양한 패키지를 제공한다. ⇒ 자바 API

자바 표준 패키지는 모듈로 나뉘어 압축파일 형태로 담김

java.lang / java.util / [java.io](http://java.io) / [java.aw](http://java.aw) / java.swing

### object 클래스 —- java.lang

모든 클래스는 강제로 object 를 상속 받는다.

object 만이 아무 클래스도 상속 받지 않는 최상위 클래스

### hashCode()

객체의 해시 코드 ( 고유한 정수값) 제공

### toString() —- 객체 → 문자열 변환

‘객체+문자열’ 연산 or 객체 출력시 자동 출력됨.

```
public string toString(); // 오버라이딩 가능
a + "점" // a.toString() + "점"
```

### getClass() / getName()

객체의 클래스 정보를 담은 class 객체 리턴

객체의 클래스명 알아냄

### equals() —- 객체 비교

두 레퍼런스 값을 비교

```
public boolean equals(Object obj) // 객체의 내용 비교
```

### Wrapper 클래스

-   8개의 기본타입을 객체로 다루기 위한 클래스
-   Byte / Short / Integer/ Long /Character/Float /Double / Boolean

```
Integer i = Integer.valueof(10) // 정수 10 객체화
```

-   Character 제외한 나머지는 문자열로 Wp객체 생성 가능
-   주요 메소드 대부분 static 타입

```
//기본타입 값 알아내기
Integer i = Integer.valueof(10); // 정수 10 객체화
int ii = i.intValue();
```

```
//문자열을 기본타입으로 변환
int i = Integer.parseIn("123"); // 정수 10 객체화
double d = Double.parseDouble("3.141592");
```

```
//기본타입을 문자열로 변환
String s1 = Integer.toString(123); //"123"
```

### boxing / unboxing

-   박싱 : 기본타입 → Wrapper 객체
-   언박싱 : Wrapper 객체 → 기본타입
-   jdk 1.5 부터는 자동박싱/언박싱

```
Integer ten =10; // 자동 박싱 Integer tne = Integer.valueof(10);
int n = ten; // 자동 언박싱 int n = ten.intValueof();
```

### String 클래스

-   스트링 리터럴은 String 객체로 처리됨

### 스트링 리터럴 / new String()

-   스트링 리터럴 → 리터럴 테이블 생성 / 공유 가능 (실행시간 줄이기 위함)
-   new Sring() → 힙 메모리 생성 / 공유 불가능 / 수정불가능
-   new String 은 수정 불가능 → concat() 으로 변경

### String 활용

-   String클래스 비교 시 == 연산자 불가능
-   equals() 같은지 / compareTo() 값비교
-   trim() 앞뒤 공백문자 제거
-   주요 메소드는 많음! 찾아서 확인 (메소드를 사용해도 원본 문자열이 바뀌지 않음)

### String Buffer 클래스

-   내부에 가변크기의 버퍼를 가지고 문자의 개수에 따라 버퍼 크기 자동조절
-   스트링 수정 가능
-   스트링이 길거나 작업이 많으면 String Buffer 추천

### StringTokenizer 클래스

-   문자열 분리를 위해 사용
-   delimiter 구분 문자 ⇒ 분리 기준 문자
-   token 토큰 ⇒ 분리된 문자
-   메소드 StringTokenizer()/ countTokens()/ hasMoreTokens()/ nextToken()

### Math 클래스

-   static 타입
-   random() / sqrt() / exp() 등등