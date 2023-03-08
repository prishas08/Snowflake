

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class SierpinskiPanel extends JPanel
{
	public SierpinskiPanel()
	{
		super.setPreferredSize(new Dimension(400, 400));
		super.setBackground(Color.WHITE);
	}

	public void paintComponent(Graphics g)
	{
		int width  = getWidth();
		int height = getHeight();

		super.paintComponent(g);
		drawSierpinskiTriangle(7, 0,0,width, g);
		/*
		 * DRAWING CODE BELOW
		 */
		g.setColor(Color.BLUE);
		//g.drawLine(0, 0, width - 1, height - 1);
	}
	
	 void drawSierpinskiTriangle(int level, int x, int y, int size, Graphics g) {
		if(level <= 0) return;
 
		g.drawLine(x, y, x+size, y);
		g.drawLine(x, y, x, y+size);
		g.drawLine(x+size, y, x, y+size);
 
		drawSierpinskiTriangle(level-1, x, y, size/2, g);
		drawSierpinskiTriangle(level-1, x+size/2, y, size/2, g);
		drawSierpinskiTriangle(level-1, x, y+size/2, size/2, g);
	}
	
}

public class Sierpinski
{
	public static void main ( String[] args )
	{
		/*
		 * A frame is a container for a panel
		 * The panel is where the drawing will take place
		 */
		JFrame frame = new JFrame("Sierpinski");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new SierpinskiPanel());
		frame.pack();
		frame.setVisible(true);
	}
}
