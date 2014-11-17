import java.awt.Color;
import java.awt.Graphics2D;

public class Tourist extends Person {

	public Tourist(Color color, int x, int y) {
		super(color, x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		y += 7;

	}

	@Override
	public void draw(Graphics2D g) {
		g.setColor(color);
		g.fillRect(this.x, this.y, this.width, this.height);
	}

}
