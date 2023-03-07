package intlist;

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
	
	public IntList() {
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
	
	/**
	 * @inspects | this
	 * @pre | 0 <= index && index <= getLength()
	 * @post | result == getIntList()[index]
	 */
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
		list = Arrays.copyOf(list, list.length+1);
		list[list.length - 1] = element;
	}
	
	/**
	 * @mutates | this
	 * 
	 * @pre | getLength() > 0
	 * 
	 * @post | getIntList().length == old(getIntList()).length - 1
	 * @post | Arrays.equals(getIntList(), 0, old(getIntList()).length - 1, old(getIntList()), 0, old(getIntList()).length - 1)
	 */
	
	public void removeElement() {
		list = Arrays.copyOf(list, list.length - 1);
		
	}
	
}
