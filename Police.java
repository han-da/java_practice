
public class Police {
	
	private String name;
	private String position;
	private Gun g; // Gun타입 참조변수
	//생성자
	public Police() {
		name="기본이름";
		position="순경";
		g=new Gun(); //기본 총알갯수로 초기화
	}
	public Police(String name, String position, String bullet) {
		this.name=name;
		this.position=position;
		//g=new Gun(bullet);
	}
	//getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	//멤버 메소드
	//소개
	public void Introduce() {
		System.out.println("이름 : " + name);
		System.out.println("계급 : " + position);
	}
	public void fire1() {
		g.fire();
	}
	public void fire2() {
		g.fire2();
	}
	public void reloading() {
		g.reloading();
	}
}
