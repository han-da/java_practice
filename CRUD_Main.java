import java.util.Scanner;
//java 패키지 안에, util패키지 안에, Scanner클래스를 가져온다.

public class CRUD_Main {
	public static void main(String[] args) {
		Person p1 = new Person();
		//왼쪽 : 참조변수, 객체변수(객체의 주소가 들어간다.)
		//오른쪽 : new Person(); (Person클래스로 객체 생성한다.)
		//오른쪽 : new Person(); (Person클래스로 메모리 생성하라.)
		//생성자 : 객체가 생성될때 호출도니다.
		//지금 상황에서는 디폴트 생성자가 호출된다.
		p1.Introduce(); // p1이 가리키는 곳의 Introduce 메소드 호출
		//p1 -> Introduce(); // p1이 가리키는 곳의 Introduce 메소드 호출
		
		Scanner sc = new Scanner(System.in);
		//왼쪽은 스캐너 객체의 주소를 저장하는 변수
		//오른쪽은 스캐너 객체 생성 (입력값으로 System.in-키보드 입력 가능하게 하는 입력값)
		//Scanner클래스로 객체 생성하면서 생성자의 입력으로 System클래스의 in객체
		//System.in - System클래스의 표준 입력 스트림
		//이걸 줘야 키보드 입력이 가능해진다.
		System.out.print("이름 입력 : ");
		String name=sc.next();
		System.out.print("나이 입력 : ");
		int age=sc.nextInt();
		System.out.print("키 입력 : ");
		double height=sc.nextDouble();
		
		Person p2 = new Person(name, age, height); 
		//Person 객체 생성하면서, 생성자로 String, int, double 값을 받는 생성자 호출
		p2.Introduce();
		
	}
}
