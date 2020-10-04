package measurement;

public interface Amount
{
	public void changeBy(Amount other);

	public String getUnit();

	public int getValue();
}
