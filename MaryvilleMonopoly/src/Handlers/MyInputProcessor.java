package Handlers;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


/**
 * Class to process inputs
 * @author tristinbaker
 *
 */
public class MyInputProcessor implements KeyListener {

	/**
	 * Sets the key state to true
	 * @param k index passed in. This is a key.
	 * @return true, the key is down
	 */
	public boolean keyDown(int k) {
		if(k == KeyEvent.VK_SPACE) {
			MyInput.setKey(MyInput.BUTTON1, true);
		}
		if(k == KeyEvent.VK_W) {
			MyInput.setKey(MyInput.BUTTON2, true);
		}
		if(k == KeyEvent.VK_A) {
			MyInput.setKey(MyInput.BUTTON3, true);
		}
		if(k == KeyEvent.VK_S) {
			MyInput.setKey(MyInput.BUTTON4, true);
		}
		if(k == KeyEvent.VK_D) {
			MyInput.setKey(MyInput.BUTTON5, true);
		}
		if(k == KeyEvent.VK_ENTER) {
			MyInput.setKey(MyInput.BUTTON6, true);
		}
		if(k == KeyEvent.VK_UP) {
			MyInput.setKey(MyInput.BUTTON7, true);
		}
		if(k == KeyEvent.VK_DOWN) {
			MyInput.setKey(MyInput.BUTTON8, true);
		}
		if(k == KeyEvent.VK_LEFT) {
			MyInput.setKey(MyInput.BUTTON9, true);
		}
		if(k == KeyEvent.VK_RIGHT) {
			MyInput.setKey(MyInput.BUTTON10, true);
		}
		return true;
	}
		
	/**
	 * Sets the key state to false
	 * @param k index passed in. This is a key.
	 * @return true, the key is up
	 */
	public boolean keyUp(int k) {
		if(k == KeyEvent.VK_SPACE) {
			MyInput.setKey(MyInput.BUTTON1, false);
		}
		if(k == KeyEvent.VK_W) {
			MyInput.setKey(MyInput.BUTTON2, false);
		}
		if(k == KeyEvent.VK_A) {
			MyInput.setKey(MyInput.BUTTON3, false);
		}
		if(k == KeyEvent.VK_S) {
			MyInput.setKey(MyInput.BUTTON4, false);
		}
		if(k == KeyEvent.VK_D) {
			MyInput.setKey(MyInput.BUTTON5, false);
		}
		if(k == KeyEvent.VK_ENTER) {
			MyInput.setKey(MyInput.BUTTON6, false);
		}
		if(k == KeyEvent.VK_UP) {
			MyInput.setKey(MyInput.BUTTON7, false);
		}
		if(k == KeyEvent.VK_DOWN) {
			MyInput.setKey(MyInput.BUTTON8, false);
		}
		if(k == KeyEvent.VK_LEFT) {
			MyInput.setKey(MyInput.BUTTON9, false);
		}
		if(k == KeyEvent.VK_RIGHT) {
			MyInput.setKey(MyInput.BUTTON10, false);
		}
		return true;
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}

