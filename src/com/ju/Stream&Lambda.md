
## Stream 
- 컬렉션, 배열 등 요소를 함수형 스타일로 다루게 해줌
```java
users.stream()
    .filter(user -> user.getAge() > 20)
    .forEach(System.out::println);
```

## Lambda 
- 람다식
- 코드가 간결해짐
```java
(a, b) -> a + b;
```

## @FunctionalInterface
- 함수형 인터페이스 : 1개의 추상메소드를 갖는 인터페이스


## 메서드 참조
- `::` 메서드 참조 연산을 통해서 더 간결하게 작성가능
- `클래스명::메서드명`
```java
 list.flapMap(innerList -> innerList.stream());
 list.flapMap(List::stream);
```