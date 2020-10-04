package measurement;

public abstract class AbstractAmount implements Amount
{

	public void changeBy(Amount other)
	{
		setValue(getValue() + other.getValue());
	}

	public int compareTo(Amount other)
	{
		if (getValue() - other.getValue() == 0)
		{
			return 0;
		} else if (getValue() - other.getValue() < 0)
		{
			return -1;
		} else
		{
			return 1;
		}
	}

	protected abstract void setValue(int value);
}
