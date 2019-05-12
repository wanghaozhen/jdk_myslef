package com.whz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.UnsupportedEncodingException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CodeStringApplicationTests {

	@Test
	public void contextLoads() throws UnsupportedEncodingException {

		String s = "abc";
		int a = s.codePointAt(1);
		System.out.println("a="+a);
//		byte[] abc = s.getBytes("UTF8");
//		String a = new String(abc,"UTF8");
//		System.out.println(a);
//		int a[] = {97,97};
//		String as = new String(a,0,2);
//		System.out.println(as);


//		String s = new String("s");
//		String a = "s";
//		System.out.println(a.equals(s));
//		Object b = "s";
//		Object c = "s";
//		System.out.println(b.equals(c));
//		System.out.println(s);
	}

}
