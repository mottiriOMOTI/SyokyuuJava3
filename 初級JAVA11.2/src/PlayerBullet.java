
public class PlayerBullet extends Character{
	public PlayerBullet(double x,double y,double vx,double vy) {
		super(x,y,vx,vy);
	}
	
	public void move() {
		x += vx / 2;
		y += vy;
	}
	public void draw(MyFrame f) {
		f.setColor(0,0,0);
		f.fillRect(x, y, 10, 30);
	}
}
