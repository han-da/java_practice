package overriding_and_polymorphism;

import java.util.Scanner;

class Animal {
	public void sound() {
		System.out.println("�����Ҹ� ��!");
	}
}
class Dog extends Animal{
	//�θ����� �������� �޼ҵ带 �ڽ��� �������ϸ�, �ڽ� �޼ҵ尡 �켱�õȴ�.
	public void sound() {
		System.out.println("�۸�!");
	}
}
class Cat extends Animal{
	public void sound() {
		System.out.println("�߿�!");
	}
}
class Frog extends Animal{
	public void sound() {
		System.out.println("����!");
	}
}

public class Main {
	public static void main(String[] args) {
		//Dog d = new Dog();
		//d.sound();
		//������ (�پ��� ���¸� ���ϴ� ����)
		//�θ� ���� ������, �ڽ� ��ü���� ��� ���� �� �ִ�.
		//Animal ani=new Dog();
		//ani.sound();
		//���� Animal Ÿ�� ��������, �������� Dog��ü
		//�θ� ���������� �ڽ� ��ü�� ���� �� �ִ�.
		//Dog d = new Animal(); -���� (�ڽ�Ÿ�� ���������� �θ�ü�� ����´�.)
		//�θ�� ������ �д�.. �θ�� �ڽ��� �Ǽ��� �뼭���ش�.
		//�޾��ִ� ���� �θ��!(������ �����ϱ�)
		//ani=new Cat();
		//ani.sound();
		
		Animal ani[]=new Animal[3];
		//AnimalŸ�� ��ü 3�� �����Ҽ��ִ� �迭 ����
		//AnimalŸ�� ��ü�� ���尡��������, AnimalŸ���� �ڽ� ��ü�� ���尡��
		//�������� ���ٸ� �ϳ��ϳ� �ٸ����� ����? Dog d=new dog(); , cat , frog���
		//�޴��� ���� 1.��, 2.�����, 3.������
		//������ ������ ���� ��ü�� �����ϰ� (Scanner,switch~case)
		ani[0]=new Dog();
		ani[1]=new Cat();
		ani[2]=new Frog();
		ani[0].sound();
		ani[1].sound();
		ani[2].sound();
//		for(int i=0; i<ani.length; i++) {
//			ani[i].sound();
//		}
		Scanner sc = new Scanner(System.in);
		Menu.menu();
		int select = sc.nextInt();
		for (;;) {
			switch (select) {
			case 1:
				ani[0].sound();
				break;
			case 2:
				ani[1].sound();
				break;
			case 3:
				ani[2].sound();
			}
			break;
		}
	}
}
