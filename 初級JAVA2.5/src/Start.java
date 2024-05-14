
public class Start {
	public static void main(String[] args) {
	int x = 2,y = 3;
	x += y;
	System.out.println(x);
	MyFrame frame1 = new MyFrame();
	frame1.setLocation(200,100);
	frame1.setSize(150,150);
	MyFrame frame2 = new RectFrame();
	frame2.setLocation(350,200);
	MyFrame frame3 = new RectFrame();
	frame2.setLocation(50,300);
	}

}
