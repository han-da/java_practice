package FighterAndMonster;

import java.util.Random;

class Warrior {
	Random r=new Random();
	String name="zi������S2";
	int hp;
	int damage;
	
	public Warrior() {
		this.hp = r.nextInt(30)+80;
		this.damage = (r.nextInt(10)+10);
		System.out.println(name);
		System.out.println("������ ü�� : " + hp);
		System.out.println("������ ���ݷ� : " + damage);
		System.out.println();
	}
	
	public Warrior(int hp, int damage) {
		this.hp = hp;
		this.damage = damage;
		System.out.println("������ ü�� : " + hp);
		System.out.println("������ ���ݷ� : " + damage);
	}

	public void attack(Monster mon) {
		if(mon.hp >= 0) {
			System.out.println(name+"�� �ϰ�!");
			mon.hp -= damage;
			if(mon.hp < 0) {
				mon.hp = 0;
				System.out.println("���� ���� ü�� : " + mon.hp);
				System.out.println("���� ���!");
				System.out.println("--------------------------");
				return;
			}
			System.out.println("���� ���� ü�� : " + mon.hp);
			System.out.println("--------------------------");
		}
	}
	//���ͼ���
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
}

class Monster {
	Random r=new Random();
	String name="�ʰ�������ȭŷ���������";
	int hp;
	int damage;
	
	public Monster() {
		this.hp = r.nextInt(30)+80;
		this.damage = (r.nextInt(10)+10);
		System.out.println(name);
		System.out.println("������ ü�� : " + hp);
		System.out.println("������ ���ݷ� : " + damage);
		System.out.println();
	}
	
	public Monster(int hp, int damage) {
		this.hp = hp;
		this.damage = damage;
		System.out.println("������ ü�� : " + hp);
		System.out.println("������ ���ݷ� : " + damage);
	}
	
	public void attack(Warrior war) {
		if(war.hp > 0) {
		System.out.println("���� ����!!");
		war.hp -= damage;
		if(war.hp < 0) {
			war.hp = 0;
			System.out.println("���� ���� ü�� : " + war.hp);
			System.out.println("���� ���!");
			System.out.println("--------------------------");
			return;
		}
		System.out.println("���� ���� ü�� : " + war.hp);
		System.out.println("--------------------------");
		}
	}
	//���ͼ���
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
}

public class FighterMain {
	public static void main(String[] args) {
//		Warrior war = new Warrior((r.nextInt(30)+80), (r.nextInt(10)+10));
//		Monster mon = new Monster((r.nextInt(30)+80), (r.nextInt(10)+10));
		Warrior war = new Warrior();
		Monster mon = new Monster();
		System.out.println("���� ����");
		for(;;) {
			war.attack(mon);
			if(mon.getHp() == 0) {
				System.out.println("���� �¸�!");
				break;
			}
			mon.attack(war);
			if(war.getHp() == 0) {
				System.out.println("���� �¸�!");
				break;
			}
		}
	}
}
