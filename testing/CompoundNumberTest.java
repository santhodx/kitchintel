package testing;

import measurement.Weight;
import measurement.CompoundNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CompoundNumberTest
{
	@Test
	void defaultConstructorTest()
	{
		CompoundNumber number = new Weight();
		assertEquals(0, number.getValue());
	}

	@Test
	void parametersConstructorTest()
	{
		CompoundNumber number = new Weight(1, 5);
		assertEquals(21, number.getValue());
	}

	@Test
	void changeByTest()
	{
		CompoundNumber number = new Weight(1, 5);
		int res = number.getValue() + 5 * number.getSmallsPerLarge() + 9;
		number.changeBy(5, 9);
		assertEquals(res, number.getValue());
	}

	@Test
	void getUnitTest()
	{
		CompoundNumber number = new Weight(1, 5);
		assertEquals("ounce", number.getUnit());
	}

	@Test
	void getValueTest()
	{
		CompoundNumber number = new Weight(1, 5);
		assertEquals(21, number.getValue());
	}

	@Test
	void multiplyByTest()
	{
		CompoundNumber number = new Weight(1, 0);
		number.multiplyBy(2.45);
		assertEquals(39, number.getValue());
	}

	@Test
	void setValueTest()
	{
		CompoundNumber number = new Weight(1, 0);
		number.setValue(20);
		assertEquals(20, number.getValue());
	}

	@Test
	void toStringTest()
	{
		CompoundNumber number = new Weight(1, 6);
		assertEquals("1 pound, 6 ounces", number.toString());
	}
}
