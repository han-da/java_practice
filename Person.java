
public class Person {
	//멤버변수
	//멤버변수 접근제어  지시자로 private을 쓰면 객체 내부에서만 접근가능
	//객체 외부 접근 차단 (정보은닉)
	//객체 외부에서 멤버변수에 직접적으로 접근하는것을 차단한다.
	//priavte을 쓰면 객체 내부에서만 접근가능
	private String name;
	private int age;
	private double height;
	
	//생성자 (클래스와 이름이 같고, 리턴 타입(반환 형태)이 없다)
	public Person() { // 입력이 없는 생성자
		//디폴트 생성자 (default Constructor)
		System.out.println("디폴트 생성자 호출됨!");
		this.name = "기본이름";
		this.age = 20;
		this.height = 170;
	}
	public Person(String name, int age, double height) {
		System.out.println("String, int, double 생성자 호출됨!");
		this.name = name;// (this - 현재 객채의 주소) - 멤버변수
		this.age = age;
		this.height = height;
	}
	//생성자도 오버로딩 된다.
	
	//멤버 메소드
	
	
	public void Introduce() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
}
