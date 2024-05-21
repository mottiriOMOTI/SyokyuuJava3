
public class RectLoop extends MyFrame{
	public void run() {
		int x = 10, y = 0;
		setColor(0,128,0);
		for(int i = 0;i < 10; i++) {
			System.out.println(x);;
			setColor(0, 128, 0);
			y += x;
			x += 5;
			fillRect(y, y, x, x);
			
			
	}
	}
	}
