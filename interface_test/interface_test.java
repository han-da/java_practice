package interface_test;

interface remoteController {
	//final - ��� ���� Ű����
	public static final int NUM=1;
	//�������̽��� ����� �߻�޼ҵ常 �������Ѵ�.
	public abstract void turnOn();
	public abstract void turnOff();
}

class TV implements remoteController {
	
	@Override
	public void turnOn() {
		System.out.println("Ƽ���ѱ�");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Ƽ�����");
	}
}

public class interface_test {

}
