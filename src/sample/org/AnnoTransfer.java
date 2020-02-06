package sample.org;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;
import rerun.org.Retry;

public class AnnoTransfer implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation f, Class arg1, Constructor arg2, Method arg3) {

		IRetryAnalyzer g = f.getRetryAnalyzer();
		
		if (g==null) {
			f.setRetryAnalyzer(Retry.class);
		}
		
	}

}
