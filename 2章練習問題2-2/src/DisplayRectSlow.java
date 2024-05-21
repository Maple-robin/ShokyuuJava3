
public class DisplayRectSlow extends MyFrame{
	public void run() {
		setColor(0,128,0);
		int x=30,y=80;
		while(x<=170) {
			fillRect(x,y,10,100);
			x+=20;
			y+=20;
			sleep(1);
		}
	}

}
