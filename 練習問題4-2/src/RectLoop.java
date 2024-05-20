
public class RectLoop extends MyFrame{
	public void run() {
		int x = 30,y = 10;
		setColor(0,128,0);
		for(int i = 0;i < 9; i++) {
			System.out.println(x);
		
			fillRect(x, 80, 10, y);
			x += 20;
			y += 20;
	}
	}
	}
