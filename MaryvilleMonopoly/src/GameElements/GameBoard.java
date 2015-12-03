package GameElements;
import java.awt.Color;

import javax.swing.*;
/**
 * Gameboard class
 * @author evanezell
 *
 */
public class GameBoard extends JPanel{
	public GameBoard() {
		setLayout(null);
		setSize(600,600);
		setBackground(Color.WHITE);
		
		Deed[] deeds = new Deed[22];
		int[] rentPrices = new int[6];
		rentPrices[0]=2;
		rentPrices[1]=4;
		rentPrices[2]=6;
		rentPrices[3]=8;
		rentPrices[4]=10;
		rentPrices[5]=10;
		//Anderson Hall deed
		deeds[0] = new Deed("Anderson Hall", "brown", 60, 30, 30, rentPrices);
		deeds[0].setLocation(92, 525);
		add(deeds[0]);
	}
}
