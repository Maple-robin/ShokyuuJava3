public class Animation extends MyFrame {
	public void run() {
		int y = 100, x = 30;
		while (y <= 170) {
			clear();
			setColor(0, 128, 0);
			fillRect(x, y, 10, 100);
			x+=5;
			y += 5;
			sleep(0.1);
		}
		while (x >= 30) {
			clear();
			setColor(0, 128, 0);
			fillRect(x, y, 10, 100);
			x -= 5;
			sleep(0.1);
		}
		while (y >= 100) {
			clear();
			setColor(0, 128, 0);
			fillRect(x, y, 10, 100);
			x+=5;
			y -= 5;
			sleep(0.1);
		}

	}
}
