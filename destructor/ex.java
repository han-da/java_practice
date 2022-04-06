package destructor;

class test {
	public test() {
		System.out.println("������ ȣ��!");
	}
	
	//�Ҹ��� (finalize�޼ҵ�) - ��ü�� �Ҹ�� ��
	//�ڹ� �޸𸮰����� JVM ������ Garbage Collector�� ���ش�.
	public void finalize() {
			try {
				super.finalize();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("�Ҹ��� ȣ��!");
	}
}

public class ex {
	public static void main(String[] args) {
		test t = new test();
		//t.finallize();
		t=null; // ��ü�� ������� �����
		System.gc(); // �������� �ҷ���.
		//Runs the garbage Collector in the Java Virtual machine
		//(�ڹ� ���� �ӽ� ������ ������ �÷��͸� �����Ѵ�.)
		//��ü���� ������ ��� ��ü�� ���� �� ���� ���������, ��ü�� �Ҹ�Ǿ�� �Ѵ�.
		//�Ҹ�� �ʿ䰡 �ִ� ��ü�� �����ϱ� ���ؼ�,
		//������ �÷��͸� ȣ���ϸ� ������ �÷��Ͱ� �Ҹ��ڸ� ȣ���Ͽ� ��ü�� �Ҹ�ǰ� �Ѵ�.
		//super.finalize()�� Object Ŭ�������� ��� ���� �޼���
	}
}
