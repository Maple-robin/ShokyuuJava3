
public class Rectlf extends MyFrame {
	public void run() {
		int x=30,y=30;
		setColor(0,128,0);
		int i;
		for(i=0;i<10;i++) {
			fillRect(x,y,10,100);
			x+=20;
			y+=20;
		}
	}

}
