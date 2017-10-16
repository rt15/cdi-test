package fr.rt15;

import org.apache.deltaspike.testcontrol.api.junit.CdiTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(CdiTestRunner.class)
public class MyTest {

	@Test
	public void test() throws Exception {
		MyThread myThread = new MyThread();
		myThread.start();
		myThread.join();
		if (myThread.exception != null) {
			throw myThread.exception;
		}
	}
}
