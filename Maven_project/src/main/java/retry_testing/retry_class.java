package retry_testing;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retry_class implements IRetryAnalyzer
{
	int initial_count=0;
	int total_count=3;
	@Override
	public boolean retry(ITestResult result)
	{
		if(initial_count<total_count)
		{
			initial_count++;
		return true;
		}
		return false;
	}

}

