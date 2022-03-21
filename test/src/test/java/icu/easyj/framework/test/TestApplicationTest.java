package icu.easyj.framework.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * {@link TestApplication} 测试类
 *
 * @author wangliang181230
 */
@SpringBootTest
@Disabled("手动触发")
public class TestApplicationTest {

	@Test
	public void testStartup() {
		System.out.println("启动成功");
	}

}
