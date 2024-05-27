public class Animation extends MyFrame {
	public void run() {
		double x = 30, y = 100;
		while (true) {
			while (y <= 160) {
				clear();
				setColor(0, 128, 0);
				fillRect(x, y, 10, 100);
				x += 5;
				y += 5;
				sleep(0.1);
			}
			while (y >= 100) {
				clear();
				setColor(0, 128, 0);
				fillRect(x, y, 10, 100);
				x += 5;
				y -= 5;
				sleep(0.1);
			}
			while (y <=160) {
				clear();
				setColor(0, 128, 0);
				fillRect(x, y, 10, 100);
				x -= 5;
				y += 5;
				sleep(0.1);
			}
			while (y >= 100) {
				clear();
				setColor(0, 128, 0);
				fillRect(x, y, 10, 100);
				x -= 5;
				y -= 5;
				sleep(0.1);
			}
		}
	}
}
