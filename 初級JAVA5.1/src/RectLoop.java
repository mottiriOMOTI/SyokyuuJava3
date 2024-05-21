
public class RectLoop extends MyFrame{
	public void run() {
		int x = 150, y = 50,z = 30;
		setColor(0,128,0);
		for(int i = 0;i < 10; i++) {
			System.out.println(x);;
			setColor(0, 128, 0);
			y += 20;
			x -= 10;
			z += 10;
			fillRect(y, 30, 10, x);
			fillRect(y, 230 - z + 30, 10, z);
			
			
	}
	}
	}
