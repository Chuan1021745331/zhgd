package zhgd.environment.security;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@SpringBootConfiguration
public class SecurityTest {
	@Test
	public void test() {
		Date date1=new Date();
		System.out.println(date1.getTime());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Date date2=new Date();
		System.out.println(date2.getTime());
		
		System.out.println("时间差："+(date2.getTime()-date1.getTime()));
		
	}
}
