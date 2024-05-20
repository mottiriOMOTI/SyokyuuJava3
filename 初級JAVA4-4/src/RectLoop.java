
public class RectLoop extends MyFrame{
	public void run() {
		int x = 30;
		setColor(0,128,0);
		for(int i = 0;i < 9; i++) {
			System.out.println(x);
		
			if(i==0) {
				fillRect(x, 70, 10, 100);
			}
			else if(i==8) {
				fillRect(x, 90, 10, 100);
			}
			else {
				fillRect(x, 80, 10, 100);
			}
			x += 20;
			}
	}

	}
