package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.rentCalc;

public class Test_1 
{

	@Test
	void test() 
	{
		rentCalc t0;
		
		// ������ ������� ��������� ��� ������������
		// ������ 5 - ������, ������ 5 - ������
		// gaz, heat, hot, cold, electr, V_gaz, V_heat, V_hot, V_cold, V_electr
		
		t0 = new rentCalc(34,19.3,21.54,3.25,2, 61,3.3,4.2,1,0.7);
		
		assertEquals(11, t0.total_houseGas);
		assertEquals(11, t0.total_houseHeating);
		assertEquals(11, t0.total_hotWater);
		assertEquals(11, t0.total_coldWater);
		assertEquals(11, t0.total_houseElectricity);

	}
}

