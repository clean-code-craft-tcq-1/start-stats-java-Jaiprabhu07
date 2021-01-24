package statisticker;

public class EmailAlert implements IAlerter{

	public static boolean emailSent;

	public void setData(boolean emailSent)
	{
		EmailAlert.emailSent = emailSent;
	}

}
