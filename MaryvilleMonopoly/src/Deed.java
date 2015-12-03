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
	 * Constructor to initialize a deed card
	 * @param deedPrice Cost to purchase deed
	 * @param housePrice Cost to purchase a house for the deed
	 * @param mortgageValue Amount paid to mortgage the deed
	 * @param rentPrices Array with the rent prices stored; Ex: rentPrices[2],
	 * cost of rent with 2 houses
	 */
	Deed(int deedPrice, int housePrice, int mortgageValue, int[] rentPrices) {
		this.deedPrice = deedPrice;
		this.housePrice = housePrice;
		this.mortgageValue = mortgageValue;
		for(int i=0; i<6; i++) { //loop to store rentPrices
			this.rentPrices[i] = rentPrices[i];
		}
		numHouses = 0;
	}
	
}
