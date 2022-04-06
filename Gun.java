
public class Gun {
	private int bulletCount;
	
	public Gun() {
		bulletCount=3;		
	}
	public Gun(int bulletCount) {
		this.bulletCount=bulletCount;		
	}
	
	//연속발사
	public void fire() {
		for(getBulletCount(); bulletCount>=0; bulletCount--) {
			if(bulletCount>0) {
				System.out.println("빵!" + "(남은탄환 : " + (bulletCount - 1) + "개)" );
			}
			else if(bulletCount==0) {
				System.out.println("재장전 필요");
				return;
			}
		}
	}
	//한발발사
	public void fire2() {
		if(getBulletCount()==0) {
			System.out.println("재장전 필요");
			return; // 메소드 종료
		}
		System.out.println("빵!" + "(남은탄환 : " + (bulletCount - 1) + "개)" );
		bulletCount--;
	}		
	public void reloading() {
		this.bulletCount = 3;
		System.out.println("재장전 완료");
	}
	//게터세터
	public int getBulletCount() {
		return bulletCount;
	}
	public void setBulletCount(int bulletCount) {
		this.bulletCount = bulletCount;
	}
}
