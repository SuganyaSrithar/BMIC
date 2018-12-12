import static org.junit.Assert.*;

import org.junit.Test;

import com.mdhasan.bmicalculator.bmiResult;

public class TestCode {

	@Test
	public void testone() {
		bmiResult obj=new bmiResult();
		String res=obj.mbiCalculate(50, 5.2);
		assertEquals("UNDERWEIGHT",res);
	}
	@Test
	public void testtwo()
	{
		bmiResult obj=new bmiResult();
		String res=obj.mbiCalculate(100, 4.5);
		assertEquals("HEALTHY",res);
	}
	@Test
	public void testthree()
	{
		bmiResult obj=new bmiResult();
		String res=obj.mbiCalculate(100,4.0);
		assertEquals("AT RISK",res);
	}
	@Test
	public void testfour()
	{
		bmiResult obj=new bmiResult();
		String res=obj.mbiCalculate(90, 3);
		assertEquals("OVERHEIGHT",res);
	}

}
