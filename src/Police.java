import java.awt.Color;
import java.awt.Graphics2D;

public class Police extends Person {

	public Police(Color color, int x, int y) {
		super(color, x, y);

	}

	@Override
	public void update() {
		y += 10;

	}

	@Override
	public void draw(Graphics2D g) {
		g.setColor(color);
		g.fillRect(this.x, this.y, this.width, this.height);

	}

}
