package testing;

import measurement.AbstractAmount;
import measurement.Piece;
import measurement.Weight;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AbstractAmountTest
{
	@Test
	void changeByTest()
	{
		AbstractAmount one = new Piece(10, "slice");
		AbstractAmount two = new Weight();
		one.changeBy(two);
		assertEquals(10, one.getValue());
	}

	@Test
	void compareToTest()
	{
		AbstractAmount one = new Weight(10, 16);
		AbstractAmount two = new Weight();
		AbstractAmount more = new Weight(20, 0);
		AbstractAmount same = new Weight(10, 16);
		assertEquals(1, one.compareTo(two));
		assertEquals(-1, one.compareTo(more));
		assertEquals(0, one.compareTo(same));
		AbstractAmount oneP = new Piece(10, "slice");
		AbstractAmount twoP = new Piece(0, "slice");
		AbstractAmount moreP = new Piece(12, "slice");
		AbstractAmount sameP = new Piece(10, "slice");
		assertEquals(1, oneP.compareTo(twoP));
		assertEquals(-1, oneP.compareTo(moreP));
		assertEquals(0, oneP.compareTo(sameP));
	}
}
