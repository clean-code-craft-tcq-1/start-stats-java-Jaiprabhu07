package statisticker;

public class LEDAlert implements IAlerter {

	public static boolean ledGlows;
	
	public void setData(boolean ledGlows)
	{
		LEDAlert.ledGlows = ledGlows;
	}


}
