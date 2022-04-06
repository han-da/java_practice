
//public-같은 패키지, 다른패키지 다 접근가능
//default-같은 패키지까지는 접근가능
public class Student extends Person{
	// ...이름, 나이, 키
	private String major;
	private double GPA;
	// 추가 멤버변수 전공, 평점
	
	public Student() {
		//디폴트 생성자
		//생성자 주요목적 : 멤버변수 초기화
		//부모 생성자
		super(); // Person클래스의 생성자 호출
		//부모한테 물려받은 멤버변수는, 부모 생성자로 처리하자
		//super - 상위의
		//super man - 초인(상위의 인간, 인간을 초월한 인간)
		//부모 클래스의 생성자 호출해라
		major="기본전공";
		GPA=3.0;
	}
	
	public Student(String name, int age, double height, String major, double GPA) {
//		this.name=name;
//		this.age=age;
//		this.height=height;
		super(name, age, height);
		//Person클래스의 매개변수가 String, int, double인 생성자 호출
	}

	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	
	public void Introduce1() {
		System.out.println("이름 : " + getName());
		System.out.println("나이 : " + getAge());
		System.out.println("키 : " + getHeight());
		System.out.println("전공" + major);
		System.out.println("평점" + GPA);
	}
	public void Introduce2() {
		super.Introduce(); //부모 클래스의 Introduce메소드
		System.out.println("전공" + major);
		System.out.println("평점" + GPA);
	}
	
}
