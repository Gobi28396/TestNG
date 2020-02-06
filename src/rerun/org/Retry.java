package rerun.org;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;



public class Retry implements IRetryAnalyzer {
int m=0,n=10;
	@Override
	public boolean retry(ITestResult arg0) {
		if (m<n) {
			m++;
			return true;
		}
		return false;
	}
	

}
