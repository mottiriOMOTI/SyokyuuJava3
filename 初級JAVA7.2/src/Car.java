
public class Car {
	int x,y,vx,vy;
	public Car(int x,int y,int vx,int vy) {
		this.x = x;
		this.y = y;
		this.vx=vx;
		this.vy=vy;
	}
	public void draw(MyFrame frame) {
		frame.fillOval(x + 10, y+20, 30, 30);
		frame.fillOval(x + 60, y+20, 30, 30);
		frame.fillRect(x, y, 100, 30);
		frame.fillRect(x+25, y-20, 50, 50);
	}
	public void move() {
		x += vx;
	}

}
