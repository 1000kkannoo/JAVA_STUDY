## 은종쌤 자바강의 part1 - 객체

## 객체

-> 의사나 행위가 미치는 대상

-> 구체적 추상적 데이터의 단위

## 객체지향 프로그래밍

절차지향과 다르게 객체들간의 인터랙션을 통해 프로그래밍

![스크린샷 2023-09-04 오후 4.18.42.png](..%2F..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fm9%2Fpngxkff54pj3dhvxng4f_gnr0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_sV9lGF%2F%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202023-09-04%20%EC%98%A4%ED%9B%84%204.18.42.png)

객체를 정의하고, 각 객체 제공하는 기능들을 구현, 객체가 제공하는 기능들 간의 소통을 통해 객체간의 협력을 구현

## 클래스는 객체의 청사진이라 볼 수 있음

(객체의 청사진) 학생 클래스 -> 멤버 변수 (학생의 속성) ex) 학생 Id, 학생 이름 등등

## 객체지향 프로그래밍을 할때

1. 객체를 정의
2. 각 객체의 속성을 멤버 변수로 역할을 메서드로 구현
3. 각 객체간의 협력을 구현

## 함수 호출과 스택 메모리

스택 : 함수가 호출될 때 지역 변수들이 사용하는 메모리

## 메서드
- 객체의 기능을 구현하기 위해 클래스 내부에 구현되는 ㅎ마수
- 멤버 함수 라고도 함
- 메서드를 구현함으로써 객체의 기능이 구현 됨
- 메서드의 이름은 그 객체를 사용하는 객체에 맞게 짓는 것이 좋음
  - ex) getStudentName()

## 인스턴스 생성과 힙 메모리

- 클래스 : 객체의 속성을 정의 (한마디로 청사진일뿐)
- 객체(인스턴스) :  각각 다른 값을 가지고 있음

### 힙메모리?

생성된 객체(인스턴스) 동적메모리에 할당됨

결론 -> 하나의 클래스에서부터 여러개의 인스턴스 생성 -> 각각 다른 메모리 주소를 가지고 있다.

### 접근 제어 지시자와 정보은직

캡슐화 : 정보 은닉을 통한 캡슐화
- 꼭 필요한 정보와 기능만 외부로 오픈
- 정보를 클래스화해서 멤버 변수와 메서드를 감추고 외부에 통합된 인터페이스만 제공하여 일관된 기능을 구현
- 각각의 메서드나 멤버 변수를 접근함으로써 발생하는 오류를 최소화

## 객체간의 협력

버스 - 학생 - 지하철




