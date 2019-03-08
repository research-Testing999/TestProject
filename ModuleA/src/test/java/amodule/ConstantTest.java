package amodule;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.junit.Assert;

public class ConstantTest {
	@Test
	public void test() throws IOException {
		File f = new File(Constant.path);
		
		Assert.assertTrue(f.exists());
		String str = Files.readAllLines(f.toPath()).get(0);
		Assert.assertEquals("te", str);
	}
}
