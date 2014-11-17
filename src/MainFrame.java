import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame {

	static Dimension d = new Dimension(300, 500);
	private PathPanel path = new PathPanel();
	private JButton go = new JButton("Go");

	public MainFrame() {
		setSize(d);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		go.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Thread t1 = new Thread(path);
				t1.start();

			}
		});

		add(go, BorderLayout.PAGE_END);
		add(path);
	}

	public static void main(String[] args) {
		new MainFrame();

	}

}
