package testing;

import measurement.Amount;
import measurement.Piece;
import measurement.Weight;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AmountTest
{
	@Test
	void changeByWeightTest()
	{
		Amount weight = new Weight();
		weight.changeBy(new Weight(10, 0));
		assertEquals(160, weight.getValue());
	}

	@Test
	void changeByPieceTest()
	{
		Amount piece = new Piece(6, "slice");
		piece.changeBy(new Piece(1, "slice"));
		assertEquals(7, piece.getValue());
	}

	@Test
	void getUnitWeightTest()
	{
		Amount weight = new Weight();
		assertEquals("ounce", weight.getUnit());
	}

	@Test
	void getUnitPieceTest()
	{
		Amount piece = new Piece(6, "slice");
		assertEquals("slice", piece.getUnit());
	}

	@Test
	void getValueWeightTest()
	{
		Amount weight = new Weight();
		assertEquals(0, weight.getValue());
	}

	@Test
	void getValuePieceTest()
	{
		Amount piece = new Piece(6, "slice");
		assertEquals(6, piece.getValue());
	}
}
