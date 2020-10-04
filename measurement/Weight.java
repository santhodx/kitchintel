package measurement;

public class Weight extends CompoundNumber
{
	public Weight()
	{
		super();
	}

	public Weight(int pounds, int ounces)
	{
		super(pounds, ounces);
	}

	/*
	 * protected String getLargesText() { return "pound"; }
	 */
	public String getLargesText()
	{
		return "pound";
	}

	/*
	 * protected String getSmallsText() { return "ounce"; }
	 */
	public String getSmallsText()
	{
		return "ounce";
	}

	/*
	 * protected int getSmallsPerLarge() { return 16; }
	 */
	public int getSmallsPerLarge()
	{
		return 16;
	}
}
