package measurement;

public abstract class CompoundNumber extends AbstractAmount
{
	private int valueSmalls;

	public CompoundNumber()
	{
		valueSmalls = 0;
	}

	public CompoundNumber(int larges, int smalls)
	{
		valueSmalls = larges * getSmallsPerLarge() + smalls;
	}

	public void changeBy(int larges, int smalls)
	{
		valueSmalls = getValue() + larges * getSmallsPerLarge() + smalls;
	}

	protected abstract String getLargesText();

	protected abstract String getSmallsText();

	/* protected abstract int getSmallsPerLarge(); */

	public abstract int getSmallsPerLarge();

	public String getUnit()
	{
		return getSmallsText();
	}

	public int getValue()
	{
		return valueSmalls;
	}

	public void multiplyBy(double m)
	{
		valueSmalls *= m;
	}

	/*
	 * protected void setValue(int value) { valueSmalls = value; }
	 */

	public void setValue(int value)
	{
		valueSmalls = value;
	}

	public String toString()
	{
		return valueSmalls / getSmallsPerLarge() + " "
				+ Pluralizer.regular(valueSmalls / getSmallsPerLarge(), getLargesText()) + ", "
				+ valueSmalls % getSmallsPerLarge() + " "
				+ Pluralizer.regular(valueSmalls % getSmallsPerLarge(), getSmallsText());
	}
}
