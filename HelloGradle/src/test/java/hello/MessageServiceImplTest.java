package hello;

import org.junit.Before;
import org.junit.Test;
 
import static org.junit.Assert.assertEquals;
 
public class MessageServiceImplTest {
 
    private MessageServiceImpl messageService;
 
    @Before
    public void setUp() {
        messageService = new MessageServiceImpl();
    }
 
    @Test
    public void getMessage_ShouldReturnMessage() {
        assertEquals("Hello WebApp!", messageService.getMessage());
    }
}
