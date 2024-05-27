
public class Animation extends MyFrame{
	public void run() {
		int x = 30,y = 60;
		while(y <= 200) {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			y += 5;
			x += 5;
			sleep(0.1);
		}
		while(x >= 30) {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			x -= 5;
			sleep(0.1);
		}
		while(y >= 60) {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			x += 5;
			y -= 5;
			sleep(0.1);
			
		}
		
	}

}
