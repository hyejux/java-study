
##  main 메서드 
`public static void main(String[] args) {}`
*  자바가 실행되면 무조건 `main` 함수 부터 실행된다. (진입점`entry point`)
*   `pulbic` 접근 제어자 (모든 클래스에서 접근 가능)
* `static`  정적 함수 
*  `void` 리턴이 없음을 의미
* `String[] args` 커맨드 라인에서 전달된 인자들을 배열로 받는 매개변수

##  Math 클래스 
* Math.abs(x) 숫자의 절댓값을 반환합니다.
* Math.ceil(x) 주어진 숫자보다 크거나 같은 가장 작은 정수를 반환합니다. 즉, 올림 함수입니다.
* Math.floor(x) 주어진 숫자보다 작거나 같은 가장 큰 정수를 반환합니다. 즉, 내림 함수입니다.
* Math.round(x)  숫자를 반올림하여 가장 가까운 정수를 반환합니다.
* Math.random() 0과 1 사이의 임의의 실수를 반환합니다.
* Math.max(...values)  주어진 인자 중 가장 큰 값을 반환합니다.
* Math.min(...values) : 주어진 인자 중 가장 작은 값을 반환합니다.
* Math.pow(base, exponent) base를 exponent만큼 거듭제곱한 값을 반환합니다.
* Math.sqrt(x) 숫자의 제곱근을 반환합니다.

## final 키워드 
* 변수 :  상수화 시킨다. (값이 변하지 않음)
* 메서드 : 오버라이드 (재정의) 불가
* 클래스 :  상속 불가
* 파라미터 : 매세드 내에서 값 변경 불가

## String 클래스
* length() : 문자열의 길이를 반환합니다.
* charAt(int index) : 주어진 인덱스 위치에 있는 문자를 반환합니다.
* substring(int start) : 주어진 시작 인덱스부터 문자열의 끝까지 부분 문자열을 반환합니다.
* substring(int start, int end) : 주어진 범위 내의 부분 문자열을 반환합니다. (start는 포함, end는 포함되지 않음)
* toLowerCase() : 문자열을 모두 소문자로 변환합니다.
* toUpperCase() : 문자열을 모두 대문자로 변환합니다.
* trim() : 문자열 앞뒤의 공백을 제거합니다.
* equals(Object obj) : 두 문자열이 동일한지 비교합니다. (대소문자 구분)
* equalsIgnoreCase(String another) : 두 문자열을 대소문자 구분 없이 비교합니다.
* contains(CharSequence sequence) : 문자열에 특정 문자열이 포함되어 있는지 확인합니다.
* indexOf(String str) : 주어진 문자열이 처음 나타나는 위치의 인덱스를 반환합니다. (없으면 -1)
* lastIndexOf(String str) : 주어진 문자열이 마지막으로 나타나는 위치의 인덱스를 반환합니다. (없으면 -1)
* replace(char oldChar, char newChar) : 문자열에서 특정 문자를 다른 문자로 바꿉니다.
* replaceAll(String regex, String replacement) : 정규 표현식을 사용하여 문자열에서 특정 패턴을 찾아 바꿉니다.
* split(String regex) : 주어진 정규 표현식에 따라 문자열을 분할하여 배열로 반환합니다.
* startsWith(String prefix) : 문자열이 특정 접두어로 시작하는지 확인합니다.
* endsWith(String suffix) : 문자열이 특정 접미어로 끝나는지 확인합니다.
* valueOf(int i) : 정수 등을 문자열로 변환합니다.
* format(String format, Object... args) : 형식화된 문자열을 생성합니다. (C 스타일 서식 지원)
* concat(String str) : 두 문자열을 연결합니다.
* isEmpty() : 문자열이 비어 있는지 확인합니다.
* toCharArray() : 문자열을 문자 배열로 변환합니다.
