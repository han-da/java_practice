package interface_test;

interface remoteController {
	//final - 상수 선언 키워드
	public static final int NUM=1;
	//인터페이스는 상수와 추상메소드만 가져야한다.
	public abstract void turnOn();
	public abstract void turnOff();
}

class TV implements remoteController {
	
	@Override
	public void turnOn() {
		System.out.println("티비켜기");
	}
	
	@Override
	public void turnOff() {
		System.out.println("티비끄기");
	}
}

public class interface_test {

}
