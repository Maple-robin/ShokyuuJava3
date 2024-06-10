import java.util.Vector;
public class DisplayVehicleVector extends MyFrame{
	public void run() {
		Vector<Vehicle> vehicle=new Vector<Vehicle>();
		vehicle.add(new Car(10,30,3,0));
		vehicle.add(new Car(10,100,5,0));
		vehicle.add(new Car(10,150,7,0));
		
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
