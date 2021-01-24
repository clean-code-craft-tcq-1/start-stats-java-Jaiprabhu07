package statisticker;

public class StatsChecker {

	private Float maxThreshold;
	private IAlerter[] alerters;
	StatsChecker(Float maxThreshold,IAlerter [] alerters)
	{
		this.maxThreshold = maxThreshold;
		this.alerters = alerters;
	}

	public void checkAndAlert(Float[] numbers) {
		EmailAlert e = new EmailAlert();
		LEDAlert l = new LEDAlert();
		Float max = 0.0f;
		System.out.println("maxThreshold : "  + maxThreshold);
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]);
			if(numbers[i]>max)
			{
				max = numbers[i];
			}
		}
		if(max>maxThreshold)
		{
			System.out.println("Max : " + max);
			e.setData(true);
			l.setData(true);
		}
	}
	
}
