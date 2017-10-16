package fr.rt15;

import javax.enterprise.inject.spi.CDI;

public class MyThread extends Thread {

	public Exception exception;

	@Override
	public void run() {
		try {
			MyBean myBean = CDI.current().select(MyBean.class).get();
			myBean.foo();
		} catch (Exception e) {
			this.exception = e;
		}
	}
}
