package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ZkMvvmJpasPringBootApplicationTests {

	@Test
	public void contextLoads() {
		String test1 = "alig";
		String test  = "alig banget sih";
		String[] arrayStr = test.split(" ");
		
		for (String temp : arrayStr) {
			System.out.println(temp);
		}
		
		for(int a = test.length() -1; a>=0 ; a--) {
			System.out.println(test.charAt(a));
		}
		
		 
		
		StringBuilder str = new StringBuilder();
		str.append(test);
		str.reverse();
		System.out.println(str);
	}

}
