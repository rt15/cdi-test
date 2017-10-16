package fr.rt15;

import javax.inject.Inject;

import org.apache.deltaspike.testcontrol.api.junit.CdiTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(CdiTestRunner.class)
public class MyTest {

	@Inject
	private MyBean myBean;

	@Test
	public void test() throws Exception {

		// Ugly workaround: uncomment next line.
		// this.myBean.foo();

		MyThread myThread = new MyThread();
		myThread.start();
		myThread.join();
		if (myThread.exception != null) {
			throw myThread.exception;
		}
	}
}
