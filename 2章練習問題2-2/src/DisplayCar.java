
public class DisplayCar extends MyFrame{
	public void run() {
		  Car car1 = new Car(50, 50, 10, 5);
		for (int i = 0; i <= 30; i++) {
			clear();
			car1.draw(this);
			sleep(0.1);
		}
	}
}
