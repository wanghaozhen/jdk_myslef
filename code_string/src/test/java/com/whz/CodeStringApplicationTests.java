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
	public void contextLoads() throws UnsupportedEncodingException, NoSuchFieldException, IllegalAccessException {

		StringBuilder stringBuilder = new StringBuilder(10);
		stringBuilder.ensureCapacity(4);
		int capacity = stringBuilder.capacity();
		stringBuilder.trimToSize();
		int length = stringBuilder.length();
		int capacity2 = stringBuilder.capacity();

//		String str = "vae";
//		String b = "vae";
////打印原字符串
//		System.out.println(str);//vae
////获取String类中的value字段
//		Field fieldStr = String.class.getDeclaredField("value");
////因为value是private声明的，这里修改其访问权限
//		fieldStr.setAccessible(true);
////获取str对象上的value属性的值
//		char[] value = (char[]) fieldStr.get(str);
////将第一个字符修改为 V(小写改大写)
//		value[0] = 'V';
////打印修改之后的字符串
//		System.out.println(str);//Vae
//		System.out.println(b);//Vae

//		String s = "aabbccdd";
//		s = s.replace('a','b');

//		String s = "a,b,c,d,e,f";
//		String[] a = s.split(",");

//		boolean s = (('7'-'0')|('9'-'7'))<0;

//		String s = "a2c";
//		int i = s.indexOf(97);

//		String s = "a";
//		String b = new String("aaaaaaaa");
//		int i = s.hashCode();

//		String a ="123abc";
//		String b ="abc";
//		String d = "abc12abc";
//		boolean c = a.startsWith(b,3);
//		boolean e = d.endsWith(b);

//		String s = "abcdefgh";
//		char chars[] = new char[13];
//		chars[0]= 'a';
//		s.getChars(0,7,chars,1);

		//		String s = "abc";
//		int a = s.codePointAt(1);
//		System.out.println("a="+a);

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
