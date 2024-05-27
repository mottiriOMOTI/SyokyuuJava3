
public class Animation extends MyFrame{
	public void run() {
		int x = 30,y = 60,z = 90;
		while(true) {
			
		while(x <= 200) {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			x += 5;
			sleep(0.1);
		}
		while(y <= z) {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			y += 5;
			sleep(0.1);
		}
		z +=30;
		while(x >= 30) {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			x -= 5;
			sleep(0.1);
		}
		while(y <= z) {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			y += 5;
			sleep(0.1);
		}
		z +=30;
	}
		
	}

}
