public class Practice {
    int x, y, vx, vy;

    public Practice(int x, int y, int vx, int vy) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
    }

    public void draw(MyFrame frame) {
        frame.fillRect(x, y, 50, 20);
        frame.fillRect(x -20, y + 20, 90, 20);
        frame.fillOval(x-5,y+40,20,20);
        frame.fillOval(x+30,y+40,20,20);
    }

    public void move() {
        x += vx;
        y += vy;
    }
}