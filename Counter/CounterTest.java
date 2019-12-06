import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class CounterTest {
	

	@Test
	public void testSetBase() {
		Counter c = new Counter();
		c.setBase(1);
		assertEquals(c.getBase(),2);
		c.setBase(11);
		assertEquals(c.getBase(),2);
		
		for (int i=2; i<=10; i++) {
			c.setBase(i);
			assertEquals(c.getBase(),i);
		}
	}

	@Test
	public void testUp() {
		Counter c = new Counter();
		c.setBase(3);
		c.up();
		assertEquals(c.getCount(),1);
		c.up();
		assertEquals(c.getCount(),2);
		c.up();
		assertEquals(c.getCount(),0);
		c.up();
		assertEquals(c.getCount(),1);
	}

	@Test
	public void testDown() {
		Counter c = new Counter();
		c.setBase(3);
		c.down();
		assertEquals(c.getCount(),2);
		c.down();
		assertEquals(c.getCount(),1);
		c.down();
		assertEquals(c.getCount(),0);
		c.down();
		assertEquals(c.getCount(),2);
	}
	
	 public static void main(String[] args) {
      Result result = JUnitCore.runClasses(CounterTest.class);
		
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
		
      System.out.println(result.wasSuccessful()?"Test OK":"Test FAILED");
   }
}
