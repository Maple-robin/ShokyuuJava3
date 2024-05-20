
public class Rectlf extends MyFrame {
	public void run() {
		int x=30,r=0,g=0,b=0;
		int i;
		for(i=0;i<10;i++) {
			setColor(r,g,b);
			fillRect(x,80,10,100);
			x+=20;
			r+=20;
			g+=20;
			b+=20;
		}
	}

}
