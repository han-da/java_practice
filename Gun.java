
public class Gun {
	private int bulletCount;
	
	public Gun() {
		bulletCount=3;		
	}
	public Gun(int bulletCount) {
		this.bulletCount=bulletCount;		
	}
	
	//���ӹ߻�
	public void fire() {
		for(getBulletCount(); bulletCount>=0; bulletCount--) {
			if(bulletCount>0) {
				System.out.println("��!" + "(����źȯ : " + (bulletCount - 1) + "��)" );
			}
			else if(bulletCount==0) {
				System.out.println("������ �ʿ�");
				return;
			}
		}
	}
	//�ѹ߹߻�
	public void fire2() {
		if(getBulletCount()==0) {
			System.out.println("������ �ʿ�");
			return; // �޼ҵ� ����
		}
		System.out.println("��!" + "(����źȯ : " + (bulletCount - 1) + "��)" );
		bulletCount--;
	}		
	public void reloading() {
		this.bulletCount = 3;
		System.out.println("������ �Ϸ�");
	}
	//���ͼ���
	public int getBulletCount() {
		return bulletCount;
	}
	public void setBulletCount(int bulletCount) {
		this.bulletCount = bulletCount;
	}
}
