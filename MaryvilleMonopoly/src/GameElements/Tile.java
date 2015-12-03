package GameElements;
import javax.swing.*;

/**
 * Tile is any game square that could appear on the monopoly board
 * @author evanezell
 *
 */
public abstract class Tile extends JPanel {
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
}
