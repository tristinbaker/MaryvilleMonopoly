package GameElements;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * Class to store a deed; deed is being defined as a tile that can be purchased
 * and houses can be purchased for the deed
 * @author evanezell
 *
 */
public class Deed extends Tile {
	/**
	 * Cost to buy the deed
	 */
	int deedPrice;
	/**
	 * Cost to buy a house for the property
	 */
	int housePrice;
	/**
	 * Amount of money to be received when mortgaging property 
	 */
	int mortgageValue;
	/**
	 * Price to pay when landing on the property
	 */
	int rent;
	/**
	 * Current rent price of property given how many houses are on the property
	 */
	int[] rentPrices = new int[6];
	/**
	 * Number of houses currently on the property
	 */
	int numHouses;
	/**
	 * Is this deed a part of a monopoly owned by one player?
	 */
	boolean isMonopoly;
	/**
	 * Name of the property
	 */
	String name;
	/**
	 * Color of the monopoly that the property belongs to
	 */
	String color;
	
	/**
	 * Constructor to initialize a deed card
	 * @param name Name of the property
	 * @param color Color of the monompoly that the porperty belongs to
	 * @param deedPrice Cost to purchase deed
	 * @param housePrice Cost to purchase a house for the deed
	 * @param mortgageValue Amount paid to mortgage the deed
	 * @param rentPrices Array with the rent prices stored; Ex: rentPrices[2],
	 * cost of rent with 2 houses
	 */
	Deed(String name, String color, int deedPrice, int housePrice, int mortgageValue, int[] rentPrices) {
		this.name = name;
		this.color = color;
		this.deedPrice = deedPrice;
		this.housePrice = housePrice;
		this.mortgageValue = mortgageValue;
		for(int i=0; i<6; i++) { //loop to store rentPrices
			this.rentPrices[i] = rentPrices[i];
		}
		numHouses = 0;
		setSize(46,75);

		Color bg = new Color(205,230,208);
		setBackground(bg);
		setLayout(null);
		
		addMouseListener(this);
		
		JPanel colorID = new JPanel();
		colorID.setLayout(null);
		
		Color IDColor = new Color(0,114,187);
		colorID.setBackground(IDColor);
		colorID.setSize(46, 15);
		colorID.setLocation(0, 0);
		add(colorID);
		
		colorID.setBorder(new LineBorder(Color.BLACK));
		setBorder(new LineBorder(Color.BLACK));
		
		JLabel text = new JLabel("Anderson");
		Font f = new Font("Serif", Font.PLAIN, 11);
		text.setForeground(Color.BLACK);
		text.setFont(f);
		text.setLocation(10, 10);
		add(text);
		
		JPanel textPanel = new JPanel();
		textPanel.add(text);
		textPanel.setSize(44, 59);
		textPanel.setBackground(bg);
		textPanel.setLocation(1,15);
		add(textPanel);
	}
	

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
