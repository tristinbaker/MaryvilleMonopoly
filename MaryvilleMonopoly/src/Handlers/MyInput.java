package Handlers;

public class MyInput {

	/**
	 * Current state the key is in. Used to determine what 
	 * key was pressed.
	 */
	public static boolean [] keys;
	/**
	 * Used to determine which key was pressed before.
	 */
	public static boolean [] pkeys;
		
	/**
	 * The number of assigned keys in the game.
	 */
	public static final int NUM_KEYS = 11;
	
	//Buttons for the game.
	public static final int BUTTON1 = 0; 		//space
	public static final int BUTTON2 = 1; 		//W
	public static final int BUTTON3 = 2; 		//A
	public static final int BUTTON4 = 3; 		//S
	public static final int BUTTON5 = 4;	    //D
	public static final int BUTTON6 = 5;	    //Enter
	public static final int BUTTON7 = 6;        //Up
	public static final int BUTTON8 = 7;        //Down
	public static final int BUTTON9 = 8;        //Left
	public static final int BUTTON10 = 9;  		//Right
	public static final int BUTTONDEFAULT = 10; //No button pressed
		
	static {
		keys = new boolean[NUM_KEYS];
		pkeys = new boolean[NUM_KEYS];
	}
	
	/**
	 * Updates based on which key was pressed.
	 */
	public static void update() {
		for(int i = 0; i < NUM_KEYS; i++) {
			pkeys[i] = keys[i];
		}
	}
		
	/**
	 * Checks if a certain key is down or not.
	 * @param i index passed in. This is a key.
	 * @return true if down, false if not.
	 */
	public static boolean isDown(int i) {
		return keys[i];
	}
		
	/**
	 * Checks if the key is pressed.
	 * @param i index passed in. This is a key.
	 * @return true if pressed, false if not.
	 */
	public static boolean isPressed(int i) {
		return keys[i] && !pkeys[i];
	}
		
	/**
	 * Sets key equal to true or false based on
	 * whether or not the key is down.
	 * @param i index passed in. This is a key.
	 * @param b true means the key is down, false means it's not.
	 */
	public static void setKey(int i, boolean b) {
		keys[i] = b;
	}
	
	/**
	 * Converts java keycodes to MyInput keycodes
	 * @param i index passed in. This is a key.
	 * @return new keycode
	 */
	public static int convertKeyCode(int i) {
		switch(i) {
		case 10:    //enter
			i = 5;
			break;
		case 87:    //w
			i = 1;
			break;
		case 83:    //s
			i = 3;
			break;
		case 65:    //a
			i = 2;
			break;
		case 68:    //d
			i = 4;
			break;
		case 32:    //space
			i = 0;
			break;
		case 38:    //up
			i = 6;
			break;
		case 40:    //down
			i = 7;
			break;
		case 37:    //left
			i = 8;
			break;
		case 39:    //right
			i = 9;
			break;
		default:	//no set button pressed
			i = 10; 
			break;
		} 
		return i;
	}
}

