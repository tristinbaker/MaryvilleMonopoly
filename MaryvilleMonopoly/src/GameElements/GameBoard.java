package GameElements;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.*;
/**
 * Gameboard class
 * @author evanezell
 *
 */
public class GameBoard extends JPanel{
	
	Deed[] deeds;
	
	public GameBoard() {
		setLayout(null);
		setSize(600,600);
		setBackground(Color.WHITE);
		
		deeds = new Deed[22];
		
		//Anderson Hall deed
		int[] rentPrices = new int[]{2,4,6,8,10,15};
		deeds[0] = new Deed("Anderson Hall", "brown", 60, 30, 30, rentPrices);
		deeds[0].setLocation(92, 525);
		add(deeds[0]);
		
	}
	
}
