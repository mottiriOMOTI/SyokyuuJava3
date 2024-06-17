import java.util.Vector;
public class DisplayVehicleVector extends MyFrame{
	public void run() {
		Vector<Vehicle> vehicles = new Vector<Vehicle>();
		vehicles.add(new Car(10,30,3,0));
		vehicles.add(new Car(100,100,-5,0));
		vehicles.add(new Train(10,150,7,0));
		vehicles.add(new Train(200,200,-7,0));
		vehicles.add(new Truck(10,250,7,0));
		vehicles.add(new Truck(100,300,7,0));
		
		for(int i=0;i<30;i++) {
			clear();
			for(int j=0;j<vehicles.size();j++) {
				vehicles.get(j).draw(this);
				vehicles.get(j).move();
			}
			sleep(0.1);
		}
	}

}
