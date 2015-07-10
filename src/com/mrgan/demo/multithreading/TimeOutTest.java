package com.mrgan.demo.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class TimeOutTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FutureTask task = new FutureTask(new Callable<String>() {

			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				while (true) {
					if (1 == 2)
						break;
				}
				return null;
			}

		});
		try {
			task.get(2000, TimeUnit.MILLISECONDS);
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
