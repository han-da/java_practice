
//public-���� ��Ű��, �ٸ���Ű�� �� ���ٰ���
//default-���� ��Ű�������� ���ٰ���
public class Student extends Person{
	// ...�̸�, ����, Ű
	private String major;
	private double GPA;
	// �߰� ������� ����, ����
	
	public Student() {
		//����Ʈ ������
		//������ �ֿ���� : ������� �ʱ�ȭ
		//�θ� ������
		super(); // PersonŬ������ ������ ȣ��
		//�θ����� �������� ���������, �θ� �����ڷ� ó������
		//super - ������
		//super man - ����(������ �ΰ�, �ΰ��� �ʿ��� �ΰ�)
		//�θ� Ŭ������ ������ ȣ���ض�
		major="�⺻����";
		GPA=3.0;
	}
	
	public Student(String name, int age, double height, String major, double GPA) {
//		this.name=name;
//		this.age=age;
//		this.height=height;
		super(name, age, height);
		//PersonŬ������ �Ű������� String, int, double�� ������ ȣ��
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
		System.out.println("�̸� : " + getName());
		System.out.println("���� : " + getAge());
		System.out.println("Ű : " + getHeight());
		System.out.println("����" + major);
		System.out.println("����" + GPA);
	}
	public void Introduce2() {
		super.Introduce(); //�θ� Ŭ������ Introduce�޼ҵ�
		System.out.println("����" + major);
		System.out.println("����" + GPA);
	}
	
}
