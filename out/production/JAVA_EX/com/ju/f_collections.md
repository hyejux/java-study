

## Collection
`컬렉션`

* 요소라고 불리는 객체 삽입/삭제/검색 기능 갖춘 가변 크기의 컨테이너 (배열 단점 극복)
* 프로그래밍에 필요한 기초적인 자료구조들을 컬렉션으로 만들어 제공함
* 제네릭 기법으로 구현되어있다.
* java.util 패키지 ⇒ 컬렉션 개념의 인터페이스 / 클래스 제공 Set<E> List<E> Queue<E> Map<K,V> 등등
* 제네릭 기법으로 구현, 이름에
* 타입매개변수 <E> , <K> 항상 포함됨 (컬렉션 요소를 일반화 시킨 타입) ⇒ 일반화 시킨 타입 , 제네릭 타입이라고 부름
* 컬렉션 요소는 객체! 만 가능 (기본타입 삽입시 자동 박싱 → Wrappper클래스 변환)


---

## Generic
`제네릭 타입`

* 모든 종류의 타입을 다룰 수 있도록 클래스/메소드를 일반화된 타입 매개 변수를 이용하여 선언하는 기법이다.
* 제네릭에 타입을 지정하면 , 구체화된 specialized 스택이 된다.

* E : Element
* T : Type
* V : Vaule
* K : Key
* 하나의 대문자로 사용

1. [x] 컴파일 시점에 데이터 타입을 지정
2. [x] 타입 안정성 (런타임 오류 줄일 수 있음)
3. [x] 코드 재사용성

---

## List
`ArrayList`, `LinkedList`, `Vector`

- 순서가 중요, 중복된 값 허용

1. [x] add(E e): 요소를 추가
2. [x] get(int index): 특정 인덱스의 요소를 가져옴
3. [x] remove(int index): 특정 인덱스의 요소를 제거
4. [x] contains(Object o): 해당 객체가 존재하는지 확인

## Set
`HashSet`, `LinkedHashSet`, `TreeSet`

- 순서 보장 없음, 중복된 값은 허용되지 않음 

1. [x] add(E e): 요소를 추가 (중복은 자동으로 제외)
2. [x] remove(Object o): 특정 객체를 제거
3. [x] contains(Object o): 특정 객체가 존재하는지 확인

## Map
`HashMap`, `TreeMap`, `LinkedHashMap`

- 키-값 쌍 (key-value pair)으로 저장
- 키는 중복 불가 , 값은 중복 가능


1. [x] put(K key, V value): 키-값 쌍을 추가
2. [x] get(Object key): 특정 키에 해당하는 값을 가져옴
3. [x] remove(Object key): 특정 키-값 쌍을 제거
4. [x] containsKey(Object key): 특정 키가 존재하는지 확인
5. [x] containsValue(Object value): 특정 값이 존재하는지 확인


---

## Collection Sort
`컬렉션 정렬`

### Comparable
```java
class Person implements Comparable<Person> {
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);  // 나이 기준으로 오름차순 정렬
    }
}
```

### Comparator
- 객체 `정렬 기준`을 외부에서 정의할 수 있게 해주는 인터페이스

```java
Comparator<Person> ageComparator = new Comparator<Person>() {
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.age, p2.age);  // 나이 기준으로 오름차순 정렬
    }
};

```

```java
// 나이 기준으로 정렬
Collections.sort(list, ageComparator);
System.out.println(list);  // [Alice: 22, John: 25, Bob: 30]
```


`movieList.sort(Comparator.comparing(Movie::getTitle));`
`movies.sort(Comparator.comparing(Movie::getTitle).thenComparing(Movie::getRating));`
