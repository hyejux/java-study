
## JUnit 
- Java에서 단위 테스트(Unit Test)를 수행하는 라이브러리
- 각 메서드가 정상적으로 동작하는지 검증함

1. [ ] `@Test`	단위 테스트 메서드 지정
2. [ ] `@BeforeEach`	각 테스트 실행 전에 실행할 메서드 지정 (초기화 등)
3. [ ] `@AfterEach`	각 테스트 실행 후 실행할 메서드 지정 (자원 해제 등)
4. [ ] `@BeforeAll`	모든 테스트 실행 전에 한 번 실행 (static 메서드 필요)
5. [ ] `@AfterAll`	모든 테스트 실행 후 한 번 실행 (static 메서드 필요)
6. `assertEquals(예상값, 실제값);`




## Logger 
- 프로그램 실행 흐름을 확인하고 오류를 추적하는 것이 중요함
- 실행 중인 프로그램의 상태를 기록하는 도구
-  System.out.println()보다 성능이 좋고, 다양한 로그 레벨을 지원


---
- Java에서는 보통 SLF4J + Logback을 함께 사용합니다.
- `SLF4J`: 로그 인터페이스 (Logger의 표준 인터페이스 역할)
- `Logback`: SLF4J와 함께 사용하는 강력한 로깅 프레임워크
- 출력 형식 지정, 파일에 로그 기록 등을 할 수 있다.
---
- https://mvnrepository.com/ > 
- logback-classic 
- logback-core
- slf4j

---
