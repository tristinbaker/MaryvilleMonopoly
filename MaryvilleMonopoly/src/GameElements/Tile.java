package GameElements;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

/**
 * Tile is any game square that could appear on the monopoly board
 * @author evanezell
 *
 */
public abstract class Tile extends JPanel implements MouseListener, MouseMotionListener {
	int width, height; //width and height of the tile
	int x, y; //location of the tile
	
	protected void performAction(){
		//Action to be performed when tile is landed on
	}
	

	protected void setTileSize(int width, int height){
		this.width = width;
		this.height = height;
		setSize(width, height);
	}
	
	protected void setTileLocation(int x, int y){
		this.x = x;
		this.y = y;
		setLocation(x,y);
	}
	
	
	protected void setTileOrientation(){
		//TODO: change the orientation of the tile
	}
	
	/** 
	 * Mouse Events
	 */
	public void mousePressed(MouseEvent e) {

	}
	
	public void mouseReleased(MouseEvent e) {

	}

	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse entered");
	}

	public void mouseExited(MouseEvent e) {

	}

	public void mouseClicked(MouseEvent e) {
		System.out.println("Mouse Clicked");
	}
}
