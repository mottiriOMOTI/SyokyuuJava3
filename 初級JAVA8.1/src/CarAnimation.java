
public class CarAnimation extends MyFrame{
	public void run() {
		Car car1 = new Car(50,50,5,1);
		Car car2 = new Car(50,125,5,2);
		Car car3 = new Car(50,200,5,3);
		Car car4 = new Car(50,275,5,4);
		Car car5 = new Car(50,350,5,5);
		for(int i = 0;i<30;i++) {
			clear();
			car1.draw(this);
			car2.draw(this);
			car3.draw(this);
			car4.draw(this);
			car5.draw(this);
			car1.move();
			car2.move();
			car3.move();
			car4.move();
			car5.move();
			sleep(0.1);
			
		}
	}

}
