package hello;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class HelloTestNG {
	@Test(expectedExceptions = Exception.class, expectedExceptionsMessageRegExp="JustForTest")
	public void hi() {
		String s = "helloTestNG";
		assertEquals("helloTestNG", s);
		assertNotEquals("goodbyeJunit", s);
        System.out.println("Hello TestNG");

        MessageService messageService = new MessageServiceImpl();
        assertEquals("Hello WebApp!", messageService.getMessage());
        throw new RuntimeException("JustForTest");
	}
}
