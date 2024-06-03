public class PracticeCar extends MyFrame {
	public void run() {
		Practice[] car = new Practice[5];
		car[0] = new Practice(50, 50, 1, 0);
		car[1] = new Practice(50, 120, 2, 0);
		car[2] = new Practice(50, 190, 3, 0);
		car[3] = new Practice(50, 260, 4, 0);
		car[4] = new Practice(50, 330, 5, 0);
		for (int i = 0; i <= 30; i++) {
			clear();
			car[0].draw(this);
			car[0].move();
			car[1].draw(this);
			car[1].move();
			car[2].draw(this);
			car[2].move();
			car[3].draw(this);
			car[3].move();
			car[4].draw(this);
			car[4].move();
			sleep(0.1);
		}
	}
}