import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class SnowFlakePanel extends JPanel
{
	public SnowFlakePanel()
	{
		super.setPreferredSize(new Dimension(400, 400));
		super.setBackground(Color.WHITE);
	}

	public void paintComponent(Graphics g)
	{
		int width  = getWidth();
		int height = getHeight();

		super.paintComponent(g);
		drawStar(g,width/2,height/2,125);
		/*
		 * DRAWING CODE BELOW
		 */
		g.setColor(Color.BLUE);
		//g.drawLine(0, 0, width - 1, height - 1);
	}
	
	public void drawStar(Graphics g, int x, int y, int size)
	{
		int radius = size;
		int x1,x2,y1,y2;
		x1 = x;
		y1 = y;
		x2 = x1+size;
		y2 = y1;
		g.drawLine(x1, y1,x2, y2);
		while(radius > 1)
		{
			radius = radius/5;
			drawStar(g, x2, y2, radius);
		}
		
		
		x2 = x1 + (int) (size * Math.cos(Math.toRadians(60)));
		y2 = y1 + (int) (size * Math.sin(Math.toRadians(60)));
		g.drawLine(x1, y1,x2,y2);
		radius = size;
		while(radius > 1)
		{
			radius = radius/5;
			drawStar(g, x2, y2, radius);
		}
		x2 = x1 + (int) (size * Math.cos(Math.toRadians(120)));
		y2 = y1 + (int) (size * Math.sin(Math.toRadians(120)));

		g.drawLine(x1, y1,x2,y2);
		radius = size;
		while(radius > 1)
		{
			radius = radius/5;
			drawStar(g, x2, y2, radius);
		}
		x2 = x1 - size;
		y2 = y1;
		g.drawLine(x1, y1,x2, y2);
		radius = size;
		while(radius > 1)
		{
			radius = radius/5;
			drawStar(g, x2, y2, radius);
		}
		
		x2 = x1 + (int) (size * Math.cos(Math.toRadians(240)));
		y2 = y1 + (int) (size * Math.sin(Math.toRadians(240)));
		g.drawLine(x1, y1,x2,y2);
		radius = size;
		while(radius > 1)
		{
			radius = radius/5;
			drawStar(g, x2, y2, radius);
		}
		x2 = x1 + (int) (size * Math.cos(Math.toRadians(300)));
		y2 = y1 + (int) (size * Math.sin(Math.toRadians(300)));
		g.drawLine(x1, y1,x2,y2);	
		radius = size;
		while(radius > 1)
		{
			radius = radius/5;
			drawStar(g, x2, y2, radius);
		}

		
	}
	
}

public class Snowflake
{
	public static void main ( String[] args )
	{
		/*
		 * A frame is a container for a panel
		 * The panel is where the drawing will take place
		 */
		JFrame frame = new JFrame("Snowflake");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new SnowFlakePanel());
		frame.pack();
		frame.setVisible(true);
	}
}
