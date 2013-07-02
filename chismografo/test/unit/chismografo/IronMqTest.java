package chismografo;

import io.iron.ironmq.Client;

import org.junit.Assert;
import org.junit.Test;

public class IronMqTest {

	@Test
	public void test() {
		io.iron.ironmq.Client client = new Client("51d1e1ce5de9387538000c7c", "pT5HrnyNrpSb4DEv3up025HYS14");
		Assert.assertNotNull(client);
	}

}
