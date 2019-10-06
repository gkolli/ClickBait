import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.Timer;

/**
 * Impossible clickbait game runner!
 * @author Naren Kolli, Period 6
 *
 */
public class ClickBait  {

static int gameScore = 0;
static Timer timer;
static JFrame gameFrame;
static ClickBaitComponent component;
static int gameTime = 0;

	public static void main(String[] args) {
		gameFrame = new JFrame();
		gameFrame.setSize(600,600);
		gameFrame.setTitle("Naren's Impossible Game");
		
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		component = new ClickBaitComponent();
		gameFrame.add(component);
		
		class Mouser implements MouseListener {
			
			public void mouseClicked(MouseEvent e) {
				
			}
			public void mousePressed(MouseEvent e) {
				int xPosition=e.getX();
				if(xPosition>component.xValue && xPosition < 
						component.xValue + component.width &&
						e.getY()>component.yValue && e.getY() < 
						(component.yValue + component.height)) {
					gameScore++;
					System.out.println("Congrats! Your score is " + gameScore);
	
				}
			}
			
			public void mouseReleased(MouseEvent e) {
				
			}
			
			public void mouseEntered(MouseEvent e) {
				
			}
			public void mouseExited(MouseEvent e) {
				
}
			
		}
		
		component.addMouseListener(new Mouser());
		
		class TimerListener implements ActionListener {

			
			public void actionPerformed(ActionEvent e) {
				if(gameTime < 20) {
					ClickBaitComponent bait = new ClickBaitComponent();
					gameTime++;

					gameFrame.add(bait);
					gameFrame.repaint();	
				}
				else {
					System.out.println("Final score is " + gameScore);
					timer.stop();
					gameFrame.dispose();
				}
			}
		}
		
		ActionListener listen = new TimerListener();
		timer = new Timer(500,listen);
		timer.start();
		gameFrame.setVisible(true);
		
		}
		
	}

