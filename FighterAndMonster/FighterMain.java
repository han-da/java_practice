package FighterAndMonster;

import java.util.Random;

class Warrior {
	Random r=new Random();
	String name="zi존젼사S2";
	int hp;
	int damage;
	
	public Warrior() {
		this.hp = r.nextInt(30)+80;
		this.damage = (r.nextInt(10)+10);
		System.out.println(name);
		System.out.println("전사의 체력 : " + hp);
		System.out.println("전사의 공격력 : " + damage);
		System.out.println();
	}
	
	public Warrior(int hp, int damage) {
		this.hp = hp;
		this.damage = damage;
		System.out.println("전사의 체력 : " + hp);
		System.out.println("전사의 공격력 : " + damage);
	}

	public void attack(Monster mon) {
		if(mon.hp >= 0) {
			System.out.println(name+"의 일격!");
			mon.hp -= damage;
			if(mon.hp < 0) {
				mon.hp = 0;
				System.out.println("남은 몬스터 체력 : " + mon.hp);
				System.out.println("몬스터 사망!");
				System.out.println("--------------------------");
				return;
			}
			System.out.println("남은 몬스터 체력 : " + mon.hp);
			System.out.println("--------------------------");
		}
	}
	//게터세터
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
}

class Monster {
	Random r=new Random();
	String name="초강력초토화킹오브더몬스터";
	int hp;
	int damage;
	
	public Monster() {
		this.hp = r.nextInt(30)+80;
		this.damage = (r.nextInt(10)+10);
		System.out.println(name);
		System.out.println("몬스터의 체력 : " + hp);
		System.out.println("몬스터의 공격력 : " + damage);
		System.out.println();
	}
	
	public Monster(int hp, int damage) {
		this.hp = hp;
		this.damage = damage;
		System.out.println("몬스터의 체력 : " + hp);
		System.out.println("몬스터의 공격력 : " + damage);
	}
	
	public void attack(Warrior war) {
		if(war.hp > 0) {
		System.out.println("몬스터 공격!!");
		war.hp -= damage;
		if(war.hp < 0) {
			war.hp = 0;
			System.out.println("남은 전사 체력 : " + war.hp);
			System.out.println("전사 사망!");
			System.out.println("--------------------------");
			return;
		}
		System.out.println("남은 전사 체력 : " + war.hp);
		System.out.println("--------------------------");
		}
	}
	//게터세터
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
		System.out.println("전투 개시");
		for(;;) {
			war.attack(mon);
			if(mon.getHp() == 0) {
				System.out.println("전사 승리!");
				break;
			}
			mon.attack(war);
			if(war.getHp() == 0) {
				System.out.println("몬스터 승리!");
				break;
			}
		}
	}
}
