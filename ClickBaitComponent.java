import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;
import java.awt.Button;

/**
 * Impossible clickbait game component!
 * @author Naren Kolli, Period 6
 *
 */
public class ClickBaitComponent extends JComponent {

	private Rectangle rect;
	int xValue = 0;
	int yValue = 0;
	int height = 0;
	int width = 0;
	
	public void paintComponent(Graphics graphicsIn) {
		
		xValue = (int)(Math.random()*480)+50;
		yValue = (int)(Math.random()*460)+50;
		
		height = 100;
		width = 100;
		
		rect = new Rectangle(xValue, yValue, width, height);
		
		Graphics2D graphic = (Graphics2D) graphicsIn;
		graphic.setColor(new Color(0,0,255));
		graphic.fill(rect);

	}
}
