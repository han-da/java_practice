package abstract_test;

//추상 클래스 sample
//추상 클래스는 하나 이상의 추상메서드를 가져야한다.
abstract class sample {
	//추상메소드 : body가 없는 메소드
	//몸체가 없는 메소드, 기능이 없는 메소드
	//틀만 있는 메소드
	public abstract void func() ;
	//추상메소드라고 abstract를 붙여놓고
	//body(몸체,기능)을 만들면 오류가 난다
	//Abstract methods do not specify a body
	//추상메소드는 바디를 구체화하면 안된다.
	//추상메소드는 바디를 만들지말라.
	//추상메소드는 추상클래스는 물려받는 클래스가 오버라이딩해서 구현하는 것
	//추상클래스는 물려받는 자식클래스가 추상메소드를 구현한다.
	//Animal의 sound는 추상메소드로 하는게 적절
	//Animal클래스에서 내용이 정해지지가 않으니까.. 물려받는 클래스에서 정해야되니깐..
	//동물울음소리 예제
	//추상클래스 Animal에, 추상메소드 sound가 적절하다.
	public void hello() {
		System.out.println("hello");
	}
}

class mychild extends sample {
	
	@Override // 어노테이션(표기)-이 메소드는 오버라이딩된 메소드다.
	public void func() { 
		System.out.println("func!");
	}
	//The type mychild must implement the inherited abstract method sample.func()
	//타입 mychild는 구현해야만 한다. ~ 상속받는 추상메소드 sample클래스의 func메소드를
	//타입 mychild는 sample클래스에게 상속받은 추상메소드 func를 구현해야만 한다.(강제)
	//추상메소드를 물려받은 자식클래스는 그 추상메소드를 구현해야할 의무가 있다.
	//왜냐면? 부모쪽에서 일부러 구현안하고 틀만 만들어서 넘긴거.. 자식이 구현하라고.
	
	//해결방법
	//add unimplemented methods
	//미구현된 메소드를 추가하라
	//(추상클래스에게 물려받은 추상메소드를 구체화하라(구현해라))
}

public class test {

}
