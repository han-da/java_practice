
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

//클래스와 객체
//클래스 : 설계도, 객체 : 설계도로 생성된 것
//클래스 : 건물설계도, 객체 설계도로 생생된 건물
//클래스 : 변수, 함수, 객체: 그 틀이 메모리에 실체화 된 것
//클래스 : class ~~, 객체 : new Person
//new - (새로운, 신규) , new의 의미?
//메모리 생성 연산자
//메모리가 어디에 할당되느냐? -heap 영역
//C언어, C++ : 직접 메모리 할당해제
//JVM이 알아서 해준다
//Person p = new Person(); - JAVA
//왼쪽 : 객체의 주소가 저장되는 변수 (실체는 포인터 변수라는 것이다.)
//오른쪽 : 객체 생성, new - 메모리 생성 연산자
//(new person - person 클래스를 이용해서 메모리를 생성해라) - (객체를 생성하고, 생성한 객체의 주소가 반환됨)
//new라는게 메모리 생성연산자 라는 것만 알고, 객체라는게 메모리에 할당하는 행위임을 알면 됨.

//Person p = new Person(); - JAVA (원리가 일부 숨어있다.)
//Person* p = new Person(); - C++ (실체)
//p = Person(); - Python (생략해도 너무 생략했다.)

//생성자(construct) : 객체를 생성하는 일종의 메소드

//메소드 오버로딩(method overloading) - 메소드 과적
//메소드 오버로딩 : 같은 이름의 메소드를 매개변수 타입이나 갯수가 다르게 정의
//이름이 똑같은 메소드를 여러개 정의할 수 있다.
//add(2,3) - 매개변수 2개짜리 덧셈
//add(2,3,4) - 매개변수 3개짜리 덧셈

//상속, 메소드 오버라이딩

//상속(Inheritance)
//class Student extends Person
//Student클래스를 Person클래스에게 물려받는다.
//Student클래스를 Person클래스를 이용해서 확장한다.
//Student가 자식 클래스, Person이 부모 클래스
//extend - 확장하다. , extention - 확장
//person이 가진 것들은 모두 student가 사용가능하다.
//상속의 목적 : 재사용 + 알파

//상속이 가능한지 판별하는 법
//IS-A관계 (~이다.)
//Person is a Student - 사람은 학생이다 (x - 사람 중에 경찰도 있고 , 회사원도 있으니깐)
//Student is Person - 학생은 사람이다. (o - 학생은 사람이니깐)

//Police is a Gun - 경철은 총이다
//기능상으로 보면 총의 기능이 경찰한테 가야되니까 상속해줘야 할거 같은데...
//실제로 IS-A관계로 따져보니까 좀 부적절하다.
//그럴땐 HAS-A관계로 포함관계로 처리하자
/* ex)
  class Police {
  private Gun g;
  private Cudgel c;
  
  public Police() {
  		g=new Gun();
  		c=new Cudgel();
  	 }
	}
*/
//상속 = 재사용 + 알파
//기능만 물려줘서 재사용은 눈에보이는것
//+알파 : 오버라이딩 다형성

//오버라이딩
//메소드 오버라이딩
//method overriding
//오버로딩 vs 오버라이딩
//overloading vs overriding
//override : ~보다 우선시하다.
//overriding : ~보다 우선시하는 것
//method overriding : 메소드 우선시하는 것
//부모한테 물려받은 메소드보다 자식이 재정의한 메소드가 우선시된다.
//메소드 오버라이딩은 반드시 상속이 선행되어야한다.

//다형성
//polymorphism + poly + morph + ism (다양한 형태를 지니는 성질)
//poly : 다양한 (접두사)
//polygon : 다각형, polymer : 고분자, poly~~
//부모 참조변수에 자식객체들을 모두 담아서 쓸 수 있다.
//어떤 자식 객체가 담기느냐에 따라서, 실제로 나오는 형태가 다르다. (다형성)
//동물 울음소리 예제

//추상클래스, 인터페이스

//쓰레드 (동기, 비동기)

