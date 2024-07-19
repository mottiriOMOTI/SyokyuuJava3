
public class Character {
	
	double x,y,vx,vy;
	public Character(double x,double y,double vx,double vy) {
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
	}
	public void move() {
		x += vx;
		y += vy;
	}
	public void draw(MyFrame f) {
		f.setColor(0,128,0);
		f.fillRect((int) x , (int) y, 20, 20);
	}
}

/*
 期末課題の提出が夜になってしまいましたが特に時間指定とかなかったので
 夜分に送らせて頂きます！！
 ところで先生は郡山駅から少し歩いた所のインドカレーって食べたことあります？
 あそこナンもでかくて熱々で、更にカレーもコクが深くかつ柔らかいルーで
 すごい美味しいんですよね～
 よかったら是非食べてみません？
 */