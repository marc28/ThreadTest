import java.awt.Color;
import java.awt.Graphics2D;

public class Local extends Person {

	public Local(Color color, int x, int y) {
		super(color, x, y);
	}

	@Override
	public void update() {
		this.y += 8;
		if (y % 6 == 0) {
			x += 10;
		}
		if (y % 5 == 0) {
			x -= 10;
		}

	}

	@Override
	public void draw(Graphics2D g) {
		g.setColor(color);
		g.fillRect(this.x, this.y, this.width, this.height);

	}

}
