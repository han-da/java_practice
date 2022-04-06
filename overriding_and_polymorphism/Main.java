package overriding_and_polymorphism;

import java.util.Scanner;

class Animal {
	public void sound() {
		System.out.println("울음소리 모름!");
	}
}
class Dog extends Animal{
	//부모한테 물려받은 메소드를 자식이 재정의하면, 자식 메소드가 우선시된다.
	public void sound() {
		System.out.println("멍멍!");
	}
}
class Cat extends Animal{
	public void sound() {
		System.out.println("야옹!");
	}
}
class Frog extends Animal{
	public void sound() {
		System.out.println("개굴!");
	}
}

public class Main {
	public static void main(String[] args) {
		//Dog d = new Dog();
		//d.sound();
		//다형성 (다양한 형태를 지니는 성질)
		//부모 참조 변수에, 자식 객체들을 모두 담을 수 있다.
		//Animal ani=new Dog();
		//ani.sound();
		//왼쪽 Animal 타입 참조변수, 오른쪽은 Dog객체
		//부모 참조변수에 자식 객체를 담을 수 있다.
		//Dog d = new Animal(); -오류 (자식타입 참조변수에 부모객체는 못담는다.)
		//부모는 마음이 넓다.. 부모는 자식의 실수를 용서해준다.
		//받아주는 쪽이 부모다!(마음이 넓으니까)
		//ani=new Cat();
		//ani.sound();
		
		Animal ani[]=new Animal[3];
		//Animal타입 객체 3개 저장할수있는 배열 생성
		//Animal타입 객체도 저장가능하지만, Animal타입의 자식 객체도 저장가능
		//다형성이 없다면 하나하나 다만들어야 겠지? Dog d=new dog(); , cat , frog등등
		//메뉴를 만들어서 1.개, 2.고양이, 3.개구리
		//선택한 동물에 대한 객체를 생성하게 (Scanner,switch~case)
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
