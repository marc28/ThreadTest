import java.awt.Color;
import java.awt.Graphics2D;

public abstract class Person {

	protected Color color;
	protected int x, y;
	protected int width = 20, height = 30;

	public Person(Color color, int x, int y) {
		this.color = color;
		this.x = x;
		this.y = y;
	}

	public abstract void update();

	public abstract void draw(Graphics2D g);

}
