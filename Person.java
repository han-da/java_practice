
public class Person {
	//�������
	//������� ��������  �����ڷ� private�� ���� ��ü ���ο����� ���ٰ���
	//��ü �ܺ� ���� ���� (��������)
	//��ü �ܺο��� ��������� ���������� �����ϴ°��� �����Ѵ�.
	//priavte�� ���� ��ü ���ο����� ���ٰ���
	private String name;
	private int age;
	private double height;
	
	//������ (Ŭ������ �̸��� ����, ���� Ÿ��(��ȯ ����)�� ����)
	public Person() { // �Է��� ���� ������
		//����Ʈ ������ (default Constructor)
		System.out.println("����Ʈ ������ ȣ���!");
		this.name = "�⺻�̸�";
		this.age = 20;
		this.height = 170;
	}
	public Person(String name, int age, double height) {
		System.out.println("String, int, double ������ ȣ���!");
		this.name = name;// (this - ���� ��ä�� �ּ�) - �������
		this.age = age;
		this.height = height;
	}
	//�����ڵ� �����ε� �ȴ�.
	
	//��� �޼ҵ�
	
	
	public void Introduce() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("Ű : " + height);
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
