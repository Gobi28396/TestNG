package sample.org;

import org.testng.annotations.Test;

public class DS {
	@Test
	private void tc1() {
System.out.println("Testcase 1");
System.out.println("test id:"+Thread.currentThread().getId());
	}
	@Test
	private void tc2() {
System.out.println("Testcase 2");
System.out.println("test id:"+Thread.currentThread().getId());
	}
	@Test
	private void tc3() {
System.out.println("Testcase 3");
System.out.println("test id:"+Thread.currentThread().getId());
	}
	@Test
	private void tc13() {
System.out.println("Testcase 4");
System.out.println("test id:"+Thread.currentThread().getId());
	}
	@Test
	private void tc12() {
System.out.println("Testcase 5");
System.out.println("test id:"+Thread.currentThread().getId());
	}
	@Test
	private void tc11() {
System.out.println("Testcase 6");
System.out.println("test id:"+Thread.currentThread().getId());
	}
	


}
