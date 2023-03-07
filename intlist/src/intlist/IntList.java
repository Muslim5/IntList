package intlist;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @muttable
 * @invar | getIntList() != null
 * 
 */
public class IntList {
	
	/**
	 * @invar | list != null
	 */
	public int[] list;
	
	/**
	 * @creates | result
	 * @inspects | list
	 * @post | result != null
	 * 
	 */
	public int[] getIntList() {
		return list.clone();
	}
	
	/**
	 * @post | getLength() == 0
	 * 
	 */
	
	public IntList(int[] array) {
		list = new int[0];
	}

	/**
	 * @throws NullPointerException| array == null
	 * @mutates | this
	 * @post | getIntList() == list
	 * 
	 */
	public void setIntList(int[] array) {
		this.list = array.clone();
	}
	
	/**
	 * @post | result == getIntList().length
	 * 	 
	 */
	public int getLength() {
		return list.length;
	}
	
	public int getElement(int index) {
		return list[index];
	}
	
	public int[] getList() {
		return this.list.clone();
	}
	
	/**
	 * 
	 * @mutates | this
	 * 
	 * @post | getIntList().length == old(getIntList()).length + 1
	 * @post | Arrays.equals(getIntList(), 0, old(getIntList()).length, 
	 * 		 | old(getIntList()), 0, old(getIntList()).length)
	 * 
	 */
	public void addElement(int element) {
		int[] aux = new int[list.length + 1];
		for(int i = 0; i < list.length; i++) {
			aux[i] = list[i];
		}
		aux[list.length] = element;
	}
	
	/**
	 * @mutates | this
	 * 
	 * @post | getIntList().length == old(getIntList()).length - 1
	 * @post | Arrays.equals(getIntList(), 0, old(getIntList()).length - 1, old(getIntList()), 0, old(getIntList()).length - 1)
	 */
	
	public void removeElement() {
		int [] aux = new int[list.length - 1];
		for(int i = 0; i < list.length - 1; i++) {
			aux[i] = list[i];
		}
		
	}
	
}
