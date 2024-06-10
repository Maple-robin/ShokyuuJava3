import java.util.Vector;
public class DisplayVehicleVector extends MyFrame{
	public void run() {
		Vector<Vehicle> vehicle=new Vector<Vehicle>();
		vehicle.add(new Car(50,30,3,0));
		vehicle.add(new Car(70,90,-5,0));
		vehicle.add(new Train(100,150,7,0));
		vehicle.add(new Train(50,210,-4,0));
		vehicle.add(new Truck(40,270,5,0));
		vehicle.add(new Truck(100,330,6,0));
		
		for(int i=0;i<30;i++) {
			clear();
			for(int j=0;j<vehicle.size();j++) {
				vehicle.get(j).draw(this);
				vehicle.get(j).move();
			}
			sleep(0.1);
		}
	}
}
