
public class 先生課題 extends MyFrame{
	public void run() {
		setColor(0,0,255);
		int x=300,y=100,z=20;
		for(int i=0;i<10;i++) {
			fillRect(x,y,10,z);
			fillRect(x,y+z+30,10,130-z);
			x-=20;
			z+=10;
		}
	}

}
