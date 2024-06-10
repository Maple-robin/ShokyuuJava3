
public class DisplayCarsTrains extends MyFrame{
	public void run() {
		Vehicle[] Vehicles = new Vehicle[6];
		Vehicles[0]=new Car(50,30,3,0);
		Vehicles[1]=new Car(70,90,-5,0);
		Vehicles[2]=new Train(100,150,7,0);
		Vehicles[3]=new Train(50,210,-4,0);
		Vehicles[4]=new Truck(40,270,5,0);
		Vehicles[5]=new Truck(100,330,6,0);
		for(int i=0;i<30;i++) {
			clear();
			for(int j=0;j<Vehicles.length;j++) {
				Vehicles[j].draw(this);
				Vehicles[j].move();
			}
			sleep(0.1);
		}
	}
}
