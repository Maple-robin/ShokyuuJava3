
public class 先生課題 extends MyFrame{
	public void run() {
		setColor(0,0,255);
		int x=10,y=10,cube=10;
		for(int i=0;i<20;i++) {
			fillRect(x,y,cube,cube);
			x+=cube;
			y+=cube;
			cube+=10;
		}
	}

}
