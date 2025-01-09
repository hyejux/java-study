
### 입출력 스트림

응용프로그램과 입출력 장치를 연결하는 소프트웨어 모듈 데이터가 순서대로 전송되도록 한다.

-   기본단위 : 바이트
-   선입선출 방식 (단방향)
-   [java.io](http://java.io) 패키지 포함

### 입출력 스트림 —- 바이트 스트림

바이트 단위 / 바이너리로 다루기때문에 문자, 이미지 바이트 모두 다룰 수 있다.

-   Stream

### 입출력 스트림 —- 문자 스트림

문자만 다룰 수 있다.

-   Reader / Writer

### 스트림 연결

바이트 스트림 ↔ 문자 스트림을 연결 할 수 있다.

-   InputStreamReader rd = new InputStreamReader ([System.in](http://System.in));
-   바이트 스트림 : [System.in](http://System.in) 을
-   문자 스트림 : rd 에 생성하여 연결
-   키 입력 받기 : rd.read()

### 텍스트 파일

문자로만 구성된 파일

### 텍스트 파일 읽기 — FileReader 클래스

1.  파일 입력 스트림 생성 (파일열기) : FileReader fin = new FileReader(”C:\\\\~~”)
2.  파일 읽기 : fin.read() 함수로 문자 하나 읽어 리턴 → (EOF (파일의 끝 ) 만나면 -1 리턴함)
3.  파일 블록 읽기 : fin.read(buf); (배열로 선언 후 크기 한번에 읽기)
4.  스트림 닫기 : fin.close()

-   경로명 표현 시 :: \\ 한개 → \\\\ 로 표기 필수 !
-   read () 리턴 타입을 int 로 하는 이유는 :: 파일 마지막 값 0xFF (-1) → 0xFF (-1) 리턴 / 파일마지막이라 -1 리턴 ???? ⇒ read() 는 int 타입으로 리턴함 즉 , 0xFF = 0x000000FF / -1 = 0xFFFFFFFF 이다. (int 리턴타입시 혼동 되지 않음)
-   FileReader 생성자 / FileReader 메소드 :: ~~

### 텍스트 파일 쓰기— FileWriter 클래스

1.  파일 출력 스트림 생성 : FileWriter fout = new FileWriter(”C:\\\\~~”)
2.  파일 쓰기 : fout.write(); → 문자 하나씩 기록
3.  파일 블록 쓰기 : fout.write(buf, 0 , buf.length); → 배열 선언 후 ( buf 0 부터 버퍼 크기만큼 작성)
4.  스트림 닫기 : fout.close();

-   FileWriter 생성자 / FileWriter 메소드 :: ~~

### 파일 입출력 / 예외 처리

1.  파일 경로명 틀림 : FileNotFoundException 예외
2.  디스크 오작동 / 파일 깨짐 : read(),write(),close() 메소드 → IOException 예외

-   IOException (슈퍼) > FileNotFoundException (서브)

### 바이트 스트림

바이트 단위의 바이너리 데이터가 흐르는 스트림

이미지/ 동영상 파일 읽고 쓸 때 사용한다.

FileOutPutStream / FileInputStream

### 바이너리 파일 쓰기 —- FileOutPutStream 클래스

변수에 저장된 바이너리 값이 저장된 파일은 사람이 쉽게 읽지 못함

1.  파일 출력 스트림 생성 : FileOutPutStream fout = new FileOutPutStream(”경로”)
2.  파일 쓰기 : fout.write(b\[i\]);
3.  파일 통째로 기록 : fout.write(b);
4.  FileOutPutStream 생성자 / FileOutPutStream 메소드 :: ~~

### 바이너리 파일 읽기 —- FileInputStream 클래스

1.  파일 읽기 : fin.read()) ≠ -1 → b\[n\] = (byte)c; n++; ~
2.  파일 통쨰로 읽기 : fin.write(b);
3.  FileInputStream 생성자 / FileInputStream 메소드 :: ~~

### File 클래스

파일이나 디렉터리에 대해 속성 정보를 제공하고 파일 관리 작업을 지원함

-   파일 입출력 기능은 없기 때문에 앞서 설명한 파일 입출력 클래스를 사용해야함

### File 객체 생성

생성자 이용해서 생성

-   File f = new File (””);
-   스트림 생성시 생성자에 파일 경로명 전달하기 위해 쓰임 FileReader fr = new FileReader(f);
-   File 클래스 생성자 :: ~~

### File 클래스 활용

파일크기타입 / 파일 삭제 / 이름변경 / 디렉터리 생성 / 디렉터리 파일 리스트 얻기 등 파일 관리 작업 수행 가능

-   File 클래스 메소드 ::length(),getName(),getPath(),getParent(),isFile(), isDirectory(),listFiles() 등

### 블록 단위로 파일 고속 복사

1.  BufferedInputStream , BufferedOutputStream 사용
2.  블록 단위로 읽고 쓰도록 수정 :: fout.write(buf, 0 , buf.length);