import java.util.ArrayList;

/**
 * @author 97254
 *Connected info between two threads 
 */
public class SharedData 
{
	
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/** the constructor of the class
	 * @param array     the array that we got from the user	
	 * @param b			the number that the user chose to check
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**  getter - method that return the boolean array
	 * @return a boolean array - every index in the array
	 * can get 0/1 1 if the number is used for the solution else 0 
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/** setter - a method that set the boolean array to be the given array
	 * @param winArray   the array that we got after we found the solution
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/** getter - a method that return array 
	 * @return 	array of the numbers from the input
	 */
	public ArrayList<Integer>getArray() 
	{
		return array;
	}

	/** getter - a method that return integer number	
	 * @return the number that the user chose to check
	 */
	public int getB() 
	{
		return b;
	}

	/** getter - a method that return boolean value	
	 * @return flag that inform that one of the threads found the solution
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/** setter - set the flag to be the given value
	 * @param flag flag that inform that one of the threads found the solution
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
