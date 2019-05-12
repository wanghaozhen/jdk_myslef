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
					System.out.println("开始1");
					synchronized (synchronizedModel){
						synchronizedModel.wait();
					}
					System.out.println("结束1");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {

				try {
					System.out.println("开始2");
					synchronized (synchronizedModel){
						synchronizedModel.wait();
					}
					System.out.println("结束2");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {

				try {
					System.out.println("开始3");
					synchronized (synchronizedModel){
						synchronizedModel.wait();
					}
					System.out.println("结束3");
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
						synchronizedModel.notifyAll();
						Thread.sleep(3000);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		Thread.sleep(100000000);
	}

	@Test
	public void testEquals() {
		/**
		 * String s="abce"是一种非常特殊的形式,和new 有本质的区别。它是java中唯一不需要new 就可以产生对象的途径。以String s="abce";形式赋值在java中叫直接量,它是在常量池中而不是象new一样放在压缩堆中。这种形式的字符串，在JVM内部发生字符串拘留，即当声明这样的一个字符串后，JVM会在常量池中先查找有有没有一个值为"abcd"的对象,如果有,就会把它赋给当前引用.即原来那个引用和现在这个引用指点向了同一对象,如果没有,则在常量池中新创建一个"abcd",下一次如果有String s1 = "abcd";又会将s1指向"abcd"这个对象,即以这形式声明的字符串,只要值相等,任何多个引用都指向同一对象.
		 　　而String s = new String("abcd");和其它任何对象一样.每调用一次就产生一个对象，只要它们调用。

		 　　也可以这么理解: String str = "hello"; 先在内存中找是不是有"hello"这个对象,如果有，就让str指向那个"hello".如果内存里没有"hello"，就创建一个新的对象保存"hello". String str=new String ("hello") 就是不管内存里是不是已经有"hello"这个对象，都新建一个对象保存"hello"。
		 */
		String s = new String("s");
		System.out.println(s.hashCode());
		String d = "s";
		System.out.println(d.hashCode());
		System.out.println(s==d);
		System.out.println(s.equals(d));
	}

}
