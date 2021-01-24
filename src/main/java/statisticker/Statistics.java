package statisticker;

import java.util.List;



public class Statistics 
{
	
    public static Stats getStatistics(List<Float> numbers) {
    	float average;
    	float sum = 0;
    	int count = 0;
    	Float min = Float.NaN;
    	Float max = Float.NaN;
    	Stats s = new Stats();
    	for(Float no: numbers)
    	{
    		if(count == 0)
    		{
    			min = no;
    			max = no;
    		}
    		if(no>max)
    		{
    			max = no; 
    		}
    		if(no<min)
    		{
    			min = no;
    		}
    		sum = sum + no;
    		
			count++;
    	}
    
    	average = sum/count;	
    	s.average=average;
    	s.min=min;
    	s.max=max;
    	System.out.println("average : "+s.average);
    	System.out.println("Min : "+s.min);
    	System.out.println("Max : "+s.max);
    	return s;
    	
    	
    }
    public static class Stats
    {
    	public float average;
		public float min;
		public float max;
	
    }
}
