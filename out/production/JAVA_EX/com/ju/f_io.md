
### 입출력 스트림 (I/O Streams)

입출력 스트림은 **응용 프로그램과 입출력 장치**(예: 파일, 네트워크 등)를 연결하는 소프트웨어 모듈로, 데이터를 순차적으로 전송하고 읽는 방식을 제공합니다.

- **기본 단위**: 바이트(Byte)
- **작동 방식**: 선입선출 (FIFO, First In First Out) 방식, **단방향** 스트림
- **패키지**: `java.io`

---

### 1. 입출력 스트림 종류

#### 1.1. **바이트 스트림 (Byte Stream)**

- **특징**: 바이트 단위로 데이터를 읽고 쓸 수 있으며, 바이너리 데이터를 처리하는 데 사용됩니다.
    - **예시**: 이미지, 비디오, 음성 파일 등
- **구성 클래스**: `InputStream`, `OutputStream` (하위 클래스로 `FileInputStream`, `FileOutputStream`, `BufferedInputStream`, `BufferedOutputStream` 등)

#### 1.2. **문자 스트림 (Character Stream)**

- **특징**: 문자 데이터를 다루는 스트림으로, **자동으로 인코딩/디코딩**을 처리하여 문자 데이터를 효율적으로 읽고 쓸 수 있습니다.
    - **예시**: 텍스트 파일
- **구성 클래스**: `Reader`, `Writer` (하위 클래스로 `FileReader`, `FileWriter`, `BufferedReader`, `BufferedWriter` 등)

#### 1.3. **바이트 스트림 ↔ 문자 스트림 연결**

- **방법**: `InputStreamReader`를 사용하여 바이트 스트림을 문자 스트림으로 변환할 수 있습니다.
    - 예시:
      ```java
      InputStreamReader reader = new InputStreamReader(System.in);
      ```

---

### 2. 텍스트 파일 처리

#### 2.1. **텍스트 파일 읽기 — `FileReader` 클래스**

1. **파일 입력 스트림 생성**:
   ```java
   FileReader fin = new FileReader("C:\path\to\file.txt");
   ```
2. **파일 읽기**: `fin.read()`를 사용하여 문자 하나를 읽습니다. (파일 끝에 도달하면 -1 반환)
   ```java
   int c;
   while ((c = fin.read()) != -1) {
       System.out.print((char) c);
   }
   ```
3. **파일 블록 읽기**: `fin.read(buf)`로 배열을 사용해 한 번에 여러 문자 읽기.
   ```java
   char[] buf = new char[1024];
   fin.read(buf);
   ```
4. **스트림 닫기**:
   ```java
   fin.close();
   ```

- **주의**: 경로명에서 `\`를 사용하여 표현해야 합니다. 예: `"C:\\path\\to\\file.txt"`

---

#### 2.2. **텍스트 파일 쓰기 — `FileWriter` 클래스**

1. **파일 출력 스트림 생성**:
   ```java
   FileWriter fout = new FileWriter("C:\path\to\file.txt");
   ```
2. **파일 쓰기**: `fout.write()`로 문자 하나씩 파일에 기록.
   ```java
   fout.write('A');
   ```
3. **파일 블록 쓰기**: `fout.write(buf, 0, buf.length)`로 배열을 사용해 여러 문자 한 번에 기록.
   ```java
   char[] buf = {'H', 'e', 'l', 'l', 'o'};
   fout.write(buf, 0, buf.length);
   ```
4. **스트림 닫기**:
   ```java
   fout.close();
   ```

---

### 3. 바이트 스트림 처리

#### 3.1. **바이너리 파일 쓰기 — `FileOutputStream` 클래스**

1. **파일 출력 스트림 생성**:
   ```java
   FileOutputStream fout = new FileOutputStream("C:\path\to\file.bin");
   ```
2. **파일 쓰기**: `fout.write(b)`로 바이트 배열을 파일에 기록.
   ```java
   byte[] b = {1, 2, 3, 4};
   fout.write(b);
   ```
3. **파일 통째로 기록**:
   ```java
   fout.write(b);
   ```
4. **스트림 닫기**:
   ```java
   fout.close();
   ```

#### 3.2. **바이너리 파일 읽기 — `FileInputStream` 클래스**

1. **파일 입력 스트림 생성**:
   ```java
   FileInputStream fin = new FileInputStream("C:\path\to\file.bin");
   ```
2. **파일 읽기**: `fin.read()`로 바이트 하나씩 읽음. (파일 끝에 도달하면 -1 반환)
   ```java
   int byteData;
   while ((byteData = fin.read()) != -1) {
       System.out.print(byteData);
   }
   ```
3. **파일 통째로 읽기**:
   ```java
   byte[] b = new byte[1024];
   fin.read(b);
   ```
4. **스트림 닫기**:
   ```java
   fin.close();
   ```

---

### 4. `File` 클래스 활용

`File` 클래스는 파일 및 디렉터리에 대한 정보 및 관리 기능을 제공합니다.

#### 4.1. **`File` 객체 생성**:
```java
File f = new File("C:\path\to\file.txt");
```

#### 4.2. **파일 정보 조회**:

- **파일 크기**:
   ```java
   long size = f.length();
   ```
- **파일 이름**:
   ```java
   String name = f.getName();
   ```
- **파일 경로**:
   ```java
   String path = f.getPath();
   ```

#### 4.3. **파일 작업**:

- **파일 삭제**:
   ```java
   boolean deleted = f.delete();
   ```
- **디렉터리 생성**:
   ```java
   boolean created = f.mkdir();
   ```

#### 4.4. **디렉터리 파일 목록 조회**:
```java
File[] files = f.listFiles();
```

---

### 5. 고속 파일 처리 (Buffered Streams)

파일 입출력을 더 효율적으로 처리하려면 **버퍼링**을 사용하는 것이 좋습니다. `BufferedInputStream`, `BufferedOutputStream`, `BufferedReader`, `BufferedWriter` 등을 사용하여 **블록 단위**로 읽고 씁니다.

- **예시**:
  ```java
  BufferedInputStream bis = new BufferedInputStream(new FileInputStream("file.txt"));
  BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("file.txt"));
  ```

---

### 6. 예외 처리

입출력 작업 시 발생할 수 있는 예외들에 대해서는 반드시 예외 처리 코드를 추가해야 합니다.

- **FileNotFoundException**: 파일을 찾을 수 없을 때 발생.
- **IOException**: 입출력 작업 중 발생하는 일반적인 예외.

**예외 처리 예시**:
```java
try {
    FileReader fin = new FileReader("file.txt");
    // 파일 처리 코드
} catch (FileNotFoundException e) {
    System.out.println("파일을 찾을 수 없습니다.");
} catch (IOException e) {
    System.out.println("입출력 오류 발생.");
} finally {
    // 리소스 해제 코드 (필요시)
}
```
