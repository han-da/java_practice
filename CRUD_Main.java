import java.util.Scanner;
//java ��Ű�� �ȿ�, util��Ű�� �ȿ�, ScannerŬ������ �����´�.

public class CRUD_Main {
	public static void main(String[] args) {
		Person p1 = new Person();
		//���� : ��������, ��ü����(��ü�� �ּҰ� ����.)
		//������ : new Person(); (PersonŬ������ ��ü �����Ѵ�.)
		//������ : new Person(); (PersonŬ������ �޸� �����϶�.)
		//������ : ��ü�� �����ɶ� ȣ�⵵�ϴ�.
		//���� ��Ȳ������ ����Ʈ �����ڰ� ȣ��ȴ�.
		p1.Introduce(); // p1�� ����Ű�� ���� Introduce �޼ҵ� ȣ��
		//p1 -> Introduce(); // p1�� ����Ű�� ���� Introduce �޼ҵ� ȣ��
		
		Scanner sc = new Scanner(System.in);
		//������ ��ĳ�� ��ü�� �ּҸ� �����ϴ� ����
		//�������� ��ĳ�� ��ü ���� (�Է°����� System.in-Ű���� �Է� �����ϰ� �ϴ� �Է°�)
		//ScannerŬ������ ��ü �����ϸ鼭 �������� �Է����� SystemŬ������ in��ü
		//System.in - SystemŬ������ ǥ�� �Է� ��Ʈ��
		//�̰� ��� Ű���� �Է��� ����������.
		System.out.print("�̸� �Է� : ");
		String name=sc.next();
		System.out.print("���� �Է� : ");
		int age=sc.nextInt();
		System.out.print("Ű �Է� : ");
		double height=sc.nextDouble();
		
		Person p2 = new Person(name, age, height); 
		//Person ��ü �����ϸ鼭, �����ڷ� String, int, double ���� �޴� ������ ȣ��
		p2.Introduce();
		
	}
}
