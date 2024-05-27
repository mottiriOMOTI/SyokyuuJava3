
public class DisplayRectsSlow extends MyFrame{
	public void run() {
		setColor(0,128,0);
		int x = 30,y = 10;
		while(x <= 170) {
			fillRect(x,80 + y,10,100);
			x += 20;
			y += 10;
			sleep(1);
		}
	}
	

}
