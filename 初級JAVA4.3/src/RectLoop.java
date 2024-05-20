
public class RectLoop extends MyFrame{
	public void run() {
		int x = 30;
		setColor(0,128,0);
		for(int i = 0;i < 15; i++) {
			System.out.println(x);
			fillRect(x, 80, 10, 100);
			x += 20;
			}
	}

	}
