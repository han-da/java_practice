package destructor;

class test {
	public test() {
		System.out.println("생성자 호출!");
	}
	
	//소멸자 (finalize메소드) - 객체가 소멸될 때
	//자바 메모리관리는 JVM 내부의 Garbage Collector가 해준다.
	public void finalize() {
			try {
				super.finalize();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("소멸자 호출!");
	}
}

public class ex {
	public static void main(String[] args) {
		test t = new test();
		//t.finallize();
		t=null; // 객체를 쓰레기로 만들고
		System.gc(); // 쓰레기차 불렀다.
		//Runs the garbage Collector in the Java Virtual machine
		//(자바 가상 머신 내부의 가비지 컬렉터를 실행한다.)
		//객체와의 연결을 끊어서 객체가 사용될 수 없게 만들어지면, 객체가 소멸되어야 한다.
		//소멸될 필요가 있는 객체를 제거하기 위해서,
		//가비지 컬렉터를 호출하면 가비지 컬렉터가 소멸자를 호출하여 객체가 소멸되게 한다.
		//super.finalize()는 Object 클래스에게 상속 받은 메서드
	}
}
