package rerun.org;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NManual {
	@Test
	private void tc1() {
		Assert.assertTrue(true);

		Assert.assertTrue(true);
	}
	@Test()
	private void tc2() {
		Assert.assertTrue(true);

		Assert.assertTrue(false);
	}

}
