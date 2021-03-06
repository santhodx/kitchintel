package measurement;

public class Piece extends AbstractAmount
{
	private int value;
	private String unit;

	public Piece(int value, String unit)
	{
		this.value = value;
		this.unit = unit;
	}

	public String getUnit()
	{
		return unit;
	}

	public int getValue()
	{
		return value;
	}

	/*
	 * protected void setValue(int value) { this.value = value; }
	 */
	public void setValue(int value)
	{
		this.value = value;
	}

	public String toString()
	{
		return value + " " + Pluralizer.regular(value, unit);
	}

}
