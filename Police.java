
public class Police {
	
	private String name;
	private String position;
	private Gun g; // GunŸ�� ��������
	//������
	public Police() {
		name="�⺻�̸�";
		position="����";
		g=new Gun(); //�⺻ �Ѿ˰����� �ʱ�ȭ
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
	//��� �޼ҵ�
	//�Ұ�
	public void Introduce() {
		System.out.println("�̸� : " + name);
		System.out.println("��� : " + position);
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
