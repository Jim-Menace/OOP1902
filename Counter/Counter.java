
public class Counter {
	private int base = 0;
	private int count = 0;	
	
	/**
	 * Increase the value of count by 1.
	 * If count is greater than or equal base, reset count back to zero.
	 *
	 */
	public void up() {
		count++;
		if (count >= base) {
			count = 0;
		}
	}

	/**
	 * Decrease the value of count by 1.
	 * If count is less than 0, set the value of count to base-1.
	 *
	 */
	public void down() {
		count--;
		if (count < 0) {
			count = base-1;
		}
	}

	/**
	 * Valid value for base is between 2 and 10.
	 * Default value for base is 2.
	 *
	 * @param n the new value for base.
	 *
	 */
	public void setBase(int n) {
		if (n>=2 && n <=10) {
			base = n;
		} else {
			base = 2;
		}
	}

	/**
	 * @return the current value of base.
	 *
	 */
	public int getBase() {
		return base;
	}

	/**
	 * @return the current value of count.
	 *
	 */
	public int getCount() {
		return count;
	}	
}
