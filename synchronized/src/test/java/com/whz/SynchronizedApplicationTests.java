package com.whz;

import com.whz.model.SynchronizedModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.whz.util.SynchronizedUtil;
import com.whz.util.SynchronizedUtil1;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SynchronizedApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testSynchronized() throws InterruptedException {
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					SynchronizedUtil.method1();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();

		synchronizedMethod();

		SynchronizedUtil1.method1();
		SynchronizedUtil1.method2();
		Thread.sleep(100000000);
	}

	public synchronized void synchronizedMethod() throws InterruptedException {
		for(int i=1;i<1000;i++){
			System.out.println("synchronizedMethod"+i);
			this.wait(10000);
		}
	}

	@Test
	public void testSynchronized1() throws InterruptedException {
		SynchronizedModel synchronizedModel = new SynchronizedModel();

		new Thread(new Runnable() {
			@Override
			public void run() {

				try {
					System.out.println("开始");
					synchronized (synchronizedModel){
						synchronizedModel.wait();
					}
					System.out.println("结束");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();

		Thread.sleep(3000);
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					System.out.println("notify开始");
					synchronized (synchronizedModel){
						synchronizedModel.notify();
						Thread.sleep(3000);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		Thread.sleep(100000000);
	}

}
