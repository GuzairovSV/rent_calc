package Tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import main.rentCalc;

class Test_0 {

	@Test
	void test() 
	{
		rentCalc t0;
		
		// вводим входные параметры для тестирования
		// первые 5 - тарифы, вторые 5 - объемы
		// gaz, heat, hot, cold, electr, V_gaz, V_heat, V_hot, V_cold, V_electr
		
		t0 = new rentCalc(34,19.3,21.54,3.25,2, 61,3.3,4.2,1,0.7); 

		assertEquals(2074, t0.total_houseGas); 
		assertEquals(63.69, t0.total_houseHeating); 
		assertEquals(90.468, t0.total_hotWater); 
		assertEquals(3.25, t0.total_coldWater); 
		assertEquals(1.4, t0.total_houseElectricity);

	}

}

