package abstract_test;

//�߻� Ŭ���� sample
//�߻� Ŭ������ �ϳ� �̻��� �߻�޼��带 �������Ѵ�.
abstract class sample {
	//�߻�޼ҵ� : body�� ���� �޼ҵ�
	//��ü�� ���� �޼ҵ�, ����� ���� �޼ҵ�
	//Ʋ�� �ִ� �޼ҵ�
	public abstract void func() ;
	//�߻�޼ҵ��� abstract�� �ٿ�����
	//body(��ü,���)�� ����� ������ ����
	//Abstract methods do not specify a body
	//�߻�޼ҵ�� �ٵ� ��üȭ�ϸ� �ȵȴ�.
	//�߻�޼ҵ�� �ٵ� ����������.
	//�߻�޼ҵ�� �߻�Ŭ������ �����޴� Ŭ������ �������̵��ؼ� �����ϴ� ��
	//�߻�Ŭ������ �����޴� �ڽ�Ŭ������ �߻�޼ҵ带 �����Ѵ�.
	//Animal�� sound�� �߻�޼ҵ�� �ϴ°� ����
	//AnimalŬ�������� ������ ���������� �����ϱ�.. �����޴� Ŭ�������� ���ؾߵǴϱ�..
	//���������Ҹ� ����
	//�߻�Ŭ���� Animal��, �߻�޼ҵ� sound�� �����ϴ�.
	public void hello() {
		System.out.println("hello");
	}
}

class mychild extends sample {
	
	@Override // ������̼�(ǥ��)-�� �޼ҵ�� �������̵��� �޼ҵ��.
	public void func() { 
		System.out.println("func!");
	}
	//The type mychild must implement the inherited abstract method sample.func()
	//Ÿ�� mychild�� �����ؾ߸� �Ѵ�. ~ ��ӹ޴� �߻�޼ҵ� sampleŬ������ func�޼ҵ带
	//Ÿ�� mychild�� sampleŬ�������� ��ӹ��� �߻�޼ҵ� func�� �����ؾ߸� �Ѵ�.(����)
	//�߻�޼ҵ带 �������� �ڽ�Ŭ������ �� �߻�޼ҵ带 �����ؾ��� �ǹ��� �ִ�.
	//�ֳĸ�? �θ��ʿ��� �Ϻη� �������ϰ� Ʋ�� ���� �ѱ��.. �ڽ��� �����϶��.
	
	//�ذ���
	//add unimplemented methods
	//�̱����� �޼ҵ带 �߰��϶�
	//(�߻�Ŭ�������� �������� �߻�޼ҵ带 ��üȭ�϶�(�����ض�))
}

public class test {

}
