
public class Rectlf extends MyFrame {
	public void run() {
		int x=30,y=10;
		setColor(0,128,0);
		int i;
		for(i=0;i<10;i++) {
			fillRect(x,80,10,y);
			x+=20;
			y+=20;
		}
	}

}
