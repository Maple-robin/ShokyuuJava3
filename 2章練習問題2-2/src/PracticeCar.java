import java.util.Vector;
public class PracticeCar extends MyFrame {
	public void run() {
		Vector<Practice> car=new Vector<Practice>();
		car.add(new Practice(50,50,1,0));
		car.add(new Practice(50,120,2,0));
		car.add(new Practice(50,190,3,0));
		car.add(new Practice(50,260,4,0));
		car.add(new Practice(50,330,5,0));
		for(int i=0;i<30;i++) {
			clear();
			for(int j=0;j<car.size();j++) {
				car.get(j).draw(this);
				car.get(j).move();
			}
			sleep(0.1);
		}
	}
}