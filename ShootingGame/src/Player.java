import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player extends Character implements KeyListener{
	public void draw(MyFrame f) {
		f.setColor(0, 128, 0);
		f.fillRect(x-5, y+20, 30, 10);
		f.setColor(200, 200, 200);
		f.fillRect(x+5, y, 10, 30);
		f.setColor(0, 0, 0);
		f.fillOval(x + 35,y + 30,10,10);
		f.fillOval(x - 25,y + 30,10,10);
	}
	public Player(double x,double y,double vx,double vy) {
		super(x,y,vx,vy);
	}
	
	public void move() {
		super.move();
		if(x<0) x=0;
		if(x>370) x=370;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	boolean Flag = true;
	@Override
	public void keyPressed(KeyEvent e) {
		if(Flag == true) {
		// TODO 自動生成されたメソッド・スタブ
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
				vx-=5;
			Flag = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
				vx+=5;
			Flag = false;
		}
		}
		if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			GameWorld.playerBullets.add(
			new PlayerBullet(x+5,y,0,-10));
			GameWorld.playerBullets.add(
			new PlayerBullet(x+35,y+10,0,-20));
			GameWorld.playerBullets.add(
			new PlayerBullet(x-25,y+10,0,-20));
			System.out.println("弾の数="+ GameWorld.playerBullets.size());
		}
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			System.out.println("Enterキーが押されました");
			GameWorld.enterPressed=true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			vx=0;
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			vx=0;
		}
		Flag = true;
	}
	
}
