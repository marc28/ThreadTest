import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class PathPanel extends JPanel implements Runnable {

	private Police policeman = new Police(Color.BLUE, 10, 0);
	private Tourist tourist = new Tourist(Color.RED, 30, 0);
	private Local local = new Local(Color.CYAN, 50, 0);
	private Graphics2D g2d;

	public PathPanel() {
		setSize(MainFrame.d);
		setBackground(Color.GRAY);
	}

	@Override
	public void run() {
		while (true) {
			policeman.update();
			tourist.update();
			local.update();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			repaint();
		}

	}

	public void paint(Graphics g) {
		super.paint(g);

		g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setRenderingHint(RenderingHints.KEY_RENDERING,
				RenderingHints.VALUE_RENDER_QUALITY);
		policeman.draw(g2d);
		tourist.draw(g2d);
		local.draw(g2d);
	}

}
